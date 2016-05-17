/**
 */
package org.sample.melangeproject.capellawithmass.information.communication.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkExchanger;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Exchanger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkExchangerImpl#getTransmit <em>Transmit</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicationLinkExchangerImpl extends EObjectImpl implements CommunicationLinkExchanger {
	/**
	 * The cached value of the '{@link #getOwnedCommunicationLinks() <em>Owned Communication Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> ownedCommunicationLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkExchangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_LINK_EXCHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getOwnedCommunicationLinks() {
		if (ownedCommunicationLinks == null) {
			ownedCommunicationLinks = new EObjectContainmentEList<CommunicationLink>(CommunicationLink.class, this, CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS);
		}
		return ownedCommunicationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getProduce() {
		// TODO: implement this method to return the 'Produce' reference list
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
	public EList<CommunicationLink> getConsume() {
		// TODO: implement this method to return the 'Consume' reference list
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
	public EList<CommunicationLink> getSend() {
		// TODO: implement this method to return the 'Send' reference list
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
	public EList<CommunicationLink> getReceive() {
		// TODO: implement this method to return the 'Receive' reference list
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
	public EList<CommunicationLink> getCall() {
		// TODO: implement this method to return the 'Call' reference list
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
	public EList<CommunicationLink> getExecute() {
		// TODO: implement this method to return the 'Execute' reference list
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
	public EList<CommunicationLink> getWrite() {
		// TODO: implement this method to return the 'Write' reference list
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
	public EList<CommunicationLink> getAccess() {
		// TODO: implement this method to return the 'Access' reference list
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
	public EList<CommunicationLink> getAcquire() {
		// TODO: implement this method to return the 'Acquire' reference list
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
	public EList<CommunicationLink> getTransmit() {
		// TODO: implement this method to return the 'Transmit' reference list
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE:
				return getProduce();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME:
				return getConsume();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND:
				return getSend();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE:
				return getReceive();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL:
				return getCall();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE:
				return getExecute();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE:
				return getWrite();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS:
				return getAccess();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE:
				return getAcquire();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT:
				return getTransmit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
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
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
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
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE:
				return !getProduce().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME:
				return !getConsume().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND:
				return !getSend().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE:
				return !getReceive().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL:
				return !getCall().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE:
				return !getExecute().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE:
				return !getWrite().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS:
				return !getAccess().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE:
				return !getAcquire().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT:
				return !getTransmit().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationLinkExchangerImpl
