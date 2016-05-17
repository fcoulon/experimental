/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.information.ExchangeItemRealization;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Operation;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractExchangeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Item Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemRealizationImpl#getRealizedItem <em>Realized Item</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemRealizationImpl#getRealizingOperation <em>Realizing Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeItemRealizationImpl extends AllocationImpl implements ExchangeItemRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeItemRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.EXCHANGE_ITEM_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExchangeItem getRealizedItem() {
		AbstractExchangeItem realizedItem = basicGetRealizedItem();
		return realizedItem != null && realizedItem.eIsProxy() ? (AbstractExchangeItem)eResolveProxy((InternalEObject)realizedItem) : realizedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExchangeItem basicGetRealizedItem() {
		// TODO: implement this method to return the 'Realized Item' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getRealizingOperation() {
		Operation realizingOperation = basicGetRealizingOperation();
		return realizingOperation != null && realizingOperation.eIsProxy() ? (Operation)eResolveProxy((InternalEObject)realizingOperation) : realizingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetRealizingOperation() {
		// TODO: implement this method to return the 'Realizing Operation' reference
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
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZED_ITEM:
				if (resolve) return getRealizedItem();
				return basicGetRealizedItem();
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZING_OPERATION:
				if (resolve) return getRealizingOperation();
				return basicGetRealizingOperation();
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
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZED_ITEM:
				return basicGetRealizedItem() != null;
			case InformationPackage.EXCHANGE_ITEM_REALIZATION__REALIZING_OPERATION:
				return basicGetRealizingOperation() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeItemRealizationImpl
