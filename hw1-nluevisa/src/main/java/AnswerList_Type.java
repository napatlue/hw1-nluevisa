
/* First created by JCasGen Mon Sep 09 23:32:30 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** List of all possible answers read from the input file
 * Updated by JCasGen Tue Sep 10 20:34:23 EDT 2013
 * @generated */
public class AnswerList_Type extends BaseAnnotaion_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnswerList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnswerList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnswerList(addr, AnswerList_Type.this);
  			   AnswerList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnswerList(addr, AnswerList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnswerList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnswerList");
 
  /** @generated */
  final Feature casFeat_list;
  /** @generated */
  final int     casFeatCode_list;
  /** @generated */ 
  public int getList(int addr) {
        if (featOkTst && casFeat_list == null)
      jcas.throwFeatMissing("list", "AnswerList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_list);
  }
  /** @generated */    
  public void setList(int addr, int v) {
        if (featOkTst && casFeat_list == null)
      jcas.throwFeatMissing("list", "AnswerList");
    ll_cas.ll_setRefValue(addr, casFeatCode_list, v);}
    
   /** @generated */
  public int getList(int addr, int i) {
        if (featOkTst && casFeat_list == null)
      jcas.throwFeatMissing("list", "AnswerList");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_list), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_list), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_list), i);
  }
   
  /** @generated */ 
  public void setList(int addr, int i, int v) {
        if (featOkTst && casFeat_list == null)
      jcas.throwFeatMissing("list", "AnswerList");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_list), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_list), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_list), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_numTotalAnswer;
  /** @generated */
  final int     casFeatCode_numTotalAnswer;
  /** @generated */ 
  public int getNumTotalAnswer(int addr) {
        if (featOkTst && casFeat_numTotalAnswer == null)
      jcas.throwFeatMissing("numTotalAnswer", "AnswerList");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numTotalAnswer);
  }
  /** @generated */    
  public void setNumTotalAnswer(int addr, int v) {
        if (featOkTst && casFeat_numTotalAnswer == null)
      jcas.throwFeatMissing("numTotalAnswer", "AnswerList");
    ll_cas.ll_setIntValue(addr, casFeatCode_numTotalAnswer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_numCorrectAnswer;
  /** @generated */
  final int     casFeatCode_numCorrectAnswer;
  /** @generated */ 
  public int getNumCorrectAnswer(int addr) {
        if (featOkTst && casFeat_numCorrectAnswer == null)
      jcas.throwFeatMissing("numCorrectAnswer", "AnswerList");
    return ll_cas.ll_getIntValue(addr, casFeatCode_numCorrectAnswer);
  }
  /** @generated */    
  public void setNumCorrectAnswer(int addr, int v) {
        if (featOkTst && casFeat_numCorrectAnswer == null)
      jcas.throwFeatMissing("numCorrectAnswer", "AnswerList");
    ll_cas.ll_setIntValue(addr, casFeatCode_numCorrectAnswer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnswerList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_list = jcas.getRequiredFeatureDE(casType, "list", "uima.cas.FSArray", featOkTst);
    casFeatCode_list  = (null == casFeat_list) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_list).getCode();

 
    casFeat_numTotalAnswer = jcas.getRequiredFeatureDE(casType, "numTotalAnswer", "uima.cas.Integer", featOkTst);
    casFeatCode_numTotalAnswer  = (null == casFeat_numTotalAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numTotalAnswer).getCode();

 
    casFeat_numCorrectAnswer = jcas.getRequiredFeatureDE(casType, "numCorrectAnswer", "uima.cas.Integer", featOkTst);
    casFeatCode_numCorrectAnswer  = (null == casFeat_numCorrectAnswer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_numCorrectAnswer).getCode();

  }
}



    