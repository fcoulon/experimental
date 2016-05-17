/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.ComponentAllocation;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentAllocationImpl#getAllocatedComponent <em>Allocated Component</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentAllocationImpl#getAllocatingComponent <em>Allocating Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentAllocationImpl extends AllocationImpl implements ComponentAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAllocatedComponent() {
		Component allocatedComponent = basicGetAllocatedComponent();
		return allocatedComponent != null && allocatedComponent.eIsProxy() ? (Component)eResolveProxy((InternalEObject)allocatedComponent) : allocatedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAllocatedComponent() {
		// TODO: implement this method to return the 'Allocated Component' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAllocatingComponent() {
		Component allocatingComponent = basicGetAllocatingComponent();
		return allocatingComponent != null && allocatingComponent.eIsProxy() ? (Component)eResolveProxy((InternalEObject)allocatingComponent) : allocatingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAllocatingComponent() {
		// TODO: implement this method to return the 'Allocating Component' reference
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
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT:
				if (resolve) return getAllocatedComponent();
				return basicGetAllocatedComponent();
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT:
				if (resolve) return getAllocatingComponent();
				return basicGetAllocatingComponent();
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
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT:
				return basicGetAllocatedComponent() != null;
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT:
				return basicGetAllocatingComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentAllocationImpl
