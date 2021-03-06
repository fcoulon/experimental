/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue;

import org.sample.melangeproject.capellawithmass.information.datatype.Enumeration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.AbstractEnumerationValue#getEnumerationType <em>Enumeration Type</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getAbstractEnumerationValue()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Base class for defining type-specific enumeration values\r\n[source: Capella light-light study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='' constraints='none'"
 * @generated
 */
public interface AbstractEnumerationValue extends DataValue {
	/**
	 * Returns the value of the '<em><b>Enumeration Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Type</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage#getAbstractEnumerationValue_EnumerationType()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='type' featureOwner='TypedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='type'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the type of the data being valued\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='abstractType' excludefrom='xmlpivot'"
	 * @generated
	 */
	Enumeration getEnumerationType();

} // AbstractEnumerationValue
