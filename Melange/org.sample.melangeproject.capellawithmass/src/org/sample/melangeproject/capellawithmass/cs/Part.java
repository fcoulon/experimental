/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.information.Partition;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getDeployedParts <em>Deployed Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getDeployingParts <em>Deploying Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getOwnedAbstractType <em>Owned Abstract Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getValue <em>Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.Part#getCurrentMass <em>Current Mass</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='PhysicalPart'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Property' stereotype='eng.PhysicalPart'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='In SysML, a Part is an owned property of a Block\r\n[source: SysML glossary for SysML v1.0]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='should be mapped to uml::Property, but one of its concrete ancestors already is (Property), so avoid redefining it\r\nat this level to avoid profile generation issue' constraints='information::Property must have as base metaclass uml::Property'"
 * @generated
 */
public interface Part extends Partition, InformationsExchanger, DeployableElement, DeploymentTarget, AbstractPathInvolvedElement {
	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_ProvidedInterfaces()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='providedInterfaces'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(computed) the provided interfaces associated to the classifier that this part represents\r\n[source: Capella study]\r\n\r\nThe interfaces that the component exposes to its environment.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Interface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_RequiredInterfaces()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='requiredInterfaces'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(computed) the required interfaces associated to the classifier that this part represents\r\n[source: Capella study]\r\n\r\nThe interfaces that the component requires from other components in its environment in order to be able to offer\r\nits full set of provided functionality\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Interface> getRequiredInterfaces();

	/**
	 * Returns the value of the '<em><b>Owned Deployment Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.AbstractDeploymentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployment Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployment Links</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_OwnedDeploymentLinks()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Deployment relationships that are stored/owned under this part' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<AbstractDeploymentLink> getOwnedDeploymentLinks();

	/**
	 * Returns the value of the '<em><b>Deployed Parts</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Parts</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_DeployedParts()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Part> getDeployedParts();

	/**
	 * Returns the value of the '<em><b>Deploying Parts</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploying Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploying Parts</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_DeployingParts()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Part> getDeployingParts();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Abstract Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Abstract Type</em>' containment reference.
	 * @see #setOwnedAbstractType(AbstractType)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_OwnedAbstractType()
	 * @model containment="true"
	 * @generated
	 */
	AbstractType getOwnedAbstractType();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.Part#getOwnedAbstractType <em>Owned Abstract Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Abstract Type</em>' containment reference.
	 * @see #getOwnedAbstractType()
	 * @generated
	 */
	void setOwnedAbstractType(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.Part#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_MaxValue()
	 * @model
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.Part#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_MinValue()
	 * @model
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.Part#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Current Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Mass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Mass</em>' attribute.
	 * @see #setCurrentMass(int)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPart_CurrentMass()
	 * @model
	 * @generated
	 */
	int getCurrentMass();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.Part#getCurrentMass <em>Current Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Mass</em>' attribute.
	 * @see #getCurrentMass()
	 * @generated
	 */
	void setCurrentMass(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isOverhead();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isSatured();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int computeMass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void print();

} // Part
