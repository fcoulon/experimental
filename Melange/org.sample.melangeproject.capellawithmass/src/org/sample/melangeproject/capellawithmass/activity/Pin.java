/**
 */
package org.sample.melangeproject.capellawithmass.activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.Pin#isIsControl <em>Is Control</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getPin()
 * @model interface="true" abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A pin is a typed element and multiplicity element that provides values to actions and accepts result values from them\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a (abstract)' used\040in\040levels='n/a' usage\040examples='n/a' constraints='If the action is an invocation action, the number and types of pins must be the same as the number of parameters and\r\ntypes of the invoked behavior or behavioral feature. Pins are matched to parameters by order\r\n[source: UML superstructure v2.2]' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Pin' constraints='none'"
 * @generated
 */
public interface Pin extends ObjectNode {
	/**
	 * Returns the value of the '<em><b>Is Control</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Control</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Control</em>' attribute.
	 * @see #setIsControl(boolean)
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getPin_IsControl()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Tells whether the pins provide data to the actions, or just controls when it executes it.\r\n[source: UML superstructure v2.2]\r\n' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='Cardinality of uml::Pin::isControl is [1..1]'"
	 * @generated
	 */
	boolean isIsControl();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.activity.Pin#isIsControl <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Control</em>' attribute.
	 * @see #isIsControl()
	 * @generated
	 */
	void setIsControl(boolean value);

} // Pin
