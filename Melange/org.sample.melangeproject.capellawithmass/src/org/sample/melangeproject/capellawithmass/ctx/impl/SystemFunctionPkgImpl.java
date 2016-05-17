/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunctionPkg;

import org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Function Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionPkgImpl#getOwnedSystemFunctions <em>Owned System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionPkgImpl#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemFunctionPkgImpl extends FunctionPkgImpl implements SystemFunctionPkg {
	/**
	 * The cached value of the '{@link #getOwnedSystemFunctions() <em>Owned System Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunction> ownedSystemFunctions;

	/**
	 * The cached value of the '{@link #getOwnedSystemFunctionPkgs() <em>Owned System Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunctionPkg> ownedSystemFunctionPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFunctionPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_FUNCTION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getOwnedSystemFunctions() {
		if (ownedSystemFunctions == null) {
			ownedSystemFunctions = new EObjectContainmentEList<SystemFunction>(SystemFunction.class, this, CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS);
		}
		return ownedSystemFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunctionPkg> getOwnedSystemFunctionPkgs() {
		if (ownedSystemFunctionPkgs == null) {
			ownedSystemFunctionPkgs = new EObjectContainmentEList<SystemFunctionPkg>(SystemFunctionPkg.class, this, CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS);
		}
		return ownedSystemFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS:
				return ((InternalEList<?>)getOwnedSystemFunctions()).basicRemove(otherEnd, msgs);
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedSystemFunctionPkgs()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS:
				return getOwnedSystemFunctions();
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS:
				return getOwnedSystemFunctionPkgs();
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
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS:
				getOwnedSystemFunctions().clear();
				getOwnedSystemFunctions().addAll((Collection<? extends SystemFunction>)newValue);
				return;
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
				getOwnedSystemFunctionPkgs().addAll((Collection<? extends SystemFunctionPkg>)newValue);
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
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS:
				getOwnedSystemFunctions().clear();
				return;
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
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
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTIONS:
				return ownedSystemFunctions != null && !ownedSystemFunctions.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION_PKG__OWNED_SYSTEM_FUNCTION_PKGS:
				return ownedSystemFunctionPkgs != null && !ownedSystemFunctionPkgs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemFunctionPkgImpl
