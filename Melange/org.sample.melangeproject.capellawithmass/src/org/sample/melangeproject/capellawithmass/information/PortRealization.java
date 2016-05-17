/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.PortRealization#getRealizedPort <em>Realized Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.PortRealization#getRealizingPort <em>Realizing Port</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getPortRealization()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a PortRealization is a specific kind of allocation link between two Ports (typically of different design levels, or of different nature)\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='../img/usage_examples/port_realization.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface PortRealization extends Allocation {
	/**
	 * Returns the value of the '<em><b>Realized Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Port#getIncomingPortRealizations <em>Incoming Port Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getPortRealization_RealizedPort()
	 * @see org.sample.melangeproject.capellawithmass.information.Port#getIncomingPortRealizations
	 * @model opposite="incomingPortRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='destiniation of the port realization : the port that is being realized\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Port getRealizedPort();

	/**
	 * Returns the value of the '<em><b>Realizing Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Port#getOutgoingPortRealizations <em>Outgoing Port Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getPortRealization_RealizingPort()
	 * @see org.sample.melangeproject.capellawithmass.information.Port#getOutgoingPortRealizations
	 * @model opposite="outgoingPortRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the source of the Port realization : the port that is realizing another port\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Port getRealizingPort();

} // PortRealization
