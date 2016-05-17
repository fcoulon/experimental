/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.ActorCapabilityRealizationInvolvement;

import org.sample.melangeproject.capellawithmass.cs.impl.AbstractActorImpl;

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.ActorCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.ActorMissionInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.Capability;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.Mission;
import org.sample.melangeproject.capellawithmass.ctx.OperationalActorRealization;
import org.sample.melangeproject.capellawithmass.ctx.OperationalEntityRealization;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunicationHook;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;

import org.sample.melangeproject.capellawithmass.la.LogicalActor;

import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.OperationalActor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getParticipationsInMissions <em>Participations In Missions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getParticipationsInCapabilities <em>Participations In Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getParticipationsInCapabilityRealizations <em>Participations In Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getContributedMissions <em>Contributed Missions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getContributedCapabilities <em>Contributed Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getSystemCommunication <em>System Communication</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getOwnedOperationalActorRealizations <em>Owned Operational Actor Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getOwnedOperationalEntityRealizations <em>Owned Operational Entity Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getRealizedEntities <em>Realized Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getRealizedOperationalActors <em>Realized Operational Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorImpl#getRealizingLogicalActors <em>Realizing Logical Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends AbstractActorImpl implements Actor {
	/**
	 * The cached value of the '{@link #getSystemCommunication() <em>System Communication</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCommunication()
	 * @generated
	 * @ordered
	 */
	protected SystemCommunicationHook systemCommunication;

	/**
	 * The cached value of the '{@link #getOwnedOperationalActorRealizations() <em>Owned Operational Actor Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalActorRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActorRealization> ownedOperationalActorRealizations;

	/**
	 * The cached value of the '{@link #getOwnedOperationalEntityRealizations() <em>Owned Operational Entity Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalEntityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalEntityRealization> ownedOperationalEntityRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorMissionInvolvement> getParticipationsInMissions() {
		// TODO: implement this method to return the 'Participations In Missions' reference list
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
	public EList<ActorCapabilityInvolvement> getParticipationsInCapabilities() {
		// TODO: implement this method to return the 'Participations In Capabilities' reference list
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
	public EList<ActorCapabilityRealizationInvolvement> getParticipationsInCapabilityRealizations() {
		// TODO: implement this method to return the 'Participations In Capability Realizations' reference list
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
	public EList<Mission> getContributedMissions() {
		// TODO: implement this method to return the 'Contributed Missions' reference list
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
	public EList<Capability> getContributedCapabilities() {
		// TODO: implement this method to return the 'Contributed Capabilities' reference list
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
	public SystemCommunicationHook getSystemCommunication() {
		if (systemCommunication != null && systemCommunication.eIsProxy()) {
			InternalEObject oldSystemCommunication = (InternalEObject)systemCommunication;
			systemCommunication = (SystemCommunicationHook)eResolveProxy(oldSystemCommunication);
			if (systemCommunication != oldSystemCommunication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.ACTOR__SYSTEM_COMMUNICATION, oldSystemCommunication, systemCommunication));
			}
		}
		return systemCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCommunicationHook basicGetSystemCommunication() {
		return systemCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemCommunication(SystemCommunicationHook newSystemCommunication) {
		SystemCommunicationHook oldSystemCommunication = systemCommunication;
		systemCommunication = newSystemCommunication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.ACTOR__SYSTEM_COMMUNICATION, oldSystemCommunication, systemCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActorRealization> getOwnedOperationalActorRealizations() {
		if (ownedOperationalActorRealizations == null) {
			ownedOperationalActorRealizations = new EObjectContainmentEList<OperationalActorRealization>(OperationalActorRealization.class, this, CtxPackage.ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS);
		}
		return ownedOperationalActorRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalEntityRealization> getOwnedOperationalEntityRealizations() {
		if (ownedOperationalEntityRealizations == null) {
			ownedOperationalEntityRealizations = new EObjectContainmentEList<OperationalEntityRealization>(OperationalEntityRealization.class, this, CtxPackage.ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS);
		}
		return ownedOperationalEntityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunction> getAllocatedSystemFunctions() {
		// TODO: implement this method to return the 'Allocated System Functions' reference list
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
	public EList<Entity> getRealizedEntities() {
		// TODO: implement this method to return the 'Realized Entities' reference list
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
	public EList<OperationalActor> getRealizedOperationalActors() {
		// TODO: implement this method to return the 'Realized Operational Actors' reference list
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
	public EList<LogicalActor> getRealizingLogicalActors() {
		// TODO: implement this method to return the 'Realizing Logical Actors' reference list
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
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS:
				return ((InternalEList<?>)getOwnedOperationalActorRealizations()).basicRemove(otherEnd, msgs);
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS:
				return ((InternalEList<?>)getOwnedOperationalEntityRealizations()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.ACTOR__PARTICIPATIONS_IN_MISSIONS:
				return getParticipationsInMissions();
			case CtxPackage.ACTOR__PARTICIPATIONS_IN_CAPABILITIES:
				return getParticipationsInCapabilities();
			case CtxPackage.ACTOR__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
				return getParticipationsInCapabilityRealizations();
			case CtxPackage.ACTOR__CONTRIBUTED_MISSIONS:
				return getContributedMissions();
			case CtxPackage.ACTOR__CONTRIBUTED_CAPABILITIES:
				return getContributedCapabilities();
			case CtxPackage.ACTOR__SYSTEM_COMMUNICATION:
				if (resolve) return getSystemCommunication();
				return basicGetSystemCommunication();
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS:
				return getOwnedOperationalActorRealizations();
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS:
				return getOwnedOperationalEntityRealizations();
			case CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS:
				return getAllocatedSystemFunctions();
			case CtxPackage.ACTOR__REALIZED_ENTITIES:
				return getRealizedEntities();
			case CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS:
				return getRealizedOperationalActors();
			case CtxPackage.ACTOR__REALIZING_LOGICAL_ACTORS:
				return getRealizingLogicalActors();
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
			case CtxPackage.ACTOR__SYSTEM_COMMUNICATION:
				setSystemCommunication((SystemCommunicationHook)newValue);
				return;
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS:
				getOwnedOperationalActorRealizations().clear();
				getOwnedOperationalActorRealizations().addAll((Collection<? extends OperationalActorRealization>)newValue);
				return;
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS:
				getOwnedOperationalEntityRealizations().clear();
				getOwnedOperationalEntityRealizations().addAll((Collection<? extends OperationalEntityRealization>)newValue);
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
			case CtxPackage.ACTOR__SYSTEM_COMMUNICATION:
				setSystemCommunication((SystemCommunicationHook)null);
				return;
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS:
				getOwnedOperationalActorRealizations().clear();
				return;
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS:
				getOwnedOperationalEntityRealizations().clear();
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
			case CtxPackage.ACTOR__PARTICIPATIONS_IN_MISSIONS:
				return !getParticipationsInMissions().isEmpty();
			case CtxPackage.ACTOR__PARTICIPATIONS_IN_CAPABILITIES:
				return !getParticipationsInCapabilities().isEmpty();
			case CtxPackage.ACTOR__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
				return !getParticipationsInCapabilityRealizations().isEmpty();
			case CtxPackage.ACTOR__CONTRIBUTED_MISSIONS:
				return !getContributedMissions().isEmpty();
			case CtxPackage.ACTOR__CONTRIBUTED_CAPABILITIES:
				return !getContributedCapabilities().isEmpty();
			case CtxPackage.ACTOR__SYSTEM_COMMUNICATION:
				return systemCommunication != null;
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ACTOR_REALIZATIONS:
				return ownedOperationalActorRealizations != null && !ownedOperationalActorRealizations.isEmpty();
			case CtxPackage.ACTOR__OWNED_OPERATIONAL_ENTITY_REALIZATIONS:
				return ownedOperationalEntityRealizations != null && !ownedOperationalEntityRealizations.isEmpty();
			case CtxPackage.ACTOR__ALLOCATED_SYSTEM_FUNCTIONS:
				return !getAllocatedSystemFunctions().isEmpty();
			case CtxPackage.ACTOR__REALIZED_ENTITIES:
				return !getRealizedEntities().isEmpty();
			case CtxPackage.ACTOR__REALIZED_OPERATIONAL_ACTORS:
				return !getRealizedOperationalActors().isEmpty();
			case CtxPackage.ACTOR__REALIZING_LOGICAL_ACTORS:
				return !getRealizingLogicalActors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
