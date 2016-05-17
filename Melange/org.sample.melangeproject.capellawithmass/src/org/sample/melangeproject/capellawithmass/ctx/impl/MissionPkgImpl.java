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

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValuePkg;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.Mission;
import org.sample.melangeproject.capellawithmass.ctx.MissionPkg;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getOwnedMissionPkgs <em>Owned Mission Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionPkgImpl#getOwnedMissions <em>Owned Missions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionPkgImpl extends NamedElementImpl implements MissionPkg {
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
	 * The cached value of the '{@link #getOwnedMissionPkgs() <em>Owned Mission Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<MissionPkg> ownedMissionPkgs;

	/**
	 * The cached value of the '{@link #getOwnedMissions() <em>Owned Missions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissions()
	 * @generated
	 * @ordered
	 */
	protected EList<Mission> ownedMissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.MISSION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CtxPackage.MISSION_PKG__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CtxPackage.MISSION_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MissionPkg> getOwnedMissionPkgs() {
		if (ownedMissionPkgs == null) {
			ownedMissionPkgs = new EObjectContainmentEList<MissionPkg>(MissionPkg.class, this, CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS);
		}
		return ownedMissionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getOwnedMissions() {
		if (ownedMissions == null) {
			ownedMissions = new EObjectContainmentEList<Mission>(Mission.class, this, CtxPackage.MISSION_PKG__OWNED_MISSIONS);
		}
		return ownedMissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				return ((InternalEList<?>)getOwnedMissionPkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				return ((InternalEList<?>)getOwnedMissions()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case CtxPackage.MISSION_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CtxPackage.MISSION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				return getNamingRules();
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				return getOwnedMissionPkgs();
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				return getOwnedMissions();
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				getOwnedMissionPkgs().clear();
				getOwnedMissionPkgs().addAll((Collection<? extends MissionPkg>)newValue);
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				getOwnedMissions().clear();
				getOwnedMissions().addAll((Collection<? extends Mission>)newValue);
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				getOwnedMissionPkgs().clear();
				return;
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				getOwnedMissions().clear();
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
			case CtxPackage.MISSION_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CtxPackage.MISSION_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case CtxPackage.MISSION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case CtxPackage.MISSION_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CtxPackage.MISSION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CtxPackage.MISSION_PKG__OWNED_MISSION_PKGS:
				return ownedMissionPkgs != null && !ownedMissionPkgs.isEmpty();
			case CtxPackage.MISSION_PKG__OWNED_MISSIONS:
				return ownedMissions != null && !ownedMissions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MissionPkgImpl
