/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;
import org.sample.melangeproject.capellawithmass.capellacommon.StateTransition;
import org.sample.melangeproject.capellawithmass.capellacommon.StateTransitionRealization;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Transition Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateTransitionRealizationImpl#getRealizedStateTransition <em>Realized State Transition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateTransitionRealizationImpl#getRealizingStateTransition <em>Realizing State Transition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateTransitionRealizationImpl extends AllocationImpl implements StateTransitionRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransitionRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE_TRANSITION_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition getRealizedStateTransition() {
		StateTransition realizedStateTransition = basicGetRealizedStateTransition();
		return realizedStateTransition != null && realizedStateTransition.eIsProxy() ? (StateTransition)eResolveProxy((InternalEObject)realizedStateTransition) : realizedStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition basicGetRealizedStateTransition() {
		// TODO: implement this method to return the 'Realized State Transition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition getRealizingStateTransition() {
		StateTransition realizingStateTransition = basicGetRealizingStateTransition();
		return realizingStateTransition != null && realizingStateTransition.eIsProxy() ? (StateTransition)eResolveProxy((InternalEObject)realizingStateTransition) : realizingStateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition basicGetRealizingStateTransition() {
		// TODO: implement this method to return the 'Realizing State Transition' reference
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
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZED_STATE_TRANSITION:
				if (resolve) return getRealizedStateTransition();
				return basicGetRealizedStateTransition();
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZING_STATE_TRANSITION:
				if (resolve) return getRealizingStateTransition();
				return basicGetRealizingStateTransition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZED_STATE_TRANSITION:
				return basicGetRealizedStateTransition() != null;
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION__REALIZING_STATE_TRANSITION:
				return basicGetRealizingStateTransition() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateTransitionRealizationImpl
