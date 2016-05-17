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

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.ActorPkg;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunication;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getOwnedActors <em>Owned Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getOwnedActorPkgs <em>Owned Actor Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorPkgImpl#getOwnedSystemCommunication <em>Owned System Communication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorPkgImpl extends NamedElementImpl implements ActorPkg {
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
	 * The cached value of the '{@link #getOwnedActors() <em>Owned Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> ownedActors;

	/**
	 * The cached value of the '{@link #getOwnedActorPkgs() <em>Owned Actor Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorPkg> ownedActorPkgs;

	/**
	 * The cached value of the '{@link #getOwnedSystemCommunication() <em>Owned System Communication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemCommunication> ownedSystemCommunication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.ACTOR_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, CtxPackage.ACTOR_PKG__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, CtxPackage.ACTOR_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, CtxPackage.ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getOwnedActors() {
		if (ownedActors == null) {
			ownedActors = new EObjectContainmentEList<Actor>(Actor.class, this, CtxPackage.ACTOR_PKG__OWNED_ACTORS);
		}
		return ownedActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorPkg> getOwnedActorPkgs() {
		if (ownedActorPkgs == null) {
			ownedActorPkgs = new EObjectContainmentEList<ActorPkg>(ActorPkg.class, this, CtxPackage.ACTOR_PKG__OWNED_ACTOR_PKGS);
		}
		return ownedActorPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemCommunication> getOwnedSystemCommunication() {
		if (ownedSystemCommunication == null) {
			ownedSystemCommunication = new EObjectContainmentEList<SystemCommunication>(SystemCommunication.class, this, CtxPackage.ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION);
		}
		return ownedSystemCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.ACTOR_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case CtxPackage.ACTOR_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case CtxPackage.ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.ACTOR_PKG__OWNED_ACTORS:
				return ((InternalEList<?>)getOwnedActors()).basicRemove(otherEnd, msgs);
			case CtxPackage.ACTOR_PKG__OWNED_ACTOR_PKGS:
				return ((InternalEList<?>)getOwnedActorPkgs()).basicRemove(otherEnd, msgs);
			case CtxPackage.ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION:
				return ((InternalEList<?>)getOwnedSystemCommunication()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.ACTOR_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case CtxPackage.ACTOR_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case CtxPackage.ACTOR_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case CtxPackage.ACTOR_PKG__NAMING_RULES:
				return getNamingRules();
			case CtxPackage.ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CtxPackage.ACTOR_PKG__OWNED_ACTORS:
				return getOwnedActors();
			case CtxPackage.ACTOR_PKG__OWNED_ACTOR_PKGS:
				return getOwnedActorPkgs();
			case CtxPackage.ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION:
				return getOwnedSystemCommunication();
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
			case CtxPackage.ACTOR_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case CtxPackage.ACTOR_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case CtxPackage.ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CtxPackage.ACTOR_PKG__OWNED_ACTORS:
				getOwnedActors().clear();
				getOwnedActors().addAll((Collection<? extends Actor>)newValue);
				return;
			case CtxPackage.ACTOR_PKG__OWNED_ACTOR_PKGS:
				getOwnedActorPkgs().clear();
				getOwnedActorPkgs().addAll((Collection<? extends ActorPkg>)newValue);
				return;
			case CtxPackage.ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION:
				getOwnedSystemCommunication().clear();
				getOwnedSystemCommunication().addAll((Collection<? extends SystemCommunication>)newValue);
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
			case CtxPackage.ACTOR_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case CtxPackage.ACTOR_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case CtxPackage.ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CtxPackage.ACTOR_PKG__OWNED_ACTORS:
				getOwnedActors().clear();
				return;
			case CtxPackage.ACTOR_PKG__OWNED_ACTOR_PKGS:
				getOwnedActorPkgs().clear();
				return;
			case CtxPackage.ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION:
				getOwnedSystemCommunication().clear();
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
			case CtxPackage.ACTOR_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case CtxPackage.ACTOR_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case CtxPackage.ACTOR_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case CtxPackage.ACTOR_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case CtxPackage.ACTOR_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CtxPackage.ACTOR_PKG__OWNED_ACTORS:
				return ownedActors != null && !ownedActors.isEmpty();
			case CtxPackage.ACTOR_PKG__OWNED_ACTOR_PKGS:
				return ownedActorPkgs != null && !ownedActorPkgs.isEmpty();
			case CtxPackage.ACTOR_PKG__OWNED_SYSTEM_COMMUNICATION:
				return ownedSystemCommunication != null && !ownedSystemCommunication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorPkgImpl
