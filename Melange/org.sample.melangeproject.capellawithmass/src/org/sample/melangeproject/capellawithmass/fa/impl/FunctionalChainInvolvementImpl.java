/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChainInvolvement;

import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainInvolvementImpl#getNextFunctionalChainInvolvements <em>Next Functional Chain Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainInvolvementImpl#getPreviousFunctionalChainInvolvements <em>Previous Functional Chain Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainInvolvementImpl#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainInvolvementImpl#getInvolvedElement <em>Involved Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalChainInvolvementImpl extends RelationshipImpl implements FunctionalChainInvolvement {
	/**
	 * The cached value of the '{@link #getInvolver() <em>Involver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolver()
	 * @generated
	 * @ordered
	 */
	protected InvolverElement involver;

	/**
	 * The cached value of the '{@link #getInvolved() <em>Involved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolved()
	 * @generated
	 * @ordered
	 */
	protected InvolvedElement involved;

	/**
	 * The cached value of the '{@link #getNextFunctionalChainInvolvements() <em>Next Functional Chain Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextFunctionalChainInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainInvolvement> nextFunctionalChainInvolvements;

	/**
	 * The cached value of the '{@link #getExchangedItems() <em>Exchanged Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> exchangedItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolverElement getInvolver() {
		if (involver != null && involver.eIsProxy()) {
			InternalEObject oldInvolver = (InternalEObject)involver;
			involver = (InvolverElement)eResolveProxy(oldInvolver);
			if (involver != oldInvolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER, oldInvolver, involver));
			}
		}
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolverElement basicGetInvolver() {
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolver(InvolverElement newInvolver) {
		InvolverElement oldInvolver = involver;
		involver = newInvolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER, oldInvolver, involver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement getInvolved() {
		if (involved != null && involved.eIsProxy()) {
			InternalEObject oldInvolved = (InternalEObject)involved;
			involved = (InvolvedElement)eResolveProxy(oldInvolved);
			if (involved != oldInvolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED, oldInvolved, involved));
			}
		}
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement basicGetInvolved() {
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolved(InvolvedElement newInvolved) {
		InvolvedElement oldInvolved = involved;
		involved = newInvolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChainInvolvement> getNextFunctionalChainInvolvements() {
		if (nextFunctionalChainInvolvements == null) {
			nextFunctionalChainInvolvements = new EObjectResolvingEList<FunctionalChainInvolvement>(FunctionalChainInvolvement.class, this, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS);
		}
		return nextFunctionalChainInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalChainInvolvement> getPreviousFunctionalChainInvolvements() {
		// TODO: implement this method to return the 'Previous Functional Chain Involvements' reference list
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
	public EList<ExchangeItem> getExchangedItems() {
		if (exchangedItems == null) {
			exchangedItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__EXCHANGED_ITEMS);
		}
		return exchangedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement getInvolvedElement() {
		InvolvedElement involvedElement = basicGetInvolvedElement();
		return involvedElement != null && involvedElement.eIsProxy() ? (InvolvedElement)eResolveProxy((InternalEObject)involvedElement) : involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement basicGetInvolvedElement() {
		// TODO: implement this method to return the 'Involved Element' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getNextFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__PREVIOUS_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return getPreviousFunctionalChainInvolvements();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__EXCHANGED_ITEMS:
				return getExchangedItems();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT:
				if (resolve) return getInvolvedElement();
				return basicGetInvolvedElement();
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
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)newValue);
				return;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)newValue);
				return;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				getNextFunctionalChainInvolvements().clear();
				getNextFunctionalChainInvolvements().addAll((Collection<? extends FunctionalChainInvolvement>)newValue);
				return;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				getExchangedItems().addAll((Collection<? extends ExchangeItem>)newValue);
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
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)null);
				return;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)null);
				return;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				getNextFunctionalChainInvolvements().clear();
				return;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__EXCHANGED_ITEMS:
				getExchangedItems().clear();
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
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVER:
				return involver != null;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED:
				return involved != null;
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__NEXT_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return nextFunctionalChainInvolvements != null && !nextFunctionalChainInvolvements.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__PREVIOUS_FUNCTIONAL_CHAIN_INVOLVEMENTS:
				return !getPreviousFunctionalChainInvolvements().isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__EXCHANGED_ITEMS:
				return exchangedItems != null && !exchangedItems.isEmpty();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT__INVOLVED_ELEMENT:
				return basicGetInvolvedElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalChainInvolvementImpl
