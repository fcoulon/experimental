/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation;
import org.sample.melangeproject.capellawithmass.cs.Interface;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol;

import org.sample.melangeproject.capellawithmass.interaction.SequenceMessage;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Item Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#getSendProtocol <em>Send Protocol</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#getReceiveProtocol <em>Receive Protocol</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#getAllocatedItem <em>Allocated Item</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ExchangeItemAllocationImpl#getAllocatingInterface <em>Allocating Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeItemAllocationImpl extends RelationshipImpl implements ExchangeItemAllocation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSendProtocol() <em>Send Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationLinkProtocol SEND_PROTOCOL_EDEFAULT = CommunicationLinkProtocol.UNSET;

	/**
	 * The cached value of the '{@link #getSendProtocol() <em>Send Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkProtocol sendProtocol = SEND_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReceiveProtocol() <em>Receive Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationLinkProtocol RECEIVE_PROTOCOL_EDEFAULT = CommunicationLinkProtocol.UNSET;

	/**
	 * The cached value of the '{@link #getReceiveProtocol() <em>Receive Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkProtocol receiveProtocol = RECEIVE_PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllocatedItem() <em>Allocated Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedItem()
	 * @generated
	 * @ordered
	 */
	protected ExchangeItem allocatedItem;

	/**
	 * The cached value of the '{@link #getAllocatingInterface() <em>Allocating Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface allocatingInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeItemAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.EXCHANGE_ITEM_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceMessage> getInvokingSequenceMessages() {
		// TODO: implement this method to return the 'Invoking Sequence Messages' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol getSendProtocol() {
		return sendProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendProtocol(CommunicationLinkProtocol newSendProtocol) {
		CommunicationLinkProtocol oldSendProtocol = sendProtocol;
		sendProtocol = newSendProtocol == null ? SEND_PROTOCOL_EDEFAULT : newSendProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL, oldSendProtocol, sendProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol getReceiveProtocol() {
		return receiveProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveProtocol(CommunicationLinkProtocol newReceiveProtocol) {
		CommunicationLinkProtocol oldReceiveProtocol = receiveProtocol;
		receiveProtocol = newReceiveProtocol == null ? RECEIVE_PROTOCOL_EDEFAULT : newReceiveProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL, oldReceiveProtocol, receiveProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem getAllocatedItem() {
		if (allocatedItem != null && allocatedItem.eIsProxy()) {
			InternalEObject oldAllocatedItem = (InternalEObject)allocatedItem;
			allocatedItem = (ExchangeItem)eResolveProxy(oldAllocatedItem);
			if (allocatedItem != oldAllocatedItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM, oldAllocatedItem, allocatedItem));
			}
		}
		return allocatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem basicGetAllocatedItem() {
		return allocatedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatedItem(ExchangeItem newAllocatedItem) {
		ExchangeItem oldAllocatedItem = allocatedItem;
		allocatedItem = newAllocatedItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM, oldAllocatedItem, allocatedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getAllocatingInterface() {
		if (allocatingInterface != null && allocatingInterface.eIsProxy()) {
			InternalEObject oldAllocatingInterface = (InternalEObject)allocatingInterface;
			allocatingInterface = (Interface)eResolveProxy(oldAllocatingInterface);
			if (allocatingInterface != oldAllocatingInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATING_INTERFACE, oldAllocatingInterface, allocatingInterface));
			}
		}
		return allocatingInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetAllocatingInterface() {
		return allocatingInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME:
				return getName();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL:
				return isFinal();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				return getSendProtocol();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				return getReceiveProtocol();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				if (resolve) return getAllocatedItem();
				return basicGetAllocatedItem();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATING_INTERFACE:
				if (resolve) return getAllocatingInterface();
				return basicGetAllocatingInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME:
				setName((String)newValue);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL:
				setFinal((Boolean)newValue);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				setSendProtocol((CommunicationLinkProtocol)newValue);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				setReceiveProtocol((CommunicationLinkProtocol)newValue);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				setAllocatedItem((ExchangeItem)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				setSendProtocol(SEND_PROTOCOL_EDEFAULT);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				setReceiveProtocol(RECEIVE_PROTOCOL_EDEFAULT);
				return;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				setAllocatedItem((ExchangeItem)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__INVOKING_SEQUENCE_MESSAGES:
				return !getInvokingSequenceMessages().isEmpty();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL:
				return final_ != FINAL_EDEFAULT;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__SEND_PROTOCOL:
				return sendProtocol != SEND_PROTOCOL_EDEFAULT;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__RECEIVE_PROTOCOL:
				return receiveProtocol != RECEIVE_PROTOCOL_EDEFAULT;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATED_ITEM:
				return allocatedItem != null;
			case CsPackage.EXCHANGE_ITEM_ALLOCATION__ALLOCATING_INTERFACE:
				return allocatingInterface != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
				case CsPackage.EXCHANGE_ITEM_ALLOCATION__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL: return ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return CsPackage.EXCHANGE_ITEM_ALLOCATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return CsPackage.EXCHANGE_ITEM_ALLOCATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL: return CsPackage.EXCHANGE_ITEM_ALLOCATION__FINAL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", final: ");
		result.append(final_);
		result.append(", sendProtocol: ");
		result.append(sendProtocol);
		result.append(", receiveProtocol: ");
		result.append(receiveProtocol);
		result.append(')');
		return result.toString();
	}

} //ExchangeItemAllocationImpl
