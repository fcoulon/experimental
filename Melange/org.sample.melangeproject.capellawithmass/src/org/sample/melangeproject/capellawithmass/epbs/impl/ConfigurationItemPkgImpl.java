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

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValuePkg;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem;
import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItemPkg;
import org.sample.melangeproject.capellawithmass.epbs.EpbsPackage;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Item Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getOwnedConfigurationItems <em>Owned Configuration Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.epbs.impl.ConfigurationItemPkgImpl#getOwnedConfigurationItemPkgs <em>Owned Configuration Item Pkgs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationItemPkgImpl extends NamedElementImpl implements ConfigurationItemPkg {
	/**
	 * The cached value of the '{@link #getOwnedTraces() <em>Owned Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> ownedTraces;

	/**
	 * The cached value of the '{@link #getNamingRules() <em>Naming Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingRule> namingRules;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationItemPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EpbsPackage.Literals.CONFIGURATION_ITEM_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_TRACES);
		}
		return ownedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		// TODO: implement this method to return the 'Contained Generic Traces' reference list
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
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		// TODO: implement this method to return the 'Contained Requirements Traces' reference list
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
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, EpbsPackage.CONFIGURATION_ITEM_PKG__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItem> getOwnedConfigurationItems() {
		if (ownedConfigurationItems == null) {
			ownedConfigurationItems = new EObjectContainmentEList<ConfigurationItem>(ConfigurationItem.class, this, EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS);
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
			ownedConfigurationItemPkgs = new EObjectContainmentEList<ConfigurationItemPkg>(ConfigurationItemPkg.class, this, EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS);
		}
		return ownedConfigurationItemPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS:
				return ((InternalEList<?>)getOwnedConfigurationItems()).basicRemove(otherEnd, msgs);
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS:
				return ((InternalEList<?>)getOwnedConfigurationItemPkgs()).basicRemove(otherEnd, msgs);
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
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__NAMING_RULES:
				return getNamingRules();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS:
				return getOwnedConfigurationItems();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS:
				return getOwnedConfigurationItemPkgs();
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
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS:
				getOwnedConfigurationItems().clear();
				getOwnedConfigurationItems().addAll((Collection<? extends ConfigurationItem>)newValue);
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS:
				getOwnedConfigurationItemPkgs().clear();
				getOwnedConfigurationItemPkgs().addAll((Collection<? extends ConfigurationItemPkg>)newValue);
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
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS:
				getOwnedConfigurationItems().clear();
				return;
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS:
				getOwnedConfigurationItemPkgs().clear();
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
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEMS:
				return ownedConfigurationItems != null && !ownedConfigurationItems.isEmpty();
			case EpbsPackage.CONFIGURATION_ITEM_PKG__OWNED_CONFIGURATION_ITEM_PKGS:
				return ownedConfigurationItemPkgs != null && !ownedConfigurationItemPkgs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationItemPkgImpl
