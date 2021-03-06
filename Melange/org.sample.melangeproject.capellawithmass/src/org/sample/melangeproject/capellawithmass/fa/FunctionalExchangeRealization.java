/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Exchange Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization#getRealizedFunctionalExchange <em>Realized Functional Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization#getRealizingFunctionalExchange <em>Realizing Functional Exchange</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchangeRealization()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Functional Exchange Realization'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a realization link between a functional exchange, and the (typically higher level) functional exchange that it realizes\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface FunctionalExchangeRealization extends Allocation {
	/**
	 * Returns the value of the '<em><b>Realized Functional Exchange</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getIncomingFunctionalExchangeRealizations <em>Incoming Functional Exchange Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Functional Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Functional Exchange</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchangeRealization_RealizedFunctionalExchange()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getIncomingFunctionalExchangeRealizations
	 * @model opposite="incomingFunctionalExchangeRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the functional exchange that is being realized by the other functional exchange involved in this relationship\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	FunctionalExchange getRealizedFunctionalExchange();

	/**
	 * Returns the value of the '<em><b>Realizing Functional Exchange</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getOutgoingFunctionalExchangeRealizations <em>Outgoing Functional Exchange Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Functional Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Functional Exchange</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchangeRealization_RealizingFunctionalExchange()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getOutgoingFunctionalExchangeRealizations
	 * @model opposite="outgoingFunctionalExchangeRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the functional exchange that is realising the other functional exchange involved in this relationship\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	FunctionalExchange getRealizingFunctionalExchange();

} // FunctionalExchangeRealization
