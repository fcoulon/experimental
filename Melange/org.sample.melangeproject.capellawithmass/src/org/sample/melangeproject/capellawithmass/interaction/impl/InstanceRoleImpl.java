/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;

import org.sample.melangeproject.capellawithmass.interaction.AbstractEnd;
import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InstanceRoleImpl#getAbstractEnds <em>Abstract Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InstanceRoleImpl#getRepresentedInstance <em>Represented Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceRoleImpl extends NamedElementImpl implements InstanceRole {
	/**
	 * The cached value of the '{@link #getRepresentedInstance() <em>Represented Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedInstance()
	 * @generated
	 * @ordered
	 */
	protected AbstractInstance representedInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INSTANCE_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEnd> getAbstractEnds() {
		// TODO: implement this method to return the 'Abstract Ends' reference list
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
	public AbstractInstance getRepresentedInstance() {
		if (representedInstance != null && representedInstance.eIsProxy()) {
			InternalEObject oldRepresentedInstance = (InternalEObject)representedInstance;
			representedInstance = (AbstractInstance)eResolveProxy(oldRepresentedInstance);
			if (representedInstance != oldRepresentedInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INSTANCE_ROLE__REPRESENTED_INSTANCE, oldRepresentedInstance, representedInstance));
			}
		}
		return representedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInstance basicGetRepresentedInstance() {
		return representedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedInstance(AbstractInstance newRepresentedInstance) {
		AbstractInstance oldRepresentedInstance = representedInstance;
		representedInstance = newRepresentedInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INSTANCE_ROLE__REPRESENTED_INSTANCE, oldRepresentedInstance, representedInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.INSTANCE_ROLE__ABSTRACT_ENDS:
				return getAbstractEnds();
			case InteractionPackage.INSTANCE_ROLE__REPRESENTED_INSTANCE:
				if (resolve) return getRepresentedInstance();
				return basicGetRepresentedInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.INSTANCE_ROLE__REPRESENTED_INSTANCE:
				setRepresentedInstance((AbstractInstance)newValue);
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
			case InteractionPackage.INSTANCE_ROLE__REPRESENTED_INSTANCE:
				setRepresentedInstance((AbstractInstance)null);
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
			case InteractionPackage.INSTANCE_ROLE__ABSTRACT_ENDS:
				return !getAbstractEnds().isEmpty();
			case InteractionPackage.INSTANCE_ROLE__REPRESENTED_INSTANCE:
				return representedInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceRoleImpl
