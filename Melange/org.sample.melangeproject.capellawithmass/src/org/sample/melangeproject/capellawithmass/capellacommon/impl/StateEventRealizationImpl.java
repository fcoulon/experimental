/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;
import org.sample.melangeproject.capellawithmass.capellacommon.StateEvent;
import org.sample.melangeproject.capellawithmass.capellacommon.StateEventRealization;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Event Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateEventRealizationImpl#getRealizedEvent <em>Realized Event</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateEventRealizationImpl#getRealizingEvent <em>Realizing Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateEventRealizationImpl extends AllocationImpl implements StateEventRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateEventRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE_EVENT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent getRealizedEvent() {
		StateEvent realizedEvent = basicGetRealizedEvent();
		return realizedEvent != null && realizedEvent.eIsProxy() ? (StateEvent)eResolveProxy((InternalEObject)realizedEvent) : realizedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent basicGetRealizedEvent() {
		// TODO: implement this method to return the 'Realized Event' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent getRealizingEvent() {
		StateEvent realizingEvent = basicGetRealizingEvent();
		return realizingEvent != null && realizingEvent.eIsProxy() ? (StateEvent)eResolveProxy((InternalEObject)realizingEvent) : realizingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEvent basicGetRealizingEvent() {
		// TODO: implement this method to return the 'Realizing Event' reference
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
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZED_EVENT:
				if (resolve) return getRealizedEvent();
				return basicGetRealizedEvent();
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZING_EVENT:
				if (resolve) return getRealizingEvent();
				return basicGetRealizingEvent();
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
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZED_EVENT:
				return basicGetRealizedEvent() != null;
			case CapellacommonPackage.STATE_EVENT_REALIZATION__REALIZING_EVENT:
				return basicGetRealizingEvent() != null;
		}
		return super.eIsSet(featureID);
	}

} //StateEventRealizationImpl
