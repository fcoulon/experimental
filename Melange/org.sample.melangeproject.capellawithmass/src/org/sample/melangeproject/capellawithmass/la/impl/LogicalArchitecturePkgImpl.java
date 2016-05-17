/**
 */
package org.sample.melangeproject.capellawithmass.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitecturePkgImpl;

import org.sample.melangeproject.capellawithmass.la.LaPackage;
import org.sample.melangeproject.capellawithmass.la.LogicalArchitecture;
import org.sample.melangeproject.capellawithmass.la.LogicalArchitecturePkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Architecture Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitecturePkgImpl#getOwnedLogicalArchitectures <em>Owned Logical Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalArchitecturePkgImpl extends BlockArchitecturePkgImpl implements LogicalArchitecturePkg {
	/**
	 * The cached value of the '{@link #getOwnedLogicalArchitectures() <em>Owned Logical Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> ownedLogicalArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalArchitecturePkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_ARCHITECTURE_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalArchitecture> getOwnedLogicalArchitectures() {
		if (ownedLogicalArchitectures == null) {
			ownedLogicalArchitectures = new EObjectContainmentEList<LogicalArchitecture>(LogicalArchitecture.class, this, LaPackage.LOGICAL_ARCHITECTURE_PKG__OWNED_LOGICAL_ARCHITECTURES);
		}
		return ownedLogicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.LOGICAL_ARCHITECTURE_PKG__OWNED_LOGICAL_ARCHITECTURES:
				return ((InternalEList<?>)getOwnedLogicalArchitectures()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_ARCHITECTURE_PKG__OWNED_LOGICAL_ARCHITECTURES:
				return getOwnedLogicalArchitectures();
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
			case LaPackage.LOGICAL_ARCHITECTURE_PKG__OWNED_LOGICAL_ARCHITECTURES:
				getOwnedLogicalArchitectures().clear();
				getOwnedLogicalArchitectures().addAll((Collection<? extends LogicalArchitecture>)newValue);
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
			case LaPackage.LOGICAL_ARCHITECTURE_PKG__OWNED_LOGICAL_ARCHITECTURES:
				getOwnedLogicalArchitectures().clear();
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
			case LaPackage.LOGICAL_ARCHITECTURE_PKG__OWNED_LOGICAL_ARCHITECTURES:
				return ownedLogicalArchitectures != null && !ownedLogicalArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalArchitecturePkgImpl
