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

import org.sample.melangeproject.capellawithmass.cs.ActorCapabilityRealizationInvolvement;

import org.sample.melangeproject.capellawithmass.cs.impl.AbstractActorImpl;

import org.sample.melangeproject.capellawithmass.ctx.Actor;

import org.sample.melangeproject.capellawithmass.la.LaPackage;
import org.sample.melangeproject.capellawithmass.la.LogicalActor;
import org.sample.melangeproject.capellawithmass.la.LogicalFunction;
import org.sample.melangeproject.capellawithmass.la.SystemActorRealization;

import org.sample.melangeproject.capellawithmass.pa.PhysicalActor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalActorImpl#getOwnedSystemActorRealizations <em>Owned System Actor Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalActorImpl#getSystemActorRealizations <em>System Actor Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalActorImpl#getParticipationsInCapabilityRealizations <em>Participations In Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalActorImpl#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalActorImpl#getRealizedSystemActors <em>Realized System Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalActorImpl#getRealizingPhysicalActors <em>Realizing Physical Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalActorImpl extends AbstractActorImpl implements LogicalActor {
	/**
	 * The cached value of the '{@link #getOwnedSystemActorRealizations() <em>Owned System Actor Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemActorRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemActorRealization> ownedSystemActorRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemActorRealization> getOwnedSystemActorRealizations() {
		if (ownedSystemActorRealizations == null) {
			ownedSystemActorRealizations = new EObjectContainmentEList<SystemActorRealization>(SystemActorRealization.class, this, LaPackage.LOGICAL_ACTOR__OWNED_SYSTEM_ACTOR_REALIZATIONS);
		}
		return ownedSystemActorRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemActorRealization> getSystemActorRealizations() {
		// TODO: implement this method to return the 'System Actor Realizations' reference list
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
	public EList<LogicalFunction> getAllocatedLogicalFunctions() {
		// TODO: implement this method to return the 'Allocated Logical Functions' reference list
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
	public EList<Actor> getRealizedSystemActors() {
		// TODO: implement this method to return the 'Realized System Actors' reference list
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
	public EList<PhysicalActor> getRealizingPhysicalActors() {
		// TODO: implement this method to return the 'Realizing Physical Actors' reference list
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
			case LaPackage.LOGICAL_ACTOR__OWNED_SYSTEM_ACTOR_REALIZATIONS:
				return ((InternalEList<?>)getOwnedSystemActorRealizations()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_ACTOR__OWNED_SYSTEM_ACTOR_REALIZATIONS:
				return getOwnedSystemActorRealizations();
			case LaPackage.LOGICAL_ACTOR__SYSTEM_ACTOR_REALIZATIONS:
				return getSystemActorRealizations();
			case LaPackage.LOGICAL_ACTOR__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
				return getParticipationsInCapabilityRealizations();
			case LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS:
				return getAllocatedLogicalFunctions();
			case LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS:
				return getRealizedSystemActors();
			case LaPackage.LOGICAL_ACTOR__REALIZING_PHYSICAL_ACTORS:
				return getRealizingPhysicalActors();
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
			case LaPackage.LOGICAL_ACTOR__OWNED_SYSTEM_ACTOR_REALIZATIONS:
				getOwnedSystemActorRealizations().clear();
				getOwnedSystemActorRealizations().addAll((Collection<? extends SystemActorRealization>)newValue);
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
			case LaPackage.LOGICAL_ACTOR__OWNED_SYSTEM_ACTOR_REALIZATIONS:
				getOwnedSystemActorRealizations().clear();
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
			case LaPackage.LOGICAL_ACTOR__OWNED_SYSTEM_ACTOR_REALIZATIONS:
				return ownedSystemActorRealizations != null && !ownedSystemActorRealizations.isEmpty();
			case LaPackage.LOGICAL_ACTOR__SYSTEM_ACTOR_REALIZATIONS:
				return !getSystemActorRealizations().isEmpty();
			case LaPackage.LOGICAL_ACTOR__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
				return !getParticipationsInCapabilityRealizations().isEmpty();
			case LaPackage.LOGICAL_ACTOR__ALLOCATED_LOGICAL_FUNCTIONS:
				return !getAllocatedLogicalFunctions().isEmpty();
			case LaPackage.LOGICAL_ACTOR__REALIZED_SYSTEM_ACTORS:
				return !getRealizedSystemActors().isEmpty();
			case LaPackage.LOGICAL_ACTOR__REALIZING_PHYSICAL_ACTORS:
				return !getRealizingPhysicalActors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalActorImpl
