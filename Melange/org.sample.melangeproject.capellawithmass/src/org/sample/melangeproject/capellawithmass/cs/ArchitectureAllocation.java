/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation#getAllocatedArchitecture <em>Allocated Architecture</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation#getAllocatingArchitecture <em>Allocating Architecture</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getArchitectureAllocation()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ArchitectureAllocation'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Mediator class between BlockArchitecture elements, to represent an allocation link\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Realization' constraints='none'"
 * @generated
 */
public interface ArchitectureAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Allocated Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getProvisioningArchitectureAllocations <em>Provisioning Architecture Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Architecture</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getArchitectureAllocation_AllocatedArchitecture()
	 * @see org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getProvisioningArchitectureAllocations
	 * @model opposite="provisioningArchitectureAllocations" required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the allocated architecture\r\n[source: Capella study]\r\n\r\nSpecifies the targets of the DirectedRelationship.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	BlockArchitecture getAllocatedArchitecture();

	/**
	 * Returns the value of the '<em><b>Allocating Architecture</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getProvisionedArchitectureAllocations <em>Provisioned Architecture Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Architecture</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getArchitectureAllocation_AllocatingArchitecture()
	 * @see org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getProvisionedArchitectureAllocations
	 * @model opposite="provisionedArchitectureAllocations" required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the allocating architecture\r\n[source: Capella study]\r\n\r\nSpecifies the sources of the DirectedRelationship.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	BlockArchitecture getAllocatingArchitecture();

} // ArchitectureAllocation
