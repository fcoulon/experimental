/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ComponentAllocation#getAllocatedComponent <em>Allocated Component</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ComponentAllocation#getAllocatingComponent <em>Allocating Component</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getComponentAllocation()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ComponentAllocation'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Mediator class between Component elements, representing the allocation link between these elements\r\n[source: Capella light-light study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::ComponentRealization or uml::InterfaceRealization regarding the baseMetaClass of the realized element' constraints='none'"
 * @generated
 */
public interface ComponentAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Allocated Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.Component#getProvisioningComponentAllocations <em>Provisioning Component Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Component</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getComponentAllocation_AllocatedComponent()
	 * @see org.sample.melangeproject.capellawithmass.cs.Component#getProvisioningComponentAllocations
	 * @model opposite="provisioningComponentAllocations" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the allocated component\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Component getAllocatedComponent();

	/**
	 * Returns the value of the '<em><b>Allocating Component</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.Component#getProvisionedComponentAllocations <em>Provisioned Component Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Component</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getComponentAllocation_AllocatingComponent()
	 * @see org.sample.melangeproject.capellawithmass.cs.Component#getProvisionedComponentAllocations
	 * @model opposite="provisionedComponentAllocations" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the allocating component\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Component getAllocatingComponent();

} // ComponentAllocation
