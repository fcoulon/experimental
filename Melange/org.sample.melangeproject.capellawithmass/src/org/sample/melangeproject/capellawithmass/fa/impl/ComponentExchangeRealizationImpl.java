/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeRealization;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeRealizationImpl#getAllocatedComponentExchange <em>Allocated Component Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeRealizationImpl#getAllocatingComponentExchange <em>Allocating Component Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeRealizationImpl extends ExchangeSpecificationRealizationImpl implements ComponentExchangeRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange getAllocatedComponentExchange() {
		ComponentExchange allocatedComponentExchange = basicGetAllocatedComponentExchange();
		return allocatedComponentExchange != null && allocatedComponentExchange.eIsProxy() ? (ComponentExchange)eResolveProxy((InternalEObject)allocatedComponentExchange) : allocatedComponentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange basicGetAllocatedComponentExchange() {
		// TODO: implement this method to return the 'Allocated Component Exchange' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange getAllocatingComponentExchange() {
		ComponentExchange allocatingComponentExchange = basicGetAllocatingComponentExchange();
		return allocatingComponentExchange != null && allocatingComponentExchange.eIsProxy() ? (ComponentExchange)eResolveProxy((InternalEObject)allocatingComponentExchange) : allocatingComponentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange basicGetAllocatingComponentExchange() {
		// TODO: implement this method to return the 'Allocating Component Exchange' reference
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
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE:
				if (resolve) return getAllocatedComponentExchange();
				return basicGetAllocatedComponentExchange();
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE:
				if (resolve) return getAllocatingComponentExchange();
				return basicGetAllocatingComponentExchange();
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
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATED_COMPONENT_EXCHANGE:
				return basicGetAllocatedComponentExchange() != null;
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION__ALLOCATING_COMPONENT_EXCHANGE:
				return basicGetAllocatingComponentExchange() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeRealizationImpl
