/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeRealizationImpl#getRealizedFunctionalExchange <em>Realized Functional Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeRealizationImpl#getRealizingFunctionalExchange <em>Realizing Functional Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalExchangeRealizationImpl extends AllocationImpl implements FunctionalExchangeRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange getRealizedFunctionalExchange() {
		FunctionalExchange realizedFunctionalExchange = basicGetRealizedFunctionalExchange();
		return realizedFunctionalExchange != null && realizedFunctionalExchange.eIsProxy() ? (FunctionalExchange)eResolveProxy((InternalEObject)realizedFunctionalExchange) : realizedFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange basicGetRealizedFunctionalExchange() {
		// TODO: implement this method to return the 'Realized Functional Exchange' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange getRealizingFunctionalExchange() {
		FunctionalExchange realizingFunctionalExchange = basicGetRealizingFunctionalExchange();
		return realizingFunctionalExchange != null && realizingFunctionalExchange.eIsProxy() ? (FunctionalExchange)eResolveProxy((InternalEObject)realizingFunctionalExchange) : realizingFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange basicGetRealizingFunctionalExchange() {
		// TODO: implement this method to return the 'Realizing Functional Exchange' reference
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
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE:
				if (resolve) return getRealizedFunctionalExchange();
				return basicGetRealizedFunctionalExchange();
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE:
				if (resolve) return getRealizingFunctionalExchange();
				return basicGetRealizingFunctionalExchange();
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
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZED_FUNCTIONAL_EXCHANGE:
				return basicGetRealizedFunctionalExchange() != null;
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION__REALIZING_FUNCTIONAL_EXCHANGE:
				return basicGetRealizingFunctionalExchange() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalExchangeRealizationImpl
