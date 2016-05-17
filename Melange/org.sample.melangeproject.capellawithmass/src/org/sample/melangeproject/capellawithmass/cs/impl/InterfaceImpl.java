/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralClassImpl;

import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.ExchangeItemAllocation;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator;
import org.sample.melangeproject.capellawithmass.cs.InterfaceImplementation;
import org.sample.melangeproject.capellawithmass.cs.InterfaceUse;

import org.sample.melangeproject.capellawithmass.fa.ComponentPort;

import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getOwnedInterfaceAllocations <em>Owned Interface Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getProvisionedInterfaceAllocations <em>Provisioned Interface Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getAllocatedInterfaces <em>Allocated Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#isStructural <em>Structural</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getImplementorComponents <em>Implementor Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getUserComponents <em>User Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getInterfaceImplementations <em>Interface Implementations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getInterfaceUses <em>Interface Uses</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getProvisioningInterfaceAllocations <em>Provisioning Interface Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getAllocatingInterfaces <em>Allocating Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getAllocatingComponents <em>Allocating Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getExchangeItems <em>Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getOwnedExchangeItemAllocations <em>Owned Exchange Item Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getRequiringComponents <em>Requiring Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getRequiringComponentPorts <em>Requiring Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getProvidingComponents <em>Providing Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getProvidingComponentPorts <em>Providing Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getRealizingLogicalInterfaces <em>Realizing Logical Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getRealizedContextInterfaces <em>Realized Context Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getRealizingPhysicalInterfaces <em>Realizing Physical Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.InterfaceImpl#getRealizedLogicalInterfaces <em>Realized Logical Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends GeneralClassImpl implements Interface {
	/**
	 * The cached value of the '{@link #getOwnedInterfaceAllocations() <em>Owned Interface Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAllocation> ownedInterfaceAllocations;

	/**
	 * The default value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanism() <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanism()
	 * @generated
	 * @ordered
	 */
	protected String mechanism = MECHANISM_EDEFAULT;

	/**
	 * The default value of the '{@link #isStructural() <em>Structural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStructural()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRUCTURAL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStructural() <em>Structural</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStructural()
	 * @generated
	 * @ordered
	 */
	protected boolean structural = STRUCTURAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItemAllocations() <em>Owned Exchange Item Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItemAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItemAllocation> ownedExchangeItemAllocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceAllocation> getOwnedInterfaceAllocations() {
		if (ownedInterfaceAllocations == null) {
			ownedInterfaceAllocations = new EObjectContainmentEList<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS);
		}
		return ownedInterfaceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceAllocation> getProvisionedInterfaceAllocations() {
		// TODO: implement this method to return the 'Provisioned Interface Allocations' reference list
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
	public EList<Interface> getAllocatedInterfaces() {
		// TODO: implement this method to return the 'Allocated Interfaces' reference list
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
	public String getMechanism() {
		return mechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMechanism(String newMechanism) {
		String oldMechanism = mechanism;
		mechanism = newMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE__MECHANISM, oldMechanism, mechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStructural() {
		return structural;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructural(boolean newStructural) {
		boolean oldStructural = structural;
		structural = newStructural;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.INTERFACE__STRUCTURAL, oldStructural, structural));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getImplementorComponents() {
		// TODO: implement this method to return the 'Implementor Components' reference list
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
	public EList<Component> getUserComponents() {
		// TODO: implement this method to return the 'User Components' reference list
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
	public EList<InterfaceImplementation> getInterfaceImplementations() {
		// TODO: implement this method to return the 'Interface Implementations' reference list
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
	public EList<InterfaceUse> getInterfaceUses() {
		// TODO: implement this method to return the 'Interface Uses' reference list
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
	public EList<InterfaceAllocation> getProvisioningInterfaceAllocations() {
		// TODO: implement this method to return the 'Provisioning Interface Allocations' reference list
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
	public EList<Interface> getAllocatingInterfaces() {
		// TODO: implement this method to return the 'Allocating Interfaces' reference list
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
	public EList<Component> getAllocatingComponents() {
		// TODO: implement this method to return the 'Allocating Components' reference list
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
	public EList<ExchangeItem> getExchangeItems() {
		// TODO: implement this method to return the 'Exchange Items' reference list
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
	public EList<ExchangeItemAllocation> getOwnedExchangeItemAllocations() {
		if (ownedExchangeItemAllocations == null) {
			ownedExchangeItemAllocations = new EObjectContainmentEList<ExchangeItemAllocation>(ExchangeItemAllocation.class, this, CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS);
		}
		return ownedExchangeItemAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getRequiringComponents() {
		// TODO: implement this method to return the 'Requiring Components' reference list
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
	public EList<ComponentPort> getRequiringComponentPorts() {
		// TODO: implement this method to return the 'Requiring Component Ports' reference list
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
	public EList<Component> getProvidingComponents() {
		// TODO: implement this method to return the 'Providing Components' reference list
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
	public EList<ComponentPort> getProvidingComponentPorts() {
		// TODO: implement this method to return the 'Providing Component Ports' reference list
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
	public EList<Interface> getRealizingLogicalInterfaces() {
		// TODO: implement this method to return the 'Realizing Logical Interfaces' reference list
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
	public EList<Interface> getRealizedContextInterfaces() {
		// TODO: implement this method to return the 'Realized Context Interfaces' reference list
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
	public EList<Interface> getRealizingPhysicalInterfaces() {
		// TODO: implement this method to return the 'Realizing Physical Interfaces' reference list
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
	public EList<Interface> getRealizedLogicalInterfaces() {
		// TODO: implement this method to return the 'Realized Logical Interfaces' reference list
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedExchangeItemAllocations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				return getOwnedInterfaceAllocations();
			case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
				return getProvisionedInterfaceAllocations();
			case CsPackage.INTERFACE__ALLOCATED_INTERFACES:
				return getAllocatedInterfaces();
			case CsPackage.INTERFACE__MECHANISM:
				return getMechanism();
			case CsPackage.INTERFACE__STRUCTURAL:
				return isStructural();
			case CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
				return getImplementorComponents();
			case CsPackage.INTERFACE__USER_COMPONENTS:
				return getUserComponents();
			case CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS:
				return getInterfaceImplementations();
			case CsPackage.INTERFACE__INTERFACE_USES:
				return getInterfaceUses();
			case CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
				return getProvisioningInterfaceAllocations();
			case CsPackage.INTERFACE__ALLOCATING_INTERFACES:
				return getAllocatingInterfaces();
			case CsPackage.INTERFACE__ALLOCATING_COMPONENTS:
				return getAllocatingComponents();
			case CsPackage.INTERFACE__EXCHANGE_ITEMS:
				return getExchangeItems();
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return getOwnedExchangeItemAllocations();
			case CsPackage.INTERFACE__REQUIRING_COMPONENTS:
				return getRequiringComponents();
			case CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS:
				return getRequiringComponentPorts();
			case CsPackage.INTERFACE__PROVIDING_COMPONENTS:
				return getProvidingComponents();
			case CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS:
				return getProvidingComponentPorts();
			case CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES:
				return getRealizingLogicalInterfaces();
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				return getRealizedContextInterfaces();
			case CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES:
				return getRealizingPhysicalInterfaces();
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				return getRealizedLogicalInterfaces();
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				getOwnedInterfaceAllocations().addAll((Collection<? extends InterfaceAllocation>)newValue);
				return;
			case CsPackage.INTERFACE__MECHANISM:
				setMechanism((String)newValue);
				return;
			case CsPackage.INTERFACE__STRUCTURAL:
				setStructural((Boolean)newValue);
				return;
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				getOwnedExchangeItemAllocations().clear();
				getOwnedExchangeItemAllocations().addAll((Collection<? extends ExchangeItemAllocation>)newValue);
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				return;
			case CsPackage.INTERFACE__MECHANISM:
				setMechanism(MECHANISM_EDEFAULT);
				return;
			case CsPackage.INTERFACE__STRUCTURAL:
				setStructural(STRUCTURAL_EDEFAULT);
				return;
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				getOwnedExchangeItemAllocations().clear();
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
			case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS:
				return ownedInterfaceAllocations != null && !ownedInterfaceAllocations.isEmpty();
			case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS:
				return !getProvisionedInterfaceAllocations().isEmpty();
			case CsPackage.INTERFACE__ALLOCATED_INTERFACES:
				return !getAllocatedInterfaces().isEmpty();
			case CsPackage.INTERFACE__MECHANISM:
				return MECHANISM_EDEFAULT == null ? mechanism != null : !MECHANISM_EDEFAULT.equals(mechanism);
			case CsPackage.INTERFACE__STRUCTURAL:
				return structural != STRUCTURAL_EDEFAULT;
			case CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS:
				return !getImplementorComponents().isEmpty();
			case CsPackage.INTERFACE__USER_COMPONENTS:
				return !getUserComponents().isEmpty();
			case CsPackage.INTERFACE__INTERFACE_IMPLEMENTATIONS:
				return !getInterfaceImplementations().isEmpty();
			case CsPackage.INTERFACE__INTERFACE_USES:
				return !getInterfaceUses().isEmpty();
			case CsPackage.INTERFACE__PROVISIONING_INTERFACE_ALLOCATIONS:
				return !getProvisioningInterfaceAllocations().isEmpty();
			case CsPackage.INTERFACE__ALLOCATING_INTERFACES:
				return !getAllocatingInterfaces().isEmpty();
			case CsPackage.INTERFACE__ALLOCATING_COMPONENTS:
				return !getAllocatingComponents().isEmpty();
			case CsPackage.INTERFACE__EXCHANGE_ITEMS:
				return !getExchangeItems().isEmpty();
			case CsPackage.INTERFACE__OWNED_EXCHANGE_ITEM_ALLOCATIONS:
				return ownedExchangeItemAllocations != null && !ownedExchangeItemAllocations.isEmpty();
			case CsPackage.INTERFACE__REQUIRING_COMPONENTS:
				return !getRequiringComponents().isEmpty();
			case CsPackage.INTERFACE__REQUIRING_COMPONENT_PORTS:
				return !getRequiringComponentPorts().isEmpty();
			case CsPackage.INTERFACE__PROVIDING_COMPONENTS:
				return !getProvidingComponents().isEmpty();
			case CsPackage.INTERFACE__PROVIDING_COMPONENT_PORTS:
				return !getProvidingComponentPorts().isEmpty();
			case CsPackage.INTERFACE__REALIZING_LOGICAL_INTERFACES:
				return !getRealizingLogicalInterfaces().isEmpty();
			case CsPackage.INTERFACE__REALIZED_CONTEXT_INTERFACES:
				return !getRealizedContextInterfaces().isEmpty();
			case CsPackage.INTERFACE__REALIZING_PHYSICAL_INTERFACES:
				return !getRealizingPhysicalInterfaces().isEmpty();
			case CsPackage.INTERFACE__REALIZED_LOGICAL_INTERFACES:
				return !getRealizedLogicalInterfaces().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InterfaceAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE__ALLOCATED_INTERFACES: return CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InterfaceAllocator.class) {
			switch (baseFeatureID) {
				case CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES: return CsPackage.INTERFACE__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mechanism: ");
		result.append(mechanism);
		result.append(", structural: ");
		result.append(structural);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
