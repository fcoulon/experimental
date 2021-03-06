/**
 */
package org.sample.melangeproject.capellawithmass.fa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Exchange Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchangeRealization#getAllocatedComponentExchange <em>Allocated Component Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchangeRealization#getAllocatingComponentExchange <em>Allocating Component Exchange</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentExchangeRealization()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Connection Realization'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an allocation link between a connection, and another (typically lower level) connection that realizes it' usage\040guideline='this kind of link is typically generated automatically by the Capella tool when performing a transition between design levels' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface ComponentExchangeRealization extends ExchangeSpecificationRealization {
	/**
	 * Returns the value of the '<em><b>Allocated Component Exchange</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getIncomingComponentExchangeRealizations <em>Incoming Component Exchange Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Component Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Component Exchange</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentExchangeRealization_AllocatedComponentExchange()
	 * @see org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getIncomingComponentExchangeRealizations
	 * @model opposite="incomingComponentExchangeRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the connection that is being allocated by/from the other connection involved in this link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	ComponentExchange getAllocatedComponentExchange();

	/**
	 * Returns the value of the '<em><b>Allocating Component Exchange</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getOutgoingComponentExchangeRealizations <em>Outgoing Component Exchange Realizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Component Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Component Exchange</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentExchangeRealization_AllocatingComponentExchange()
	 * @see org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getOutgoingComponentExchangeRealizations
	 * @model opposite="outgoingComponentExchangeRealizations" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the connection that is allocating that other connection involved in this link \r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	ComponentExchange getAllocatingComponentExchange();

} // ComponentExchangeRealization
