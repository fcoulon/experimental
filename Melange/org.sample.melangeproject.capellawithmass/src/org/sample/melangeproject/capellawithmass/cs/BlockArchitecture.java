/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractCapabilityPkg;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalArchitecture;

import org.sample.melangeproject.capellawithmass.information.DataPkg;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getProvisionedArchitectureAllocations <em>Provisioned Architecture Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getProvisioningArchitectureAllocations <em>Provisioning Architecture Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getAllocatedArchitectures <em>Allocated Architectures</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getAllocatingArchitectures <em>Allocating Architectures</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='BlockArchitecture'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Parent class for deriving specific architectures for each design phase\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Package' constraints='none'"
 * @generated
 */
public interface BlockArchitecture extends AbstractFunctionalArchitecture {
	/**
	 * Returns the value of the '<em><b>Owned Requirement Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.requirement.RequirementsPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Requirement Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Requirement Pkgs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_OwnedRequirementPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedRequirementPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to packages that contain requirements\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which RequirementsPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<RequirementsPkg> getOwnedRequirementPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Abstract Capability Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Abstract Capability Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Abstract Capability Pkg</em>' containment reference.
	 * @see #setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_OwnedAbstractCapabilityPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedAspectPkg'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to packages that contain capabilities\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which AbstractCapabilityPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [1..1]'"
	 * @generated
	 */
	AbstractCapabilityPkg getOwnedAbstractCapabilityPkg();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Abstract Capability Pkg</em>' containment reference.
	 * @see #getOwnedAbstractCapabilityPkg()
	 * @generated
	 */
	void setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg value);

	/**
	 * Returns the value of the '<em><b>Owned Interface Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interface Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interface Pkg</em>' containment reference.
	 * @see #setOwnedInterfacePkg(InterfacePkg)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_OwnedInterfacePkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedInterfacePkg'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to packages that contain interfaces\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which InterfacePkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	InterfacePkg getOwnedInterfacePkg();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Interface Pkg</em>' containment reference.
	 * @see #getOwnedInterfacePkg()
	 * @generated
	 */
	void setOwnedInterfacePkg(InterfacePkg value);

	/**
	 * Returns the value of the '<em><b>Owned Data Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Data Pkg</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Data Pkg</em>' containment reference.
	 * @see #setOwnedDataPkg(DataPkg)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_OwnedDataPkg()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedDataPkg'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to packages that contain data\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which DataPkg stereotype or any stereotype that inherits from it is applied\r\nMultiplicity must be [0..1]'"
	 * @generated
	 */
	DataPkg getOwnedDataPkg();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture#getOwnedDataPkg <em>Owned Data Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Data Pkg</em>' containment reference.
	 * @see #getOwnedDataPkg()
	 * @generated
	 */
	void setOwnedDataPkg(DataPkg value);

	/**
	 * Returns the value of the '<em><b>Provisioned Architecture Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation#getAllocatingArchitecture <em>Allocating Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provisioned Architecture Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisioned Architecture Allocations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_ProvisionedArchitectureAllocations()
	 * @see org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation#getAllocatingArchitecture
	 * @model opposite="allocatingArchitecture" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) list of allocation links to other architectures\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ArchitectureAllocation> getProvisionedArchitectureAllocations();

	/**
	 * Returns the value of the '<em><b>Provisioning Architecture Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation#getAllocatedArchitecture <em>Allocated Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provisioning Architecture Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provisioning Architecture Allocations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_ProvisioningArchitectureAllocations()
	 * @see org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation#getAllocatedArchitecture
	 * @model opposite="allocatedArchitecture" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) list of allocation links from other architectures to this one\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ArchitectureAllocation> getProvisioningArchitectureAllocations();

	/**
	 * Returns the value of the '<em><b>Allocated Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Architectures</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_AllocatedArchitectures()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) direct references to the BlockArchitectures that are allocated from this one\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<BlockArchitecture> getAllocatedArchitectures();

	/**
	 * Returns the value of the '<em><b>Allocating Architectures</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Architectures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Architectures</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getBlockArchitecture_AllocatingArchitectures()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) direct references to BlockArchitectures that allocate to this architecture\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<BlockArchitecture> getAllocatingArchitectures();

} // BlockArchitecture
