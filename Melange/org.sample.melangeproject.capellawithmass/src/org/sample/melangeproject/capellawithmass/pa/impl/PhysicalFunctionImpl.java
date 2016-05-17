/**
 */
package org.sample.melangeproject.capellawithmass.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl;

import org.sample.melangeproject.capellawithmass.la.LogicalFunction;

import org.sample.melangeproject.capellawithmass.pa.PaPackage;
import org.sample.melangeproject.capellawithmass.pa.PhysicalActor;
import org.sample.melangeproject.capellawithmass.pa.PhysicalComponent;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunction;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionImpl#getOwnedPhysicalFunctionPkgs <em>Owned Physical Function Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionImpl#getAllocatorPhysicalActors <em>Allocator Physical Actors</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionImpl#getAllocatorPhysicalComponents <em>Allocator Physical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionImpl#getRealizedLogicalFunctions <em>Realized Logical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionImpl#getContainedPhysicalFunctions <em>Contained Physical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalFunctionImpl#getChildrenPhysicalFunctions <em>Children Physical Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalFunctionImpl extends AbstractFunctionImpl implements PhysicalFunction {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalFunctionPkgs() <em>Owned Physical Function Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalFunctionPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalFunctionPkg> ownedPhysicalFunctionPkgs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalFunctionPkg> getOwnedPhysicalFunctionPkgs() {
		if (ownedPhysicalFunctionPkgs == null) {
			ownedPhysicalFunctionPkgs = new EObjectContainmentEList<PhysicalFunctionPkg>(PhysicalFunctionPkg.class, this, PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS);
		}
		return ownedPhysicalFunctionPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalActor> getAllocatorPhysicalActors() {
		// TODO: implement this method to return the 'Allocator Physical Actors' reference list
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
	public EList<PhysicalComponent> getAllocatorPhysicalComponents() {
		// TODO: implement this method to return the 'Allocator Physical Components' reference list
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
	public EList<LogicalFunction> getRealizedLogicalFunctions() {
		// TODO: implement this method to return the 'Realized Logical Functions' reference list
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
	public EList<PhysicalFunction> getContainedPhysicalFunctions() {
		// TODO: implement this method to return the 'Contained Physical Functions' reference list
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
	public EList<PhysicalFunction> getChildrenPhysicalFunctions() {
		// TODO: implement this method to return the 'Children Physical Functions' reference list
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalFunctionPkgs()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return getOwnedPhysicalFunctionPkgs();
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATOR_PHYSICAL_ACTORS:
				return getAllocatorPhysicalActors();
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATOR_PHYSICAL_COMPONENTS:
				return getAllocatorPhysicalComponents();
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return getRealizedLogicalFunctions();
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return getContainedPhysicalFunctions();
			case PaPackage.PHYSICAL_FUNCTION__CHILDREN_PHYSICAL_FUNCTIONS:
				return getChildrenPhysicalFunctions();
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
				getOwnedPhysicalFunctionPkgs().addAll((Collection<? extends PhysicalFunctionPkg>)newValue);
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				getOwnedPhysicalFunctionPkgs().clear();
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
			case PaPackage.PHYSICAL_FUNCTION__OWNED_PHYSICAL_FUNCTION_PKGS:
				return ownedPhysicalFunctionPkgs != null && !ownedPhysicalFunctionPkgs.isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATOR_PHYSICAL_ACTORS:
				return !getAllocatorPhysicalActors().isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__ALLOCATOR_PHYSICAL_COMPONENTS:
				return !getAllocatorPhysicalComponents().isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__REALIZED_LOGICAL_FUNCTIONS:
				return !getRealizedLogicalFunctions().isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__CONTAINED_PHYSICAL_FUNCTIONS:
				return !getContainedPhysicalFunctions().isEmpty();
			case PaPackage.PHYSICAL_FUNCTION__CHILDREN_PHYSICAL_FUNCTIONS:
				return !getChildrenPhysicalFunctions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalFunctionImpl
