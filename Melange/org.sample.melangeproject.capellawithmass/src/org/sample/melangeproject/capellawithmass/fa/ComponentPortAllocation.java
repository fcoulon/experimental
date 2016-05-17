/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

import org.sample.melangeproject.capellawithmass.information.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Port Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocation#getOwnedComponentPortAllocationEnds <em>Owned Component Port Allocation Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocation#getAllocatedPort <em>Allocated Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocation#getAllocatingPort <em>Allocating Port</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentPortAllocation()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specific kind of allocation link, between two Ports.\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML::Allocations::Allocate' explanation='none' constraints='none'"
 * @generated
 */
public interface ComponentPortAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Owned Component Port Allocation Ends</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocationEnd}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocationEnd#getOwningComponentPortAllocation <em>Owning Component Port Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Port Allocation Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Port Allocation Ends</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentPortAllocation_OwnedComponentPortAllocationEnds()
	 * @see org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocationEnd#getOwningComponentPortAllocation
	 * @model opposite="owningComponentPortAllocation" containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the component port allocation endpoints involved in this link\r\n\r\nA connector consists of at least two connector ends, each representing the participation of instances of the classifiers\r\ntyping the connectable elements attached to this end. The set of connector ends is ordered.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Connector::end' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<ComponentPortAllocationEnd> getOwnedComponentPortAllocationEnds();

	/**
	 * Returns the value of the '<em><b>Allocated Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentPortAllocation_AllocatedPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the \"destination\" of the allocation link : the port that is being allocated by another port\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Port getAllocatedPort();

	/**
	 * Returns the value of the '<em><b>Allocating Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentPortAllocation_AllocatingPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the \"source\" of the allocation link : the port that is allocating the other port\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Port getAllocatingPort();

} // ComponentPortAllocation
