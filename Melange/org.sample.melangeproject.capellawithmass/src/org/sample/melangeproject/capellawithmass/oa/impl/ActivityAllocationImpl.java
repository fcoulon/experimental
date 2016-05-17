/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.oa.ActivityAllocation;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalActivity;
import org.sample.melangeproject.capellawithmass.oa.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ActivityAllocationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ActivityAllocationImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityAllocationImpl extends AllocationImpl implements ActivityAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ACTIVITY_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		Role role = basicGetRole();
		return role != null && role.eIsProxy() ? (Role)eResolveProxy((InternalEObject)role) : role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		// TODO: implement this method to return the 'Role' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity getActivity() {
		OperationalActivity activity = basicGetActivity();
		return activity != null && activity.eIsProxy() ? (OperationalActivity)eResolveProxy((InternalEObject)activity) : activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity basicGetActivity() {
		// TODO: implement this method to return the 'Activity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OaPackage.ACTIVITY_ALLOCATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case OaPackage.ACTIVITY_ALLOCATION__ACTIVITY:
				if (resolve) return getActivity();
				return basicGetActivity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OaPackage.ACTIVITY_ALLOCATION__ROLE:
				return basicGetRole() != null;
			case OaPackage.ACTIVITY_ALLOCATION__ACTIVITY:
				return basicGetActivity() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityAllocationImpl
