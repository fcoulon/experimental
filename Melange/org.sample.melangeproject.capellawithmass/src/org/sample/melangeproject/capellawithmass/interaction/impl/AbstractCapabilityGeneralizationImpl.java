/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.interaction.AbstractCapability;
import org.sample.melangeproject.capellawithmass.interaction.AbstractCapabilityGeneralization;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Capability Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityGeneralizationImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityGeneralizationImpl#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractCapabilityGeneralizationImpl extends RelationshipImpl implements AbstractCapabilityGeneralization {
	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability super_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCapabilityGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_CAPABILITY_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (AbstractCapability)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(AbstractCapability newSuper) {
		AbstractCapability oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getSub() {
		AbstractCapability sub = basicGetSub();
		return sub != null && sub.eIsProxy() ? (AbstractCapability)eResolveProxy((InternalEObject)sub) : sub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetSub() {
		// TODO: implement this method to return the 'Sub' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUB:
				if (resolve) return getSub();
				return basicGetSub();
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
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUPER:
				setSuper((AbstractCapability)newValue);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUPER:
				setSuper((AbstractCapability)null);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUPER:
				return super_ != null;
			case InteractionPackage.ABSTRACT_CAPABILITY_GENERALIZATION__SUB:
				return basicGetSub() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCapabilityGeneralizationImpl
