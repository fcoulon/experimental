/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.activity.ObjectFlow;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Relationship;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getExchangeSpecifications <em>Exchange Specifications</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getInvolvingFunctionalChains <em>Involving Functional Chains</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getAllocatingComponentExchanges <em>Allocating Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getIncomingComponentExchangeFunctionalExchangeRealizations <em>Incoming Component Exchange Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getIncomingFunctionalExchangeRealizations <em>Incoming Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getOutgoingFunctionalExchangeRealizations <em>Outgoing Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getOwnedFunctionalExchangeRealizations <em>Owned Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getSourceFunctionOutputPort <em>Source Function Output Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getTargetFunctionInputPort <em>Target Function Input Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getRealizingFunctionalExchanges <em>Realizing Functional Exchanges</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Transition'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='ObjectFlow' stereotype='eng.Transition'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='an exchange between two functions of the system\r\n[source: Capella study]' usage\040guideline='a functional exchange is used between two functions whenever there is an interaction between these two functions, be it the providing of some data or just the transition of control from/to a function.' used\040in\040levels='operational,system,logical,physical' usage\040examples='../img/usage_examples/ports_exchanges.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::ObjectFlow' explanation='none' constraints='none'"
 * @generated
 */
public interface FunctionalExchange extends NamedElement, Relationship, InvolvedElement, ObjectFlow, AbstractEvent, AbstractEventOperation {
	/**
	 * Returns the value of the '<em><b>Exchange Specifications</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Specifications</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_ExchangeSpecifications()
	 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='exchanges'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange specification(s) that this exchange complies to\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchangeSpecification> getExchangeSpecifications();

	/**
	 * Returns the value of the '<em><b>Involving Functional Chains</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalChain}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalChain#getInvolvedFunctionalExchanges <em>Involved Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involving Functional Chains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involving Functional Chains</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_InvolvingFunctionalChains()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalChain#getInvolvedFunctionalExchanges
	 * @model opposite="involvedFunctionalExchanges" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the functional chains in which this exchange is involved\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<FunctionalChain> getInvolvingFunctionalChains();

	/**
	 * Returns the value of the '<em><b>Exchanged Items</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.ExchangeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchanged Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchanged Items</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_ExchangedItems()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange items that are carried along this functional exchange\r\n[source: Capella study]\r\n\r\nSpecifies the information items that may circulate on this information flow.\r\n[source: UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints=''"
	 * @generated
	 */
	EList<ExchangeItem> getExchangedItems();

	/**
	 * Returns the value of the '<em><b>Allocating Component Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ComponentExchange}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Component Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Component Exchanges</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_AllocatingComponentExchanges()
	 * @see org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getAllocatedFunctionalExchanges
	 * @model opposite="allocatedFunctionalExchanges" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the component exchanges associated to this functional exchange, e.g. the exchanges between the components to which the source/destination of this functional exchange are allocated.\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<ComponentExchange> getAllocatingComponentExchanges();

	/**
	 * Returns the value of the '<em><b>Incoming Component Exchange Functional Exchange Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation#getAllocatedFunctionalExchange <em>Allocated Functional Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Component Exchange Functional Exchange Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Component Exchange Functional Exchange Realizations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_IncomingComponentExchangeFunctionalExchangeRealizations()
	 * @see org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation#getAllocatedFunctionalExchange
	 * @model opposite="allocatedFunctionalExchange" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the allocation links between component exchanges and functional exchanges, that have this functional exchange as their destination\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ComponentExchangeFunctionalExchangeAllocation> getIncomingComponentExchangeFunctionalExchangeRealizations();

	/**
	 * Returns the value of the '<em><b>Incoming Functional Exchange Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization#getRealizedFunctionalExchange <em>Realized Functional Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Functional Exchange Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Functional Exchange Realizations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_IncomingFunctionalExchangeRealizations()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization#getRealizedFunctionalExchange
	 * @model opposite="realizedFunctionalExchange" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the realization links between functional exchanges, that have this functional exchange as their destination\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchangeRealization> getIncomingFunctionalExchangeRealizations();

	/**
	 * Returns the value of the '<em><b>Outgoing Functional Exchange Realizations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization#getRealizingFunctionalExchange <em>Realizing Functional Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Functional Exchange Realizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Functional Exchange Realizations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_OutgoingFunctionalExchangeRealizations()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization#getRealizingFunctionalExchange
	 * @model opposite="realizingFunctionalExchange" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the realization links between functional exchanges, that have this functional exchange as their origin\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchangeRealization> getOutgoingFunctionalExchangeRealizations();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ExchangeCategory}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ExchangeCategory#getExchanges <em>Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_Categories()
	 * @see org.sample.melangeproject.capellawithmass.fa.ExchangeCategory#getExchanges
	 * @model opposite="exchanges"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange categories (families) to which this functional exchange belongs\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='' constraints='none'"
	 * @generated
	 */
	EList<ExchangeCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Owned Functional Exchange Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Functional Exchange Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Functional Exchange Realizations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_OwnedFunctionalExchangeRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the realization links between functional exchanges, that are owned by this functional exchange\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='Some elements on which FunctionalExchangeRealization stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<FunctionalExchangeRealization> getOwnedFunctionalExchangeRealizations();

	/**
	 * Returns the value of the '<em><b>Source Function Output Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Function Output Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Function Output Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_SourceFunctionOutputPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	FunctionOutputPort getSourceFunctionOutputPort();

	/**
	 * Returns the value of the '<em><b>Target Function Input Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Function Input Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Function Input Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_TargetFunctionInputPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	FunctionInputPort getTargetFunctionInputPort();

	/**
	 * Returns the value of the '<em><b>Realized Functional Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getRealizingFunctionalExchanges <em>Realizing Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Functional Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Functional Exchanges</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_RealizedFunctionalExchanges()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getRealizingFunctionalExchanges
	 * @model opposite="realizingFunctionalExchanges" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchange> getRealizedFunctionalExchanges();

	/**
	 * Returns the value of the '<em><b>Realizing Functional Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Functional Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Functional Exchanges</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getFunctionalExchange_RealizingFunctionalExchanges()
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionalExchange#getRealizedFunctionalExchanges
	 * @model opposite="realizedFunctionalExchanges" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<FunctionalExchange> getRealizingFunctionalExchanges();

} // FunctionalExchange
