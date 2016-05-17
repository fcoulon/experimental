/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionRealizationImpl#getAllocatedFunction <em>Allocated Function</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionRealizationImpl#getAllocatingFunction <em>Allocating Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionRealizationImpl extends AllocationImpl implements FunctionRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction getAllocatedFunction() {
		AbstractFunction allocatedFunction = basicGetAllocatedFunction();
		return allocatedFunction != null && allocatedFunction.eIsProxy() ? (AbstractFunction)eResolveProxy((InternalEObject)allocatedFunction) : allocatedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetAllocatedFunction() {
		// TODO: implement this method to return the 'Allocated Function' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction getAllocatingFunction() {
		AbstractFunction allocatingFunction = basicGetAllocatingFunction();
		return allocatingFunction != null && allocatingFunction.eIsProxy() ? (AbstractFunction)eResolveProxy((InternalEObject)allocatingFunction) : allocatingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetAllocatingFunction() {
		// TODO: implement this method to return the 'Allocating Function' reference
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
			case FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION:
				if (resolve) return getAllocatedFunction();
				return basicGetAllocatedFunction();
			case FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION:
				if (resolve) return getAllocatingFunction();
				return basicGetAllocatingFunction();
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
			case FaPackage.FUNCTION_REALIZATION__ALLOCATED_FUNCTION:
				return basicGetAllocatedFunction() != null;
			case FaPackage.FUNCTION_REALIZATION__ALLOCATING_FUNCTION:
				return basicGetAllocatingFunction() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionRealizationImpl
