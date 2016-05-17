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

import org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalArtifact;

import org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl;

import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem;
import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItemKind;
import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItemPkg;
import org.sample.melangeproject.capellawithmass.epbs.EpbsPackage;
import org.sample.melangeproject.capellawithmass.epbs.PhysicalArtifactRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemImpl#getItemIdentifier <em>Item Identifier</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemImpl#getOwnedConfigurationItems <em>Owned Configuration Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemImpl#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemImpl#getOwnedPhysicalArtifactRealizations <em>Owned Physical Artifact Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemImpl#getAllocatedPhysicalArtifacts <em>Allocated Physical Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationItemImpl extends SystemComponentImpl implements ConfigurationItem {
	/**
	 * The default value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemIdentifier() <em>Item Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String itemIdentifier = ITEM_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConfigurationItemKind KIND_EDEFAULT = ConfigurationItemKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationItemKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItems() <em>Owned Configuration Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationItem> ownedConfigurationItems;

	/**
	 * The cached value of the '{@link #getOwnedConfigurationItemPkgs() <em>Owned Configuration Item Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurationItemPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationItemPkg> ownedConfigurationItemPkgs;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalArtifactRealizations() <em>Owned Physical Artifact Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalArtifactRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalArtifactRealization> ownedPhysicalArtifactRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.CONFIGURATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItemIdentifier() {
		return itemIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemIdentifier(String newItemIdentifier) {
		String oldItemIdentifier = itemIdentifier;
		itemIdentifier = newItemIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER, oldItemIdentifier, itemIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ConfigurationItemKind newKind) {
		ConfigurationItemKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EpbsPackage.CONFIGURATION_ITEM__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItem> getOwnedConfigurationItems() {
		if (ownedConfigurationItems == null) {
			ownedConfigurationItems = new EObjectContainmentEList<ConfigurationItem>(ConfigurationItem.class, this, EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS);
		}
		return ownedConfigurationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItemPkg> getOwnedConfigurationItemPkgs() {
		if (ownedConfigurationItemPkgs == null) {
			ownedConfigurationItemPkgs = new EObjectContainmentEList<ConfigurationItemPkg>(ConfigurationItemPkg.class, this, EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS);
		}
		return ownedConfigurationItemPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalArtifactRealization> getOwnedPhysicalArtifactRealizations() {
		if (ownedPhysicalArtifactRealizations == null) {
			ownedPhysicalArtifactRealizations = new EObjectContainmentEList<PhysicalArtifactRealization>(PhysicalArtifactRealization.class, this, EpbsPackage.CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS);
		}
		return ownedPhysicalArtifactRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPhysicalArtifact> getAllocatedPhysicalArtifacts() {
		// TODO: implement this method to return the 'Allocated Physical Artifacts' reference list
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
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				return ((InternalEList<?>)getOwnedConfigurationItems()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				return ((InternalEList<?>)getOwnedConfigurationItemPkgs()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPhysicalArtifactRealizations()).basicRemove(otherEnd, msgs);
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				return getItemIdentifier();
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				return getKind();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				return getOwnedConfigurationItems();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				return getOwnedConfigurationItemPkgs();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS:
				return getOwnedPhysicalArtifactRealizations();
			case EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS:
				return getAllocatedPhysicalArtifacts();
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				setItemIdentifier((String)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				setKind((ConfigurationItemKind)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				getOwnedConfigurationItems().clear();
				getOwnedConfigurationItems().addAll((Collection<? extends ConfigurationItem>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				getOwnedConfigurationItemPkgs().clear();
				getOwnedConfigurationItemPkgs().addAll((Collection<? extends ConfigurationItemPkg>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS:
				getOwnedPhysicalArtifactRealizations().clear();
				getOwnedPhysicalArtifactRealizations().addAll((Collection<? extends PhysicalArtifactRealization>)newValue);
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				setItemIdentifier(ITEM_IDENTIFIER_EDEFAULT);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				getOwnedConfigurationItems().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				getOwnedConfigurationItemPkgs().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS:
				getOwnedPhysicalArtifactRealizations().clear();
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
			case EpbsPackage.CONFIGURATION_ITEM__ITEM_IDENTIFIER:
				return ITEM_IDENTIFIER_EDEFAULT == null ? itemIdentifier != null : !ITEM_IDENTIFIER_EDEFAULT.equals(itemIdentifier);
			case EpbsPackage.CONFIGURATION_ITEM__KIND:
				return kind != KIND_EDEFAULT;
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEMS:
				return ownedConfigurationItems != null && !ownedConfigurationItems.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_CONFIGURATION_ITEM_PKGS:
				return ownedConfigurationItemPkgs != null && !ownedConfigurationItemPkgs.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM__OWNED_PHYSICAL_ARTIFACT_REALIZATIONS:
				return ownedPhysicalArtifactRealizations != null && !ownedPhysicalArtifactRealizations.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM__ALLOCATED_PHYSICAL_ARTIFACTS:
				return !getAllocatedPhysicalArtifacts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (itemIdentifier: ");
		result.append(itemIdentifier);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ConfigurationItemImpl
