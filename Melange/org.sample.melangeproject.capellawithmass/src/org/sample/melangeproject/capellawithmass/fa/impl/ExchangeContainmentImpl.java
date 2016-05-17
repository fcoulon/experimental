/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.fa.ExchangeContainment;
import org.sample.melangeproject.capellawithmass.fa.ExchangeLink;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeContainmentImpl#getExchange <em>Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeContainmentImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeContainmentImpl extends RelationshipImpl implements ExchangeContainment {
	/**
	 * The cached value of the '{@link #getExchange() <em>Exchange</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchange()
	 * @generated
	 * @ordered
	 */
	protected ExchangeSpecification exchange;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected ExchangeLink link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeContainmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.EXCHANGE_CONTAINMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification getExchange() {
		if (exchange != null && exchange.eIsProxy()) {
			InternalEObject oldExchange = (InternalEObject)exchange;
			exchange = (ExchangeSpecification)eResolveProxy(oldExchange);
			if (exchange != oldExchange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, oldExchange, exchange));
			}
		}
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification basicGetExchange() {
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchange(ExchangeSpecification newExchange, NotificationChain msgs) {
		ExchangeSpecification oldExchange = exchange;
		exchange = newExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, oldExchange, newExchange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchange(ExchangeSpecification newExchange) {
		if (newExchange != exchange) {
			NotificationChain msgs = null;
			if (exchange != null)
				msgs = ((InternalEObject)exchange).eInverseRemove(this, FaPackage.EXCHANGE_SPECIFICATION__LINK, ExchangeSpecification.class, msgs);
			if (newExchange != null)
				msgs = ((InternalEObject)newExchange).eInverseAdd(this, FaPackage.EXCHANGE_SPECIFICATION__LINK, ExchangeSpecification.class, msgs);
			msgs = basicSetExchange(newExchange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, newExchange, newExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeLink getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (ExchangeLink)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_CONTAINMENT__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeLink basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(ExchangeLink newLink, NotificationChain msgs) {
		ExchangeLink oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_CONTAINMENT__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(ExchangeLink newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS, ExchangeLink.class, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS, ExchangeLink.class, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_CONTAINMENT__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE:
				if (exchange != null)
					msgs = ((InternalEObject)exchange).eInverseRemove(this, FaPackage.EXCHANGE_SPECIFICATION__LINK, ExchangeSpecification.class, msgs);
				return basicSetExchange((ExchangeSpecification)otherEnd, msgs);
			case FaPackage.EXCHANGE_CONTAINMENT__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS, ExchangeLink.class, msgs);
				return basicSetLink((ExchangeLink)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE:
				return basicSetExchange(null, msgs);
			case FaPackage.EXCHANGE_CONTAINMENT__LINK:
				return basicSetLink(null, msgs);
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
			case FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE:
				if (resolve) return getExchange();
				return basicGetExchange();
			case FaPackage.EXCHANGE_CONTAINMENT__LINK:
				if (resolve) return getLink();
				return basicGetLink();
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
			case FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE:
				setExchange((ExchangeSpecification)newValue);
				return;
			case FaPackage.EXCHANGE_CONTAINMENT__LINK:
				setLink((ExchangeLink)newValue);
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
			case FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE:
				setExchange((ExchangeSpecification)null);
				return;
			case FaPackage.EXCHANGE_CONTAINMENT__LINK:
				setLink((ExchangeLink)null);
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
			case FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE:
				return exchange != null;
			case FaPackage.EXCHANGE_CONTAINMENT__LINK:
				return link != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeContainmentImpl
