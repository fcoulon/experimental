/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon;

import org.sample.melangeproject.capellawithmass.capellacore.Involvement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Realization Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvement#getInvolvedCapabilityRealizationInvolvedElement <em>Involved Capability Realization Involved Element</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getCapabilityRealizationInvolvement()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an involvement relationship of an entity in the capability that it realizes\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface CapabilityRealizationInvolvement extends Involvement {
	/**
	 * Returns the value of the '<em><b>Involved Capability Realization Involved Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved Capability Realization Involved Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved Capability Realization Involved Element</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getCapabilityRealizationInvolvement_InvolvedCapabilityRealizationInvolvedElement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the involved element\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	CapabilityRealizationInvolvedElement getInvolvedCapabilityRealizationInvolvedElement();

} // CapabilityRealizationInvolvement
