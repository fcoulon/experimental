/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacore.impl.FeatureImpl;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;
import org.sample.melangeproject.capellawithmass.information.ExchangeItemRealization;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Operation;
import org.sample.melangeproject.capellawithmass.information.OperationAllocation;
import org.sample.melangeproject.capellawithmass.information.Parameter;

import org.sample.melangeproject.capellawithmass.interaction.SequenceMessage;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getAllocatingOperations <em>Allocating Operations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getAllocatedOperations <em>Allocated Operations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getOwnedOperationAllocation <em>Owned Operation Allocation</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getOwnedExchangeItemRealizations <em>Owned Exchange Item Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.OperationImpl#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends FeatureImpl implements Operation {
	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameters;

	/**
	 * The cached value of the '{@link #getOwnedOperationAllocation() <em>Owned Operation Allocation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationAllocation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationAllocation> ownedOperationAllocation;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItemRealizations() <em>Owned Exchange Item Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItemRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItemRealization> ownedExchangeItemRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		// TODO: implement this method to return the 'Abstract Typed Elements' reference list
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
	public EList<SequenceMessage> getInvokingSequenceMessages() {
		// TODO: implement this method to return the 'Invoking Sequence Messages' reference list
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
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, InformationPackage.OPERATION__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getAllocatingOperations() {
		// TODO: implement this method to return the 'Allocating Operations' reference list
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
	public EList<Operation> getAllocatedOperations() {
		// TODO: implement this method to return the 'Allocated Operations' reference list
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
	public EList<OperationAllocation> getOwnedOperationAllocation() {
		if (ownedOperationAllocation == null) {
			ownedOperationAllocation = new EObjectContainmentEList<OperationAllocation>(OperationAllocation.class, this, InformationPackage.OPERATION__OWNED_OPERATION_ALLOCATION);
		}
		return ownedOperationAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItemRealization> getOwnedExchangeItemRealizations() {
		if (ownedExchangeItemRealizations == null) {
			ownedExchangeItemRealizations = new EObjectContainmentEList<ExchangeItemRealization>(ExchangeItemRealization.class, this, InformationPackage.OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS);
		}
		return ownedExchangeItemRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItem> getRealizedExchangeItems() {
		// TODO: implement this method to return the 'Realized Exchange Items' reference list
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				return ((InternalEList<?>)getOwnedParameters()).basicRemove(otherEnd, msgs);
			case InformationPackage.OPERATION__OWNED_OPERATION_ALLOCATION:
				return ((InternalEList<?>)getOwnedOperationAllocation()).basicRemove(otherEnd, msgs);
			case InformationPackage.OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS:
				return ((InternalEList<?>)getOwnedExchangeItemRealizations()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.OPERATION__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case InformationPackage.OPERATION__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				return getOwnedParameters();
			case InformationPackage.OPERATION__ALLOCATING_OPERATIONS:
				return getAllocatingOperations();
			case InformationPackage.OPERATION__ALLOCATED_OPERATIONS:
				return getAllocatedOperations();
			case InformationPackage.OPERATION__OWNED_OPERATION_ALLOCATION:
				return getOwnedOperationAllocation();
			case InformationPackage.OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS:
				return getOwnedExchangeItemRealizations();
			case InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS:
				return getRealizedExchangeItems();
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case InformationPackage.OPERATION__OWNED_OPERATION_ALLOCATION:
				getOwnedOperationAllocation().clear();
				getOwnedOperationAllocation().addAll((Collection<? extends OperationAllocation>)newValue);
				return;
			case InformationPackage.OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS:
				getOwnedExchangeItemRealizations().clear();
				getOwnedExchangeItemRealizations().addAll((Collection<? extends ExchangeItemRealization>)newValue);
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
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case InformationPackage.OPERATION__OWNED_OPERATION_ALLOCATION:
				getOwnedOperationAllocation().clear();
				return;
			case InformationPackage.OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS:
				getOwnedExchangeItemRealizations().clear();
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
			case InformationPackage.OPERATION__ABSTRACT_TYPED_ELEMENTS:
				return !getAbstractTypedElements().isEmpty();
			case InformationPackage.OPERATION__INVOKING_SEQUENCE_MESSAGES:
				return !getInvokingSequenceMessages().isEmpty();
			case InformationPackage.OPERATION__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case InformationPackage.OPERATION__ALLOCATING_OPERATIONS:
				return !getAllocatingOperations().isEmpty();
			case InformationPackage.OPERATION__ALLOCATED_OPERATIONS:
				return !getAllocatedOperations().isEmpty();
			case InformationPackage.OPERATION__OWNED_OPERATION_ALLOCATION:
				return ownedOperationAllocation != null && !ownedOperationAllocation.isEmpty();
			case InformationPackage.OPERATION__OWNED_EXCHANGE_ITEM_REALIZATIONS:
				return ownedExchangeItemRealizations != null && !ownedExchangeItemRealizations.isEmpty();
			case InformationPackage.OPERATION__REALIZED_EXCHANGE_ITEMS:
				return !getRealizedExchangeItems().isEmpty();
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
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case InformationPackage.OPERATION__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
				case InformationPackage.OPERATION__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
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
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return InformationPackage.OPERATION__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.OPERATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationImpl
