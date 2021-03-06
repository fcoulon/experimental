/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Event Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.StateEventRealization#getRealizedEvent <em>Realized Event</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.StateEventRealization#getRealizingEvent <em>Realizing Event</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getStateEventRealization()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a StateEventRealization is a specific kind of realization link between two StateEvent (typically of different design levels, or of different nature)\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='none' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface StateEventRealization extends Allocation {
	/**
	 * Returns the value of the '<em><b>Realized Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Event</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getStateEventRealization_RealizedEvent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='destination of the realization link : the state event that is being realized\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	StateEvent getRealizedEvent();

	/**
	 * Returns the value of the '<em><b>Realizing Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Event</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getStateEventRealization_RealizingEvent()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the source of the realization link : the state event that is realizing another abstract state\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	StateEvent getRealizingEvent();

} // StateEventRealization
