/**
 */
package org.sample.melangeproject.capellawithmass.epbs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitecturePkgImpl;

import org.sample.melangeproject.capellawithmass.epbs.EPBSArchitecture;
import org.sample.melangeproject.capellawithmass.epbs.EPBSArchitecturePkg;
import org.sample.melangeproject.capellawithmass.epbs.EpbsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPBS Architecture Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitecturePkgImpl#getOwnedEPBSArchitectures <em>Owned EPBS Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPBSArchitecturePkgImpl extends BlockArchitecturePkgImpl implements EPBSArchitecturePkg {
	/**
	 * The cached value of the '{@link #getOwnedEPBSArchitectures() <em>Owned EPBS Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEPBSArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<EPBSArchitecture> ownedEPBSArchitectures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPBSArchitecturePkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.EPBS_ARCHITECTURE_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPBSArchitecture> getOwnedEPBSArchitectures() {
		if (ownedEPBSArchitectures == null) {
			ownedEPBSArchitectures = new EObjectContainmentEList<EPBSArchitecture>(EPBSArchitecture.class, this, EpbsPackage.EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES);
		}
		return ownedEPBSArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpbsPackage.EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES:
				return ((InternalEList<?>)getOwnedEPBSArchitectures()).basicRemove(otherEnd, msgs);
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
			case EpbsPackage.EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES:
				return getOwnedEPBSArchitectures();
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
			case EpbsPackage.EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES:
				getOwnedEPBSArchitectures().clear();
				getOwnedEPBSArchitectures().addAll((Collection<? extends EPBSArchitecture>)newValue);
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
			case EpbsPackage.EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES:
				getOwnedEPBSArchitectures().clear();
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
			case EpbsPackage.EPBS_ARCHITECTURE_PKG__OWNED_EPBS_ARCHITECTURES:
				return ownedEPBSArchitectures != null && !ownedEPBSArchitectures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EPBSArchitecturePkgImpl
