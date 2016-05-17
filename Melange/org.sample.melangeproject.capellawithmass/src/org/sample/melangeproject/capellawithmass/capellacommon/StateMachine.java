/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractBehavior;

import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.StateMachine#getOwnedRegions <em>Owned Regions</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getStateMachine()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='State machines can be used to express the behavior of part of a system. Behavior is modeled as a traversal of a graph of\r\nstate nodes interconnected by one or more joined transition arcs that are triggered by the dispatching of series of (event)\r\noccurrences. During this traversal, the state machine executes a series of activities associated with various elements of the\r\nstate machine.\r\n[source: UML superstructure v2.2]\r\n' usage\040guideline='a state machine is created (usually through the creation of a state or mode diagram, declaring states, modes, and transitions between them) as a support to specify the dynamic behavior of an entity' used\040in\040levels='operational, system, logical, physical' usage\040examples='../img/usage_examples/example_statemachine.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::StateMachine' explanation='none' constraints='none'"
 * @generated
 */
public interface StateMachine extends CapellaElement, AbstractBehavior {
	/**
	 * Returns the value of the '<em><b>Owned Regions</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Regions</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getStateMachine_OwnedRegions()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The regions owned directly by the state machine.\r\n[source:UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::StateMachine::region' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<Region> getOwnedRegions();

} // StateMachine
