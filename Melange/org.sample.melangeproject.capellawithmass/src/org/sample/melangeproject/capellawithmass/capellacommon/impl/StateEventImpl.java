/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;
import org.sample.melangeproject.capellawithmass.capellacommon.StateEvent;
import org.sample.melangeproject.capellawithmass.capellacommon.StateEventRealization;

import org.sample.melangeproject.capellawithmass.capellacore.Constraint;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateEventImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateEventImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateEventImpl#getOwnedStateEventRealizations <em>Owned State Event Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StateEventImpl extends NamedElementImpl implements StateEvent {
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Constraint expression;

	/**
	 * The cached value of the '{@link #getOwnedStateEventRealizations() <em>Owned State Event Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateEventRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<StateEventRealization> ownedStateEventRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE_EVENT;
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
	public Constraint getExpression() {
		if (expression != null && expression.eIsProxy()) {
			InternalEObject oldExpression = (InternalEObject)expression;
			expression = (Constraint)eResolveProxy(oldExpression);
			if (expression != oldExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE_EVENT__EXPRESSION, oldExpression, expression));
			}
		}
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(Constraint newExpression) {
		Constraint oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE_EVENT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateEventRealization> getOwnedStateEventRealizations() {
		if (ownedStateEventRealizations == null) {
			ownedStateEventRealizations = new EObjectContainmentEList<StateEventRealization>(StateEventRealization.class, this, CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS);
		}
		return ownedStateEventRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedStateEventRealizations()).basicRemove(otherEnd, msgs);
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
			case CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				if (resolve) return getExpression();
				return basicGetExpression();
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				return getOwnedStateEventRealizations();
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
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				setExpression((Constraint)newValue);
				return;
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				getOwnedStateEventRealizations().clear();
				getOwnedStateEventRealizations().addAll((Collection<? extends StateEventRealization>)newValue);
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
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				setExpression((Constraint)null);
				return;
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				getOwnedStateEventRealizations().clear();
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
			case CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS:
				return !getAbstractTypedElements().isEmpty();
			case CapellacommonPackage.STATE_EVENT__EXPRESSION:
				return expression != null;
			case CapellacommonPackage.STATE_EVENT__OWNED_STATE_EVENT_REALIZATIONS:
				return ownedStateEventRealizations != null && !ownedStateEventRealizations.isEmpty();
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
				case CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
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
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return CapellacommonPackage.STATE_EVENT__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StateEventImpl
