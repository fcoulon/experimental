/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;

import org.sample.melangeproject.capellawithmass.ctx.Actor;

import org.sample.melangeproject.capellawithmass.modellingcore.InformationsExchanger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getRoleAllocations <em>Role Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getOrganisationalUnitMemberships <em>Organisational Unit Memberships</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getActualLocation <em>Actual Location</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getSubEntities <em>Sub Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getOwnedEntities <em>Owned Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getOwnedCommunicationMeans <em>Owned Communication Means</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getOwnedRoleAllocations <em>Owned Role Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getAllocatedRoles <em>Allocated Roles</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getRealizingSystems <em>Realizing Systems</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getRealizingActors <em>Realizing Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Entity#getInvolvingOperationalCapabilities <em>Involving Operational Capabilities</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='An Operational Entity is a thing or entity that occurs in the real world of which information is required about fact that need to be known.\r\nAn Operational Entity can be for instance: A operational node, an actor, an equipment...' usage\040guideline='n/a' arcadia_description='An Operational Entity is a real world entity (other system, device, group or organisation...), interacting with the system (or software, equipment, hardware...) under study, or with its users.' used\040in\040levels='operational' usage\040examples='../img/usage_examples/example_operational_entities.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML ::Blocks ::Block' explanation='' constraints='none'"
 * @generated
 */
public interface Entity extends AbstractConceptItem, InformationsExchanger, InvolvedElement {
	/**
	 * Returns the value of the '<em><b>Role Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Allocations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_RoleAllocations()
	 * @see org.sample.melangeproject.capellawithmass.oa.RoleAllocation#getEntity
	 * @model opposite="entity" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the allocation links between this operational entity and the operational roles\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<RoleAllocation> getRoleAllocations();

	/**
	 * Returns the value of the '<em><b>Organisational Unit Memberships</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.OrganisationalUnitComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisational Unit Memberships</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisational Unit Memberships</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_OrganisationalUnitMemberships()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of organisational units to which this Entity belongs\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Dependency::supplier' constraints='Order must be computed'"
	 * @generated
	 */
	EList<OrganisationalUnitComposition> getOrganisationalUnitMemberships();

	/**
	 * Returns the value of the '<em><b>Actual Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Location</em>' reference.
	 * @see #setActualLocation(Location)
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_ActualLocation()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Location where this Entity operates.\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	Location getActualLocation();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.oa.Entity#getActualLocation <em>Actual Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Location</em>' reference.
	 * @see #getActualLocation()
	 * @generated
	 */
	void setActualLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Sub Entities</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Entities</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_SubEntities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='sub-entities that have a derivation relationship from this entity\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Entity> getSubEntities();

	/**
	 * Returns the value of the '<em><b>Owned Entities</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entities</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_OwnedEntities()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Entities owned by this Entity' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='none'"
	 * @generated
	 */
	EList<Entity> getOwnedEntities();

	/**
	 * Returns the value of the '<em><b>Owned Communication Means</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.CommunicationMean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Communication Means</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Communication Means</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_OwnedCommunicationMeans()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='communication means associated to this Entity\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='since CommunicationMean is mapped to uml::InformationFlow, and no containment reference on Block is available to receive this' constraints='none'"
	 * @generated
	 */
	EList<CommunicationMean> getOwnedCommunicationMeans();

	/**
	 * Returns the value of the '<em><b>Owned Role Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Role Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Role Allocations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_OwnedRoleAllocations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='role allocation links owned by this Entity\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='some elements on which RoleAllocation stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<RoleAllocation> getOwnedRoleAllocations();

	/**
	 * Returns the value of the '<em><b>Allocated Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.OperationalActivity}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.OperationalActivity#getAllocatorEntities <em>Allocator Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operational Activities</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_AllocatedOperationalActivities()
	 * @see org.sample.melangeproject.capellawithmass.oa.OperationalActivity#getAllocatorEntities
	 * @model opposite="allocatorEntities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalActivity> getAllocatedOperationalActivities();

	/**
	 * Returns the value of the '<em><b>Allocated Roles</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Roles</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_AllocatedRoles()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Role> getAllocatedRoles();

	/**
	 * Returns the value of the '<em><b>Realizing Systems</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Systems</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_RealizingSystems()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<org.sample.melangeproject.capellawithmass.ctx.System> getRealizingSystems();

	/**
	 * Returns the value of the '<em><b>Realizing Actors</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.Actor}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.ctx.Actor#getRealizedEntities <em>Realized Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Actors</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_RealizingActors()
	 * @see org.sample.melangeproject.capellawithmass.ctx.Actor#getRealizedEntities
	 * @model opposite="realizedEntities" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Actor> getRealizingActors();

	/**
	 * Returns the value of the '<em><b>Involving Operational Capabilities</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.OperationalCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involving Operational Capabilities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involving Operational Capabilities</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getEntity_InvolvingOperationalCapabilities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<OperationalCapability> getInvolvingOperationalCapabilities();

} // Entity
