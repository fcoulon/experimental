/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityExchange;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.fa.ExchangeContainment;
import org.sample.melangeproject.capellawithmass.fa.ExchangeLink;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecificationRealization;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationImpl#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationImpl#getContainingLink <em>Containing Link</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationImpl#getOutgoingExchangeSpecificationRealizations <em>Outgoing Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationImpl#getIncomingExchangeSpecificationRealizations <em>Incoming Exchange Specification Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExchangeSpecificationImpl extends NamedElementImpl implements ExchangeSpecification {
	/**
	 * The cached value of the '{@link #getRealizedFlow() <em>Realized Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFlow()
	 * @generated
	 * @ordered
	 */
	protected AbstractInformationFlow realizedFlow;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected ExchangeContainment link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.EXCHANGE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInformationFlow getRealizedFlow() {
		if (realizedFlow != null && realizedFlow.eIsProxy()) {
			InternalEObject oldRealizedFlow = (InternalEObject)realizedFlow;
			realizedFlow = (AbstractInformationFlow)eResolveProxy(oldRealizedFlow);
			if (realizedFlow != oldRealizedFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
			}
		}
		return realizedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInformationFlow basicGetRealizedFlow() {
		return realizedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizedFlow(AbstractInformationFlow newRealizedFlow) {
		AbstractInformationFlow oldRealizedFlow = realizedFlow;
		realizedFlow = newRealizedFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRealizingActivityFlows() {
		// TODO: implement this method to return the 'Realizing Activity Flows' reference list
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
	public ExchangeLink getContainingLink() {
		ExchangeLink containingLink = basicGetContainingLink();
		return containingLink != null && containingLink.eIsProxy() ? (ExchangeLink)eResolveProxy((InternalEObject)containingLink) : containingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeLink basicGetContainingLink() {
		// TODO: implement this method to return the 'Containing Link' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeContainment getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (ExchangeContainment)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.EXCHANGE_SPECIFICATION__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeContainment basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(ExchangeContainment newLink, NotificationChain msgs) {
		ExchangeContainment oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(ExchangeContainment newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_SPECIFICATION__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeSpecificationRealization> getOutgoingExchangeSpecificationRealizations() {
		// TODO: implement this method to return the 'Outgoing Exchange Specification Realizations' reference list
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
	public EList<ExchangeSpecificationRealization> getIncomingExchangeSpecificationRealizations() {
		// TODO: implement this method to return the 'Incoming Exchange Specification Realizations' reference list
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
				return basicSetLink((ExchangeContainment)otherEnd, msgs);
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
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				if (resolve) return getRealizedFlow();
				return basicGetRealizedFlow();
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
			case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK:
				if (resolve) return getContainingLink();
				return basicGetContainingLink();
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOutgoingExchangeSpecificationRealizations();
			case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getIncomingExchangeSpecificationRealizations();
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)newValue);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				setLink((ExchangeContainment)newValue);
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)null);
				return;
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				setLink((ExchangeContainment)null);
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
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW:
				return realizedFlow != null;
			case FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS:
				return !getRealizingActivityFlows().isEmpty();
			case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK:
				return basicGetContainingLink() != null;
			case FaPackage.EXCHANGE_SPECIFICATION__LINK:
				return link != null;
			case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return !getOutgoingExchangeSpecificationRealizations().isEmpty();
			case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return !getIncomingExchangeSpecificationRealizations().isEmpty();
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
		if (baseClass == AbstractRelationship.class) {
			switch (derivedFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW: return ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (derivedFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS: return ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
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
		if (baseClass == AbstractRelationship.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW: return FaPackage.EXCHANGE_SPECIFICATION__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return FaPackage.EXCHANGE_SPECIFICATION__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExchangeSpecificationImpl
