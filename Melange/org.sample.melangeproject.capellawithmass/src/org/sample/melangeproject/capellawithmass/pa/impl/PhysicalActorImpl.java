/**
 */
package org.sample.melangeproject.capellawithmass.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.la.LogicalActor;

import org.sample.melangeproject.capellawithmass.pa.LogicalActorRealization;
import org.sample.melangeproject.capellawithmass.pa.PaPackage;
import org.sample.melangeproject.capellawithmass.pa.PhysicalActor;
import org.sample.melangeproject.capellawithmass.pa.PhysicalComponent;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalActorImpl#getOwnedLogicalActorRealizations <em>Owned Logical Actor Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalActorImpl#getLogicalActorRealizations <em>Logical Actor Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalActorImpl#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalActorImpl#getRealizedLogicalActors <em>Realized Logical Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalActorImpl#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalActorImpl extends AbstractPhysicalComponentImpl implements PhysicalActor {
	/**
	 * The cached value of the '{@link #getOwnedLogicalActorRealizations() <em>Owned Logical Actor Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalActorRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalActorRealization> ownedLogicalActorRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalActorRealization> getOwnedLogicalActorRealizations() {
		if (ownedLogicalActorRealizations == null) {
			ownedLogicalActorRealizations = new EObjectContainmentEList<LogicalActorRealization>(LogicalActorRealization.class, this, PaPackage.PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS);
		}
		return ownedLogicalActorRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalActorRealization> getLogicalActorRealizations() {
		// TODO: implement this method to return the 'Logical Actor Realizations' reference list
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
	public EList<PhysicalFunction> getAllocatedPhysicalFunctions() {
		// TODO: implement this method to return the 'Allocated Physical Functions' reference list
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
	public EList<LogicalActor> getRealizedLogicalActors() {
		// TODO: implement this method to return the 'Realized Logical Actors' reference list
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
	public EList<PhysicalComponent> getDeployedPhysicalComponents() {
		// TODO: implement this method to return the 'Deployed Physical Components' reference list
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
			case PaPackage.PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS:
				return ((InternalEList<?>)getOwnedLogicalActorRealizations()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS:
				return getOwnedLogicalActorRealizations();
			case PaPackage.PHYSICAL_ACTOR__LOGICAL_ACTOR_REALIZATIONS:
				return getLogicalActorRealizations();
			case PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS:
				return getAllocatedPhysicalFunctions();
			case PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS:
				return getRealizedLogicalActors();
			case PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS:
				return getDeployedPhysicalComponents();
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
			case PaPackage.PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS:
				getOwnedLogicalActorRealizations().clear();
				getOwnedLogicalActorRealizations().addAll((Collection<? extends LogicalActorRealization>)newValue);
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
			case PaPackage.PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS:
				getOwnedLogicalActorRealizations().clear();
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
			case PaPackage.PHYSICAL_ACTOR__OWNED_LOGICAL_ACTOR_REALIZATIONS:
				return ownedLogicalActorRealizations != null && !ownedLogicalActorRealizations.isEmpty();
			case PaPackage.PHYSICAL_ACTOR__LOGICAL_ACTOR_REALIZATIONS:
				return !getLogicalActorRealizations().isEmpty();
			case PaPackage.PHYSICAL_ACTOR__ALLOCATED_PHYSICAL_FUNCTIONS:
				return !getAllocatedPhysicalFunctions().isEmpty();
			case PaPackage.PHYSICAL_ACTOR__REALIZED_LOGICAL_ACTORS:
				return !getRealizedLogicalActors().isEmpty();
			case PaPackage.PHYSICAL_ACTOR__DEPLOYED_PHYSICAL_COMPONENTS:
				return !getDeployedPhysicalComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalActorImpl
