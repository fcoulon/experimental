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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.ActorCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.Capability;
import org.sample.melangeproject.capellawithmass.ctx.CapabilityExploitation;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.Mission;
import org.sample.melangeproject.capellawithmass.ctx.SystemCapabilityInvolvement;

import org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityImpl;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealization;

import org.sample.melangeproject.capellawithmass.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getOwnedActorCapabilityInvolvements <em>Owned Actor Capability Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getOwnedSystemCapabilityInvolvement <em>Owned System Capability Involvement</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getInvolvedActors <em>Involved Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getInvolvedSystem <em>Involved System</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getParticipatingSystem <em>Participating System</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getPurposes <em>Purposes</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getPurposeMissions <em>Purpose Missions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getRealizedOperationalCapabilities <em>Realized Operational Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.CapabilityImpl#getRealizingCapabilityRealizations <em>Realizing Capability Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityImpl extends AbstractCapabilityImpl implements Capability {
	/**
	 * The cached value of the '{@link #getOwnedActorCapabilityInvolvements() <em>Owned Actor Capability Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorCapabilityInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorCapabilityInvolvement> ownedActorCapabilityInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedSystemCapabilityInvolvement() <em>Owned System Capability Involvement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemCapabilityInvolvement()
	 * @generated
	 * @ordered
	 */
	protected SystemCapabilityInvolvement ownedSystemCapabilityInvolvement;

	/**
	 * The cached value of the '{@link #getPurposes() <em>Purposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityExploitation> purposes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorCapabilityInvolvement> getOwnedActorCapabilityInvolvements() {
		if (ownedActorCapabilityInvolvements == null) {
			ownedActorCapabilityInvolvements = new EObjectContainmentEList<ActorCapabilityInvolvement>(ActorCapabilityInvolvement.class, this, CtxPackage.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS);
		}
		return ownedActorCapabilityInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCapabilityInvolvement getOwnedSystemCapabilityInvolvement() {
		return ownedSystemCapabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystemCapabilityInvolvement(SystemCapabilityInvolvement newOwnedSystemCapabilityInvolvement, NotificationChain msgs) {
		SystemCapabilityInvolvement oldOwnedSystemCapabilityInvolvement = ownedSystemCapabilityInvolvement;
		ownedSystemCapabilityInvolvement = newOwnedSystemCapabilityInvolvement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT, oldOwnedSystemCapabilityInvolvement, newOwnedSystemCapabilityInvolvement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystemCapabilityInvolvement(SystemCapabilityInvolvement newOwnedSystemCapabilityInvolvement) {
		if (newOwnedSystemCapabilityInvolvement != ownedSystemCapabilityInvolvement) {
			NotificationChain msgs = null;
			if (ownedSystemCapabilityInvolvement != null)
				msgs = ((InternalEObject)ownedSystemCapabilityInvolvement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT, null, msgs);
			if (newOwnedSystemCapabilityInvolvement != null)
				msgs = ((InternalEObject)newOwnedSystemCapabilityInvolvement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT, null, msgs);
			msgs = basicSetOwnedSystemCapabilityInvolvement(newOwnedSystemCapabilityInvolvement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT, newOwnedSystemCapabilityInvolvement, newOwnedSystemCapabilityInvolvement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorCapabilityInvolvement> getInvolvedActors() {
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
	public SystemCapabilityInvolvement getInvolvedSystem() {
		SystemCapabilityInvolvement involvedSystem = basicGetInvolvedSystem();
		return involvedSystem != null && involvedSystem.eIsProxy() ? (SystemCapabilityInvolvement)eResolveProxy((InternalEObject)involvedSystem) : involvedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCapabilityInvolvement basicGetInvolvedSystem() {
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
	public EList<CapabilityExploitation> getPurposes() {
		if (purposes == null) {
			purposes = new EObjectWithInverseResolvingEList<CapabilityExploitation>(CapabilityExploitation.class, this, CtxPackage.CAPABILITY__PURPOSES, CtxPackage.CAPABILITY_EXPLOITATION__CAPABILITY);
		}
		return purposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mission> getPurposeMissions() {
		// TODO: implement this method to return the 'Purpose Missions' reference list
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
	public EList<OperationalCapability> getRealizedOperationalCapabilities() {
		// TODO: implement this method to return the 'Realized Operational Capabilities' reference list
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
	public EList<CapabilityRealization> getRealizingCapabilityRealizations() {
		// TODO: implement this method to return the 'Realizing Capability Realizations' reference list
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
			case CtxPackage.CAPABILITY__PURPOSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPurposes()).basicAdd(otherEnd, msgs);
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
			case CtxPackage.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedActorCapabilityInvolvements()).basicRemove(otherEnd, msgs);
			case CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT:
				return basicSetOwnedSystemCapabilityInvolvement(null, msgs);
			case CtxPackage.CAPABILITY__PURPOSES:
				return ((InternalEList<?>)getPurposes()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS:
				return getOwnedActorCapabilityInvolvements();
			case CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT:
				return getOwnedSystemCapabilityInvolvement();
			case CtxPackage.CAPABILITY__INVOLVED_ACTORS:
				return getInvolvedActors();
			case CtxPackage.CAPABILITY__INVOLVED_SYSTEM:
				if (resolve) return getInvolvedSystem();
				return basicGetInvolvedSystem();
			case CtxPackage.CAPABILITY__PARTICIPATING_ACTORS:
				return getParticipatingActors();
			case CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM:
				if (resolve) return getParticipatingSystem();
				return basicGetParticipatingSystem();
			case CtxPackage.CAPABILITY__PURPOSES:
				return getPurposes();
			case CtxPackage.CAPABILITY__PURPOSE_MISSIONS:
				return getPurposeMissions();
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return getRealizedOperationalCapabilities();
			case CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS:
				return getRealizingCapabilityRealizations();
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
			case CtxPackage.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS:
				getOwnedActorCapabilityInvolvements().clear();
				getOwnedActorCapabilityInvolvements().addAll((Collection<? extends ActorCapabilityInvolvement>)newValue);
				return;
			case CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT:
				setOwnedSystemCapabilityInvolvement((SystemCapabilityInvolvement)newValue);
				return;
			case CtxPackage.CAPABILITY__PURPOSES:
				getPurposes().clear();
				getPurposes().addAll((Collection<? extends CapabilityExploitation>)newValue);
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
			case CtxPackage.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS:
				getOwnedActorCapabilityInvolvements().clear();
				return;
			case CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT:
				setOwnedSystemCapabilityInvolvement((SystemCapabilityInvolvement)null);
				return;
			case CtxPackage.CAPABILITY__PURPOSES:
				getPurposes().clear();
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
			case CtxPackage.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS:
				return ownedActorCapabilityInvolvements != null && !ownedActorCapabilityInvolvements.isEmpty();
			case CtxPackage.CAPABILITY__OWNED_SYSTEM_CAPABILITY_INVOLVEMENT:
				return ownedSystemCapabilityInvolvement != null;
			case CtxPackage.CAPABILITY__INVOLVED_ACTORS:
				return !getInvolvedActors().isEmpty();
			case CtxPackage.CAPABILITY__INVOLVED_SYSTEM:
				return basicGetInvolvedSystem() != null;
			case CtxPackage.CAPABILITY__PARTICIPATING_ACTORS:
				return !getParticipatingActors().isEmpty();
			case CtxPackage.CAPABILITY__PARTICIPATING_SYSTEM:
				return basicGetParticipatingSystem() != null;
			case CtxPackage.CAPABILITY__PURPOSES:
				return purposes != null && !purposes.isEmpty();
			case CtxPackage.CAPABILITY__PURPOSE_MISSIONS:
				return !getPurposeMissions().isEmpty();
			case CtxPackage.CAPABILITY__REALIZED_OPERATIONAL_CAPABILITIES:
				return !getRealizedOperationalCapabilities().isEmpty();
			case CtxPackage.CAPABILITY__REALIZING_CAPABILITY_REALIZATIONS:
				return !getRealizingCapabilityRealizations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityImpl
