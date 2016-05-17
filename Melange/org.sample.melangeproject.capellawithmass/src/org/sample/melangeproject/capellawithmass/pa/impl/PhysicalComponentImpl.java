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

import org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalArtifact;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;

import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem;

import org.sample.melangeproject.capellawithmass.la.LogicalComponent;

import org.sample.melangeproject.capellawithmass.pa.LogicalComponentRealization;
import org.sample.melangeproject.capellawithmass.pa.LogicalInterfaceRealization;
import org.sample.melangeproject.capellawithmass.pa.PaPackage;
import org.sample.melangeproject.capellawithmass.pa.PhysicalActor;
import org.sample.melangeproject.capellawithmass.pa.PhysicalComponent;
import org.sample.melangeproject.capellawithmass.pa.PhysicalComponentPkg;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getAllocatorConfigurationItems <em>Allocator Configuration Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getOwnedPhysicalComponents <em>Owned Physical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getOwnedPhysicalComponentPkgs <em>Owned Physical Component Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getOwnedLogicalComponentRealizations <em>Owned Logical Component Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getLogicalComponentRealizations <em>Logical Component Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getLogicalInterfaceRealizations <em>Logical Interface Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getSubPhysicalComponents <em>Sub Physical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getRealizedLogicalComponents <em>Realized Logical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getAllocatedPhysicalFunctions <em>Allocated Physical Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getDeployedPhysicalComponents <em>Deployed Physical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getDeployingPhysicalComponents <em>Deploying Physical Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalComponentImpl#getDeployingPhysicalActors <em>Deploying Physical Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalComponentImpl extends AbstractPhysicalComponentImpl implements PhysicalComponent {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponents() <em>Owned Physical Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponent> ownedPhysicalComponents;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkgs() <em>Owned Physical Component Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalComponentPkg> ownedPhysicalComponentPkgs;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponentRealizations() <em>Owned Logical Component Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponentRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalComponentRealization> ownedLogicalComponentRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItem> getAllocatorConfigurationItems() {
		// TODO: implement this method to return the 'Allocator Configuration Items' reference list
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
	public EList<PhysicalComponent> getOwnedPhysicalComponents() {
		if (ownedPhysicalComponents == null) {
			ownedPhysicalComponents = new EObjectContainmentEList<PhysicalComponent>(PhysicalComponent.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS);
		}
		return ownedPhysicalComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalComponentPkg> getOwnedPhysicalComponentPkgs() {
		if (ownedPhysicalComponentPkgs == null) {
			ownedPhysicalComponentPkgs = new EObjectContainmentEList<PhysicalComponentPkg>(PhysicalComponentPkg.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS);
		}
		return ownedPhysicalComponentPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponentRealization> getOwnedLogicalComponentRealizations() {
		if (ownedLogicalComponentRealizations == null) {
			ownedLogicalComponentRealizations = new EObjectContainmentEList<LogicalComponentRealization>(LogicalComponentRealization.class, this, PaPackage.PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS);
		}
		return ownedLogicalComponentRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalComponentRealization> getLogicalComponentRealizations() {
		// TODO: implement this method to return the 'Logical Component Realizations' reference list
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
	public EList<LogicalInterfaceRealization> getLogicalInterfaceRealizations() {
		// TODO: implement this method to return the 'Logical Interface Realizations' reference list
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
	public EList<PhysicalComponent> getSubPhysicalComponents() {
		// TODO: implement this method to return the 'Sub Physical Components' reference list
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
	public EList<LogicalComponent> getRealizedLogicalComponents() {
		// TODO: implement this method to return the 'Realized Logical Components' reference list
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
	public EList<PhysicalFunction> getAllocatedPhysicalFunctions() {
		// TODO: implement this method to return the 'Allocated Physical Functions' reference list
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
	public EList<PhysicalComponent> getDeployedPhysicalComponents() {
		// TODO: implement this method to return the 'Deployed Physical Components' reference list
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
	public EList<PhysicalComponent> getDeployingPhysicalComponents() {
		// TODO: implement this method to return the 'Deploying Physical Components' reference list
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
	public EList<PhysicalActor> getDeployingPhysicalActors() {
		// TODO: implement this method to return the 'Deploying Physical Actors' reference list
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return ((InternalEList<?>)getOwnedPhysicalComponents()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ((InternalEList<?>)getOwnedPhysicalComponentPkgs()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedLogicalComponentRealizations()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATOR_CONFIGURATION_ITEMS:
				return getAllocatorConfigurationItems();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return getOwnedPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return getOwnedPhysicalComponentPkgs();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
				return getOwnedLogicalComponentRealizations();
			case PaPackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENT_REALIZATIONS:
				return getLogicalComponentRealizations();
			case PaPackage.PHYSICAL_COMPONENT__LOGICAL_INTERFACE_REALIZATIONS:
				return getLogicalInterfaceRealizations();
			case PaPackage.PHYSICAL_COMPONENT__SUB_PHYSICAL_COMPONENTS:
				return getSubPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return getRealizedLogicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return getAllocatedPhysicalFunctions();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				return getDeployedPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_COMPONENTS:
				return getDeployingPhysicalComponents();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_ACTORS:
				return getDeployingPhysicalActors();
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				getOwnedPhysicalComponents().clear();
				getOwnedPhysicalComponents().addAll((Collection<? extends PhysicalComponent>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				getOwnedPhysicalComponentPkgs().addAll((Collection<? extends PhysicalComponentPkg>)newValue);
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
				getOwnedLogicalComponentRealizations().clear();
				getOwnedLogicalComponentRealizations().addAll((Collection<? extends LogicalComponentRealization>)newValue);
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
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				getOwnedPhysicalComponents().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				getOwnedPhysicalComponentPkgs().clear();
				return;
			case PaPackage.PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
				getOwnedLogicalComponentRealizations().clear();
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
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATOR_CONFIGURATION_ITEMS:
				return !getAllocatorConfigurationItems().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENTS:
				return ownedPhysicalComponents != null && !ownedPhysicalComponents.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_PHYSICAL_COMPONENT_PKGS:
				return ownedPhysicalComponentPkgs != null && !ownedPhysicalComponentPkgs.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__OWNED_LOGICAL_COMPONENT_REALIZATIONS:
				return ownedLogicalComponentRealizations != null && !ownedLogicalComponentRealizations.isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__LOGICAL_COMPONENT_REALIZATIONS:
				return !getLogicalComponentRealizations().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__LOGICAL_INTERFACE_REALIZATIONS:
				return !getLogicalInterfaceRealizations().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__SUB_PHYSICAL_COMPONENTS:
				return !getSubPhysicalComponents().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__REALIZED_LOGICAL_COMPONENTS:
				return !getRealizedLogicalComponents().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__ALLOCATED_PHYSICAL_FUNCTIONS:
				return !getAllocatedPhysicalFunctions().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYED_PHYSICAL_COMPONENTS:
				return !getDeployedPhysicalComponents().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_COMPONENTS:
				return !getDeployingPhysicalComponents().isEmpty();
			case PaPackage.PHYSICAL_COMPONENT__DEPLOYING_PHYSICAL_ACTORS:
				return !getDeployingPhysicalActors().isEmpty();
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
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (derivedFeatureID) {
				case PaPackage.PHYSICAL_COMPONENT__ALLOCATOR_CONFIGURATION_ITEMS: return CsPackage.ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS;
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
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (baseFeatureID) {
				case CsPackage.ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS: return PaPackage.PHYSICAL_COMPONENT__ALLOCATOR_CONFIGURATION_ITEMS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalComponentImpl
