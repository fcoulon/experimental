/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunctionPkg;

import org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl;

import org.sample.melangeproject.capellawithmass.la.LogicalFunction;

import org.sample.melangeproject.capellawithmass.oa.OperationalActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getOwnedSystemFunctionPkgs <em>Owned System Function Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getAllocatorActors <em>Allocator Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getAllocatorSystems <em>Allocator Systems</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getRealizedOperationalActivities <em>Realized Operational Activities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getRealizingLogicalFunctions <em>Realizing Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getContainedSystemFunctions <em>Contained System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemFunctionImpl#getChildrenSystemFunctions <em>Children System Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemFunctionImpl extends AbstractFunctionImpl implements SystemFunction {
	/**
	 * The cached value of the '{@link #getOwnedSystemFunctionPkgs() <em>Owned System Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemFunctionPkg> ownedSystemFunctionPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemFunctionPkg> getOwnedSystemFunctionPkgs() {
		if (ownedSystemFunctionPkgs == null) {
			ownedSystemFunctionPkgs = new EObjectContainmentEList<SystemFunctionPkg>(SystemFunctionPkg.class, this, CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS);
		}
		return ownedSystemFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getAllocatorActors() {
		// TODO: implement this method to return the 'Allocator Actors' reference list
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
	public EList<org.sample.melangeproject.capellawithmass.ctx.System> getAllocatorSystems() {
		// TODO: implement this method to return the 'Allocator Systems' reference list
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
	public EList<OperationalActivity> getRealizedOperationalActivities() {
		// TODO: implement this method to return the 'Realized Operational Activities' reference list
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
	public EList<LogicalFunction> getRealizingLogicalFunctions() {
		// TODO: implement this method to return the 'Realizing Logical Functions' reference list
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
	public EList<SystemFunction> getContainedSystemFunctions() {
		// TODO: implement this method to return the 'Contained System Functions' reference list
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
	public EList<SystemFunction> getChildrenSystemFunctions() {
		// TODO: implement this method to return the 'Children System Functions' reference list
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedSystemFunctionPkgs()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return getOwnedSystemFunctionPkgs();
			case CtxPackage.SYSTEM_FUNCTION__ALLOCATOR_ACTORS:
				return getAllocatorActors();
			case CtxPackage.SYSTEM_FUNCTION__ALLOCATOR_SYSTEMS:
				return getAllocatorSystems();
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return getRealizedOperationalActivities();
			case CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS:
				return getRealizingLogicalFunctions();
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return getContainedSystemFunctions();
			case CtxPackage.SYSTEM_FUNCTION__CHILDREN_SYSTEM_FUNCTIONS:
				return getChildrenSystemFunctions();
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
				getOwnedSystemFunctionPkgs().addAll((Collection<? extends SystemFunctionPkg>)newValue);
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				getOwnedSystemFunctionPkgs().clear();
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
			case CtxPackage.SYSTEM_FUNCTION__OWNED_SYSTEM_FUNCTION_PKGS:
				return ownedSystemFunctionPkgs != null && !ownedSystemFunctionPkgs.isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__ALLOCATOR_ACTORS:
				return !getAllocatorActors().isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__ALLOCATOR_SYSTEMS:
				return !getAllocatorSystems().isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__REALIZED_OPERATIONAL_ACTIVITIES:
				return !getRealizedOperationalActivities().isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__REALIZING_LOGICAL_FUNCTIONS:
				return !getRealizingLogicalFunctions().isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__CONTAINED_SYSTEM_FUNCTIONS:
				return !getContainedSystemFunctions().isEmpty();
			case CtxPackage.SYSTEM_FUNCTION__CHILDREN_SYSTEM_FUNCTIONS:
				return !getChildrenSystemFunctions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemFunctionImpl
