/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeAllocation;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeAllocator;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeAllocationImpl#getComponentExchangeAllocated <em>Component Exchange Allocated</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeAllocationImpl#getComponentExchangeAllocator <em>Component Exchange Allocator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeAllocationImpl extends AllocationImpl implements ComponentExchangeAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentExchangeAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange getComponentExchangeAllocated() {
		ComponentExchange componentExchangeAllocated = basicGetComponentExchangeAllocated();
		return componentExchangeAllocated != null && componentExchangeAllocated.eIsProxy() ? (ComponentExchange)eResolveProxy((InternalEObject)componentExchangeAllocated) : componentExchangeAllocated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange basicGetComponentExchangeAllocated() {
		// TODO: implement this method to return the 'Component Exchange Allocated' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeAllocator getComponentExchangeAllocator() {
		ComponentExchangeAllocator componentExchangeAllocator = basicGetComponentExchangeAllocator();
		return componentExchangeAllocator != null && componentExchangeAllocator.eIsProxy() ? (ComponentExchangeAllocator)eResolveProxy((InternalEObject)componentExchangeAllocator) : componentExchangeAllocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeAllocator basicGetComponentExchangeAllocator() {
		// TODO: implement this method to return the 'Component Exchange Allocator' reference
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATED:
				if (resolve) return getComponentExchangeAllocated();
				return basicGetComponentExchangeAllocated();
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATOR:
				if (resolve) return getComponentExchangeAllocator();
				return basicGetComponentExchangeAllocator();
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
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATED:
				return basicGetComponentExchangeAllocated() != null;
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION__COMPONENT_EXCHANGE_ALLOCATOR:
				return basicGetComponentExchangeAllocator() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentExchangeAllocationImpl
