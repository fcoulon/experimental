/**
 */
package org.sample.melangeproject.capellawithmass.ctx;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

import org.sample.melangeproject.capellawithmass.la.LogicalFunction;

import org.sample.melangeproject.capellawithmass.oa.OperationalActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getAllocatorActors <em>Allocator Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getAllocatorSystems <em>Allocator Systems</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getRealizedOperationalActivities <em>Realized Operational Activities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getRealizingLogicalFunctions <em>Realizing Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getContainedSystemFunctions <em>Contained System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getChildrenSystemFunctions <em>Children System Functions</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Function at System level\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='../img/usage_examples/example_systemfunction.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Activity' explanation='All functions are mapped to Activities. Parent activities refer to children activities via CallBehaviorActions' constraints='none'"
 * @generated
 */
public interface SystemFunction extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned System Function Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.SystemFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Function Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Function Pkgs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_OwnedSystemFunctionPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='sub (function) package under this function' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='' constraints='uml::Package::nestedPackage elements on which SystemFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<SystemFunctionPkg> getOwnedSystemFunctionPkgs();

	/**
	 * Returns the value of the '<em><b>Allocator Actors</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.Actor}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.ctx.Actor#getAllocatedSystemFunctions <em>Allocated System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Actors</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_AllocatorActors()
	 * @see org.sample.melangeproject.capellawithmass.ctx.Actor#getAllocatedSystemFunctions
	 * @model opposite="allocatedSystemFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Actor> getAllocatorActors();

	/**
	 * Returns the value of the '<em><b>Allocator Systems</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.System}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.ctx.System#getAllocatedSystemFunctions <em>Allocated System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Systems</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Systems</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_AllocatorSystems()
	 * @see org.sample.melangeproject.capellawithmass.ctx.System#getAllocatedSystemFunctions
	 * @model opposite="allocatedSystemFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<org.sample.melangeproject.capellawithmass.ctx.System> getAllocatorSystems();

	/**
	 * Returns the value of the '<em><b>Realized Operational Activities</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.OperationalActivity}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.oa.OperationalActivity#getRealizingSystemFunctions <em>Realizing System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Operational Activities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Operational Activities</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_RealizedOperationalActivities()
	 * @see org.sample.melangeproject.capellawithmass.oa.OperationalActivity#getRealizingSystemFunctions
	 * @model opposite="realizingSystemFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<OperationalActivity> getRealizedOperationalActivities();

	/**
	 * Returns the value of the '<em><b>Realizing Logical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalFunction}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getRealizedSystemFunctions <em>Realized System Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Logical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Logical Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_RealizingLogicalFunctions()
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalFunction#getRealizedSystemFunctions
	 * @model opposite="realizedSystemFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalFunction> getRealizingLogicalFunctions();

	/**
	 * Returns the value of the '<em><b>Contained System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained System Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_ContainedSystemFunctions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFunctions'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<SystemFunction> getContainedSystemFunctions();

	/**
	 * Returns the value of the '<em><b>Children System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children System Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getSystemFunction_ChildrenSystemFunctions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of children system functions\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<SystemFunction> getChildrenSystemFunctions();

} // SystemFunction
