/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Exchange Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeSpecification#getFunctionalExchanges <em>Functional Exchanges</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchangeSpecification()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Functional Exchange Specification'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Connector' stereotype='eng.Exchange'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a specialized version of an exchange specification, dedicated to specify exchanges between two functions of the system\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::InformationFlow' explanation='none' constraints='none'"
 * @generated
 */
public interface FunctionalExchangeSpecification extends ExchangeSpecification {
	/**
	 * Returns the value of the '<em><b>Functional Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Exchanges</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchangeSpecification_FunctionalExchanges()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the functional exchanges that fulfill this specification\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchange> getFunctionalExchanges();

} // FunctionalExchangeSpecification
