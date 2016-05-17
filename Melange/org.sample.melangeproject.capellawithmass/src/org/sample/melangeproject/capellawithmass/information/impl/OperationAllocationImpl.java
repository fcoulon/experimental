/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Operation;
import org.sample.melangeproject.capellawithmass.information.OperationAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationAllocationImpl#getAllocatedOperation <em>Allocated Operation</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationAllocationImpl#getAllocatingOperation <em>Allocating Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationAllocationImpl extends AllocationImpl implements OperationAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.OPERATION_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAllocatedOperation() {
		Operation allocatedOperation = basicGetAllocatedOperation();
		return allocatedOperation != null && allocatedOperation.eIsProxy() ? (Operation)eResolveProxy((InternalEObject)allocatedOperation) : allocatedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAllocatedOperation() {
		// TODO: implement this method to return the 'Allocated Operation' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAllocatingOperation() {
		Operation allocatingOperation = basicGetAllocatingOperation();
		return allocatingOperation != null && allocatingOperation.eIsProxy() ? (Operation)eResolveProxy((InternalEObject)allocatingOperation) : allocatingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAllocatingOperation() {
		// TODO: implement this method to return the 'Allocating Operation' reference
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
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATED_OPERATION:
				if (resolve) return getAllocatedOperation();
				return basicGetAllocatedOperation();
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATING_OPERATION:
				if (resolve) return getAllocatingOperation();
				return basicGetAllocatingOperation();
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
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATED_OPERATION:
				return basicGetAllocatedOperation() != null;
			case InformationPackage.OPERATION_ALLOCATION__ALLOCATING_OPERATION:
				return basicGetAllocatingOperation() != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationAllocationImpl
