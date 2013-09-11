

/* First created by JCasGen Mon Sep 09 23:32:30 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;


/** List of all possible answers read from the input file
 * Updated by JCasGen Tue Sep 10 20:34:23 EDT 2013
 * XML source: /Users/napatluevisadpaibul/Documents/workspace/hw1-nluevisa/src/main/resources/hw1-nluevisa-typesystem.xml
 * @generated */
public class AnswerList extends BaseAnnotaion {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerList.class);
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
  protected AnswerList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerList(JCas jcas, int begin, int end) {
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
  //* Feature: list

  /** getter for list - gets array of all answers from the input flie
   * @generated */
  public FSArray getList() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_list == null)
      jcasType.jcas.throwFeatMissing("list", "AnswerList");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_list)));}
    
  /** setter for list - sets array of all answers from the input flie 
   * @generated */
  public void setList(FSArray v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_list == null)
      jcasType.jcas.throwFeatMissing("list", "AnswerList");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_list, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for list - gets an indexed value - array of all answers from the input flie
   * @generated */
  public Answer getList(int i) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_list == null)
      jcasType.jcas.throwFeatMissing("list", "AnswerList");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_list), i);
    return (Answer)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_list), i)));}

  /** indexed setter for list - sets an indexed value - array of all answers from the input flie
   * @generated */
  public void setList(int i, Answer v) { 
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_list == null)
      jcasType.jcas.throwFeatMissing("list", "AnswerList");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_list), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_list), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: numTotalAnswer

  /** getter for numTotalAnswer - gets total number of answers in the list
   * @generated */
  public int getNumTotalAnswer() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_numTotalAnswer == null)
      jcasType.jcas.throwFeatMissing("numTotalAnswer", "AnswerList");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerList_Type)jcasType).casFeatCode_numTotalAnswer);}
    
  /** setter for numTotalAnswer - sets total number of answers in the list 
   * @generated */
  public void setNumTotalAnswer(int v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_numTotalAnswer == null)
      jcasType.jcas.throwFeatMissing("numTotalAnswer", "AnswerList");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerList_Type)jcasType).casFeatCode_numTotalAnswer, v);}    
   
    
  //*--------------*
  //* Feature: numCorrectAnswer

  /** getter for numCorrectAnswer - gets total number of correct answer
   * @generated */
  public int getNumCorrectAnswer() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_numCorrectAnswer == null)
      jcasType.jcas.throwFeatMissing("numCorrectAnswer", "AnswerList");
    return jcasType.ll_cas.ll_getIntValue(addr, ((AnswerList_Type)jcasType).casFeatCode_numCorrectAnswer);}
    
  /** setter for numCorrectAnswer - sets total number of correct answer 
   * @generated */
  public void setNumCorrectAnswer(int v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_numCorrectAnswer == null)
      jcasType.jcas.throwFeatMissing("numCorrectAnswer", "AnswerList");
    jcasType.ll_cas.ll_setIntValue(addr, ((AnswerList_Type)jcasType).casFeatCode_numCorrectAnswer, v);}    
  }

    