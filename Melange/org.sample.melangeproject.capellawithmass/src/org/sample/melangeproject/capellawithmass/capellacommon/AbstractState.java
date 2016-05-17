/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

import org.sample.melangeproject.capellawithmass.modellingcore.IState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState#getOwnedAbstractStateRealizations <em>Owned Abstract State Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState#getRealizedAbstractStates <em>Realized Abstract States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState#getRealizingAbstractStates <em>Realizing Abstract States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState#getInvolverRegions <em>Involver Regions</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an abstract base class to define various kinds of states (typically real states and pseudo states)\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractState extends NamedElement, IState {
	/**
	 * Returns the value of the '<em><b>Owned Abstract State Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractStateRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Abstract State Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Abstract State Realizations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState_OwnedAbstractStateRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the realization links that are owned/contained in this AbstractState\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which AbstractStateRealization stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<AbstractStateRealization> getOwnedAbstractStateRealizations();

	/**
	 * Returns the value of the '<em><b>Realized Abstract States</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Abstract States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Abstract States</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState_RealizedAbstractStates()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AbstractState> getRealizedAbstractStates();

	/**
	 * Returns the value of the '<em><b>Realizing Abstract States</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Abstract States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Abstract States</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState_RealizingAbstractStates()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<AbstractState> getRealizingAbstractStates();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.StateTransition}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.capellacommon.StateTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState_Outgoing()
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.StateTransition#getSource
	 * @model opposite="source"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the transitions departing from this vertex.\r\n[source:UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Transition::source' constraints='Order must be computed'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<StateTransition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.StateTransition}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.capellacommon.StateTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState_Incoming()
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.StateTransition#getTarget
	 * @model opposite="target"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the transitions entering this vertex.\r\n[source:UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Transition::target' constraints='Order must be computed'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<StateTransition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Involver Regions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.capellacommon.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involver Regions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involver Regions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractState_InvolverRegions()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Region> getInvolverRegions();

} // AbstractState
