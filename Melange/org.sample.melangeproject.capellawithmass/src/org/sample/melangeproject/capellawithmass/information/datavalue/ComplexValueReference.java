/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue;

import org.sample.melangeproject.capellawithmass.information.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValueReference#getReferencedValue <em>Referenced Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValueReference#getReferencedProperty <em>Referenced Property</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getComplexValueReference()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A reference to a complex value\r\n[source: Capella light-light study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Expression' explanation='uml::LiteralSpecification' constraints='none'"
 * @generated
 */
public interface ComplexValueReference extends AbstractComplexValue {
	/**
	 * Returns the value of the '<em><b>Referenced Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Value</em>' reference.
	 * @see #setReferencedValue(AbstractComplexValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getComplexValueReference_ReferencedValue()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the complex value being referenced' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	AbstractComplexValue getReferencedValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValueReference#getReferencedValue <em>Referenced Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Value</em>' reference.
	 * @see #getReferencedValue()
	 * @generated
	 */
	void setReferencedValue(AbstractComplexValue value);

	/**
	 * Returns the value of the '<em><b>Referenced Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Property</em>' reference.
	 * @see #setReferencedProperty(Property)
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getComplexValueReference_ReferencedProperty()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='reference'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the property that uses this reference\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	Property getReferencedProperty();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValueReference#getReferencedProperty <em>Referenced Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Property</em>' reference.
	 * @see #getReferencedProperty()
	 * @generated
	 */
	void setReferencedProperty(Property value);

} // ComplexValueReference
