/**
 */
package org.sample.melangeproject.capellawithmass.modellingcore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship#getRealizedFlow <em>Realized Flow</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getAbstractRelationship()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Relationship'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Element'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A relationship references one or more related elements. Relationship is an abstract metaclass\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a (Abstract)' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Relationship' constraints=''"
 * @generated
 */
public interface AbstractRelationship extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Realized Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Flow</em>' reference.
	 * @see #setRealizedFlow(AbstractInformationFlow)
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getAbstractRelationship_RealizedFlow()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the information flow that this relationship realizes\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::InformationFlow::realization' constraints='Multiplicity must be [0..1]'"
	 * @generated
	 */
	AbstractInformationFlow getRealizedFlow();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship#getRealizedFlow <em>Realized Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized Flow</em>' reference.
	 * @see #getRealizedFlow()
	 * @generated
	 */
	void setRealizedFlow(AbstractInformationFlow value);

} // AbstractRelationship
