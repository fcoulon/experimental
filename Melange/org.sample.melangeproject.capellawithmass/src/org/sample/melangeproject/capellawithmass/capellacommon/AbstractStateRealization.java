/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract State Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractStateRealization#getRealizedAbstractState <em>Realized Abstract State</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractStateRealization#getRealizingAbstractState <em>Realizing Abstract State</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractStateRealization()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an AbstractStateRealization is a specific kind of allocation link between two AbstractStates (typically of different design levels, or of different nature)\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='none' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractStateRealization extends Allocation {
	/**
	 * Returns the value of the '<em><b>Realized Abstract State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Abstract State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Abstract State</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractStateRealization_RealizedAbstractState()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='destination of the realization link : the abstract state that is being realized\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractState getRealizedAbstractState();

	/**
	 * Returns the value of the '<em><b>Realizing Abstract State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Abstract State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Abstract State</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getAbstractStateRealization_RealizingAbstractState()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the source of the realization link : the abstract state that is realizing another abstract state\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractState getRealizingAbstractState();

} // AbstractStateRealization
