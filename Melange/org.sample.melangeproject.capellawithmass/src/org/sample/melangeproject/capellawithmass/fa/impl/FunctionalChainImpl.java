/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.State;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.ctx.Capability;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalBlock;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChain;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChainInvolvement;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChainKind;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChainRealization;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvedInvolvements <em>Involved Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getOwnedFunctionalChainInvolvements <em>Owned Functional Chain Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getOwnedFunctionalChainRealizations <em>Owned Functional Chain Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvedFunctionalChainInvolvements <em>Involved Functional Chain Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvedFunctions <em>Involved Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvedFunctionalExchanges <em>Involved Functional Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvedElements <em>Involved Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getEnactedFunctions <em>Enacted Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getEnactedFunctionalBlocks <em>Enacted Functional Blocks</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getAvailableInStates <em>Available In States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getFirstFunctionalChainInvolvements <em>First Functional Chain Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvingCapabilities <em>Involving Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getInvolvingCapabilityRealizations <em>Involving Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getRealizedFunctionalChains <em>Realized Functional Chains</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl#getRealizingFunctionalChains <em>Realizing Functional Chains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalChainImpl extends NamedElementImpl implements FunctionalChain {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionalChainKind KIND_EDEFAULT = FunctionalChainKind.SIMPLE;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FunctionalChainKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalChainInvolvements() <em>Owned Functional Chain Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalChainInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainInvolvement> ownedFunctionalChainInvolvements;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalChainRealizations() <em>Owned Functional Chain Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalChainRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainRealization> ownedFunctionalChainRealizations;

	/**
	 * The cached value of the '{@link #getAvailableInStates() <em>Available In States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> availableInStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN;
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
	public FunctionalChainKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(FunctionalChainKind newKind) {
		FunctionalChainKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_CHAIN__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChainInvolvement> getOwnedFunctionalChainInvolvements() {
		if (ownedFunctionalChainInvolvements == null) {
			ownedFunctionalChainInvolvements = new EObjectContainmentEList<FunctionalChainInvolvement>(FunctionalChainInvolvement.class, this, FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		}
		return ownedFunctionalChainInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChainRealization> getOwnedFunctionalChainRealizations() {
		if (ownedFunctionalChainRealizations == null) {
			ownedFunctionalChainRealizations = new EObjectContainmentEList<FunctionalChainRealization>(FunctionalChainRealization.class, this, FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS);
		}
		return ownedFunctionalChainRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChainInvolvement> getInvolvedFunctionalChainInvolvements() {
		// TODO: implement this method to return the 'Involved Functional Chain Involvements' reference list
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
	public EList<AbstractFunction> getInvolvedFunctions() {
		// TODO: implement this method to return the 'Involved Functions' reference list
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
	public EList<FunctionalExchange> getInvolvedFunctionalExchanges() {
		// TODO: implement this method to return the 'Involved Functional Exchanges' reference list
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
	public EList<InvolvedElement> getInvolvedElements() {
		// TODO: implement this method to return the 'Involved Elements' reference list
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
	public EList<AbstractFunction> getEnactedFunctions() {
		// TODO: implement this method to return the 'Enacted Functions' reference list
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
	public EList<AbstractFunctionalBlock> getEnactedFunctionalBlocks() {
		// TODO: implement this method to return the 'Enacted Functional Blocks' reference list
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
	public EList<State> getAvailableInStates() {
		if (availableInStates == null) {
			availableInStates = new EObjectResolvingEList<State>(State.class, this, FaPackage.FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES);
		}
		return availableInStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChainInvolvement> getFirstFunctionalChainInvolvements() {
		// TODO: implement this method to return the 'First Functional Chain Involvements' reference list
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
	public EList<Capability> getInvolvingCapabilities() {
		// TODO: implement this method to return the 'Involving Capabilities' reference list
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
	public EList<CapabilityRealization> getInvolvingCapabilityRealizations() {
		// TODO: implement this method to return the 'Involving Capability Realizations' reference list
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
	public EList<FunctionalChain> getRealizedFunctionalChains() {
		// TODO: implement this method to return the 'Realized Functional Chains' reference list
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
	public EList<FunctionalChain> getRealizingFunctionalChains() {
		// TODO: implement this method to return the 'Realizing Functional Chains' reference list
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
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedFunctionalChainInvolvements()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
				return ((InternalEList<?>)getOwnedFunctionalChainRealizations()).basicRemove(otherEnd, msgs);
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
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_INVOLVEMENTS:
				return getInvolvedInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN__KIND:
				return getKind();
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getOwnedFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
				return getOwnedFunctionalChainRealizations();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getInvolvedFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONS:
				return getInvolvedFunctions();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_EXCHANGES:
				return getInvolvedFunctionalExchanges();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_ELEMENTS:
				return getInvolvedElements();
			case FaPackage.FUNCTIONAL_CHAIN__ENACTED_FUNCTIONS:
				return getEnactedFunctions();
			case FaPackage.FUNCTIONAL_CHAIN__ENACTED_FUNCTIONAL_BLOCKS:
				return getEnactedFunctionalBlocks();
			case FaPackage.FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES:
				return getAvailableInStates();
			case FaPackage.FUNCTIONAL_CHAIN__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getFirstFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_CAPABILITIES:
				return getInvolvingCapabilities();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_CAPABILITY_REALIZATIONS:
				return getInvolvingCapabilityRealizations();
			case FaPackage.FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS:
				return getRealizedFunctionalChains();
			case FaPackage.FUNCTIONAL_CHAIN__REALIZING_FUNCTIONAL_CHAINS:
				return getRealizingFunctionalChains();
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
			case FaPackage.FUNCTIONAL_CHAIN__KIND:
				setKind((FunctionalChainKind)newValue);
				return;
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				getOwnedFunctionalChainInvolvements().clear();
				getOwnedFunctionalChainInvolvements().addAll((Collection<? extends FunctionalChainInvolvement>)newValue);
				return;
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
				getOwnedFunctionalChainRealizations().clear();
				getOwnedFunctionalChainRealizations().addAll((Collection<? extends FunctionalChainRealization>)newValue);
				return;
			case FaPackage.FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES:
				getAvailableInStates().clear();
				getAvailableInStates().addAll((Collection<? extends State>)newValue);
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
			case FaPackage.FUNCTIONAL_CHAIN__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				getOwnedFunctionalChainInvolvements().clear();
				return;
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
				getOwnedFunctionalChainRealizations().clear();
				return;
			case FaPackage.FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES:
				getAvailableInStates().clear();
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
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_INVOLVEMENTS:
				return !getInvolvedInvolvements().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__KIND:
				return kind != KIND_EDEFAULT;
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return ownedFunctionalChainInvolvements != null && !ownedFunctionalChainInvolvements.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__OWNED_FUNCTIONAL_CHAIN_REALIZATIONS:
				return ownedFunctionalChainRealizations != null && !ownedFunctionalChainRealizations.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return !getInvolvedFunctionalChainInvolvements().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONS:
				return !getInvolvedFunctions().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_FUNCTIONAL_EXCHANGES:
				return !getInvolvedFunctionalExchanges().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_ELEMENTS:
				return !getInvolvedElements().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__ENACTED_FUNCTIONS:
				return !getEnactedFunctions().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__ENACTED_FUNCTIONAL_BLOCKS:
				return !getEnactedFunctionalBlocks().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__AVAILABLE_IN_STATES:
				return availableInStates != null && !availableInStates.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__FIRST_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return !getFirstFunctionalChainInvolvements().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_CAPABILITIES:
				return !getInvolvingCapabilities().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_CAPABILITY_REALIZATIONS:
				return !getInvolvingCapabilityRealizations().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__REALIZED_FUNCTIONAL_CHAINS:
				return !getRealizedFunctionalChains().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN__REALIZING_FUNCTIONAL_CHAINS:
				return !getRealizingFunctionalChains().isEmpty();
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
		if (baseClass == InvolverElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_CHAIN__INVOLVED_INVOLVEMENTS: return CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_CHAIN__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
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
		if (baseClass == InvolverElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVER_ELEMENT__INVOLVED_INVOLVEMENTS: return FaPackage.FUNCTIONAL_CHAIN__INVOLVED_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return FaPackage.FUNCTIONAL_CHAIN__INVOLVING_INVOLVEMENTS;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //FunctionalChainImpl
