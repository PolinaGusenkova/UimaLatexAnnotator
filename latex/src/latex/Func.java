

/* First created by JCasGen Thu Jul 09 17:08:58 MSK 2015 */
package latex;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Jul 27 13:44:55 MSK 2015
 * XML source: D:/workspace11/latex/desc/latexAnnotator/LatexAnnotator.xml
 * @generated */
public class Func extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Func.class);
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
  protected Func() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Func(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Func(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Func(JCas jcas, int begin, int end) {
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
    if (Func_Type.featOkTst && ((Func_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "latex.Func");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Func_Type)jcasType).casFeatCode_name);}
    
  /** setter for name - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setName(String v) {
    if (Func_Type.featOkTst && ((Func_Type)jcasType).casFeat_name == null)
      jcasType.jcas.throwFeatMissing("name", "latex.Func");
    jcasType.ll_cas.ll_setStringValue(addr, ((Func_Type)jcasType).casFeatCode_name, v);}    
   
    
  //*--------------*
  //* Feature: expression

  /** getter for expression - gets 
   * @generated
   * @return value of the feature 
   */
  public String getExpression() {
    if (Func_Type.featOkTst && ((Func_Type)jcasType).casFeat_expression == null)
      jcasType.jcas.throwFeatMissing("expression", "latex.Func");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Func_Type)jcasType).casFeatCode_expression);}
    
  /** setter for expression - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setExpression(String v) {
    if (Func_Type.featOkTst && ((Func_Type)jcasType).casFeat_expression == null)
      jcasType.jcas.throwFeatMissing("expression", "latex.Func");
    jcasType.ll_cas.ll_setStringValue(addr, ((Func_Type)jcasType).casFeatCode_expression, v);}    
  }

    