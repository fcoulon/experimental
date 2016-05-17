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

import org.sample.melangeproject.capellawithmass.information.impl.AbstractInstanceImpl;

import org.sample.melangeproject.capellawithmass.oa.ActivityAllocation;
import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalActivity;
import org.sample.melangeproject.capellawithmass.oa.Role;
import org.sample.melangeproject.capellawithmass.oa.RoleAllocation;
import org.sample.melangeproject.capellawithmass.oa.RoleAssemblyUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleImpl#getOwnedRoleAssemblyUsages <em>Owned Role Assembly Usages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleImpl#getOwnedActivityAllocations <em>Owned Activity Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleImpl#getRoleAllocations <em>Role Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleImpl#getActivityAllocations <em>Activity Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleImpl#getAllocatingEntities <em>Allocating Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleImpl#getAllocatedOperationalActivities <em>Allocated Operational Activities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends AbstractInstanceImpl implements Role {
	/**
	 * The cached value of the '{@link #getOwnedRoleAssemblyUsages() <em>Owned Role Assembly Usages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRoleAssemblyUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleAssemblyUsage> ownedRoleAssemblyUsages;

	/**
	 * The cached value of the '{@link #getOwnedActivityAllocations() <em>Owned Activity Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActivityAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityAllocation> ownedActivityAllocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleAssemblyUsage> getOwnedRoleAssemblyUsages() {
		if (ownedRoleAssemblyUsages == null) {
			ownedRoleAssemblyUsages = new EObjectContainmentEList<RoleAssemblyUsage>(RoleAssemblyUsage.class, this, OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES);
		}
		return ownedRoleAssemblyUsages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityAllocation> getOwnedActivityAllocations() {
		if (ownedActivityAllocations == null) {
			ownedActivityAllocations = new EObjectContainmentEList<ActivityAllocation>(ActivityAllocation.class, this, OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS);
		}
		return ownedActivityAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleAllocation> getRoleAllocations() {
		// TODO: implement this method to return the 'Role Allocations' reference list
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
	public EList<Entity> getAllocatingEntities() {
		// TODO: implement this method to return the 'Allocating Entities' reference list
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
	public EList<OperationalActivity> getAllocatedOperationalActivities() {
		// TODO: implement this method to return the 'Allocated Operational Activities' reference list
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				return ((InternalEList<?>)getOwnedRoleAssemblyUsages()).basicRemove(otherEnd, msgs);
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedActivityAllocations()).basicRemove(otherEnd, msgs);
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				return getOwnedRoleAssemblyUsages();
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				return getOwnedActivityAllocations();
			case OaPackage.ROLE__ROLE_ALLOCATIONS:
				return getRoleAllocations();
			case OaPackage.ROLE__ACTIVITY_ALLOCATIONS:
				return getActivityAllocations();
			case OaPackage.ROLE__ALLOCATING_ENTITIES:
				return getAllocatingEntities();
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return getAllocatedOperationalActivities();
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				getOwnedRoleAssemblyUsages().clear();
				getOwnedRoleAssemblyUsages().addAll((Collection<? extends RoleAssemblyUsage>)newValue);
				return;
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				getOwnedActivityAllocations().clear();
				getOwnedActivityAllocations().addAll((Collection<? extends ActivityAllocation>)newValue);
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				getOwnedRoleAssemblyUsages().clear();
				return;
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				getOwnedActivityAllocations().clear();
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
			case OaPackage.ROLE__OWNED_ROLE_ASSEMBLY_USAGES:
				return ownedRoleAssemblyUsages != null && !ownedRoleAssemblyUsages.isEmpty();
			case OaPackage.ROLE__OWNED_ACTIVITY_ALLOCATIONS:
				return ownedActivityAllocations != null && !ownedActivityAllocations.isEmpty();
			case OaPackage.ROLE__ROLE_ALLOCATIONS:
				return !getRoleAllocations().isEmpty();
			case OaPackage.ROLE__ACTIVITY_ALLOCATIONS:
				return !getActivityAllocations().isEmpty();
			case OaPackage.ROLE__ALLOCATING_ENTITIES:
				return !getAllocatingEntities().isEmpty();
			case OaPackage.ROLE__ALLOCATED_OPERATIONAL_ACTIVITIES:
				return !getAllocatedOperationalActivities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoleImpl
