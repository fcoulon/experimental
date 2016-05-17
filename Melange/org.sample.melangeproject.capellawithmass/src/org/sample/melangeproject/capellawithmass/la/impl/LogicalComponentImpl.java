/**
 */
package org.sample.melangeproject.capellawithmass.la.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl;

import org.sample.melangeproject.capellawithmass.la.LaPackage;
import org.sample.melangeproject.capellawithmass.la.LogicalArchitecture;
import org.sample.melangeproject.capellawithmass.la.LogicalComponent;
import org.sample.melangeproject.capellawithmass.la.LogicalComponentPkg;
import org.sample.melangeproject.capellawithmass.la.LogicalFunction;
import org.sample.melangeproject.capellawithmass.la.SystemRealization;

import org.sample.melangeproject.capellawithmass.pa.PhysicalComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getOwnedLogicalComponents <em>Owned Logical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getOwnedLogicalArchitectures <em>Owned Logical Architectures</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getOwnedLogicalComponentPkgs <em>Owned Logical Component Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getOwnedSystemRealizations <em>Owned System Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getSystemRealizations <em>System Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getSubLogicalComponents <em>Sub Logical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getAllocatedLogicalFunctions <em>Allocated Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getRealizingPhysicalComponents <em>Realizing Physical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalComponentImpl#getRealizedSystems <em>Realized Systems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalComponentImpl extends SystemComponentImpl implements LogicalComponent {
	/**
	 * The cached value of the '{@link #getOwnedLogicalComponents() <em>Owned Logical Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponent> ownedLogicalComponents;

	/**
	 * The cached value of the '{@link #getOwnedLogicalArchitectures() <em>Owned Logical Architectures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalArchitectures()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitecture> ownedLogicalArchitectures;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponentPkgs() <em>Owned Logical Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponentPkg> ownedLogicalComponentPkgs;

	/**
	 * The cached value of the '{@link #getOwnedSystemRealizations() <em>Owned System Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemRealization> ownedSystemRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponent> getOwnedLogicalComponents() {
		if (ownedLogicalComponents == null) {
			ownedLogicalComponents = new EObjectContainmentEList<LogicalComponent>(LogicalComponent.class, this, LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS);
		}
		return ownedLogicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalArchitecture> getOwnedLogicalArchitectures() {
		if (ownedLogicalArchitectures == null) {
			ownedLogicalArchitectures = new EObjectContainmentEList<LogicalArchitecture>(LogicalArchitecture.class, this, LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_ARCHITECTURES);
		}
		return ownedLogicalArchitectures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponentPkg> getOwnedLogicalComponentPkgs() {
		if (ownedLogicalComponentPkgs == null) {
			ownedLogicalComponentPkgs = new EObjectContainmentEList<LogicalComponentPkg>(LogicalComponentPkg.class, this, LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS);
		}
		return ownedLogicalComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemRealization> getOwnedSystemRealizations() {
		if (ownedSystemRealizations == null) {
			ownedSystemRealizations = new EObjectContainmentEList<SystemRealization>(SystemRealization.class, this, LaPackage.LOGICAL_COMPONENT__OWNED_SYSTEM_REALIZATIONS);
		}
		return ownedSystemRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemRealization> getSystemRealizations() {
		// TODO: implement this method to return the 'System Realizations' reference list
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
	public EList<LogicalComponent> getSubLogicalComponents() {
		// TODO: implement this method to return the 'Sub Logical Components' reference list
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
	public EList<LogicalFunction> getAllocatedLogicalFunctions() {
		// TODO: implement this method to return the 'Allocated Logical Functions' reference list
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
	public EList<PhysicalComponent> getRealizingPhysicalComponents() {
		// TODO: implement this method to return the 'Realizing Physical Components' reference list
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
	public EList<org.sample.melangeproject.capellawithmass.ctx.System> getRealizedSystems() {
		// TODO: implement this method to return the 'Realized Systems' reference list
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				return ((InternalEList<?>)getOwnedLogicalComponents()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_ARCHITECTURES:
				return ((InternalEList<?>)getOwnedLogicalArchitectures()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedLogicalComponentPkgs()).basicRemove(otherEnd, msgs);
			case LaPackage.LOGICAL_COMPONENT__OWNED_SYSTEM_REALIZATIONS:
				return ((InternalEList<?>)getOwnedSystemRealizations()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				return getOwnedLogicalComponents();
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_ARCHITECTURES:
				return getOwnedLogicalArchitectures();
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				return getOwnedLogicalComponentPkgs();
			case LaPackage.LOGICAL_COMPONENT__OWNED_SYSTEM_REALIZATIONS:
				return getOwnedSystemRealizations();
			case LaPackage.LOGICAL_COMPONENT__SYSTEM_REALIZATIONS:
				return getSystemRealizations();
			case LaPackage.LOGICAL_COMPONENT__SUB_LOGICAL_COMPONENTS:
				return getSubLogicalComponents();
			case LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS:
				return getAllocatedLogicalFunctions();
			case LaPackage.LOGICAL_COMPONENT__REALIZING_PHYSICAL_COMPONENTS:
				return getRealizingPhysicalComponents();
			case LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS:
				return getRealizedSystems();
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				getOwnedLogicalComponents().clear();
				getOwnedLogicalComponents().addAll((Collection<? extends LogicalComponent>)newValue);
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_ARCHITECTURES:
				getOwnedLogicalArchitectures().clear();
				getOwnedLogicalArchitectures().addAll((Collection<? extends LogicalArchitecture>)newValue);
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				getOwnedLogicalComponentPkgs().clear();
				getOwnedLogicalComponentPkgs().addAll((Collection<? extends LogicalComponentPkg>)newValue);
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_SYSTEM_REALIZATIONS:
				getOwnedSystemRealizations().clear();
				getOwnedSystemRealizations().addAll((Collection<? extends SystemRealization>)newValue);
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				getOwnedLogicalComponents().clear();
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_ARCHITECTURES:
				getOwnedLogicalArchitectures().clear();
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				getOwnedLogicalComponentPkgs().clear();
				return;
			case LaPackage.LOGICAL_COMPONENT__OWNED_SYSTEM_REALIZATIONS:
				getOwnedSystemRealizations().clear();
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
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENTS:
				return ownedLogicalComponents != null && !ownedLogicalComponents.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_ARCHITECTURES:
				return ownedLogicalArchitectures != null && !ownedLogicalArchitectures.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_PKGS:
				return ownedLogicalComponentPkgs != null && !ownedLogicalComponentPkgs.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__OWNED_SYSTEM_REALIZATIONS:
				return ownedSystemRealizations != null && !ownedSystemRealizations.isEmpty();
			case LaPackage.LOGICAL_COMPONENT__SYSTEM_REALIZATIONS:
				return !getSystemRealizations().isEmpty();
			case LaPackage.LOGICAL_COMPONENT__SUB_LOGICAL_COMPONENTS:
				return !getSubLogicalComponents().isEmpty();
			case LaPackage.LOGICAL_COMPONENT__ALLOCATED_LOGICAL_FUNCTIONS:
				return !getAllocatedLogicalFunctions().isEmpty();
			case LaPackage.LOGICAL_COMPONENT__REALIZING_PHYSICAL_COMPONENTS:
				return !getRealizingPhysicalComponents().isEmpty();
			case LaPackage.LOGICAL_COMPONENT__REALIZED_SYSTEMS:
				return !getRealizedSystems().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalComponentImpl
