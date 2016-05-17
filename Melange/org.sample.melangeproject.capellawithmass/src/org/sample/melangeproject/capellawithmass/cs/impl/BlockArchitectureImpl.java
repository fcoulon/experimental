/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractCapabilityPkg;

import org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation;
import org.sample.melangeproject.capellawithmass.cs.BlockArchitecture;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.InterfacePkg;

import org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionalArchitectureImpl;

import org.sample.melangeproject.capellawithmass.information.DataPkg;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getOwnedRequirementPkgs <em>Owned Requirement Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getOwnedAbstractCapabilityPkg <em>Owned Abstract Capability Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getOwnedInterfacePkg <em>Owned Interface Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getOwnedDataPkg <em>Owned Data Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getProvisionedArchitectureAllocations <em>Provisioned Architecture Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getProvisioningArchitectureAllocations <em>Provisioning Architecture Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getAllocatedArchitectures <em>Allocated Architectures</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl#getAllocatingArchitectures <em>Allocating Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlockArchitectureImpl extends AbstractFunctionalArchitectureImpl implements BlockArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedRequirementPkgs() <em>Owned Requirement Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRequirementPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementsPkg> ownedRequirementPkgs;

	/**
	 * The cached value of the '{@link #getOwnedAbstractCapabilityPkg() <em>Owned Abstract Capability Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractCapabilityPkg()
	 * @generated
	 * @ordered
	 */
	protected AbstractCapabilityPkg ownedAbstractCapabilityPkg;

	/**
	 * The cached value of the '{@link #getOwnedInterfacePkg() <em>Owned Interface Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfacePkg()
	 * @generated
	 * @ordered
	 */
	protected InterfacePkg ownedInterfacePkg;

	/**
	 * The cached value of the '{@link #getOwnedDataPkg() <em>Owned Data Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataPkg()
	 * @generated
	 * @ordered
	 */
	protected DataPkg ownedDataPkg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.BLOCK_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementsPkg> getOwnedRequirementPkgs() {
		if (ownedRequirementPkgs == null) {
			ownedRequirementPkgs = new EObjectContainmentEList<RequirementsPkg>(RequirementsPkg.class, this, CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS);
		}
		return ownedRequirementPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapabilityPkg getOwnedAbstractCapabilityPkg() {
		return ownedAbstractCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAbstractCapabilityPkg(AbstractCapabilityPkg newOwnedAbstractCapabilityPkg, NotificationChain msgs) {
		AbstractCapabilityPkg oldOwnedAbstractCapabilityPkg = ownedAbstractCapabilityPkg;
		ownedAbstractCapabilityPkg = newOwnedAbstractCapabilityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, oldOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAbstractCapabilityPkg(AbstractCapabilityPkg newOwnedAbstractCapabilityPkg) {
		if (newOwnedAbstractCapabilityPkg != ownedAbstractCapabilityPkg) {
			NotificationChain msgs = null;
			if (ownedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)ownedAbstractCapabilityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			if (newOwnedAbstractCapabilityPkg != null)
				msgs = ((InternalEObject)newOwnedAbstractCapabilityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, null, msgs);
			msgs = basicSetOwnedAbstractCapabilityPkg(newOwnedAbstractCapabilityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG, newOwnedAbstractCapabilityPkg, newOwnedAbstractCapabilityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg getOwnedInterfacePkg() {
		return ownedInterfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInterfacePkg(InterfacePkg newOwnedInterfacePkg, NotificationChain msgs) {
		InterfacePkg oldOwnedInterfacePkg = ownedInterfacePkg;
		ownedInterfacePkg = newOwnedInterfacePkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, oldOwnedInterfacePkg, newOwnedInterfacePkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedInterfacePkg(InterfacePkg newOwnedInterfacePkg) {
		if (newOwnedInterfacePkg != ownedInterfacePkg) {
			NotificationChain msgs = null;
			if (ownedInterfacePkg != null)
				msgs = ((InternalEObject)ownedInterfacePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, null, msgs);
			if (newOwnedInterfacePkg != null)
				msgs = ((InternalEObject)newOwnedInterfacePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, null, msgs);
			msgs = basicSetOwnedInterfacePkg(newOwnedInterfacePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG, newOwnedInterfacePkg, newOwnedInterfacePkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg getOwnedDataPkg() {
		return ownedDataPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDataPkg(DataPkg newOwnedDataPkg, NotificationChain msgs) {
		DataPkg oldOwnedDataPkg = ownedDataPkg;
		ownedDataPkg = newOwnedDataPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, oldOwnedDataPkg, newOwnedDataPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDataPkg(DataPkg newOwnedDataPkg) {
		if (newOwnedDataPkg != ownedDataPkg) {
			NotificationChain msgs = null;
			if (ownedDataPkg != null)
				msgs = ((InternalEObject)ownedDataPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, null, msgs);
			if (newOwnedDataPkg != null)
				msgs = ((InternalEObject)newOwnedDataPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, null, msgs);
			msgs = basicSetOwnedDataPkg(newOwnedDataPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG, newOwnedDataPkg, newOwnedDataPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureAllocation> getProvisionedArchitectureAllocations() {
		// TODO: implement this method to return the 'Provisioned Architecture Allocations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArchitectureAllocation> getProvisioningArchitectureAllocations() {
		// TODO: implement this method to return the 'Provisioning Architecture Allocations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockArchitecture> getAllocatedArchitectures() {
		// TODO: implement this method to return the 'Allocated Architectures' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockArchitecture> getAllocatingArchitectures() {
		// TODO: implement this method to return the 'Allocating Architectures' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				return ((InternalEList<?>)getOwnedRequirementPkgs()).basicRemove(otherEnd, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				return basicSetOwnedAbstractCapabilityPkg(null, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				return basicSetOwnedInterfacePkg(null, msgs);
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				return basicSetOwnedDataPkg(null, msgs);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				return getOwnedRequirementPkgs();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				return getOwnedAbstractCapabilityPkg();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				return getOwnedInterfacePkg();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				return getOwnedDataPkg();
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
				return getProvisionedArchitectureAllocations();
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
				return getProvisioningArchitectureAllocations();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATED_ARCHITECTURES:
				return getAllocatedArchitectures();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATING_ARCHITECTURES:
				return getAllocatingArchitectures();
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				getOwnedRequirementPkgs().clear();
				getOwnedRequirementPkgs().addAll((Collection<? extends RequirementsPkg>)newValue);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)newValue);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)newValue);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)newValue);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				getOwnedRequirementPkgs().clear();
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				setOwnedAbstractCapabilityPkg((AbstractCapabilityPkg)null);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				setOwnedInterfacePkg((InterfacePkg)null);
				return;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				setOwnedDataPkg((DataPkg)null);
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
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_REQUIREMENT_PKGS:
				return ownedRequirementPkgs != null && !ownedRequirementPkgs.isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_ABSTRACT_CAPABILITY_PKG:
				return ownedAbstractCapabilityPkg != null;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_INTERFACE_PKG:
				return ownedInterfacePkg != null;
			case CsPackage.BLOCK_ARCHITECTURE__OWNED_DATA_PKG:
				return ownedDataPkg != null;
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONED_ARCHITECTURE_ALLOCATIONS:
				return !getProvisionedArchitectureAllocations().isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__PROVISIONING_ARCHITECTURE_ALLOCATIONS:
				return !getProvisioningArchitectureAllocations().isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATED_ARCHITECTURES:
				return !getAllocatedArchitectures().isEmpty();
			case CsPackage.BLOCK_ARCHITECTURE__ALLOCATING_ARCHITECTURES:
				return !getAllocatingArchitectures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockArchitectureImpl
