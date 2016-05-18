/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.InterfaceUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceUseImpl#getInterfaceUser <em>Interface User</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceUseImpl#getUsedInterface <em>Used Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceUseImpl extends RelationshipImpl implements InterfaceUse {
	/**
	 * The cached value of the '{@link #getInterfaceUser() <em>Interface User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceUser()
	 * @generated
	 * @ordered
	 */
	protected Component interfaceUser;

	/**
	 * The cached value of the '{@link #getUsedInterface() <em>Used Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface usedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getInterfaceUser() {
		if (interfaceUser != null && interfaceUser.eIsProxy()) {
			InternalEObject oldInterfaceUser = (InternalEObject)interfaceUser;
			interfaceUser = (Component)eResolveProxy(oldInterfaceUser);
			if (interfaceUser != oldInterfaceUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.INTERFACE_USE__INTERFACE_USER, oldInterfaceUser, interfaceUser));
			}
		}
		return interfaceUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInterfaceUser() {
		return interfaceUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterfaceUser(Component newInterfaceUser, NotificationChain msgs) {
		Component oldInterfaceUser = interfaceUser;
		interfaceUser = newInterfaceUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE_USE__INTERFACE_USER, oldInterfaceUser, newInterfaceUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getUsedInterface() {
		if (usedInterface != null && usedInterface.eIsProxy()) {
			InternalEObject oldUsedInterface = (InternalEObject)usedInterface;
			usedInterface = (Interface)eResolveProxy(oldUsedInterface);
			if (usedInterface != oldUsedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.INTERFACE_USE__USED_INTERFACE, oldUsedInterface, usedInterface));
			}
		}
		return usedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetUsedInterface() {
		return usedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsedInterface(Interface newUsedInterface) {
		Interface oldUsedInterface = usedInterface;
		usedInterface = newUsedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE_USE__USED_INTERFACE, oldUsedInterface, usedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.INTERFACE_USE__INTERFACE_USER:
				if (interfaceUser != null)
					msgs = ((InternalEObject)interfaceUser).eInverseRemove(this, CsPackage.COMPONENT__USED_INTERFACE_LINKS, Component.class, msgs);
				return basicSetInterfaceUser((Component)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.INTERFACE_USE__INTERFACE_USER:
				return basicSetInterfaceUser(null, msgs);
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
			case CsPackage.INTERFACE_USE__INTERFACE_USER:
				if (resolve) return getInterfaceUser();
				return basicGetInterfaceUser();
			case CsPackage.INTERFACE_USE__USED_INTERFACE:
				if (resolve) return getUsedInterface();
				return basicGetUsedInterface();
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
			case CsPackage.INTERFACE_USE__USED_INTERFACE:
				setUsedInterface((Interface)newValue);
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
			case CsPackage.INTERFACE_USE__USED_INTERFACE:
				setUsedInterface((Interface)null);
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
			case CsPackage.INTERFACE_USE__INTERFACE_USER:
				return interfaceUser != null;
			case CsPackage.INTERFACE_USE__USED_INTERFACE:
				return usedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceUseImpl
