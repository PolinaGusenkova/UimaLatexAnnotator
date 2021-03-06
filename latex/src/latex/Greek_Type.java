
/* First created by JCasGen Wed Jul 15 14:35:43 MSK 2015 */
package latex;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Mon Jul 27 13:44:55 MSK 2015
 * @generated */
public class Greek_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Greek_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Greek_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Greek(addr, Greek_Type.this);
  			   Greek_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Greek(addr, Greek_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Greek.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("latex.Greek");



  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "latex.Greek");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "latex.Greek");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  
 
  /** @generated */
  final Feature casFeat_upperIndex;
  /** @generated */
  final int     casFeatCode_upperIndex;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getUpperIndex(int addr) {
        if (featOkTst && casFeat_upperIndex == null)
      jcas.throwFeatMissing("upperIndex", "latex.Greek");
    return ll_cas.ll_getStringValue(addr, casFeatCode_upperIndex);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setUpperIndex(int addr, String v) {
        if (featOkTst && casFeat_upperIndex == null)
      jcas.throwFeatMissing("upperIndex", "latex.Greek");
    ll_cas.ll_setStringValue(addr, casFeatCode_upperIndex, v);}
    
  
 
  /** @generated */
  final Feature casFeat_lowerIndex;
  /** @generated */
  final int     casFeatCode_lowerIndex;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getLowerIndex(int addr) {
        if (featOkTst && casFeat_lowerIndex == null)
      jcas.throwFeatMissing("lowerIndex", "latex.Greek");
    return ll_cas.ll_getStringValue(addr, casFeatCode_lowerIndex);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setLowerIndex(int addr, String v) {
        if (featOkTst && casFeat_lowerIndex == null)
      jcas.throwFeatMissing("lowerIndex", "latex.Greek");
    ll_cas.ll_setStringValue(addr, casFeatCode_lowerIndex, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Greek_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

 
    casFeat_upperIndex = jcas.getRequiredFeatureDE(casType, "upperIndex", "uima.cas.String", featOkTst);
    casFeatCode_upperIndex  = (null == casFeat_upperIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_upperIndex).getCode();

 
    casFeat_lowerIndex = jcas.getRequiredFeatureDE(casType, "lowerIndex", "uima.cas.String", featOkTst);
    casFeatCode_lowerIndex  = (null == casFeat_lowerIndex) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lowerIndex).getCode();

  }
}



    