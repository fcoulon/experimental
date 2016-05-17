/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractState;
import org.sample.melangeproject.capellawithmass.capellacommon.AbstractStateRealization;
import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;
import org.sample.melangeproject.capellawithmass.capellacommon.Region;
import org.sample.melangeproject.capellawithmass.capellacommon.StateTransition;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.IState;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getReferencedStates <em>Referenced States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getExploitedStates <em>Exploited States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getOwnedAbstractStateRealizations <em>Owned Abstract State Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getRealizedAbstractStates <em>Realized Abstract States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getRealizingAbstractStates <em>Realizing Abstract States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.AbstractStateImpl#getInvolverRegions <em>Involver Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStateImpl extends NamedElementImpl implements AbstractState {
	/**
	 * The cached value of the '{@link #getReferencedStates() <em>Referenced States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IState> referencedStates;

	/**
	 * The cached value of the '{@link #getExploitedStates() <em>Exploited States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploitedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IState> exploitedStates;

	/**
	 * The cached value of the '{@link #getOwnedAbstractStateRealizations() <em>Owned Abstract State Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractStateRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractStateRealization> ownedAbstractStateRealizations;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> outgoing;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<StateTransition> incoming;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.ABSTRACT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IState> getReferencedStates() {
		if (referencedStates == null) {
			referencedStates = new EObjectResolvingEList<IState>(IState.class, this, CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES);
		}
		return referencedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IState> getExploitedStates() {
		if (exploitedStates == null) {
			exploitedStates = new EObjectResolvingEList<IState>(IState.class, this, CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES);
		}
		return exploitedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractStateRealization> getOwnedAbstractStateRealizations() {
		if (ownedAbstractStateRealizations == null) {
			ownedAbstractStateRealizations = new EObjectContainmentEList<AbstractStateRealization>(AbstractStateRealization.class, this, CapellacommonPackage.ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS);
		}
		return ownedAbstractStateRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractState> getRealizedAbstractStates() {
		// TODO: implement this method to return the 'Realized Abstract States' reference list
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
	public EList<AbstractState> getRealizingAbstractStates() {
		// TODO: implement this method to return the 'Realizing Abstract States' reference list
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
	public EList<StateTransition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<StateTransition>(StateTransition.class, this, CapellacommonPackage.ABSTRACT_STATE__OUTGOING, CapellacommonPackage.STATE_TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateTransition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<StateTransition>(StateTransition.class, this, CapellacommonPackage.ABSTRACT_STATE__INCOMING, CapellacommonPackage.STATE_TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getInvolverRegions() {
		// TODO: implement this method to return the 'Involver Regions' reference list
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.ABSTRACT_STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case CapellacommonPackage.ABSTRACT_STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
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
			case CapellacommonPackage.ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedAbstractStateRealizations()).basicRemove(otherEnd, msgs);
			case CapellacommonPackage.ABSTRACT_STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case CapellacommonPackage.ABSTRACT_STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				return getReferencedStates();
			case CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES:
				return getExploitedStates();
			case CapellacommonPackage.ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
				return getOwnedAbstractStateRealizations();
			case CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES:
				return getRealizedAbstractStates();
			case CapellacommonPackage.ABSTRACT_STATE__REALIZING_ABSTRACT_STATES:
				return getRealizingAbstractStates();
			case CapellacommonPackage.ABSTRACT_STATE__OUTGOING:
				return getOutgoing();
			case CapellacommonPackage.ABSTRACT_STATE__INCOMING:
				return getIncoming();
			case CapellacommonPackage.ABSTRACT_STATE__INVOLVER_REGIONS:
				return getInvolverRegions();
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				getReferencedStates().clear();
				getReferencedStates().addAll((Collection<? extends IState>)newValue);
				return;
			case CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES:
				getExploitedStates().clear();
				getExploitedStates().addAll((Collection<? extends IState>)newValue);
				return;
			case CapellacommonPackage.ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
				getOwnedAbstractStateRealizations().clear();
				getOwnedAbstractStateRealizations().addAll((Collection<? extends AbstractStateRealization>)newValue);
				return;
			case CapellacommonPackage.ABSTRACT_STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends StateTransition>)newValue);
				return;
			case CapellacommonPackage.ABSTRACT_STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends StateTransition>)newValue);
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				getReferencedStates().clear();
				return;
			case CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES:
				getExploitedStates().clear();
				return;
			case CapellacommonPackage.ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
				getOwnedAbstractStateRealizations().clear();
				return;
			case CapellacommonPackage.ABSTRACT_STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case CapellacommonPackage.ABSTRACT_STATE__INCOMING:
				getIncoming().clear();
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
			case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES:
				return referencedStates != null && !referencedStates.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES:
				return exploitedStates != null && !exploitedStates.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__OWNED_ABSTRACT_STATE_REALIZATIONS:
				return ownedAbstractStateRealizations != null && !ownedAbstractStateRealizations.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__REALIZED_ABSTRACT_STATES:
				return !getRealizedAbstractStates().isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__REALIZING_ABSTRACT_STATES:
				return !getRealizingAbstractStates().isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case CapellacommonPackage.ABSTRACT_STATE__INVOLVER_REGIONS:
				return !getInvolverRegions().isEmpty();
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
		if (baseClass == IState.class) {
			switch (derivedFeatureID) {
				case CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES: return ModellingcorePackage.ISTATE__REFERENCED_STATES;
				case CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES: return ModellingcorePackage.ISTATE__EXPLOITED_STATES;
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
		if (baseClass == IState.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ISTATE__REFERENCED_STATES: return CapellacommonPackage.ABSTRACT_STATE__REFERENCED_STATES;
				case ModellingcorePackage.ISTATE__EXPLOITED_STATES: return CapellacommonPackage.ABSTRACT_STATE__EXPLOITED_STATES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractStateImpl
