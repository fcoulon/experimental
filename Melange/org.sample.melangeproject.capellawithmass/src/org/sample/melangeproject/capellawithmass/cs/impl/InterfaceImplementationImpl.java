/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.InterfaceImplementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImplementationImpl#getInterfaceImplementor <em>Interface Implementor</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImplementationImpl#getImplementedInterface <em>Implemented Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImplementationImpl extends RelationshipImpl implements InterfaceImplementation {
	/**
	 * The cached value of the '{@link #getImplementedInterface() <em>Implemented Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface implementedInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getInterfaceImplementor() {
		Component interfaceImplementor = basicGetInterfaceImplementor();
		return interfaceImplementor != null && interfaceImplementor.eIsProxy() ? (Component)eResolveProxy((InternalEObject)interfaceImplementor) : interfaceImplementor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInterfaceImplementor() {
		// TODO: implement this method to return the 'Interface Implementor' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getImplementedInterface() {
		if (implementedInterface != null && implementedInterface.eIsProxy()) {
			InternalEObject oldImplementedInterface = (InternalEObject)implementedInterface;
			implementedInterface = (Interface)eResolveProxy(oldImplementedInterface);
			if (implementedInterface != oldImplementedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE, oldImplementedInterface, implementedInterface));
			}
		}
		return implementedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetImplementedInterface() {
		return implementedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementedInterface(Interface newImplementedInterface) {
		Interface oldImplementedInterface = implementedInterface;
		implementedInterface = newImplementedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE, oldImplementedInterface, implementedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.INTERFACE_IMPLEMENTATION__INTERFACE_IMPLEMENTOR:
				if (resolve) return getInterfaceImplementor();
				return basicGetInterfaceImplementor();
			case CsPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				if (resolve) return getImplementedInterface();
				return basicGetImplementedInterface();
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
			case CsPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				setImplementedInterface((Interface)newValue);
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
			case CsPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				setImplementedInterface((Interface)null);
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
			case CsPackage.INTERFACE_IMPLEMENTATION__INTERFACE_IMPLEMENTOR:
				return basicGetInterfaceImplementor() != null;
			case CsPackage.INTERFACE_IMPLEMENTATION__IMPLEMENTED_INTERFACE:
				return implementedInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImplementationImpl
