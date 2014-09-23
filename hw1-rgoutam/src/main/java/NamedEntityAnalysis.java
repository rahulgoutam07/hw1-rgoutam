import java.io.File;
import java.util.Set;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.util.AbstractExternalizable;


public class NamedEntityAnalysis extends JCasAnnotator_ImplBase {
  Chunker model;
  
  @Override
  public void initialize(UimaContext aContext) throws ResourceInitializationException {
    // TODO Auto-generated method stub
    try {
      File f = new File((String)aContext.getConfigParameterValue("ModelName"));
      model = (Chunker) AbstractExternalizable.readObject(f);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
  
  @Override
  public void process(JCas arg0) throws AnalysisEngineProcessException {
    // TODO Auto-generated method stub
    FSIterator iter = arg0.getJFSIndexRepository().getAllIndexedFS(SentenceAnnotation.type);
    SentenceAnnotation sent = (SentenceAnnotation) iter.next();
    Set<Chunk> NamedEntitiesSet = model.chunk((String)sent.getSentence()).chunkSet();
    
    for(Chunk c : NamedEntitiesSet) {
      NEAnnotation ne = new NEAnnotation();
      ne.setBegin(countChar((String)sent.getSentence(), c.start()));
      ne.setEnd(countChar((String)sent.getSentence(), c.end()));
      ne.setNamedEntity((String)sent.getSentence().substring(c.start(), c.end()));
      ne.addToIndexes();
    }
    
  }
  
  private static int countChar(String text, int index) {
    int ret = 0;
    for(int i = 0; i < index; i++) {
      if(text.charAt(i) != ' ')
        ret++;
    }
    return ret;
  }

}
