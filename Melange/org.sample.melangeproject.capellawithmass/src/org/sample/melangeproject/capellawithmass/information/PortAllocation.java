/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.PortAllocation#getAllocatedPort <em>Allocated Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.PortAllocation#getAllocatingPort <em>Allocating Port</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getPortAllocation()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specific kind of allocation link, between two Ports.\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML::Allocations::Allocate' explanation='none' constraints='none'"
 * @generated
 */
public interface PortAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Allocated Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Port#getIncomingPortAllocations <em>Incoming Port Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getPortAllocation_AllocatedPort()
	 * @see org.sample.melangeproject.capellawithmass.information.Port#getIncomingPortAllocations
	 * @model opposite="incomingPortAllocations" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the \"destination\" of the allocation link : the port that is being allocated by another port\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Port getAllocatedPort();

	/**
	 * Returns the value of the '<em><b>Allocating Port</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Port#getOutgoingPortAllocations <em>Outgoing Port Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getPortAllocation_AllocatingPort()
	 * @see org.sample.melangeproject.capellawithmass.information.Port#getOutgoingPortAllocations
	 * @model opposite="outgoingPortAllocations" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the \"source\" of the allocation link : the port that is allocating the other port\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Port getAllocatingPort();

} // PortAllocation
