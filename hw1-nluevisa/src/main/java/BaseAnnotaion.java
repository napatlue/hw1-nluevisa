

/* First created by JCasGen Mon Sep 09 23:32:30 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base class for all annotation used in this QA system
 * Updated by JCasGen Tue Sep 10 20:34:23 EDT 2013
 * XML source: /Users/napatluevisadpaibul/Documents/workspace/hw1-nluevisa/src/main/resources/hw1-nluevisa-typesystem.xml
 * @generated */
public class BaseAnnotaion extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BaseAnnotaion.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected BaseAnnotaion() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BaseAnnotaion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BaseAnnotaion(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BaseAnnotaion(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: source

  /** getter for source - gets the source where an annotation was made by
   * @generated */
  public String getSource() {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "BaseAnnotaion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets the source where an annotation was made by 
   * @generated */
  public void setSource(String v) {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "BaseAnnotaion");
    jcasType.ll_cas.ll_setStringValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets numerical value in range [0,1] showing how confidence the annotation was.
   * @generated */
  public double getConfidence() {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BaseAnnotaion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets numerical value in range [0,1] showing how confidence the annotation was. 
   * @generated */
  public void setConfidence(double v) {
    if (BaseAnnotaion_Type.featOkTst && ((BaseAnnotaion_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "BaseAnnotaion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((BaseAnnotaion_Type)jcasType).casFeatCode_confidence, v);}    
  }

    