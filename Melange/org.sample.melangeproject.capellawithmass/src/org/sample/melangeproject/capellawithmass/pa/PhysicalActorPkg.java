/**
 */
package org.sample.melangeproject.capellawithmass.pa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalStructure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Actor Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.PhysicalActorPkg#getOwnedPhysicalActorPkgs <em>Owned Physical Actor Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.PhysicalActorPkg#getOwnedPhysicalActors <em>Owned Physical Actors</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.pa.PaPackage#getPhysicalActorPkg()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='PhysicalActorPkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.PhysicalActorPkg'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a container for physical actors entities\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface PhysicalActorPkg extends AbstractFunctionalStructure {
	/**
	 * Returns the value of the '<em><b>Owned Physical Actor Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.pa.PhysicalActorPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Actor Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Actor Pkgs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.pa.PaPackage#getPhysicalActorPkg_OwnedPhysicalActorPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedActorPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the sub-(physical actor) packages contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which PhysicalActorPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<PhysicalActorPkg> getOwnedPhysicalActorPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Physical Actors</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.pa.PhysicalActor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Actors</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.pa.PaPackage#getPhysicalActorPkg_OwnedPhysicalActors()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedActors'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the physical actor entities contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which PhysicalActor stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<PhysicalActor> getOwnedPhysicalActors();

} // PhysicalActorPkg
