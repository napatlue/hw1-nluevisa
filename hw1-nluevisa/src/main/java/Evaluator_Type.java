
/* First created by JCasGen Tue Sep 10 15:07:41 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** evaluate the answer score from analysis engine by selecting top N highest score answer where N is number of correct answer
 * Updated by JCasGen Tue Sep 10 20:34:23 EDT 2013
 * @generated */
public class Evaluator_Type extends BaseAnnotaion_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Evaluator_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Evaluator_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Evaluator(addr, Evaluator_Type.this);
  			   Evaluator_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Evaluator(addr, Evaluator_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Evaluator.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Evaluator");
 
  /** @generated */
  final Feature casFeat_AnswerScoreList;
  /** @generated */
  final int     casFeatCode_AnswerScoreList;
  /** @generated */ 
  public int getAnswerScoreList(int addr) {
        if (featOkTst && casFeat_AnswerScoreList == null)
      jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    return ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList);
  }
  /** @generated */    
  public void setAnswerScoreList(int addr, int v) {
        if (featOkTst && casFeat_AnswerScoreList == null)
      jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    ll_cas.ll_setRefValue(addr, casFeatCode_AnswerScoreList, v);}
    
   /** @generated */
  public int getAnswerScoreList(int addr, int i) {
        if (featOkTst && casFeat_AnswerScoreList == null)
      jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList), i);
  }
   
  /** @generated */ 
  public void setAnswerScoreList(int addr, int i, int v) {
        if (featOkTst && casFeat_AnswerScoreList == null)
      jcas.throwFeatMissing("AnswerScoreList", "Evaluator");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_AnswerScoreList), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_precision;
  /** @generated */
  final int     casFeatCode_precision;
  /** @generated */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "Evaluator");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_precision);
  }
  /** @generated */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_precision == null)
      jcas.throwFeatMissing("precision", "Evaluator");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_precision, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Evaluator_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_AnswerScoreList = jcas.getRequiredFeatureDE(casType, "AnswerScoreList", "uima.cas.FSArray", featOkTst);
    casFeatCode_AnswerScoreList  = (null == casFeat_AnswerScoreList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_AnswerScoreList).getCode();

 
    casFeat_precision = jcas.getRequiredFeatureDE(casType, "precision", "uima.cas.Double", featOkTst);
    casFeatCode_precision  = (null == casFeat_precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_precision).getCode();

  }
}



    