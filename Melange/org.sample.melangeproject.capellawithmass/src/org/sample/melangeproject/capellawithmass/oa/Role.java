/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Role#getOwnedRoleAssemblyUsages <em>Owned Role Assembly Usages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Role#getOwnedActivityAllocations <em>Owned Activity Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Role#getRoleAllocations <em>Role Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Role#getActivityAllocations <em>Activity Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Role#getAllocatingEntities <em>Allocating Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Role#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Role is a set of activities allocated to an actor or a system against another actor or system.' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML ::Blocks ::Block' explanation='none' constraints='none'"
 * @generated
 */
public interface Role extends AbstractInstance {
	/**
	 * Returns the value of the '<em><b>Owned Role Assembly Usages</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.RoleAssemblyUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Role Assembly Usages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Role Assembly Usages</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole_OwnedRoleAssemblyUsages()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of mediator elements establishing links between this role and parent/children roles\r\n[source: Capella study]' constraints='none' comment/notes='not used/implemented as of Capella 1.0.3'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Dependency::supplier' constraints='Order must be computed'"
	 * @generated
	 */
	EList<RoleAssemblyUsage> getOwnedRoleAssemblyUsages();

	/**
	 * Returns the value of the '<em><b>Owned Activity Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.ActivityAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Activity Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Activity Allocations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole_OwnedActivityAllocations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of allocations between roles and operational activities, that are stored/owned by this role\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which ActivityAllocation stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<ActivityAllocation> getOwnedActivityAllocations();

	/**
	 * Returns the value of the '<em><b>Role Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Allocations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole_RoleAllocations()
	 * @see org.sample.melangeproject.capellawithmass.oa.RoleAllocation#getRole
	 * @model opposite="role" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of allocations between this operational role, and operational entities\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<RoleAllocation> getRoleAllocations();

	/**
	 * Returns the value of the '<em><b>Activity Allocations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.ActivityAllocation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.ActivityAllocation#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Allocations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Allocations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole_ActivityAllocations()
	 * @see org.sample.melangeproject.capellawithmass.oa.ActivityAllocation#getRole
	 * @model opposite="role" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) list of allocations of this role to/from operation activities\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActivityAllocation> getActivityAllocations();

	/**
	 * Returns the value of the '<em><b>Allocating Entities</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Entities</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole_AllocatingEntities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Entity> getAllocatingEntities();

	/**
	 * Returns the value of the '<em><b>Allocated Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.OperationalActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Operational Activities</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRole_AllocatedOperationalActivities()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalActivity> getAllocatedOperationalActivities();

} // Role
