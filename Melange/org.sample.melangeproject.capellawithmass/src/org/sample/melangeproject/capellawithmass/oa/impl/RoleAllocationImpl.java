/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.Role;
import org.sample.melangeproject.capellawithmass.oa.RoleAllocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleAllocationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.RoleAllocationImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleAllocationImpl extends AllocationImpl implements RoleAllocation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ROLE_ALLOCATION;
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
	public Entity getEntity() {
		Entity entity = basicGetEntity();
		return entity != null && entity.eIsProxy() ? (Entity)eResolveProxy((InternalEObject)entity) : entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		// TODO: implement this method to return the 'Entity' reference
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
			case OaPackage.ROLE_ALLOCATION__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case OaPackage.ROLE_ALLOCATION__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case OaPackage.ROLE_ALLOCATION__ROLE:
				return basicGetRole() != null;
			case OaPackage.ROLE_ALLOCATION__ENTITY:
				return basicGetEntity() != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleAllocationImpl
