/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;

import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AbstractInstanceImpl#getRepresentingInstanceRoles <em>Representing Instance Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractInstanceImpl extends PropertyImpl implements AbstractInstance {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.ABSTRACT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceRole> getRepresentingInstanceRoles() {
		// TODO: implement this method to return the 'Representing Instance Roles' reference list
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES:
				return getRepresentingInstanceRoles();
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
			case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES:
				return !getRepresentingInstanceRoles().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractInstanceImpl
