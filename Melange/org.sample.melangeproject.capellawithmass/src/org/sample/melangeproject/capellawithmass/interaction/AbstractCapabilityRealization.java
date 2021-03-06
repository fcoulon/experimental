/**
 */
package org.sample.melangeproject.capellawithmass.interaction;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.AbstractCapabilityRealization#getRealizedCapability <em>Realized Capability</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.AbstractCapabilityRealization#getRealizingCapability <em>Realizing Capability</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getAbstractCapabilityRealization()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='An abstract capability realization describes an realization between an realizing capability and an realized capability\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractCapabilityRealization extends Allocation {
	/**
	 * Returns the value of the '<em><b>Realized Capability</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.interaction.AbstractCapability#getIncomingCapabilityAllocation <em>Incoming Capability Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Capability</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getAbstractCapabilityRealization_RealizedCapability()
	 * @see org.sample.melangeproject.capellawithmass.interaction.AbstractCapability#getIncomingCapabilityAllocation
	 * @model opposite="incomingCapabilityAllocation" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the Capability being realized from the other Capability' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractCapability getRealizedCapability();

	/**
	 * Returns the value of the '<em><b>Realizing Capability</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.interaction.AbstractCapability#getOutgoingCapabilityAllocation <em>Outgoing Capability Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Capability</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getAbstractCapabilityRealization_RealizingCapability()
	 * @see org.sample.melangeproject.capellawithmass.interaction.AbstractCapability#getOutgoingCapabilityAllocation
	 * @model opposite="outgoingCapabilityAllocation" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the Capability starting the realization relationships towards the other capability\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractCapability getRealizingCapability();

} // AbstractCapabilityRealization
