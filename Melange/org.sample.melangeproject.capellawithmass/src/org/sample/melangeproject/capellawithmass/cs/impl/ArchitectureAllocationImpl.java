/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation;
import org.sample.melangeproject.capellawithmass.cs.BlockArchitecture;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ArchitectureAllocationImpl#getAllocatedArchitecture <em>Allocated Architecture</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ArchitectureAllocationImpl#getAllocatingArchitecture <em>Allocating Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArchitectureAllocationImpl extends AllocationImpl implements ArchitectureAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ARCHITECTURE_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockArchitecture getAllocatedArchitecture() {
		BlockArchitecture allocatedArchitecture = basicGetAllocatedArchitecture();
		return allocatedArchitecture != null && allocatedArchitecture.eIsProxy() ? (BlockArchitecture)eResolveProxy((InternalEObject)allocatedArchitecture) : allocatedArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockArchitecture basicGetAllocatedArchitecture() {
		// TODO: implement this method to return the 'Allocated Architecture' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockArchitecture getAllocatingArchitecture() {
		BlockArchitecture allocatingArchitecture = basicGetAllocatingArchitecture();
		return allocatingArchitecture != null && allocatingArchitecture.eIsProxy() ? (BlockArchitecture)eResolveProxy((InternalEObject)allocatingArchitecture) : allocatingArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockArchitecture basicGetAllocatingArchitecture() {
		// TODO: implement this method to return the 'Allocating Architecture' reference
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
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE:
				if (resolve) return getAllocatedArchitecture();
				return basicGetAllocatedArchitecture();
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE:
				if (resolve) return getAllocatingArchitecture();
				return basicGetAllocatingArchitecture();
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
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATED_ARCHITECTURE:
				return basicGetAllocatedArchitecture() != null;
			case CsPackage.ARCHITECTURE_ALLOCATION__ALLOCATING_ARCHITECTURE:
				return basicGetAllocatingArchitecture() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArchitectureAllocationImpl
