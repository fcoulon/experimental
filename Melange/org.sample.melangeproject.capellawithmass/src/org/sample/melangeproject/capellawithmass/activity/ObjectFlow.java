/**
 */
package org.sample.melangeproject.capellawithmass.activity;

import org.sample.melangeproject.capellawithmass.behavior.AbstractBehavior;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#getSelection <em>Selection</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getObjectFlow()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='An object flow models the flow of values to or from object nodes\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a (guideline)' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::ObjectFlow' constraints='none'"
 * @generated
 */
public interface ObjectFlow extends ActivityEdge {
	/**
	 * Returns the value of the '<em><b>Is Multicast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multicast</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multicast</em>' attribute.
	 * @see #setIsMulticast(boolean)
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getObjectFlow_IsMulticast()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Tells whether the objects in the flow are passed by multicasting\r\n[source: UML superstructure v2.2]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ObjectFlow:isMulticast' explanation='' constraints='The cardinality of uml::ObjectFlow::isMulticast is [1..1].'"
	 * @generated
	 */
	boolean isIsMulticast();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#isIsMulticast <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multicast</em>' attribute.
	 * @see #isIsMulticast()
	 * @generated
	 */
	void setIsMulticast(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Multireceive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Multireceive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Multireceive</em>' attribute.
	 * @see #setIsMultireceive(boolean)
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getObjectFlow_IsMultireceive()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Tells whether the objects in the flow are gathered from respondents to multicasting\r\n[source: UML superstructure v2.2]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ObjectFlow::isMultireceive' explanation='none' constraints='Cardinality of uml::ObjectFlow::isMultiReceive is [1..1]'"
	 * @generated
	 */
	boolean isIsMultireceive();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#isIsMultireceive <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Multireceive</em>' attribute.
	 * @see #isIsMultireceive()
	 * @generated
	 */
	void setIsMultireceive(boolean value);

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(AbstractBehavior)
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getObjectFlow_Transformation()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Changes or replaces data tokens flowing along edge\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ObjectFlow::transformation' explanation='' constraints='none'"
	 * @generated
	 */
	AbstractBehavior getTransformation();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(AbstractBehavior value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(AbstractBehavior)
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getObjectFlow_Selection()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Selects tokens from a source object node\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::ObjectFlow::selection' explanation='none' constraints='none'"
	 * @generated
	 */
	AbstractBehavior getSelection();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.activity.ObjectFlow#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(AbstractBehavior value);

} // ObjectFlow
