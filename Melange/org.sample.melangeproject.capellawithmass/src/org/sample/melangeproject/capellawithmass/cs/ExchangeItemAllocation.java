/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.sample.melangeproject.capellawithmass.capellacore.Relationship;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol;

import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Item Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getSendProtocol <em>Send Protocol</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getReceiveProtocol <em>Receive Protocol</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getAllocatedItem <em>Allocated Item</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getAllocatingInterface <em>Allocating Interface</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getExchangeItemAllocation()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Allocation link between exchange items and interface that support them' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface ExchangeItemAllocation extends Relationship, AbstractEventOperation, FinalizableElement {
	/**
	 * Returns the value of the '<em><b>Send Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Protocol</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol
	 * @see #setSendProtocol(CommunicationLinkProtocol)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getExchangeItemAllocation_SendProtocol()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='describes the default protocol used by the sender of the exchange item. It could be overrided by the protocol used by the given communication exchanger' constraints='none' type='refer to CommunicationLinkProtocol definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	CommunicationLinkProtocol getSendProtocol();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getSendProtocol <em>Send Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Protocol</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol
	 * @see #getSendProtocol()
	 * @generated
	 */
	void setSendProtocol(CommunicationLinkProtocol value);

	/**
	 * Returns the value of the '<em><b>Receive Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Protocol</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol
	 * @see #setReceiveProtocol(CommunicationLinkProtocol)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getExchangeItemAllocation_ReceiveProtocol()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='describes the default protocol used by the receiver of the exchange item. It could be overrided by the protocol used by the given communication exchanger' constraints='none' type='refer to CommunicationLinkProtocol definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	CommunicationLinkProtocol getReceiveProtocol();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getReceiveProtocol <em>Receive Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Protocol</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol
	 * @see #getReceiveProtocol()
	 * @generated
	 */
	void setReceiveProtocol(CommunicationLinkProtocol value);

	/**
	 * Returns the value of the '<em><b>Allocated Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocated Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocated Item</em>' reference.
	 * @see #setAllocatedItem(ExchangeItem)
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getExchangeItemAllocation_AllocatedItem()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange item that is being allocated by the interface' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	ExchangeItem getAllocatedItem();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation#getAllocatedItem <em>Allocated Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocated Item</em>' reference.
	 * @see #getAllocatedItem()
	 * @generated
	 */
	void setAllocatedItem(ExchangeItem value);

	/**
	 * Returns the value of the '<em><b>Allocating Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocating Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocating Interface</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getExchangeItemAllocation_AllocatingInterface()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the interface that allocated the given exchange item' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Interface getAllocatingInterface();

} // ExchangeItemAllocation
