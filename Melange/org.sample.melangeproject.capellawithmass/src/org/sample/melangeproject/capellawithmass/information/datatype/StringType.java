/**
 */
package org.sample.melangeproject.capellawithmass.information.datatype;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractStringValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage#getStringType()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='StringType'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='DataType' stereotype='eng.StringType'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A string is a sequence of characters in some suitable character set used to display information about the model\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::DataType' explanation='none' constraints='none'"
 * @generated
 */
public interface StringType extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #setOwnedDefaultValue(AbstractStringValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage#getStringType_OwnedDefaultValue()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='defaultValue'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the default value for this data type\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='none' constraints='Elements on which StringValue stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	AbstractStringValue getOwnedDefaultValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedDefaultValue <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Default Value</em>' containment reference.
	 * @see #getOwnedDefaultValue()
	 * @generated
	 */
	void setOwnedDefaultValue(AbstractStringValue value);

	/**
	 * Returns the value of the '<em><b>Owned Null Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Null Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #setOwnedNullValue(AbstractStringValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage#getStringType_OwnedNullValue()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='nullValue'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the neutral value for this data type\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='none' constraints='Elements on which StringValue stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	AbstractStringValue getOwnedNullValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedNullValue <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Null Value</em>' containment reference.
	 * @see #getOwnedNullValue()
	 * @generated
	 */
	void setOwnedNullValue(AbstractStringValue value);

	/**
	 * Returns the value of the '<em><b>Owned Min Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Min Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Min Length</em>' containment reference.
	 * @see #setOwnedMinLength(NumericValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage#getStringType_OwnedMinLength()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='minLength'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specification of the minimum length of the string\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='none' constraints='Elements on which FunctionRealization stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	NumericValue getOwnedMinLength();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedMinLength <em>Owned Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Min Length</em>' containment reference.
	 * @see #getOwnedMinLength()
	 * @generated
	 */
	void setOwnedMinLength(NumericValue value);

	/**
	 * Returns the value of the '<em><b>Owned Max Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Max Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Max Length</em>' containment reference.
	 * @see #setOwnedMaxLength(NumericValue)
	 * @see org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage#getStringType_OwnedMaxLength()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='maxLength'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specification of the maximum length of the string\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='none' constraints='Elements on which UnlimitedNaturalValue stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	NumericValue getOwnedMaxLength();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.datatype.StringType#getOwnedMaxLength <em>Owned Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Max Length</em>' containment reference.
	 * @see #getOwnedMaxLength()
	 * @generated
	 */
	void setOwnedMaxLength(NumericValue value);

} // StringType
