

/* First created by JCasGen Tue Sep 10 15:07:41 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** evaluate the answer score from analysis engine by selecting top N highest score answer where N is number of correct answer
 * Updated by JCasGen Tue Sep 10 20:34:23 EDT 2013
 * XML source: /Users/napatluevisadpaibul/Documents/workspace/hw1-nluevisa/src/main/resources/hw1-nluevisa-typesystem.xml
 * @generated */
public class Evaluator extends BaseAnnotaion {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Evaluator.class);
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
  protected Evaluator() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Evaluator(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Evaluator(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Evaluator(JCas jcas, int begin, int end) {
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
  //* Feature: AnswerScoreList

  /** getter for AnswerScoreList - gets List of answers sorted by descending score
   * @generated */
  public FSArray getAnswerScoreList() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_AnswerScoreList == null)
      jcasType.jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_AnswerScoreList)));}
    
  /** setter for AnswerScoreList - sets List of answers sorted by descending score 
   * @generated */
  public void setAnswerScoreList(FSArray v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_AnswerScoreList == null)
      jcasType.jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    jcasType.ll_cas.ll_setRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_AnswerScoreList, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for AnswerScoreList - gets an indexed value - List of answers sorted by descending score
   * @generated */
  public AnswerScore getAnswerScoreList(int i) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_AnswerScoreList == null)
      jcasType.jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_AnswerScoreList), i);
    return (AnswerScore)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_AnswerScoreList), i)));}

  /** indexed setter for AnswerScoreList - sets an indexed value - List of answers sorted by descending score
   * @generated */
  public void setAnswerScoreList(int i, AnswerScore v) { 
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_AnswerScoreList == null)
      jcasType.jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_AnswerScoreList), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Evaluator_Type)jcasType).casFeatCode_AnswerScoreList), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: precision

  /** getter for precision - gets numerical value indicate performace (number of correct top N answer/number of correct answer)
   * @generated */
  public double getPrecision() {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Evaluator");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision);}
    
  /** setter for precision - sets numerical value indicate performace (number of correct top N answer/number of correct answer) 
   * @generated */
  public void setPrecision(double v) {
    if (Evaluator_Type.featOkTst && ((Evaluator_Type)jcasType).casFeat_precision == null)
      jcasType.jcas.throwFeatMissing("precision", "Evaluator");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Evaluator_Type)jcasType).casFeatCode_precision, v);}    
  }

    