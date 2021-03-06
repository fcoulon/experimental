/**
 */
package org.sample.melangeproject.capellawithmass.la;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.fa.FunctionPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Function Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg#getOwnedLogicalFunctions <em>Owned Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunctionPkg()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contains logical function elements\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='logical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface LogicalFunctionPkg extends FunctionPkg {
	/**
	 * Returns the value of the '<em><b>Owned Logical Functions</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.la.LogicalFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Logical Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Logical Functions</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunctionPkg_OwnedLogicalFunctions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='logical function elements contained in this package\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which LogicalFunction stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalFunction> getOwnedLogicalFunctions();

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
	 * @see org.sample.melangeproject.capellawithmass.la.LaPackage#getLogicalFunctionPkg_OwnedLogicalFunctionPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of subpackages that contain logical function elements\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which LogicalFunctionPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs();

} // LogicalFunctionPkg
