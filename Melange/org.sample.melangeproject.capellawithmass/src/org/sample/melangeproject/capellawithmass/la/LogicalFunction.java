/**
 */
package org.sample.melangeproject.capellawithmass.la;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

import org.sample.melangeproject.capellawithmass.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getAllocatorLogicalActors <em>Allocator Logical Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getAllocatorLogicalComponents <em>Allocator Logical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getRealizedSystemFunctions <em>Realized System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getRealizingPhysicalFunctions <em>Realizing Physical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getContainedLogicalFunctions <em>Contained Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction#getChildrenLogicalFunctions <em>Children Logical Functions</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Function at Logical level' usage\040guideline='n/a' used\040in\040levels='logical' usage\040examples='../img/usage_examples/example_logicalfunction.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Activity' explanation='All functions are mapped to (empty) activities' constraints='none'"
 * @generated
 */
public interface LogicalFunction extends AbstractFunction {
	/**
	 * Returns the value of the '<em><b>Owned Logical Function Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Function Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Function Pkgs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_OwnedLogicalFunctionPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of subpackages that contain logical function elements' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which LogicalFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs();

	/**
	 * Returns the value of the '<em><b>Allocator Logical Actors</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalActor}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.la.LogicalActor#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Logical Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Logical Actors</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_AllocatorLogicalActors()
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalActor#getAllocatedLogicalFunctions
	 * @model opposite="allocatedLogicalFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalActor> getAllocatorLogicalActors();

	/**
	 * Returns the value of the '<em><b>Allocator Logical Components</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalComponent}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.la.LogicalComponent#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Logical Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Logical Components</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_AllocatorLogicalComponents()
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalComponent#getAllocatedLogicalFunctions
	 * @model opposite="allocatedLogicalFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalComponent> getAllocatorLogicalComponents();

	/**
	 * Returns the value of the '<em><b>Realized System Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getRealizingLogicalFunctions <em>Realizing Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized System Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized System Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_RealizedSystemFunctions()
	 * @see org.sample.melangeproject.capellawithmass.ctx.SystemFunction#getRealizingLogicalFunctions
	 * @model opposite="realizingLogicalFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<SystemFunction> getRealizedSystemFunctions();

	/**
	 * Returns the value of the '<em><b>Realizing Physical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.pa.PhysicalFunction}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.pa.PhysicalFunction#getRealizedLogicalFunctions <em>Realized Logical Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Physical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Physical Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_RealizingPhysicalFunctions()
	 * @see org.sample.melangeproject.capellawithmass.pa.PhysicalFunction#getRealizedLogicalFunctions
	 * @model opposite="realizedLogicalFunctions" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<PhysicalFunction> getRealizingPhysicalFunctions();

	/**
	 * Returns the value of the '<em><b>Contained Logical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Logical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Logical Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_ContainedLogicalFunctions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFunctions'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalFunction> getContainedLogicalFunctions();

	/**
	 * Returns the value of the '<em><b>Children Logical Functions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Logical Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Logical Functions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunction_ChildrenLogicalFunctions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of children logical functions\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<LogicalFunction> getChildrenLogicalFunctions();

} // LogicalFunction
