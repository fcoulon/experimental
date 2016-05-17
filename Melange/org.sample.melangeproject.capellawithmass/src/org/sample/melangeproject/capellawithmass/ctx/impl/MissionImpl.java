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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.ActorMissionInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.Capability;
import org.sample.melangeproject.capellawithmass.ctx.CapabilityExploitation;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.Mission;
import org.sample.melangeproject.capellawithmass.ctx.SystemMissionInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getInvolvedInvolvements <em>Involved Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getOwnedActorMissionInvolvements <em>Owned Actor Mission Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getOwnedSystemMissionInvolvement <em>Owned System Mission Involvement</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getOwnedCapabilityExploitations <em>Owned Capability Exploitations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getInvolvedActors <em>Involved Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getInvolvedSystem <em>Involved System</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.MissionImpl#getExploitedCapabilities <em>Exploited Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MissionImpl extends NamedElementImpl implements Mission {
	/**
	 * The cached value of the '{@link #getOwnedActorMissionInvolvements() <em>Owned Actor Mission Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorMissionInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorMissionInvolvement> ownedActorMissionInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedSystemMissionInvolvement() <em>Owned System Mission Involvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemMissionInvolvement()
	 * @generated
	 * @ordered
	 */
	protected SystemMissionInvolvement ownedSystemMissionInvolvement;

	/**
	 * The cached value of the '{@link #getOwnedCapabilityExploitations() <em>Owned Capability Exploitations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCapabilityExploitations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityExploitation> ownedCapabilityExploitations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.MISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Involvement> getInvolvedInvolvements() {
		// TODO: implement this method to return the 'Involved Involvements' reference list
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
	public EList<ActorMissionInvolvement> getOwnedActorMissionInvolvements() {
		if (ownedActorMissionInvolvements == null) {
			ownedActorMissionInvolvements = new EObjectContainmentEList<ActorMissionInvolvement>(ActorMissionInvolvement.class, this, CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS);
		}
		return ownedActorMissionInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMissionInvolvement getOwnedSystemMissionInvolvement() {
		return ownedSystemMissionInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystemMissionInvolvement(SystemMissionInvolvement newOwnedSystemMissionInvolvement, NotificationChain msgs) {
		SystemMissionInvolvement oldOwnedSystemMissionInvolvement = ownedSystemMissionInvolvement;
		ownedSystemMissionInvolvement = newOwnedSystemMissionInvolvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT, oldOwnedSystemMissionInvolvement, newOwnedSystemMissionInvolvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystemMissionInvolvement(SystemMissionInvolvement newOwnedSystemMissionInvolvement) {
		if (newOwnedSystemMissionInvolvement != ownedSystemMissionInvolvement) {
			NotificationChain msgs = null;
			if (ownedSystemMissionInvolvement != null)
				msgs = ((InternalEObject)ownedSystemMissionInvolvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT, null, msgs);
			if (newOwnedSystemMissionInvolvement != null)
				msgs = ((InternalEObject)newOwnedSystemMissionInvolvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT, null, msgs);
			msgs = basicSetOwnedSystemMissionInvolvement(newOwnedSystemMissionInvolvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT, newOwnedSystemMissionInvolvement, newOwnedSystemMissionInvolvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityExploitation> getOwnedCapabilityExploitations() {
		if (ownedCapabilityExploitations == null) {
			ownedCapabilityExploitations = new EObjectContainmentWithInverseEList<CapabilityExploitation>(CapabilityExploitation.class, this, CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS, CtxPackage.CAPABILITY_EXPLOITATION__MISSION);
		}
		return ownedCapabilityExploitations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getParticipatingActors() {
		// TODO: implement this method to return the 'Participating Actors' reference list
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
	public org.sample.melangeproject.capellawithmass.ctx.System getParticipatingSystem() {
		org.sample.melangeproject.capellawithmass.ctx.System participatingSystem = basicGetParticipatingSystem();
		return participatingSystem != null && participatingSystem.eIsProxy() ? (org.sample.melangeproject.capellawithmass.ctx.System)eResolveProxy((InternalEObject)participatingSystem) : participatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.sample.melangeproject.capellawithmass.ctx.System basicGetParticipatingSystem() {
		// TODO: implement this method to return the 'Participating System' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorMissionInvolvement> getInvolvedActors() {
		// TODO: implement this method to return the 'Involved Actors' reference list
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
	public SystemMissionInvolvement getInvolvedSystem() {
		SystemMissionInvolvement involvedSystem = basicGetInvolvedSystem();
		return involvedSystem != null && involvedSystem.eIsProxy() ? (SystemMissionInvolvement)eResolveProxy((InternalEObject)involvedSystem) : involvedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMissionInvolvement basicGetInvolvedSystem() {
		// TODO: implement this method to return the 'Involved System' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getExploitedCapabilities() {
		// TODO: implement this method to return the 'Exploited Capabilities' reference list
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedCapabilityExploitations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedActorMissionInvolvements()).basicRemove(otherEnd, msgs);
			case CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
				return basicSetOwnedSystemMissionInvolvement(null, msgs);
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return ((InternalEList<?>)getOwnedCapabilityExploitations()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
				return getInvolvedInvolvements();
			case CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
				return getOwnedActorMissionInvolvements();
			case CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
				return getOwnedSystemMissionInvolvement();
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return getOwnedCapabilityExploitations();
			case CtxPackage.MISSION__PARTICIPATING_ACTORS:
				return getParticipatingActors();
			case CtxPackage.MISSION__PARTICIPATING_SYSTEM:
				if (resolve) return getParticipatingSystem();
				return basicGetParticipatingSystem();
			case CtxPackage.MISSION__INVOLVED_ACTORS:
				return getInvolvedActors();
			case CtxPackage.MISSION__INVOLVED_SYSTEM:
				if (resolve) return getInvolvedSystem();
				return basicGetInvolvedSystem();
			case CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
				return getExploitedCapabilities();
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
			case CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
				getOwnedActorMissionInvolvements().clear();
				getOwnedActorMissionInvolvements().addAll((Collection<? extends ActorMissionInvolvement>)newValue);
				return;
			case CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
				setOwnedSystemMissionInvolvement((SystemMissionInvolvement)newValue);
				return;
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				getOwnedCapabilityExploitations().clear();
				getOwnedCapabilityExploitations().addAll((Collection<? extends CapabilityExploitation>)newValue);
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
			case CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
				getOwnedActorMissionInvolvements().clear();
				return;
			case CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
				setOwnedSystemMissionInvolvement((SystemMissionInvolvement)null);
				return;
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				getOwnedCapabilityExploitations().clear();
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
			case CtxPackage.MISSION__INVOLVED_INVOLVEMENTS:
				return !getInvolvedInvolvements().isEmpty();
			case CtxPackage.MISSION__OWNED_ACTOR_MISSION_INVOLVEMENTS:
				return ownedActorMissionInvolvements != null && !ownedActorMissionInvolvements.isEmpty();
			case CtxPackage.MISSION__OWNED_SYSTEM_MISSION_INVOLVEMENT:
				return ownedSystemMissionInvolvement != null;
			case CtxPackage.MISSION__OWNED_CAPABILITY_EXPLOITATIONS:
				return ownedCapabilityExploitations != null && !ownedCapabilityExploitations.isEmpty();
			case CtxPackage.MISSION__PARTICIPATING_ACTORS:
				return !getParticipatingActors().isEmpty();
			case CtxPackage.MISSION__PARTICIPATING_SYSTEM:
				return basicGetParticipatingSystem() != null;
			case CtxPackage.MISSION__INVOLVED_ACTORS:
				return !getInvolvedActors().isEmpty();
			case CtxPackage.MISSION__INVOLVED_SYSTEM:
				return basicGetInvolvedSystem() != null;
			case CtxPackage.MISSION__EXPLOITED_CAPABILITIES:
				return !getExploitedCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InvolverElement.class) {
			switch (derivedFeatureID) {
				case CtxPackage.MISSION__INVOLVED_INVOLVEMENTS: return CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InvolverElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS: return CtxPackage.MISSION__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MissionImpl
