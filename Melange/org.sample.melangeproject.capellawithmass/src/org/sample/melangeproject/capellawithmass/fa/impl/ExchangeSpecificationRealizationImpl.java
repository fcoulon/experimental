/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecificationRealization;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Specification Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationRealizationImpl#getRealizedExchangeSpecification <em>Realized Exchange Specification</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeSpecificationRealizationImpl#getRealizingExchangeSpecification <em>Realizing Exchange Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExchangeSpecificationRealizationImpl extends AllocationImpl implements ExchangeSpecificationRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeSpecificationRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.EXCHANGE_SPECIFICATION_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification getRealizedExchangeSpecification() {
		ExchangeSpecification realizedExchangeSpecification = basicGetRealizedExchangeSpecification();
		return realizedExchangeSpecification != null && realizedExchangeSpecification.eIsProxy() ? (ExchangeSpecification)eResolveProxy((InternalEObject)realizedExchangeSpecification) : realizedExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification basicGetRealizedExchangeSpecification() {
		// TODO: implement this method to return the 'Realized Exchange Specification' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification getRealizingExchangeSpecification() {
		ExchangeSpecification realizingExchangeSpecification = basicGetRealizingExchangeSpecification();
		return realizingExchangeSpecification != null && realizingExchangeSpecification.eIsProxy() ? (ExchangeSpecification)eResolveProxy((InternalEObject)realizingExchangeSpecification) : realizingExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeSpecification basicGetRealizingExchangeSpecification() {
		// TODO: implement this method to return the 'Realizing Exchange Specification' reference
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
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION:
				if (resolve) return getRealizedExchangeSpecification();
				return basicGetRealizedExchangeSpecification();
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION:
				if (resolve) return getRealizingExchangeSpecification();
				return basicGetRealizingExchangeSpecification();
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
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZED_EXCHANGE_SPECIFICATION:
				return basicGetRealizedExchangeSpecification() != null;
			case FaPackage.EXCHANGE_SPECIFICATION_REALIZATION__REALIZING_EXCHANGE_SPECIFICATION:
				return basicGetRealizingExchangeSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExchangeSpecificationRealizationImpl
