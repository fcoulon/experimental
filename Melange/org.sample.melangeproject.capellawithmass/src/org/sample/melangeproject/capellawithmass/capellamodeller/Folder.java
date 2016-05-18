/**
 */
package org.sample.melangeproject.capellawithmass.capellamodeller;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.Folder#getOwnedFolders <em>Owned Folders</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.Folder#getOwnedModelRoots <em>Owned Model Roots</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getFolder()
 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Package' stereotype='core.Folder'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a container for structuring the storage of models\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical, epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface Folder extends Structure {
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
	 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getFolder_OwnedFolders()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Sub folders of this folder\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='Order must be computed'"
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
	 * @see org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage#getFolder_OwnedModelRoots()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Package'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of system engineering elements\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which ModelRoot stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ModelRoot> getOwnedModelRoots();

} // Folder
