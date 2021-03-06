/**
 */
package org.sample.melangeproject.capellawithmass.oa;

import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swimlane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.Swimlane#getRepresentedEntity <em>Represented Entity</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getSwimlane()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a partition/subset of an activity\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::ActivityPartition' explanation='' constraints='none'"
 * @generated
 */
public interface Swimlane extends NamedElement, ActivityPartition {
	/**
	 * Returns the value of the '<em><b>Represented Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Entity</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.oa.OaPackage#getSwimlane_RepresentedEntity()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the entity to which that elements in this swimlane are being allocated\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Entity getRepresentedEntity();

} // Swimlane
