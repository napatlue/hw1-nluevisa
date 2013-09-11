

/* First created by JCasGen Mon Sep 09 23:32:31 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** score of an answer to the question in QA system
 * Updated by JCasGen Mon Sep 09 23:47:59 EDT 2013
 * XML source: /Users/napatluevisadpaibul/Documents/workspace/hw1-nluevisa/src/main/resources/hw1-nluevisa-typesystem.xml
 * @generated */
public class Score extends BaseAnnotaion {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Score.class);
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
  protected Score() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Score(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Score(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Score(JCas jcas, int begin, int end) {
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
  //* Feature: score

  /** getter for score - gets numerical value represent score of the corresponding answer
   * @generated */
  public double getScore() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Score");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Score_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets numerical value represent score of the corresponding answer 
   * @generated */
  public void setScore(double v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "Score");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Score_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: answer

  /** getter for answer - gets the answer which produce this score
   * @generated */
  public Answer getAnswer() {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "Score");
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Score_Type)jcasType).casFeatCode_answer)));}
    
  /** setter for answer - sets the answer which produce this score 
   * @generated */
  public void setAnswer(Answer v) {
    if (Score_Type.featOkTst && ((Score_Type)jcasType).casFeat_answer == null)
      jcasType.jcas.throwFeatMissing("answer", "Score");
    jcasType.ll_cas.ll_setRefValue(addr, ((Score_Type)jcasType).casFeatCode_answer, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    