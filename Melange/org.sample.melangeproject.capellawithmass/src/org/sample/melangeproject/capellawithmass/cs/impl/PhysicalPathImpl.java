/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.cs.AbstractPathInvolvedElement;
import org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalPathLink;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPath;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPathInvolvement;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPathRealization;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeAllocation;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeAllocator;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getOwnedComponentExchangeAllocations <em>Owned Component Exchange Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getAllocatedComponentExchanges <em>Allocated Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getInvolvedInvolvements <em>Involved Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getInvolvedLinks <em>Involved Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getOwnedPhysicalPathInvolvements <em>Owned Physical Path Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getFirstPhysicalPathInvolvements <em>First Physical Path Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getOwnedPhysicalPathRealizations <em>Owned Physical Path Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getRealizedPhysicalPaths <em>Realized Physical Paths</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathImpl#getRealizingPhysicalPaths <em>Realizing Physical Paths</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalPathImpl extends NamedElementImpl implements PhysicalPath {
	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeAllocations() <em>Owned Component Exchange Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeAllocation> ownedComponentExchangeAllocations;

	/**
	 * The cached value of the '{@link #getInvolvedLinks() <em>Involved Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPhysicalPathLink> involvedLinks;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPathInvolvements() <em>Owned Physical Path Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPathInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> ownedPhysicalPathInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPathRealizations() <em>Owned Physical Path Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPathRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathRealization> ownedPhysicalPathRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeAllocation> getOwnedComponentExchangeAllocations() {
		if (ownedComponentExchangeAllocations == null) {
			ownedComponentExchangeAllocations = new EObjectContainmentEList<ComponentExchangeAllocation>(ComponentExchangeAllocation.class, this, CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS);
		}
		return ownedComponentExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getAllocatedComponentExchanges() {
		// TODO: implement this method to return the 'Allocated Component Exchanges' reference list
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
	public EList<Involvement> getInvolvingInvolvements() {
		// TODO: implement this method to return the 'Involving Involvements' reference list
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
	public EList<Involvement> getInvolvedInvolvements() {
		// TODO: implement this method to return the 'Involved Involvements' reference list
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
	public EList<AbstractPhysicalPathLink> getInvolvedLinks() {
		if (involvedLinks == null) {
			involvedLinks = new EObjectResolvingEList<AbstractPhysicalPathLink>(AbstractPhysicalPathLink.class, this, CsPackage.PHYSICAL_PATH__INVOLVED_LINKS);
		}
		return involvedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getOwnedPhysicalPathInvolvements() {
		if (ownedPhysicalPathInvolvements == null) {
			ownedPhysicalPathInvolvements = new EObjectContainmentEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS);
		}
		return ownedPhysicalPathInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getFirstPhysicalPathInvolvements() {
		// TODO: implement this method to return the 'First Physical Path Involvements' reference list
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
	public EList<PhysicalPathRealization> getOwnedPhysicalPathRealizations() {
		if (ownedPhysicalPathRealizations == null) {
			ownedPhysicalPathRealizations = new EObjectContainmentEList<PhysicalPathRealization>(PhysicalPathRealization.class, this, CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS);
		}
		return ownedPhysicalPathRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPath> getRealizedPhysicalPaths() {
		// TODO: implement this method to return the 'Realized Physical Paths' reference list
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
	public EList<PhysicalPath> getRealizingPhysicalPaths() {
		// TODO: implement this method to return the 'Realizing Physical Paths' reference list
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedPhysicalPathInvolvements()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPhysicalPathRealizations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeAllocations();
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				return getAllocatedComponentExchanges();
			case CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS:
				return getInvolvedInvolvements();
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				return getInvolvedLinks();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return getOwnedPhysicalPathInvolvements();
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				return getFirstPhysicalPathInvolvements();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				return getOwnedPhysicalPathRealizations();
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				return getRealizedPhysicalPaths();
			case CsPackage.PHYSICAL_PATH__REALIZING_PHYSICAL_PATHS:
				return getRealizingPhysicalPaths();
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeAllocations().clear();
				getOwnedComponentExchangeAllocations().addAll((Collection<? extends ComponentExchangeAllocation>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				getInvolvedLinks().clear();
				getInvolvedLinks().addAll((Collection<? extends AbstractPhysicalPathLink>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				getOwnedPhysicalPathInvolvements().clear();
				getOwnedPhysicalPathInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				getOwnedPhysicalPathRealizations().clear();
				getOwnedPhysicalPathRealizations().addAll((Collection<? extends PhysicalPathRealization>)newValue);
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeAllocations().clear();
				return;
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				getInvolvedLinks().clear();
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				getOwnedPhysicalPathInvolvements().clear();
				return;
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				getOwnedPhysicalPathRealizations().clear();
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
			case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeAllocations != null && !ownedComponentExchangeAllocations.isEmpty();
			case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES:
				return !getAllocatedComponentExchanges().isEmpty();
			case CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS:
				return !getInvolvedInvolvements().isEmpty();
			case CsPackage.PHYSICAL_PATH__INVOLVED_LINKS:
				return involvedLinks != null && !involvedLinks.isEmpty();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_INVOLVEMENTS:
				return ownedPhysicalPathInvolvements != null && !ownedPhysicalPathInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH__FIRST_PHYSICAL_PATH_INVOLVEMENTS:
				return !getFirstPhysicalPathInvolvements().isEmpty();
			case CsPackage.PHYSICAL_PATH__OWNED_PHYSICAL_PATH_REALIZATIONS:
				return ownedPhysicalPathRealizations != null && !ownedPhysicalPathRealizations.isEmpty();
			case CsPackage.PHYSICAL_PATH__REALIZED_PHYSICAL_PATHS:
				return !getRealizedPhysicalPaths().isEmpty();
			case CsPackage.PHYSICAL_PATH__REALIZING_PHYSICAL_PATHS:
				return !getRealizingPhysicalPaths().isEmpty();
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
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS: return FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS;
				case CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolverElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS: return CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS;
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
		if (baseClass == ComponentExchangeAllocator.class) {
			switch (baseFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS: return CsPackage.PHYSICAL_PATH__OWNED_COMPONENT_EXCHANGE_ALLOCATIONS;
				case FaPackage.COMPONENT_EXCHANGE_ALLOCATOR__ALLOCATED_COMPONENT_EXCHANGES: return CsPackage.PHYSICAL_PATH__ALLOCATED_COMPONENT_EXCHANGES;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.PHYSICAL_PATH__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolverElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS: return CsPackage.PHYSICAL_PATH__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalPathImpl
