/**
 */
package org.sample.melangeproject.capellawithmass.ctx;

import org.sample.melangeproject.capellawithmass.capellacore.Involvement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Capability Involvement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.ActorCapabilityInvolvement#getActor <em>Actor</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.ActorCapabilityInvolvement#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getActorCapabilityInvolvement()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ActorCapabilityInvolvement'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency' stereotype='eng.ActorCapabilityInvolvement'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link between a system actor and a system capability that means the actor is involved in the capability\r\n[source:Capella study]' usage\040guideline='n/a' used\040in\040levels='system' usage\040examples='../img/usage_examples/example_actor_capability.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 * @generated
 */
public interface ActorCapabilityInvolvement extends Involvement {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.ctx.Actor#getParticipationsInCapabilities <em>Participations In Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getActorCapabilityInvolvement_Actor()
	 * @see org.sample.melangeproject.capellawithmass.ctx.Actor#getParticipationsInCapabilities
	 * @model opposite="participationsInCapabilities" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='supplier' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='actor'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to a system actor that is involved in the system capability.\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.ctx.Capability#getInvolvedActors <em>Involved Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.ctx.CtxPackage#getActorCapabilityInvolvement_Capability()
	 * @see org.sample.melangeproject.capellawithmass.ctx.Capability#getInvolvedActors
	 * @model opposite="involvedActors" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='client' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='capability'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Link to the system capability involving the actor\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Capability getCapability();

} // ActorCapabilityInvolvement
