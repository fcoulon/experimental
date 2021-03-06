/**
 */
package org.sample.melangeproject.capellawithmass.ctx;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractCapabilityPkg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.CapabilityPkg#getOwnedCapabilities <em>Owned Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.CapabilityPkg#getOwnedCapabilityPkgs <em>Owned Capability Pkgs</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getCapabilityPkg()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='CapabilityPkg'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.CapabilityPkg'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contains system capabilities\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface CapabilityPkg extends AbstractCapabilityPkg {
	/**
	 * Returns the value of the '<em><b>Owned Capabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capabilities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capabilities</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getCapabilityPkg_OwnedCapabilities()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='capabilities'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of system capabilities that are defined at that level of package\r\n[Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<Capability> getOwnedCapabilities();

	/**
	 * Returns the value of the '<em><b>Owned Capability Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.ctx.CapabilityPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Capability Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Capability Pkgs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getCapabilityPkg_OwnedCapabilityPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='subCapabilityPkgs'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Sub pakages that contain system capabilities\r\n[Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<CapabilityPkg> getOwnedCapabilityPkgs();

} // CapabilityPkg
