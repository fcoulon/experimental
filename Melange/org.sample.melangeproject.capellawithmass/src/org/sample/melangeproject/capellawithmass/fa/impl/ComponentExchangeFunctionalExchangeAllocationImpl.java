/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Functional Exchange Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeFunctionalExchangeAllocationImpl#getAllocatedFunctionalExchange <em>Allocated Functional Exchange</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeFunctionalExchangeAllocationImpl#getAllocatingComponentExchange <em>Allocating Component Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeFunctionalExchangeAllocationImpl extends AllocationImpl implements ComponentExchangeFunctionalExchangeAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeFunctionalExchangeAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange getAllocatedFunctionalExchange() {
		FunctionalExchange allocatedFunctionalExchange = basicGetAllocatedFunctionalExchange();
		return allocatedFunctionalExchange != null && allocatedFunctionalExchange.eIsProxy() ? (FunctionalExchange)eResolveProxy((InternalEObject)allocatedFunctionalExchange) : allocatedFunctionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange basicGetAllocatedFunctionalExchange() {
		// TODO: implement this method to return the 'Allocated Functional Exchange' reference
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
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE:
				if (resolve) return getAllocatedFunctionalExchange();
				return basicGetAllocatedFunctionalExchange();
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE:
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
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATED_FUNCTIONAL_EXCHANGE:
				return basicGetAllocatedFunctionalExchange() != null;
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION__ALLOCATING_COMPONENT_EXCHANGE:
				return basicGetAllocatingComponentExchange() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeFunctionalExchangeAllocationImpl
