/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.sample.melangeproject.capellawithmass.capellacore.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Containment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment#getExchange <em>Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeContainment()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ExchangeContainment'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency' stereotype='eng.ExchangeContainment'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a mediator class allowing to implement a referencing between an Exchange and an ExchangeLink\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 * @generated
 */
public interface ExchangeContainment extends Relationship {
	/**
	 * Returns the value of the '<em><b>Exchange</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange</em>' reference.
	 * @see #setExchange(ExchangeSpecification)
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeContainment_Exchange()
	 * @see org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification#getLink
	 * @model opposite="link" required="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='supplier' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='exchange'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange (specification) involved in this relationship\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::supplier' explanation='none' constraints='Multiplicity must be [1..1]'"
	 * @generated
	 */
	ExchangeSpecification getExchange();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment#getExchange <em>Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange</em>' reference.
	 * @see #getExchange()
	 * @generated
	 */
	void setExchange(ExchangeSpecification value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getExchangeContainmentLinks <em>Exchange Containment Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference.
	 * @see #setLink(ExchangeLink)
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeContainment_Link()
	 * @see org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getExchangeContainmentLinks
	 * @model opposite="exchangeContainmentLinks" required="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='client' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='link'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange link involved in this relationship\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::client' explanation='none' constraints='Multiplicity must be [1..1]'"
	 * @generated
	 */
	ExchangeLink getLink();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment#getLink <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(ExchangeLink value);

} // ExchangeContainment
