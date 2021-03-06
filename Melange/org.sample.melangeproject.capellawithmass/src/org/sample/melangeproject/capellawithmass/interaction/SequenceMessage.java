/**
 */
package org.sample.melangeproject.capellawithmass.interaction;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Constraint;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

import org.sample.melangeproject.capellawithmass.cs.Part;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getExchangeContext <em>Exchange Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getSendingEnd <em>Sending End</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getReceivingEnd <em>Receiving End</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getInvokedOperation <em>Invoked Operation</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getSendingPart <em>Sending Part</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getReceivingPart <em>Receiving Part</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getSendingFunction <em>Sending Function</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getReceivingFunction <em>Receiving Function</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getOwnedSequenceMessageValuations <em>Owned Sequence Message Valuations</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='SequenceMessage'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Message' stereotype='eng.SequenceMessage'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A Message defines a particular communication between Lifelines of an Interaction.\r\n[source:UML Superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='../img/usage_examples/example_sequence_scenario.png' constraints='none' comment/notes='Should be renamed Message to map UML concept' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Message' explanation='none' constraints='none'"
 * @generated
 */
public interface SequenceMessage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.interaction.MessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.interaction.MessageKind
	 * @see #setKind(MessageKind)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_Kind()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='messageSort' featureOwner='Message'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The sort of communication reflected by the Message.\r\n[source:UML Superstructure v2.2]' constraints='none' type='see MessageKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Message::messageSort' explanation='none' constraints='none'"
	 * @generated
	 */
	MessageKind getKind();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.interaction.MessageKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MessageKind value);

	/**
	 * Returns the value of the '<em><b>Exchange Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Context</em>' reference.
	 * @see #setExchangeContext(Constraint)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_ExchangeContext()
	 * @model
	 * @generated
	 */
	Constraint getExchangeContext();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getExchangeContext <em>Exchange Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Context</em>' reference.
	 * @see #getExchangeContext()
	 * @generated
	 */
	void setExchangeContext(Constraint value);

	/**
	 * Returns the value of the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending End</em>' reference.
	 * @see #setSendingEnd(MessageEnd)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_SendingEnd()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='sendEvent' featureOwner='Message'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='sendingEnd'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='This is equivalent to UML Message::sendEvent :\r\nReferences the Sending of the Message.\r\n[source:UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Message::sendEvent' explanation='none' constraints='none'"
	 * @generated
	 */
	MessageEnd getSendingEnd();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getSendingEnd <em>Sending End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending End</em>' reference.
	 * @see #getSendingEnd()
	 * @generated
	 */
	void setSendingEnd(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving End</em>' reference.
	 * @see #setReceivingEnd(MessageEnd)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_ReceivingEnd()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='receiveEvent' featureOwner='Message'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='receivingEnd'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='This is equivalent to UML Message::sendEvent :\r\nReferences the Receiving of the Message.\r\n[source:UML Superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Message::receiveEvent' explanation='none' constraints='none'"
	 * @generated
	 */
	MessageEnd getReceivingEnd();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessage#getReceivingEnd <em>Receiving End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving End</em>' reference.
	 * @see #getReceivingEnd()
	 * @generated
	 */
	void setReceivingEnd(MessageEnd value);

	/**
	 * Returns the value of the '<em><b>Invoked Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Operation</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_InvokedOperation()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the AbstractEventOperation triggered by this sequence message' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	AbstractEventOperation getInvokedOperation();

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
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_ExchangedItems()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the ExchangeItems carried by this sequence message' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<ExchangeItem> getExchangedItems();

	/**
	 * Returns the value of the '<em><b>Sending Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Part</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_SendingPart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Part getSendingPart();

	/**
	 * Returns the value of the '<em><b>Receiving Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Part</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_ReceivingPart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Part getReceivingPart();

	/**
	 * Returns the value of the '<em><b>Sending Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sending Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending Function</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_SendingFunction()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractFunction getSendingFunction();

	/**
	 * Returns the value of the '<em><b>Receiving Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receiving Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving Function</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_ReceivingFunction()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractFunction getReceivingFunction();

	/**
	 * Returns the value of the '<em><b>Owned Sequence Message Valuations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessageValuation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sequence Message Valuations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sequence Message Valuations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessage_OwnedSequenceMessageValuations()
	 * @model containment="true"
	 * @generated
	 */
	EList<SequenceMessageValuation> getOwnedSequenceMessageValuations();

} // SequenceMessage
