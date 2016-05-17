/**
 */
package org.sample.melangeproject.capellawithmass.capellacore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.PropertyValueGroup#getValuedElements <em>Valued Elements</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getPropertyValueGroup()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Package that contain property values\r\n[Capella study]' usage\040guideline='none' used\040in\040levels='operational, system, logical, physical, epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Comment' explanation='none' constraints='none'"
 * @generated
 */
public interface PropertyValueGroup extends Namespace {
	/**
	 * Returns the value of the '<em><b>Valued Elements</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacore.CapellaElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valued Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valued Elements</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage#getPropertyValueGroup_ValuedElements()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the model elements to which this property group is applied\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<CapellaElement> getValuedElements();

} // PropertyValueGroup
