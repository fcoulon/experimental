/**
 */
package org.sample.melangeproject.capellawithmass.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl;

import org.sample.melangeproject.capellawithmass.pa.PaPackage;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunction;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Function Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionPkgImpl#getOwnedPhysicalFunctions <em>Owned Physical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionPkgImpl#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalFunctionPkgImpl extends FunctionPkgImpl implements PhysicalFunctionPkg {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalFunctions() <em>Owned Physical Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunction> ownedPhysicalFunctions;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalFunctionPkgs() <em>Owned Physical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunctionPkg> ownedPhysicalFunctionPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFunctionPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_FUNCTION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunction> getOwnedPhysicalFunctions() {
		if (ownedPhysicalFunctions == null) {
			ownedPhysicalFunctions = new EObjectContainmentEList<PhysicalFunction>(PhysicalFunction.class, this, PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS);
		}
		return ownedPhysicalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunctionPkg> getOwnedPhysicalFunctionPkgs() {
		if (ownedPhysicalFunctionPkgs == null) {
			ownedPhysicalFunctionPkgs = new EObjectContainmentEList<PhysicalFunctionPkg>(PhysicalFunctionPkg.class, this, PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS);
		}
		return ownedPhysicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS:
				return ((InternalEList<?>)getOwnedPhysicalFunctions()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalFunctionPkgs()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS:
				return getOwnedPhysicalFunctions();
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS:
				return getOwnedPhysicalFunctionPkgs();
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
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS:
				getOwnedPhysicalFunctions().clear();
				getOwnedPhysicalFunctions().addAll((Collection<? extends PhysicalFunction>)newValue);
				return;
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
				getOwnedPhysicalFunctionPkgs().addAll((Collection<? extends PhysicalFunctionPkg>)newValue);
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
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS:
				getOwnedPhysicalFunctions().clear();
				return;
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
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
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTIONS:
				return ownedPhysicalFunctions != null && !ownedPhysicalFunctions.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION_PKG__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ownedPhysicalFunctionPkgs != null && !ownedPhysicalFunctionPkgs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalFunctionPkgImpl
