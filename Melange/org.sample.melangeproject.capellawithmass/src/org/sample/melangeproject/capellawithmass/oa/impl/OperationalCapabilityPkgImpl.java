/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractCapabilityPkgImpl;

import org.sample.melangeproject.capellawithmass.oa.CapabilityConfiguration;
import org.sample.melangeproject.capellawithmass.oa.ConceptCompliance;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalCapability;
import org.sample.melangeproject.capellawithmass.oa.OperationalCapabilityPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Capability Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityPkgImpl#getOwnedOperationalCapabilities <em>Owned Operational Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityPkgImpl#getOwnedOperationalCapabilityPkgs <em>Owned Operational Capability Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityPkgImpl#getOwnedCapabilityConfigurations <em>Owned Capability Configurations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityPkgImpl#getOwnedConceptCompliances <em>Owned Concept Compliances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalCapabilityPkgImpl extends AbstractCapabilityPkgImpl implements OperationalCapabilityPkg {
	/**
	 * The cached value of the '{@link #getOwnedOperationalCapabilities() <em>Owned Operational Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapability> ownedOperationalCapabilities;

	/**
	 * The cached value of the '{@link #getOwnedOperationalCapabilityPkgs() <em>Owned Operational Capability Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalCapabilityPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCapabilityPkg> ownedOperationalCapabilityPkgs;

	/**
	 * The cached value of the '{@link #getOwnedCapabilityConfigurations() <em>Owned Capability Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCapabilityConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityConfiguration> ownedCapabilityConfigurations;

	/**
	 * The cached value of the '{@link #getOwnedConceptCompliances() <em>Owned Concept Compliances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConceptCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptCompliance> ownedConceptCompliances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_CAPABILITY_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapability> getOwnedOperationalCapabilities() {
		if (ownedOperationalCapabilities == null) {
			ownedOperationalCapabilities = new EObjectContainmentEList<OperationalCapability>(OperationalCapability.class, this, OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES);
		}
		return ownedOperationalCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapabilityPkg> getOwnedOperationalCapabilityPkgs() {
		if (ownedOperationalCapabilityPkgs == null) {
			ownedOperationalCapabilityPkgs = new EObjectContainmentEList<OperationalCapabilityPkg>(OperationalCapabilityPkg.class, this, OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS);
		}
		return ownedOperationalCapabilityPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityConfiguration> getOwnedCapabilityConfigurations() {
		if (ownedCapabilityConfigurations == null) {
			ownedCapabilityConfigurations = new EObjectContainmentEList<CapabilityConfiguration>(CapabilityConfiguration.class, this, OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS);
		}
		return ownedCapabilityConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptCompliance> getOwnedConceptCompliances() {
		if (ownedConceptCompliances == null) {
			ownedConceptCompliances = new EObjectContainmentEList<ConceptCompliance>(ConceptCompliance.class, this, OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES);
		}
		return ownedConceptCompliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				return ((InternalEList<?>)getOwnedOperationalCapabilities()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				return ((InternalEList<?>)getOwnedOperationalCapabilityPkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS:
				return ((InternalEList<?>)getOwnedCapabilityConfigurations()).basicRemove(otherEnd, msgs);
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES:
				return ((InternalEList<?>)getOwnedConceptCompliances()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				return getOwnedOperationalCapabilities();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				return getOwnedOperationalCapabilityPkgs();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS:
				return getOwnedCapabilityConfigurations();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES:
				return getOwnedConceptCompliances();
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				getOwnedOperationalCapabilities().clear();
				getOwnedOperationalCapabilities().addAll((Collection<? extends OperationalCapability>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				getOwnedOperationalCapabilityPkgs().clear();
				getOwnedOperationalCapabilityPkgs().addAll((Collection<? extends OperationalCapabilityPkg>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS:
				getOwnedCapabilityConfigurations().clear();
				getOwnedCapabilityConfigurations().addAll((Collection<? extends CapabilityConfiguration>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES:
				getOwnedConceptCompliances().clear();
				getOwnedConceptCompliances().addAll((Collection<? extends ConceptCompliance>)newValue);
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				getOwnedOperationalCapabilities().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				getOwnedOperationalCapabilityPkgs().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS:
				getOwnedCapabilityConfigurations().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES:
				getOwnedConceptCompliances().clear();
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
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITIES:
				return ownedOperationalCapabilities != null && !ownedOperationalCapabilities.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_OPERATIONAL_CAPABILITY_PKGS:
				return ownedOperationalCapabilityPkgs != null && !ownedOperationalCapabilityPkgs.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CAPABILITY_CONFIGURATIONS:
				return ownedCapabilityConfigurations != null && !ownedCapabilityConfigurations.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG__OWNED_CONCEPT_COMPLIANCES:
				return ownedConceptCompliances != null && !ownedConceptCompliances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalCapabilityPkgImpl
