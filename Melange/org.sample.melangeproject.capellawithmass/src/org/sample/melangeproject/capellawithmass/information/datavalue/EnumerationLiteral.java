/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationLiteral#getDomainValue <em>Domain Value</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getEnumerationLiteral()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='EnumerationLiteral'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='EnumerationLiteral' stereotype='eng.EnumerationLiteral'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A value specification composed of a finite list of predefined values\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::EnumerationLiteral' explanation='none' constraints='none'"
 * @generated
 */
public interface EnumerationLiteral extends AbstractEnumerationValue {
	/**
	 * Returns the value of the '<em><b>Domain Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Value</em>' containment reference.
	 * @see #setDomainValue(DataValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getEnumerationLiteral_DomainValue()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	DataValue getDomainValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationLiteral#getDomainValue <em>Domain Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Value</em>' containment reference.
	 * @see #getDomainValue()
	 * @generated
	 */
	void setDomainValue(DataValue value);

} // EnumerationLiteral
