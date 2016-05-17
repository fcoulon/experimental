/**
 */
package org.sample.melangeproject.capellawithmass.pa.deployment.impl;

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

import org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentAspect;
import org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentConfiguration;
import org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getOwnedConfigurations <em>Owned Configurations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentAspectImpl#getOwnedDeploymentAspects <em>Owned Deployment Aspects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentAspectImpl extends NamedElementImpl implements DeploymentAspect {
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
	 * The cached value of the '{@link #getOwnedConfigurations() <em>Owned Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentConfiguration> ownedConfigurations;

	/**
	 * The cached value of the '{@link #getOwnedDeploymentAspects() <em>Owned Deployment Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeploymentAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentAspect> ownedDeploymentAspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentAspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentPackage.Literals.DEPLOYMENT_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, DeploymentPackage.DEPLOYMENT_ASPECT__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentConfiguration> getOwnedConfigurations() {
		if (ownedConfigurations == null) {
			ownedConfigurations = new EObjectContainmentEList<DeploymentConfiguration>(DeploymentConfiguration.class, this, DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_CONFIGURATIONS);
		}
		return ownedConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentAspect> getOwnedDeploymentAspects() {
		if (ownedDeploymentAspects == null) {
			ownedDeploymentAspects = new EObjectContainmentEList<DeploymentAspect>(DeploymentAspect.class, this, DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_DEPLOYMENT_ASPECTS);
		}
		return ownedDeploymentAspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT_ASPECT__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_CONFIGURATIONS:
				return ((InternalEList<?>)getOwnedConfigurations()).basicRemove(otherEnd, msgs);
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_DEPLOYMENT_ASPECTS:
				return ((InternalEList<?>)getOwnedDeploymentAspects()).basicRemove(otherEnd, msgs);
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
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_TRACES:
				return getOwnedTraces();
			case DeploymentPackage.DEPLOYMENT_ASPECT__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case DeploymentPackage.DEPLOYMENT_ASPECT__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case DeploymentPackage.DEPLOYMENT_ASPECT__NAMING_RULES:
				return getNamingRules();
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_CONFIGURATIONS:
				return getOwnedConfigurations();
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_DEPLOYMENT_ASPECTS:
				return getOwnedDeploymentAspects();
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
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_CONFIGURATIONS:
				getOwnedConfigurations().clear();
				getOwnedConfigurations().addAll((Collection<? extends DeploymentConfiguration>)newValue);
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_DEPLOYMENT_ASPECTS:
				getOwnedDeploymentAspects().clear();
				getOwnedDeploymentAspects().addAll((Collection<? extends DeploymentAspect>)newValue);
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
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__NAMING_RULES:
				getNamingRules().clear();
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_CONFIGURATIONS:
				getOwnedConfigurations().clear();
				return;
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_DEPLOYMENT_ASPECTS:
				getOwnedDeploymentAspects().clear();
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
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case DeploymentPackage.DEPLOYMENT_ASPECT__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case DeploymentPackage.DEPLOYMENT_ASPECT__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case DeploymentPackage.DEPLOYMENT_ASPECT__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_CONFIGURATIONS:
				return ownedConfigurations != null && !ownedConfigurations.isEmpty();
			case DeploymentPackage.DEPLOYMENT_ASPECT__OWNED_DEPLOYMENT_ASPECTS:
				return ownedDeploymentAspects != null && !ownedDeploymentAspects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentAspectImpl
