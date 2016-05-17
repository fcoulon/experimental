/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.interaction.AbstractCapability;
import org.sample.melangeproject.capellawithmass.interaction.AbstractCapabilityInclude;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Capability Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityIncludeImpl#getIncluded <em>Included</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityIncludeImpl#getInclusion <em>Inclusion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractCapabilityIncludeImpl extends RelationshipImpl implements AbstractCapabilityInclude {
	/**
	 * The cached value of the '{@link #getIncluded() <em>Included</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncluded()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapability included;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCapabilityIncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_CAPABILITY_INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getIncluded() {
		if (included != null && included.eIsProxy()) {
			InternalEObject oldIncluded = (InternalEObject)included;
			included = (AbstractCapability)eResolveProxy(oldIncluded);
			if (included != oldIncluded) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED, oldIncluded, included));
			}
		}
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetIncluded() {
		return included;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncluded(AbstractCapability newIncluded) {
		AbstractCapability oldIncluded = included;
		included = newIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED, oldIncluded, included));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getInclusion() {
		AbstractCapability inclusion = basicGetInclusion();
		return inclusion != null && inclusion.eIsProxy() ? (AbstractCapability)eResolveProxy((InternalEObject)inclusion) : inclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetInclusion() {
		// TODO: implement this method to return the 'Inclusion' reference
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
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				if (resolve) return getIncluded();
				return basicGetIncluded();
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUSION:
				if (resolve) return getInclusion();
				return basicGetInclusion();
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
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				setIncluded((AbstractCapability)newValue);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				setIncluded((AbstractCapability)null);
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
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUDED:
				return included != null;
			case InteractionPackage.ABSTRACT_CAPABILITY_INCLUDE__INCLUSION:
				return basicGetInclusion() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCapabilityIncludeImpl
