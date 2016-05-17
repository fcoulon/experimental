/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacommon.StateMachine;

import org.sample.melangeproject.capellawithmass.capellacore.GeneralClass;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#isIsPrimitive <em>Is Primitive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#getKeyParts <em>Key Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#getOwnedInformationRealizations <em>Owned Information Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#getRealizedClasses <em>Realized Classes</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Class#getRealizingClasses <em>Realizing Classes</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Class'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Class' stereotype='eng.Class'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A class describes a set of objects that share the same specifications of features, constraints, and semantics\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a (Abstract)' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Class' explanation='none' constraints='none'"
 * @generated
 */
public interface Class extends GeneralClass {
	/**
	 * Returns the value of the '<em><b>Is Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primitive</em>' attribute.
	 * @see #setIsPrimitive(boolean)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_IsPrimitive()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='isPrimitive' featureOwner='eng.Class' fromStereotype='true'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='indicates whether or not the class inherits from a parent class.\r\n[source: Capella study]' constraints='none' type='\"true\" means that there is no super class that this class inherits from.' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	boolean isIsPrimitive();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Class#isIsPrimitive <em>Is Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primitive</em>' attribute.
	 * @see #isIsPrimitive()
	 * @generated
	 */
	void setIsPrimitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Key Parts</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.KeyPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Parts</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_KeyParts()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='keyParts'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The KeyPart elements owned by this class\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::clientDependency' explanation='none' constraints='uml::NamedElement::clientDependency elements on which KeyPart stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<KeyPart> getKeyParts();

	/**
	 * Returns the value of the '<em><b>Owned State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.StateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned State Machines</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_OwnedStateMachines()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the state machines associated to this class, supporting the characterization of its dynamic behavior\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Class::nestedClassifier' explanation='none' constraints='uml::Class::nestedClassifier elements on which StateMachine stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<StateMachine> getOwnedStateMachines();

	/**
	 * Returns the value of the '<em><b>Owned Data Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.datavalue.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Values</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_OwnedDataValues()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of DataValue elements owned by this class\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='Elements are contained in the nearest possible parent container.' constraints='uml::NamedElement::clientDependency elements on which DataValue stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<DataValue> getOwnedDataValues();

	/**
	 * Returns the value of the '<em><b>Owned Information Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.InformationRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Information Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Information Realizations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_OwnedInformationRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<InformationRealization> getOwnedInformationRealizations();

	/**
	 * Returns the value of the '<em><b>Realized Classes</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.Class}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Class#getRealizingClasses <em>Realizing Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Classes</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_RealizedClasses()
	 * @see org.sample.melangeproject.capellawithmass.information.Class#getRealizingClasses
	 * @model opposite="realizingClasses" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='class(es) realized by this class' constraints='none' comment/notes='none'"
	 * @generated
	 */
	EList<Class> getRealizedClasses();

	/**
	 * Returns the value of the '<em><b>Realizing Classes</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.Class}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Class#getRealizedClasses <em>Realized Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Classes</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getClass_RealizingClasses()
	 * @see org.sample.melangeproject.capellawithmass.information.Class#getRealizedClasses
	 * @model opposite="realizedClasses" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='class(es) realizing this class' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Class> getRealizingClasses();

} // Class
