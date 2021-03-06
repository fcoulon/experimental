/**
 */
package org.sample.melangeproject.capellawithmass.capellacore;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.information.Operation;

import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.GeneralClass#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.GeneralClass#getContainedOperations <em>Contained Operations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.GeneralClass#getNestedGeneralClasses <em>Nested General Classes</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getGeneralClass()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='GeneralClass'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Classifier'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an abstract concept allowing the nesting of classes in classes\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Class' constraints='none'"
 * @generated
 */
public interface GeneralClass extends Classifier, FinalizableElement {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getGeneralClass_Visibility()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the visibility of this class (refer to VisibilityKind definition)\r\n[source: Capella study]' constraints='none' type='refer to VisibilityKind' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::visibility' explanation='none' constraints='none'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.capellacore.GeneralClass#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Contained Operations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getGeneralClass_ContainedOperations()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedOperation' featureOwner='GeneralClass'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='operations'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The operations owned by the general class. The association is ordered\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Class:ownedOperation' explanation='Derived and transient but mapped to ease the transformation : pick the corresponding containment reference that stores Operations, in uml::Class' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFeatures'"
	 * @generated
	 */
	EList<Operation> getContainedOperations();

	/**
	 * Returns the value of the '<em><b>Nested General Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacore.GeneralClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested General Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested General Classes</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getGeneralClass_NestedGeneralClasses()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='nestedClassifier' featureOwner='Class'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='nestedGeneralClasses'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the classes contained/nested into this class\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='uml::Class::nestedClassifier || uml::Interface::nestedClassifier' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFeatures'"
	 * @generated
	 */
	EList<GeneralClass> getNestedGeneralClasses();

} // GeneralClass
