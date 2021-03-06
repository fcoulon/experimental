/**
 */
package org.sample.melangeproject.capellawithmass.capellamodeller;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.KeyValue;
import org.sample.melangeproject.capellawithmass.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.Project#getKeyValuePairs <em>Key Value Pairs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.Project#getOwnedFolders <em>Owned Folders</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.Project#getOwnedModelRoots <em>Owned Model Roots</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getProject()
 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Model' stereotype='core.Project'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Project is the model root of a Capella model\r\n[source:Capella study]' usage\040guideline='A Project is the model root of a Capella model' used\040in\040levels='operational, system, logical, physical, epbs' usage\040examples='None' constraints='None' comment/notes='None' reference\040documentation='None'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface Project extends Structure {
	/**
	 * Returns the value of the '<em><b>Key Value Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacore.KeyValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Value Pairs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Value Pairs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getProject_KeyValuePairs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedComment' featureOwner='Element'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a list of key/value pairs applying to this Project\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Element::ownedComment' explanation='none' constraints='uml::Element::ownedComment elements on which KeyValue stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedArchitectures'"
	 * @generated
	 */
	EList<KeyValue> getKeyValuePairs();

	/**
	 * Returns the value of the '<em><b>Owned Folders</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellamodeller.Folder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Folders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Folders</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getProject_OwnedFolders()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of folders owned by the project\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which Folder stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<Folder> getOwnedFolders();

	/**
	 * Returns the value of the '<em><b>Owned Model Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellamodeller.ModelRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Roots</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getProject_OwnedModelRoots()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of system engineering elements\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ModelRoot stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ModelRoot> getOwnedModelRoots();

} // Project
