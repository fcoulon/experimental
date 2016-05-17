/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.ActivityAllocation#getRole <em>Role</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.ActivityAllocation#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getActivityAllocation()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='allocation relationship between an operational role and an operational activity\r\n[source: Capella study]' usage\040guideline='In Capella, these allocations are created using the \"Operational Role Blank\" diagram' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='SysML::Allocations::Allocate' explanation='none' constraints='none'"
 * @generated
 */
public interface ActivityAllocation extends Allocation {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.Role#getActivityAllocations <em>Activity Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getActivityAllocation_Role()
	 * @see org.sample.melangeproject.capellawithmass.oa.Role#getActivityAllocations
	 * @model opposite="activityAllocations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Operational role involved in this allocation relationship\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Role getRole();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.OperationalActivity#getActivityAllocations <em>Activity Allocations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getActivityAllocation_Activity()
	 * @see org.sample.melangeproject.capellawithmass.oa.OperationalActivity#getActivityAllocations
	 * @model opposite="activityAllocations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Operational activity involved in this allocation relationship\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	OperationalActivity getActivity();

} // ActivityAllocation
