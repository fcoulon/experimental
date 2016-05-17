/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Structure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.ConceptPkg#getOwnedConceptPkgs <em>Owned Concept Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.ConceptPkg#getOwnedConcepts <em>Owned Concepts</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getConceptPkg()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='container for operational concepts\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface ConceptPkg extends Structure {
	/**
	 * Returns the value of the '<em><b>Owned Concept Pkgs</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.ConceptPkg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Concept Pkgs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Concept Pkgs</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getConceptPkg_OwnedConceptPkgs()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='concept packages contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::nestedPackage#uml::Package::packagedElement' explanation='none' constraints='uml::Package::nestedPackage elements on which ConceptPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ConceptPkg> getOwnedConceptPkgs();

	/**
	 * Returns the value of the '<em><b>Owned Concepts</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.oa.Concept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Concepts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Concepts</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getConceptPkg_OwnedConcepts()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Operational concepts contained in this package\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Package::packagedElement' explanation='none' constraints='uml::Package::packagedElement elements on which Concept stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<Concept> getOwnedConcepts();

} // ConceptPkg
