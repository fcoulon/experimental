/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceAllocationImpl#getAllocatedInterface <em>Allocated Interface</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceAllocationImpl#getAllocatingInterfaceAllocator <em>Allocating Interface Allocator</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InterfaceAllocationImpl extends AllocationImpl implements InterfaceAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getAllocatedInterface() {
		Interface allocatedInterface = basicGetAllocatedInterface();
		return allocatedInterface != null && allocatedInterface.eIsProxy() ? (Interface)eResolveProxy((InternalEObject)allocatedInterface) : allocatedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetAllocatedInterface() {
		// TODO: implement this method to return the 'Allocated Interface' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceAllocator getAllocatingInterfaceAllocator() {
		InterfaceAllocator allocatingInterfaceAllocator = basicGetAllocatingInterfaceAllocator();
		return allocatingInterfaceAllocator != null && allocatingInterfaceAllocator.eIsProxy() ? (InterfaceAllocator)eResolveProxy((InternalEObject)allocatingInterfaceAllocator) : allocatingInterfaceAllocator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceAllocator basicGetAllocatingInterfaceAllocator() {
		// TODO: implement this method to return the 'Allocating Interface Allocator' reference
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
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE:
				if (resolve) return getAllocatedInterface();
				return basicGetAllocatedInterface();
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR:
				if (resolve) return getAllocatingInterfaceAllocator();
				return basicGetAllocatingInterfaceAllocator();
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
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATED_INTERFACE:
				return basicGetAllocatedInterface() != null;
			case CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR:
				return basicGetAllocatingInterfaceAllocator() != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceAllocationImpl
