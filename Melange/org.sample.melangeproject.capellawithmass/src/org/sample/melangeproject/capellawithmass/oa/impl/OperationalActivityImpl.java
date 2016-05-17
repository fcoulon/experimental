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

import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;

import org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl;

import org.sample.melangeproject.capellawithmass.oa.ActivityAllocation;
import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalActivity;
import org.sample.melangeproject.capellawithmass.oa.OperationalActivityPkg;
import org.sample.melangeproject.capellawithmass.oa.OperationalProcess;
import org.sample.melangeproject.capellawithmass.oa.Role;
import org.sample.melangeproject.capellawithmass.oa.Swimlane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getOwnedOperationalActivityPkgs <em>Owned Operational Activity Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getActivityAllocations <em>Activity Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getOwnedSwimlanes <em>Owned Swimlanes</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getOwnedProcess <em>Owned Process</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getAllocatorEntities <em>Allocator Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getRealizingSystemFunctions <em>Realizing System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getAllocatingRoles <em>Allocating Roles</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getContainedOperationalActivities <em>Contained Operational Activities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalActivityImpl#getChildrenOperationalActivities <em>Children Operational Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalActivityImpl extends AbstractFunctionImpl implements OperationalActivity {
	/**
	 * The cached value of the '{@link #getOwnedOperationalActivityPkgs() <em>Owned Operational Activity Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalActivityPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalActivityPkg> ownedOperationalActivityPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalActivityPkg> getOwnedOperationalActivityPkgs() {
		if (ownedOperationalActivityPkgs == null) {
			ownedOperationalActivityPkgs = new EObjectContainmentEList<OperationalActivityPkg>(OperationalActivityPkg.class, this, OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS);
		}
		return ownedOperationalActivityPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityAllocation> getActivityAllocations() {
		// TODO: implement this method to return the 'Activity Allocations' reference list
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
	public EList<Swimlane> getOwnedSwimlanes() {
		// TODO: implement this method to return the 'Owned Swimlanes' reference list
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
	public EList<OperationalProcess> getOwnedProcess() {
		// TODO: implement this method to return the 'Owned Process' reference list
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
	public EList<Entity> getAllocatorEntities() {
		// TODO: implement this method to return the 'Allocator Entities' reference list
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
	public EList<SystemFunction> getRealizingSystemFunctions() {
		// TODO: implement this method to return the 'Realizing System Functions' reference list
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
	public EList<Role> getAllocatingRoles() {
		// TODO: implement this method to return the 'Allocating Roles' reference list
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
	public EList<OperationalActivity> getContainedOperationalActivities() {
		// TODO: implement this method to return the 'Contained Operational Activities' reference list
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
	public EList<OperationalActivity> getChildrenOperationalActivities() {
		// TODO: implement this method to return the 'Children Operational Activities' reference list
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return ((InternalEList<?>)getOwnedOperationalActivityPkgs()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return getOwnedOperationalActivityPkgs();
			case OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
				return getActivityAllocations();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES:
				return getOwnedSwimlanes();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS:
				return getOwnedProcess();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
				return getAllocatorEntities();
			case OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
				return getRealizingSystemFunctions();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES:
				return getAllocatingRoles();
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return getContainedOperationalActivities();
			case OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES:
				return getChildrenOperationalActivities();
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				getOwnedOperationalActivityPkgs().clear();
				getOwnedOperationalActivityPkgs().addAll((Collection<? extends OperationalActivityPkg>)newValue);
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				getOwnedOperationalActivityPkgs().clear();
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
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_OPERATIONAL_ACTIVITY_PKGS:
				return ownedOperationalActivityPkgs != null && !ownedOperationalActivityPkgs.isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__ACTIVITY_ALLOCATIONS:
				return !getActivityAllocations().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_SWIMLANES:
				return !getOwnedSwimlanes().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__OWNED_PROCESS:
				return !getOwnedProcess().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATOR_ENTITIES:
				return !getAllocatorEntities().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__REALIZING_SYSTEM_FUNCTIONS:
				return !getRealizingSystemFunctions().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__ALLOCATING_ROLES:
				return !getAllocatingRoles().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__CONTAINED_OPERATIONAL_ACTIVITIES:
				return !getContainedOperationalActivities().isEmpty();
			case OaPackage.OPERATIONAL_ACTIVITY__CHILDREN_OPERATIONAL_ACTIVITIES:
				return !getChildrenOperationalActivities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalActivityImpl
