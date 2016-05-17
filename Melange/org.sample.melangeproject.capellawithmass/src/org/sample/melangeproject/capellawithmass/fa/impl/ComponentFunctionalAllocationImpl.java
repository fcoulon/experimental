/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalBlock;
import org.sample.melangeproject.capellawithmass.fa.ComponentFunctionalAllocation;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Functional Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentFunctionalAllocationImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentFunctionalAllocationImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentFunctionalAllocationImpl extends AllocationImpl implements ComponentFunctionalAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFunctionalAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_FUNCTIONAL_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction getFunction() {
		AbstractFunction function = basicGetFunction();
		return function != null && function.eIsProxy() ? (AbstractFunction)eResolveProxy((InternalEObject)function) : function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetFunction() {
		// TODO: implement this method to return the 'Function' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionalBlock getBlock() {
		AbstractFunctionalBlock block = basicGetBlock();
		return block != null && block.eIsProxy() ? (AbstractFunctionalBlock)eResolveProxy((InternalEObject)block) : block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunctionalBlock basicGetBlock() {
		// TODO: implement this method to return the 'Block' reference
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
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK:
				if (resolve) return getBlock();
				return basicGetBlock();
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
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__FUNCTION:
				return basicGetFunction() != null;
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION__BLOCK:
				return basicGetBlock() != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentFunctionalAllocationImpl
