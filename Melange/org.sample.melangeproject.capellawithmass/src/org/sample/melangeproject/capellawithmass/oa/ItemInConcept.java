/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item In Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.ItemInConcept#getConcept <em>Concept</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.ItemInConcept#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getItemInConcept()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Mediator class for a relationship between an operational concept and a concept item\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 * @generated
 */
public interface ItemInConcept extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(Concept)
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getItemInConcept_Concept()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the operational concept involved in the relationship implemented by this element\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::client' explanation='none' constraints='Multiplicity must be [1..1]'"
	 * @generated
	 */
	Concept getConcept();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.oa.ItemInConcept#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Concept value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(AbstractConceptItem)
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getItemInConcept_Item()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the concept item involved in the relationship implemented by this element\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::supplier' explanation='none' constraints='Multiplicity must be [1..1]'"
	 * @generated
	 */
	AbstractConceptItem getItem();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.oa.ItemInConcept#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(AbstractConceptItem value);

} // ItemInConcept
