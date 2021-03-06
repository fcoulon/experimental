/**
 */
package org.sample.melangeproject.capellawithmass.capellamodeller;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Engineering Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.SystemEngineeringPkg#getOwnedSystemEngineerings <em>Owned System Engineerings</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getSystemEngineeringPkg()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='SystemEngineeringPkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.SystemEngineeringPkg'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contains system engineering elements\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical, epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface SystemEngineeringPkg extends Structure, ModelRoot {
	/**
	 * Returns the value of the '<em><b>Owned System Engineerings</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellamodeller.SystemEngineering}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System Engineerings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System Engineerings</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getSystemEngineeringPkg_OwnedSystemEngineerings()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedSystemEngineerings'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of system engineering elements\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<SystemEngineering> getOwnedSystemEngineerings();

} // SystemEngineeringPkg
