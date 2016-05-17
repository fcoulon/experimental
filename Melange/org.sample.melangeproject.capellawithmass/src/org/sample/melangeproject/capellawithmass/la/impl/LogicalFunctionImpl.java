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

import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;

import org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl;

import org.sample.melangeproject.capellawithmass.la.LaPackage;
import org.sample.melangeproject.capellawithmass.la.LogicalActor;
import org.sample.melangeproject.capellawithmass.la.LogicalComponent;
import org.sample.melangeproject.capellawithmass.la.LogicalFunction;
import org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg;

import org.sample.melangeproject.capellawithmass.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getOwnedLogicalFunctionPkgs <em>Owned Logical Function Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getAllocatorLogicalActors <em>Allocator Logical Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getAllocatorLogicalComponents <em>Allocator Logical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getRealizedSystemFunctions <em>Realized System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getRealizingPhysicalFunctions <em>Realizing Physical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getContainedLogicalFunctions <em>Contained Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalFunctionImpl#getChildrenLogicalFunctions <em>Children Logical Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalFunctionImpl extends AbstractFunctionImpl implements LogicalFunction {
	/**
	 * The cached value of the '{@link #getOwnedLogicalFunctionPkgs() <em>Owned Logical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalFunctionPkg> ownedLogicalFunctionPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalFunctionPkg> getOwnedLogicalFunctionPkgs() {
		if (ownedLogicalFunctionPkgs == null) {
			ownedLogicalFunctionPkgs = new EObjectContainmentEList<LogicalFunctionPkg>(LogicalFunctionPkg.class, this, LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS);
		}
		return ownedLogicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalActor> getAllocatorLogicalActors() {
		// TODO: implement this method to return the 'Allocator Logical Actors' reference list
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
	public EList<LogicalComponent> getAllocatorLogicalComponents() {
		// TODO: implement this method to return the 'Allocator Logical Components' reference list
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
	public EList<SystemFunction> getRealizedSystemFunctions() {
		// TODO: implement this method to return the 'Realized System Functions' reference list
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
	public EList<PhysicalFunction> getRealizingPhysicalFunctions() {
		// TODO: implement this method to return the 'Realizing Physical Functions' reference list
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
	public EList<LogicalFunction> getContainedLogicalFunctions() {
		// TODO: implement this method to return the 'Contained Logical Functions' reference list
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
	public EList<LogicalFunction> getChildrenLogicalFunctions() {
		// TODO: implement this method to return the 'Children Logical Functions' reference list
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedLogicalFunctionPkgs()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return getOwnedLogicalFunctionPkgs();
			case LaPackage.LOGICAL_FUNCTION__ALLOCATOR_LOGICAL_ACTORS:
				return getAllocatorLogicalActors();
			case LaPackage.LOGICAL_FUNCTION__ALLOCATOR_LOGICAL_COMPONENTS:
				return getAllocatorLogicalComponents();
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return getRealizedSystemFunctions();
			case LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS:
				return getRealizingPhysicalFunctions();
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return getContainedLogicalFunctions();
			case LaPackage.LOGICAL_FUNCTION__CHILDREN_LOGICAL_FUNCTIONS:
				return getChildrenLogicalFunctions();
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				getOwnedLogicalFunctionPkgs().clear();
				getOwnedLogicalFunctionPkgs().addAll((Collection<? extends LogicalFunctionPkg>)newValue);
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				getOwnedLogicalFunctionPkgs().clear();
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
			case LaPackage.LOGICAL_FUNCTION__OWNED_LOGICAL_FUNCTION_PKGS:
				return ownedLogicalFunctionPkgs != null && !ownedLogicalFunctionPkgs.isEmpty();
			case LaPackage.LOGICAL_FUNCTION__ALLOCATOR_LOGICAL_ACTORS:
				return !getAllocatorLogicalActors().isEmpty();
			case LaPackage.LOGICAL_FUNCTION__ALLOCATOR_LOGICAL_COMPONENTS:
				return !getAllocatorLogicalComponents().isEmpty();
			case LaPackage.LOGICAL_FUNCTION__REALIZED_SYSTEM_FUNCTIONS:
				return !getRealizedSystemFunctions().isEmpty();
			case LaPackage.LOGICAL_FUNCTION__REALIZING_PHYSICAL_FUNCTIONS:
				return !getRealizingPhysicalFunctions().isEmpty();
			case LaPackage.LOGICAL_FUNCTION__CONTAINED_LOGICAL_FUNCTIONS:
				return !getContainedLogicalFunctions().isEmpty();
			case LaPackage.LOGICAL_FUNCTION__CHILDREN_LOGICAL_FUNCTIONS:
				return !getChildrenLogicalFunctions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalFunctionImpl
