/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;
import org.sample.melangeproject.capellawithmass.interaction.InteractionFragment;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InteractionFragmentImpl#getCoveredInstanceRoles <em>Covered Instance Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InteractionFragmentImpl extends NamedElementImpl implements InteractionFragment {
	/**
	 * The cached value of the '{@link #getCoveredInstanceRoles() <em>Covered Instance Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoveredInstanceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceRole> coveredInstanceRoles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceRole> getCoveredInstanceRoles() {
		if (coveredInstanceRoles == null) {
			coveredInstanceRoles = new EObjectResolvingEList<InstanceRole>(InstanceRole.class, this, InteractionPackage.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES);
		}
		return coveredInstanceRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES:
				return getCoveredInstanceRoles();
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
			case InteractionPackage.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES:
				getCoveredInstanceRoles().clear();
				getCoveredInstanceRoles().addAll((Collection<? extends InstanceRole>)newValue);
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
			case InteractionPackage.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES:
				getCoveredInstanceRoles().clear();
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
			case InteractionPackage.INTERACTION_FRAGMENT__COVERED_INSTANCE_ROLES:
				return coveredInstanceRoles != null && !coveredInstanceRoles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionFragmentImpl
