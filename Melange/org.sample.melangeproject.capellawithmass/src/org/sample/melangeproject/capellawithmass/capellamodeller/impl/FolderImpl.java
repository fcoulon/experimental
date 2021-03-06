/**
 */
package org.sample.melangeproject.capellawithmass.capellamodeller.impl;

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

import org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage;
import org.sample.melangeproject.capellawithmass.capellamodeller.Folder;
import org.sample.melangeproject.capellawithmass.capellamodeller.ModelRoot;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getOwnedFolders <em>Owned Folders</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellamodeller.impl.FolderImpl#getOwnedModelRoots <em>Owned Model Roots</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends NamedElementImpl implements Folder {
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
	 * The cached value of the '{@link #getOwnedFolders() <em>Owned Folders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFolders()
	 * @generated
	 * @ordered
	 */
	protected EList<Folder> ownedFolders;

	/**
	 * The cached value of the '{@link #getOwnedModelRoots() <em>Owned Model Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelRoot> ownedModelRoots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellamodellerPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CapellamodellerPackage.FOLDER__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CapellamodellerPackage.FOLDER__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, CapellamodellerPackage.FOLDER__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Folder> getOwnedFolders() {
		if (ownedFolders == null) {
			ownedFolders = new EObjectContainmentEList<Folder>(Folder.class, this, CapellamodellerPackage.FOLDER__OWNED_FOLDERS);
		}
		return ownedFolders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelRoot> getOwnedModelRoots() {
		if (ownedModelRoots == null) {
			ownedModelRoots = new EObjectContainmentEList<ModelRoot>(ModelRoot.class, this, CapellamodellerPackage.FOLDER__OWNED_MODEL_ROOTS);
		}
		return ownedModelRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellamodellerPackage.FOLDER__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.FOLDER__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.FOLDER__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.FOLDER__OWNED_FOLDERS:
				return ((InternalEList<?>)getOwnedFolders()).basicRemove(otherEnd, msgs);
			case CapellamodellerPackage.FOLDER__OWNED_MODEL_ROOTS:
				return ((InternalEList<?>)getOwnedModelRoots()).basicRemove(otherEnd, msgs);
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
			case CapellamodellerPackage.FOLDER__OWNED_TRACES:
				return getOwnedTraces();
			case CapellamodellerPackage.FOLDER__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CapellamodellerPackage.FOLDER__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CapellamodellerPackage.FOLDER__NAMING_RULES:
				return getNamingRules();
			case CapellamodellerPackage.FOLDER__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CapellamodellerPackage.FOLDER__OWNED_FOLDERS:
				return getOwnedFolders();
			case CapellamodellerPackage.FOLDER__OWNED_MODEL_ROOTS:
				return getOwnedModelRoots();
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
			case CapellamodellerPackage.FOLDER__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CapellamodellerPackage.FOLDER__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CapellamodellerPackage.FOLDER__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CapellamodellerPackage.FOLDER__OWNED_FOLDERS:
				getOwnedFolders().clear();
				getOwnedFolders().addAll((Collection<? extends Folder>)newValue);
				return;
			case CapellamodellerPackage.FOLDER__OWNED_MODEL_ROOTS:
				getOwnedModelRoots().clear();
				getOwnedModelRoots().addAll((Collection<? extends ModelRoot>)newValue);
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
			case CapellamodellerPackage.FOLDER__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CapellamodellerPackage.FOLDER__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CapellamodellerPackage.FOLDER__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CapellamodellerPackage.FOLDER__OWNED_FOLDERS:
				getOwnedFolders().clear();
				return;
			case CapellamodellerPackage.FOLDER__OWNED_MODEL_ROOTS:
				getOwnedModelRoots().clear();
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
			case CapellamodellerPackage.FOLDER__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CapellamodellerPackage.FOLDER__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case CapellamodellerPackage.FOLDER__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case CapellamodellerPackage.FOLDER__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CapellamodellerPackage.FOLDER__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CapellamodellerPackage.FOLDER__OWNED_FOLDERS:
				return ownedFolders != null && !ownedFolders.isEmpty();
			case CapellamodellerPackage.FOLDER__OWNED_MODEL_ROOTS:
				return ownedModelRoots != null && !ownedModelRoots.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FolderImpl
