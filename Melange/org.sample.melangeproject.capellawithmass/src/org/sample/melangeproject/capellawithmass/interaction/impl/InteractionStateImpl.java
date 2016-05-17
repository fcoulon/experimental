/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractState;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;
import org.sample.melangeproject.capellawithmass.interaction.InteractionState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InteractionStateImpl#getRelatedAbstractState <em>Related Abstract State</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InteractionStateImpl#getRelatedAbstractFunction <em>Related Abstract Function</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InteractionStateImpl#getCovered <em>Covered</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionStateImpl extends InteractionFragmentImpl implements InteractionState {
	/**
	 * The cached value of the '{@link #getRelatedAbstractState() <em>Related Abstract State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAbstractState()
	 * @generated
	 * @ordered
	 */
	protected AbstractState relatedAbstractState;

	/**
	 * The cached value of the '{@link #getRelatedAbstractFunction() <em>Related Abstract Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedAbstractFunction()
	 * @generated
	 * @ordered
	 */
	protected AbstractFunction relatedAbstractFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getRelatedAbstractState() {
		if (relatedAbstractState != null && relatedAbstractState.eIsProxy()) {
			InternalEObject oldRelatedAbstractState = (InternalEObject)relatedAbstractState;
			relatedAbstractState = (AbstractState)eResolveProxy(oldRelatedAbstractState);
			if (relatedAbstractState != oldRelatedAbstractState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE, oldRelatedAbstractState, relatedAbstractState));
			}
		}
		return relatedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetRelatedAbstractState() {
		return relatedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAbstractState(AbstractState newRelatedAbstractState) {
		AbstractState oldRelatedAbstractState = relatedAbstractState;
		relatedAbstractState = newRelatedAbstractState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE, oldRelatedAbstractState, relatedAbstractState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction getRelatedAbstractFunction() {
		if (relatedAbstractFunction != null && relatedAbstractFunction.eIsProxy()) {
			InternalEObject oldRelatedAbstractFunction = (InternalEObject)relatedAbstractFunction;
			relatedAbstractFunction = (AbstractFunction)eResolveProxy(oldRelatedAbstractFunction);
			if (relatedAbstractFunction != oldRelatedAbstractFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION, oldRelatedAbstractFunction, relatedAbstractFunction));
			}
		}
		return relatedAbstractFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetRelatedAbstractFunction() {
		return relatedAbstractFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedAbstractFunction(AbstractFunction newRelatedAbstractFunction) {
		AbstractFunction oldRelatedAbstractFunction = relatedAbstractFunction;
		relatedAbstractFunction = newRelatedAbstractFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION, oldRelatedAbstractFunction, relatedAbstractFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceRole getCovered() {
		InstanceRole covered = basicGetCovered();
		return covered != null && covered.eIsProxy() ? (InstanceRole)eResolveProxy((InternalEObject)covered) : covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceRole basicGetCovered() {
		// TODO: implement this method to return the 'Covered' reference
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				if (resolve) return getRelatedAbstractState();
				return basicGetRelatedAbstractState();
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				if (resolve) return getRelatedAbstractFunction();
				return basicGetRelatedAbstractFunction();
			case InteractionPackage.INTERACTION_STATE__COVERED:
				if (resolve) return getCovered();
				return basicGetCovered();
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				setRelatedAbstractState((AbstractState)newValue);
				return;
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				setRelatedAbstractFunction((AbstractFunction)newValue);
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				setRelatedAbstractState((AbstractState)null);
				return;
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				setRelatedAbstractFunction((AbstractFunction)null);
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
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_STATE:
				return relatedAbstractState != null;
			case InteractionPackage.INTERACTION_STATE__RELATED_ABSTRACT_FUNCTION:
				return relatedAbstractFunction != null;
			case InteractionPackage.INTERACTION_STATE__COVERED:
				return basicGetCovered() != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionStateImpl
