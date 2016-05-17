/**
 */
package org.sample.melangeproject.capellawithmass.epbs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.impl.ComponentArchitectureImpl;

import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem;
import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItemPkg;
import org.sample.melangeproject.capellawithmass.epbs.EPBSArchitecture;
import org.sample.melangeproject.capellawithmass.epbs.EPBSContext;
import org.sample.melangeproject.capellawithmass.epbs.EpbsPackage;
import org.sample.melangeproject.capellawithmass.epbs.PhysicalArchitectureRealization;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealizationPkg;

import org.sample.melangeproject.capellawithmass.pa.PhysicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPBS Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getOwnedEPBSContext <em>Owned EPBS Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getOwnedConfigurationItem <em>Owned Configuration Item</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getOwnedConfigurationItemPkg <em>Owned Configuration Item Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getOwnedPhysicalArchitectureRealizations <em>Owned Physical Architecture Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getAllocatedPhysicalArchitectureRealizations <em>Allocated Physical Architecture Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.EPBSArchitectureImpl#getAllocatedPhysicalArchitectures <em>Allocated Physical Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPBSArchitectureImpl extends ComponentArchitectureImpl implements EPBSArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedEPBSContext() <em>Owned EPBS Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEPBSContext()
	 * @generated
	 * @ordered
	 */
	protected EPBSContext ownedEPBSContext;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItem() <em>Owned Configuration Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItem()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItem ownedConfigurationItem;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItemPkg() <em>Owned Configuration Item Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItemPkg()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItemPkg ownedConfigurationItemPkg;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalArchitectureRealizations() <em>Owned Physical Architecture Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalArchitectureRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalArchitectureRealization> ownedPhysicalArchitectureRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EPBSArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.EPBS_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPBSContext getOwnedEPBSContext() {
		return ownedEPBSContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEPBSContext(EPBSContext newOwnedEPBSContext, NotificationChain msgs) {
		EPBSContext oldOwnedEPBSContext = ownedEPBSContext;
		ownedEPBSContext = newOwnedEPBSContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, oldOwnedEPBSContext, newOwnedEPBSContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEPBSContext(EPBSContext newOwnedEPBSContext) {
		if (newOwnedEPBSContext != ownedEPBSContext) {
			NotificationChain msgs = null;
			if (ownedEPBSContext != null)
				msgs = ((InternalEObject)ownedEPBSContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, null, msgs);
			if (newOwnedEPBSContext != null)
				msgs = ((InternalEObject)newOwnedEPBSContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, null, msgs);
			msgs = basicSetOwnedEPBSContext(newOwnedEPBSContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT, newOwnedEPBSContext, newOwnedEPBSContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItem getOwnedConfigurationItem() {
		return ownedConfigurationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedConfigurationItem(ConfigurationItem newOwnedConfigurationItem, NotificationChain msgs) {
		ConfigurationItem oldOwnedConfigurationItem = ownedConfigurationItem;
		ownedConfigurationItem = newOwnedConfigurationItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, oldOwnedConfigurationItem, newOwnedConfigurationItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConfigurationItem(ConfigurationItem newOwnedConfigurationItem) {
		if (newOwnedConfigurationItem != ownedConfigurationItem) {
			NotificationChain msgs = null;
			if (ownedConfigurationItem != null)
				msgs = ((InternalEObject)ownedConfigurationItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, null, msgs);
			if (newOwnedConfigurationItem != null)
				msgs = ((InternalEObject)newOwnedConfigurationItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, null, msgs);
			msgs = basicSetOwnedConfigurationItem(newOwnedConfigurationItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM, newOwnedConfigurationItem, newOwnedConfigurationItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemPkg getOwnedConfigurationItemPkg() {
		return ownedConfigurationItemPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedConfigurationItemPkg(ConfigurationItemPkg newOwnedConfigurationItemPkg, NotificationChain msgs) {
		ConfigurationItemPkg oldOwnedConfigurationItemPkg = ownedConfigurationItemPkg;
		ownedConfigurationItemPkg = newOwnedConfigurationItemPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, oldOwnedConfigurationItemPkg, newOwnedConfigurationItemPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConfigurationItemPkg(ConfigurationItemPkg newOwnedConfigurationItemPkg) {
		if (newOwnedConfigurationItemPkg != ownedConfigurationItemPkg) {
			NotificationChain msgs = null;
			if (ownedConfigurationItemPkg != null)
				msgs = ((InternalEObject)ownedConfigurationItemPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, null, msgs);
			if (newOwnedConfigurationItemPkg != null)
				msgs = ((InternalEObject)newOwnedConfigurationItemPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, null, msgs);
			msgs = basicSetOwnedConfigurationItemPkg(newOwnedConfigurationItemPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG, newOwnedConfigurationItemPkg, newOwnedConfigurationItemPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg getContainedCapabilityRealizationPkg() {
		CapabilityRealizationPkg containedCapabilityRealizationPkg = basicGetContainedCapabilityRealizationPkg();
		return containedCapabilityRealizationPkg != null && containedCapabilityRealizationPkg.eIsProxy() ? (CapabilityRealizationPkg)eResolveProxy((InternalEObject)containedCapabilityRealizationPkg) : containedCapabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg basicGetContainedCapabilityRealizationPkg() {
		// TODO: implement this method to return the 'Contained Capability Realization Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalArchitectureRealization> getOwnedPhysicalArchitectureRealizations() {
		if (ownedPhysicalArchitectureRealizations == null) {
			ownedPhysicalArchitectureRealizations = new EObjectContainmentEList<PhysicalArchitectureRealization>(PhysicalArchitectureRealization.class, this, EpbsPackage.EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS);
		}
		return ownedPhysicalArchitectureRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalArchitectureRealization> getAllocatedPhysicalArchitectureRealizations() {
		// TODO: implement this method to return the 'Allocated Physical Architecture Realizations' reference list
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
	public EList<PhysicalArchitecture> getAllocatedPhysicalArchitectures() {
		// TODO: implement this method to return the 'Allocated Physical Architectures' reference list
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				return basicSetOwnedEPBSContext(null, msgs);
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				return basicSetOwnedConfigurationItem(null, msgs);
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				return basicSetOwnedConfigurationItemPkg(null, msgs);
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPhysicalArchitectureRealizations()).basicRemove(otherEnd, msgs);
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				return getOwnedEPBSContext();
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				return getOwnedConfigurationItem();
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				return getOwnedConfigurationItemPkg();
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				if (resolve) return getContainedCapabilityRealizationPkg();
				return basicGetContainedCapabilityRealizationPkg();
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				return getOwnedPhysicalArchitectureRealizations();
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				return getAllocatedPhysicalArchitectureRealizations();
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES:
				return getAllocatedPhysicalArchitectures();
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				setOwnedEPBSContext((EPBSContext)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				setOwnedConfigurationItem((ConfigurationItem)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				setOwnedConfigurationItemPkg((ConfigurationItemPkg)newValue);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				getOwnedPhysicalArchitectureRealizations().clear();
				getOwnedPhysicalArchitectureRealizations().addAll((Collection<? extends PhysicalArchitectureRealization>)newValue);
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				setOwnedEPBSContext((EPBSContext)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				setOwnedConfigurationItem((ConfigurationItem)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				setOwnedConfigurationItemPkg((ConfigurationItemPkg)null);
				return;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				getOwnedPhysicalArchitectureRealizations().clear();
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
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_EPBS_CONTEXT:
				return ownedEPBSContext != null;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM:
				return ownedConfigurationItem != null;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_CONFIGURATION_ITEM_PKG:
				return ownedConfigurationItemPkg != null;
			case EpbsPackage.EPBS_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return basicGetContainedCapabilityRealizationPkg() != null;
			case EpbsPackage.EPBS_ARCHITECTURE__OWNED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				return ownedPhysicalArchitectureRealizations != null && !ownedPhysicalArchitectureRealizations.isEmpty();
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURE_REALIZATIONS:
				return !getAllocatedPhysicalArchitectureRealizations().isEmpty();
			case EpbsPackage.EPBS_ARCHITECTURE__ALLOCATED_PHYSICAL_ARCHITECTURES:
				return !getAllocatedPhysicalArchitectures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EPBSArchitectureImpl
