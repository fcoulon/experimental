/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.ComponentAllocation;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Allocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentAllocationImpl#getAllocatedComponent <em>Allocated Component</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentAllocationImpl#getAllocatingComponent <em>Allocating Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentAllocationImpl extends AllocationImpl implements ComponentAllocation {
	/**
	 * The cached value of the '{@link #getAllocatedComponent() <em>Allocated Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponent()
	 * @generated
	 * @ordered
	 */
	protected Component allocatedComponent;

	/**
	 * The cached value of the '{@link #getAllocatingComponent() <em>Allocating Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingComponent()
	 * @generated
	 * @ordered
	 */
	protected Component allocatingComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAllocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT_ALLOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAllocatedComponent() {
		if (allocatedComponent != null && allocatedComponent.eIsProxy()) {
			InternalEObject oldAllocatedComponent = (InternalEObject)allocatedComponent;
			allocatedComponent = (Component)eResolveProxy(oldAllocatedComponent);
			if (allocatedComponent != oldAllocatedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT, oldAllocatedComponent, allocatedComponent));
			}
		}
		return allocatedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAllocatedComponent() {
		return allocatedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatedComponent(Component newAllocatedComponent, NotificationChain msgs) {
		Component oldAllocatedComponent = allocatedComponent;
		allocatedComponent = newAllocatedComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT, oldAllocatedComponent, newAllocatedComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getAllocatingComponent() {
		if (allocatingComponent != null && allocatingComponent.eIsProxy()) {
			InternalEObject oldAllocatingComponent = (InternalEObject)allocatingComponent;
			allocatingComponent = (Component)eResolveProxy(oldAllocatingComponent);
			if (allocatingComponent != oldAllocatingComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT, oldAllocatingComponent, allocatingComponent));
			}
		}
		return allocatingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetAllocatingComponent() {
		return allocatingComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatingComponent(Component newAllocatingComponent, NotificationChain msgs) {
		Component oldAllocatingComponent = allocatingComponent;
		allocatingComponent = newAllocatingComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT, oldAllocatingComponent, newAllocatingComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT:
				if (allocatedComponent != null)
					msgs = ((InternalEObject)allocatedComponent).eInverseRemove(this, CsPackage.COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS, Component.class, msgs);
				return basicSetAllocatedComponent((Component)otherEnd, msgs);
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT:
				if (allocatingComponent != null)
					msgs = ((InternalEObject)allocatingComponent).eInverseRemove(this, CsPackage.COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS, Component.class, msgs);
				return basicSetAllocatingComponent((Component)otherEnd, msgs);
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
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT:
				return basicSetAllocatedComponent(null, msgs);
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT:
				return basicSetAllocatingComponent(null, msgs);
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
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT:
				if (resolve) return getAllocatedComponent();
				return basicGetAllocatedComponent();
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT:
				if (resolve) return getAllocatingComponent();
				return basicGetAllocatingComponent();
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
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT:
				return allocatedComponent != null;
			case CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT:
				return allocatingComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentAllocationImpl
