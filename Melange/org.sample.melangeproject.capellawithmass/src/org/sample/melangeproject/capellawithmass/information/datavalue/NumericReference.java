/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue;

import org.sample.melangeproject.capellawithmass.information.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.NumericReference#getReferencedValue <em>Referenced Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.NumericReference#getReferencedProperty <em>Referenced Property</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getNumericReference()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='NumericReference'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Expression' stereotype='eng.NumericReference'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a reference to a numeric value, allowing the reuse of numeric values across data value structures\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='none' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Expression' explanation='none' constraints='none'"
 * @generated
 */
public interface NumericReference extends NumericValue {
	/**
	 * Returns the value of the '<em><b>Referenced Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Value</em>' reference.
	 * @see #setReferencedValue(NumericValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getNumericReference_ReferencedValue()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='reference'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the numeric value being referenced\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	NumericValue getReferencedValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datavalue.NumericReference#getReferencedValue <em>Referenced Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Value</em>' reference.
	 * @see #getReferencedValue()
	 * @generated
	 */
	void setReferencedValue(NumericValue value);

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
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getNumericReference_ReferencedProperty()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='reference'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the property that uses this reference\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	Property getReferencedProperty();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datavalue.NumericReference#getReferencedProperty <em>Referenced Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Property</em>' reference.
	 * @see #getReferencedProperty()
	 * @generated
	 */
	void setReferencedProperty(Property value);

} // NumericReference
