

/* First created by JCasGen Wed Jul 15 16:30:20 MSK 2015 */
package latex;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Jul 27 13:44:55 MSK 2015
 * XML source: D:/workspace11/latex/desc/latexAnnotator/LatexAnnotator.xml
 * @generated */
public class LetterVar extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(LetterVar.class);
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
  protected LetterVar() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public LetterVar(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public LetterVar(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public LetterVar(JCas jcas, int begin, int end) {
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
  //* Feature: name

  /** getter for name - gets 
   * @generated
   * @return value of the feature 
   */
  public String getName() {
    if (LetterVar_Type.featOkTst && ((LetterVar_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "latex.LetterVar");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LetterVar_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (LetterVar_Type.featOkTst && ((LetterVar_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "latex.LetterVar");
    jcasType.ll_cas.ll_setStringValue(addr, ((LetterVar_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: upperIndex

  /** getter for upperIndex - gets 
   * @generated
   * @return value of the feature 
   */
  public String getUpperIndex() {
    if (LetterVar_Type.featOkTst && ((LetterVar_Type)jcasType).casFeat_upperIndex == null)
      jcasType.jcas.throwFeatMissing("upperIndex", "latex.LetterVar");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LetterVar_Type)jcasType).casFeatCode_upperIndex);}
    
  /** setter for upperIndex - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setUpperIndex(String v) {
    if (LetterVar_Type.featOkTst && ((LetterVar_Type)jcasType).casFeat_upperIndex == null)
      jcasType.jcas.throwFeatMissing("upperIndex", "latex.LetterVar");
    jcasType.ll_cas.ll_setStringValue(addr, ((LetterVar_Type)jcasType).casFeatCode_upperIndex, v);}    
   
    
  //*--------------*
  //* Feature: lowerIndex

  /** getter for lowerIndex - gets 
   * @generated
   * @return value of the feature 
   */
  public String getLowerIndex() {
    if (LetterVar_Type.featOkTst && ((LetterVar_Type)jcasType).casFeat_lowerIndex == null)
      jcasType.jcas.throwFeatMissing("lowerIndex", "latex.LetterVar");
    return jcasType.ll_cas.ll_getStringValue(addr, ((LetterVar_Type)jcasType).casFeatCode_lowerIndex);}
    
  /** setter for lowerIndex - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setLowerIndex(String v) {
    if (LetterVar_Type.featOkTst && ((LetterVar_Type)jcasType).casFeat_lowerIndex == null)
      jcasType.jcas.throwFeatMissing("lowerIndex", "latex.LetterVar");
    jcasType.ll_cas.ll_setStringValue(addr, ((LetterVar_Type)jcasType).casFeatCode_lowerIndex, v);}    
  }

    