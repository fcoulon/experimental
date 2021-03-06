/**
 */
package org.sample.melangeproject.capellawithmass.pa.deployment;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentAspect#getOwnedConfigurations <em>Owned Configurations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentAspect#getOwnedDeploymentAspects <em>Owned Deployment Aspects</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage#getDeploymentAspect()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='DeploymentAspect'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='eng.DeploymentAspect'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a grouping of deployment configurations, with a specific applicative meaning\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface DeploymentAspect extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Configurations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage#getDeploymentAspect_OwnedConfigurations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedConfigurations'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the deployment configurations associated to this deployment aspect\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which DeploymentConfiguration stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<DeploymentConfiguration> getOwnedConfigurations();

	/**
	 * Returns the value of the '<em><b>Owned Deployment Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Deployment Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Deployment Aspects</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage#getDeploymentAspect_OwnedDeploymentAspects()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedAspects'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the sub packages contained under this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which AbstractCapabilityPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<DeploymentAspect> getOwnedDeploymentAspects();

} // DeploymentAspect
