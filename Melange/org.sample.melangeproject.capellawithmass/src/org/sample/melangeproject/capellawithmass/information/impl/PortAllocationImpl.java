/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Port;
import org.sample.melangeproject.capellawithmass.information.PortAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.PortAllocationImpl#getAllocatedPort <em>Allocated Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.PortAllocationImpl#getAllocatingPort <em>Allocating Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortAllocationImpl extends AllocationImpl implements PortAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PORT_ALLOCATION;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT:
				if (resolve) return getAllocatedPort();
				return basicGetAllocatedPort();
			case InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InformationPackage.PORT_ALLOCATION__ALLOCATED_PORT:
				return basicGetAllocatedPort() != null;
			case InformationPackage.PORT_ALLOCATION__ALLOCATING_PORT:
				return basicGetAllocatingPort() != null;
		}
		return super.eIsSet(featureID);
	}

} //PortAllocationImpl
