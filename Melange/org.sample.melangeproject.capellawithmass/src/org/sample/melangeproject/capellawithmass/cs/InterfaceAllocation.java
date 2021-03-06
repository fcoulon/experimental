/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation#getAllocatedInterface <em>Allocated Interface</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation#getAllocatingInterfaceAllocator <em>Allocating Interface Allocator</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getInterfaceAllocation()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='InterfaceRealization'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency' stereotype='eng.InterfaceRealization'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Mediator class between an Interface and an element that allocates to/from it.\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface InterfaceAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Allocated Interface</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.Interface#getProvisioningInterfaceAllocations <em>Provisioning Interface Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Interface</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getInterfaceAllocation_AllocatedInterface()
	 * @see org.sample.melangeproject.capellawithmass.cs.Interface#getProvisioningInterfaceAllocations
	 * @model opposite="provisioningInterfaceAllocations" required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the allocated interface\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Interface getAllocatedInterface();

	/**
	 * Returns the value of the '<em><b>Allocating Interface Allocator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator#getProvisionedInterfaceAllocations <em>Provisioned Interface Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Interface Allocator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Interface Allocator</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getInterfaceAllocation_AllocatingInterfaceAllocator()
	 * @see org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator#getProvisionedInterfaceAllocations
	 * @model opposite="provisionedInterfaceAllocations" required="true" transient="true" changeable="false" derived="true" ordered="false"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the allocating interface\r\n[source: Capella study]\r\n\r\nSpecifies the sources of the DirectedRelationship.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	InterfaceAllocator getAllocatingInterfaceAllocator();

} // InterfaceAllocation
