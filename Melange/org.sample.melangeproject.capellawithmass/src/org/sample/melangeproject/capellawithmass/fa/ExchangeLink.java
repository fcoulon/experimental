/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.NamedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getExchanges <em>Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getExchangeContainmentLinks <em>Exchange Containment Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getOwnedExchangeContainments <em>Owned Exchange Containments</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getSources <em>Sources</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ExchangeLink#getDestinations <em>Destinations</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeLink()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='FunctionalLink'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Component' stereotype='eng.sys.FunctionalLink'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='a grouping of functional exchanges, all participating in the same applicative link\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::InformationFlow' explanation='none' constraints='none'"
 * @generated
 */
public interface ExchangeLink extends NamedRelationship {
	/**
	 * Returns the value of the '<em><b>Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchanges</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeLink_Exchanges()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='exchanges'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the exchanges involved in this exchange link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ExchangeSpecification> getExchanges();

	/**
	 * Returns the value of the '<em><b>Exchange Containment Links</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Containment Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Containment Links</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeLink_ExchangeContainmentLinks()
	 * @see org.sample.melangeproject.capellawithmass.fa.ExchangeContainment#getLink
	 * @model opposite="link"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='exchangeContainmentLinks'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange containments that are part of this exchange link \r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::clientDependency' explanation='none' constraints='uml::NamedElement::clientDependency elements on which ExchangeContainment stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<ExchangeContainment> getExchangeContainmentLinks();

	/**
	 * Returns the value of the '<em><b>Owned Exchange Containments</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ExchangeContainment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exchange Containments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exchange Containments</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeLink_OwnedExchangeContainments()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='packagedElement' featureOwner='Component'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ownedExchangeContainments'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange containments that are owned by this exchange link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which ExchangeContainment stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<ExchangeContainment> getOwnedExchangeContainments();

	/**
	 * Returns the value of the '<em><b>Sources</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeLink_Sources()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='sources'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the functions that are at the starting point(s) of this exchange link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::InformationFlow::informationSource' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<FunctionSpecification> getSources();

	/**
	 * Returns the value of the '<em><b>Destinations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destinations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destinations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getExchangeLink_Destinations()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='destinations'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the functions that are at the destination point(s) of this exchange link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::InformationFlow::informationTarget' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<FunctionSpecification> getDestinations();

} // ExchangeLink
