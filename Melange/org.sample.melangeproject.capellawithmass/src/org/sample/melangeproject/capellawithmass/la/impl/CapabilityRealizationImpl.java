/**
 */
package org.sample.melangeproject.capellawithmass.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.AbstractActor;
import org.sample.melangeproject.capellawithmass.cs.ActorCapabilityRealizationInvolvement;
import org.sample.melangeproject.capellawithmass.cs.SystemComponent;
import org.sample.melangeproject.capellawithmass.cs.SystemComponentCapabilityRealizationInvolvement;

import org.sample.melangeproject.capellawithmass.ctx.Capability;

import org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityImpl;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealization;
import org.sample.melangeproject.capellawithmass.la.LaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getOwnedActorCapabilityRealizations <em>Owned Actor Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getOwnedSystemComponentCapabilityRealizations <em>Owned System Component Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getParticipatingActors <em>Participating Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getParticipatingSystemComponents <em>Participating System Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getInvolvedActors <em>Involved Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getInvolvedSystemComponents <em>Involved System Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getRealizedCapabilities <em>Realized Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getRealizedCapabilityRealizations <em>Realized Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.CapabilityRealizationImpl#getRealizingCapabilityRealizations <em>Realizing Capability Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityRealizationImpl extends AbstractCapabilityImpl implements CapabilityRealization {
	/**
	 * The cached value of the '{@link #getOwnedActorCapabilityRealizations() <em>Owned Actor Capability Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorCapabilityRealizationInvolvement> ownedActorCapabilityRealizations;

	/**
	 * The cached value of the '{@link #getOwnedSystemComponentCapabilityRealizations() <em>Owned System Component Capability Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemComponentCapabilityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponentCapabilityRealizationInvolvement> ownedSystemComponentCapabilityRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.CAPABILITY_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorCapabilityRealizationInvolvement> getOwnedActorCapabilityRealizations() {
		if (ownedActorCapabilityRealizations == null) {
			ownedActorCapabilityRealizations = new EObjectContainmentEList<ActorCapabilityRealizationInvolvement>(ActorCapabilityRealizationInvolvement.class, this, LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS);
		}
		return ownedActorCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemComponentCapabilityRealizationInvolvement> getOwnedSystemComponentCapabilityRealizations() {
		if (ownedSystemComponentCapabilityRealizations == null) {
			ownedSystemComponentCapabilityRealizations = new EObjectContainmentEList<SystemComponentCapabilityRealizationInvolvement>(SystemComponentCapabilityRealizationInvolvement.class, this, LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS);
		}
		return ownedSystemComponentCapabilityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractActor> getParticipatingActors() {
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
	public EList<SystemComponent> getParticipatingSystemComponents() {
		// TODO: implement this method to return the 'Participating System Components' reference list
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
	public EList<ActorCapabilityRealizationInvolvement> getInvolvedActors() {
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
	public EList<SystemComponentCapabilityRealizationInvolvement> getInvolvedSystemComponents() {
		// TODO: implement this method to return the 'Involved System Components' reference list
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
	public EList<Capability> getRealizedCapabilities() {
		// TODO: implement this method to return the 'Realized Capabilities' reference list
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
	public EList<CapabilityRealization> getRealizedCapabilityRealizations() {
		// TODO: implement this method to return the 'Realized Capability Realizations' reference list
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
				return ((InternalEList<?>)getOwnedActorCapabilityRealizations()).basicRemove(otherEnd, msgs);
			case LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
				return ((InternalEList<?>)getOwnedSystemComponentCapabilityRealizations()).basicRemove(otherEnd, msgs);
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
			case LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
				return getOwnedActorCapabilityRealizations();
			case LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
				return getOwnedSystemComponentCapabilityRealizations();
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
				return getParticipatingActors();
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
				return getParticipatingSystemComponents();
			case LaPackage.CAPABILITY_REALIZATION__INVOLVED_ACTORS:
				return getInvolvedActors();
			case LaPackage.CAPABILITY_REALIZATION__INVOLVED_SYSTEM_COMPONENTS:
				return getInvolvedSystemComponents();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return getRealizedCapabilities();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return getRealizedCapabilityRealizations();
			case LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
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
			case LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
				getOwnedActorCapabilityRealizations().clear();
				getOwnedActorCapabilityRealizations().addAll((Collection<? extends ActorCapabilityRealizationInvolvement>)newValue);
				return;
			case LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
				getOwnedSystemComponentCapabilityRealizations().clear();
				getOwnedSystemComponentCapabilityRealizations().addAll((Collection<? extends SystemComponentCapabilityRealizationInvolvement>)newValue);
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
			case LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
				getOwnedActorCapabilityRealizations().clear();
				return;
			case LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
				getOwnedSystemComponentCapabilityRealizations().clear();
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
			case LaPackage.CAPABILITY_REALIZATION__OWNED_ACTOR_CAPABILITY_REALIZATIONS:
				return ownedActorCapabilityRealizations != null && !ownedActorCapabilityRealizations.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__OWNED_SYSTEM_COMPONENT_CAPABILITY_REALIZATIONS:
				return ownedSystemComponentCapabilityRealizations != null && !ownedSystemComponentCapabilityRealizations.isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_ACTORS:
				return !getParticipatingActors().isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__PARTICIPATING_SYSTEM_COMPONENTS:
				return !getParticipatingSystemComponents().isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__INVOLVED_ACTORS:
				return !getInvolvedActors().isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__INVOLVED_SYSTEM_COMPONENTS:
				return !getInvolvedSystemComponents().isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITIES:
				return !getRealizedCapabilities().isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZED_CAPABILITY_REALIZATIONS:
				return !getRealizedCapabilityRealizations().isEmpty();
			case LaPackage.CAPABILITY_REALIZATION__REALIZING_CAPABILITY_REALIZATIONS:
				return !getRealizingCapabilityRealizations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CapabilityRealizationImpl
