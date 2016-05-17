/**
 */
package org.sample.melangeproject.capellawithmass.fa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionRealization#getAllocatedFunction <em>Allocated Function</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionRealization#getAllocatingFunction <em>Allocating Function</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionRealization()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an allocation link between a function, and the function that it realizes\r\n[source: Capella study]' usage\040guideline='this link is typically generated by the Capella tool during automated transitions between design levels' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface FunctionRealization extends AbstractFunctionAllocation {
	/**
	 * Returns the value of the '<em><b>Allocated Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunction#getInFunctionRealizations <em>In Function Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Function</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionRealization_AllocatedFunction()
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunction#getInFunctionRealizations
	 * @model opposite="inFunctionRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the function that is being allocated by/from the other function\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractFunction getAllocatedFunction();

	/**
	 * Returns the value of the '<em><b>Allocating Function</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunction#getOutFunctionRealizations <em>Out Function Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Function</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionRealization_AllocatingFunction()
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunction#getOutFunctionRealizations
	 * @model opposite="outFunctionRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the function that allocates (to) the other function\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractFunction getAllocatingFunction();

} // FunctionRealization