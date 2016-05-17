/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocation;
import org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocationEnd;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

import org.sample.melangeproject.capellawithmass.information.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortAllocationImpl#getOwnedComponentPortAllocationEnds <em>Owned Component Port Allocation Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortAllocationImpl#getAllocatedPort <em>Allocated Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortAllocationImpl#getAllocatingPort <em>Allocating Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPortAllocationImpl extends AllocationImpl implements ComponentPortAllocation {
	/**
	 * The cached value of the '{@link #getOwnedComponentPortAllocationEnds() <em>Owned Component Port Allocation Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentPortAllocationEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPortAllocationEnd> ownedComponentPortAllocationEnds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPortAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_PORT_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPortAllocationEnd> getOwnedComponentPortAllocationEnds() {
		if (ownedComponentPortAllocationEnds == null) {
			ownedComponentPortAllocationEnds = new EObjectContainmentWithInverseEList<ComponentPortAllocationEnd>(ComponentPortAllocationEnd.class, this, FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS, FaPackage.COMPONENT_PORT_ALLOCATION_END__OWNING_COMPONENT_PORT_ALLOCATION);
		}
		return ownedComponentPortAllocationEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getAllocatedPort() {
		Port allocatedPort = basicGetAllocatedPort();
		return allocatedPort != null && allocatedPort.eIsProxy() ? (Port)eResolveProxy((InternalEObject)allocatedPort) : allocatedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetAllocatedPort() {
		// TODO: implement this method to return the 'Allocated Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getAllocatingPort() {
		Port allocatingPort = basicGetAllocatingPort();
		return allocatingPort != null && allocatingPort.eIsProxy() ? (Port)eResolveProxy((InternalEObject)allocatingPort) : allocatingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetAllocatingPort() {
		// TODO: implement this method to return the 'Allocating Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedComponentPortAllocationEnds()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return ((InternalEList<?>)getOwnedComponentPortAllocationEnds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return getOwnedComponentPortAllocationEnds();
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATED_PORT:
				if (resolve) return getAllocatedPort();
				return basicGetAllocatedPort();
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATING_PORT:
				if (resolve) return getAllocatingPort();
				return basicGetAllocatingPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				getOwnedComponentPortAllocationEnds().clear();
				getOwnedComponentPortAllocationEnds().addAll((Collection<? extends ComponentPortAllocationEnd>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				getOwnedComponentPortAllocationEnds().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT_ALLOCATION__OWNED_COMPONENT_PORT_ALLOCATION_ENDS:
				return ownedComponentPortAllocationEnds != null && !ownedComponentPortAllocationEnds.isEmpty();
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATED_PORT:
				return basicGetAllocatedPort() != null;
			case FaPackage.COMPONENT_PORT_ALLOCATION__ALLOCATING_PORT:
				return basicGetAllocatingPort() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentPortAllocationImpl
