/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractState;
import org.sample.melangeproject.capellawithmass.capellacommon.AbstractStateRealization;
import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateRealizationImpl#getRealizedAbstractState <em>Realized Abstract State</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateRealizationImpl#getRealizingAbstractState <em>Realizing Abstract State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractStateRealizationImpl extends AllocationImpl implements AbstractStateRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.ABSTRACT_STATE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getRealizedAbstractState() {
		AbstractState realizedAbstractState = basicGetRealizedAbstractState();
		return realizedAbstractState != null && realizedAbstractState.eIsProxy() ? (AbstractState)eResolveProxy((InternalEObject)realizedAbstractState) : realizedAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetRealizedAbstractState() {
		// TODO: implement this method to return the 'Realized Abstract State' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState getRealizingAbstractState() {
		AbstractState realizingAbstractState = basicGetRealizingAbstractState();
		return realizingAbstractState != null && realizingAbstractState.eIsProxy() ? (AbstractState)eResolveProxy((InternalEObject)realizingAbstractState) : realizingAbstractState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractState basicGetRealizingAbstractState() {
		// TODO: implement this method to return the 'Realizing Abstract State' reference
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
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZED_ABSTRACT_STATE:
				if (resolve) return getRealizedAbstractState();
				return basicGetRealizedAbstractState();
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZING_ABSTRACT_STATE:
				if (resolve) return getRealizingAbstractState();
				return basicGetRealizingAbstractState();
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
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZED_ABSTRACT_STATE:
				return basicGetRealizedAbstractState() != null;
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION__REALIZING_ABSTRACT_STATE:
				return basicGetRealizingAbstractState() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractStateRealizationImpl
