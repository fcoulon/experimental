/**
 */
package org.sample.melangeproject.capellawithmass.capellacore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.Involvement#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.Involvement#getInvolved <em>Involved</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getInvolvement()
 * @model interface="true" abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link that denotes some involvement relationship of an element that is involved in another one\r\n[Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical, epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Dependency' constraints='none'"
 * @generated
 */
public interface Involvement extends Relationship {
	/**
	 * Returns the value of the '<em><b>Involver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involver</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involver</em>' reference.
	 * @see #setInvolver(InvolverElement)
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getInvolvement_Involver()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to the element that involves\r\n[Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::client' explanation='none' constraints='Multiplicity must be [0..1]'"
	 * @generated
	 */
	InvolverElement getInvolver();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.capellacore.Involvement#getInvolver <em>Involver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involver</em>' reference.
	 * @see #getInvolver()
	 * @generated
	 */
	void setInvolver(InvolverElement value);

	/**
	 * Returns the value of the '<em><b>Involved</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved</em>' reference.
	 * @see #setInvolved(InvolvedElement)
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getInvolvement_Involved()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to the element that is involved\r\n[Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::supplier' explanation='none' constraints='Multiplicity must be [0..1]'"
	 * @generated
	 */
	InvolvedElement getInvolved();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.capellacore.Involvement#getInvolved <em>Involved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Involved</em>' reference.
	 * @see #getInvolved()
	 * @generated
	 */
	void setInvolved(InvolvedElement value);

} // Involvement
