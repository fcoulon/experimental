/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation#getRole <em>Role</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.RoleAllocation#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRoleAllocation()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Allocation link between an operational role and an operational entity\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML::Allocations::Allocate' explanation='none' constraints='none'"
 * @generated
 */
public interface RoleAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.Role#getRoleAllocations <em>Role Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRoleAllocation_Role()
	 * @see org.sample.melangeproject.capellawithmass.oa.Role#getRoleAllocations
	 * @model opposite="roleAllocations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the operational role involved in this allocation link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Role getRole();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.Entity#getRoleAllocations <em>Role Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getRoleAllocation_Entity()
	 * @see org.sample.melangeproject.capellawithmass.oa.Entity#getRoleAllocations
	 * @model opposite="roleAllocations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the operational entity involved in this allocation link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Entity getEntity();

} // RoleAllocation
