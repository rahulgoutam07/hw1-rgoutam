

/* First created by JCasGen Sat Sep 20 14:44:09 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Annotation type for Named Entities
 * Updated by JCasGen Mon Sep 22 22:42:49 EDT 2014
 * XML source: C:/Users/rgoutam/hw1-rgoutam/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NEAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NEAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected NEAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public NEAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public NEAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public NEAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: Begin

  /** getter for Begin - gets Begin Offset
   * @generated
   * @return value of the feature 
   */
  public int getBegin() {
    if (NEAnnotation_Type.featOkTst && ((NEAnnotation_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "NEAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NEAnnotation_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets Begin Offset 
   * @generated
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (NEAnnotation_Type.featOkTst && ((NEAnnotation_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "NEAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((NEAnnotation_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets End offset
   * @generated
   * @return value of the feature 
   */
  public int getEnd() {
    if (NEAnnotation_Type.featOkTst && ((NEAnnotation_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "NEAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NEAnnotation_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets End offset 
   * @generated
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (NEAnnotation_Type.featOkTst && ((NEAnnotation_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "NEAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((NEAnnotation_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: NamedEntity

  /** getter for NamedEntity - gets Named Entity String
   * @generated
   * @return value of the feature 
   */
  public String getNamedEntity() {
    if (NEAnnotation_Type.featOkTst && ((NEAnnotation_Type)jcasType).casFeat_NamedEntity == null)
      jcasType.jcas.throwFeatMissing("NamedEntity", "NEAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NEAnnotation_Type)jcasType).casFeatCode_NamedEntity);}
    
  /** setter for NamedEntity - sets Named Entity String 
   * @generated
   * @param v value to set into the feature 
   */
  public void setNamedEntity(String v) {
    if (NEAnnotation_Type.featOkTst && ((NEAnnotation_Type)jcasType).casFeat_NamedEntity == null)
      jcasType.jcas.throwFeatMissing("NamedEntity", "NEAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NEAnnotation_Type)jcasType).casFeatCode_NamedEntity, v);}    
  }

    