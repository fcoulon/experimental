/**
 */
package org.sample.melangeproject.capellawithmass.capellacore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Constraint;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractConstraint;
import org.sample.melangeproject.capellawithmass.modellingcore.ModelElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.ConstraintImpl#getConstrainedElements <em>Constrained Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.ConstraintImpl#getOwnedSpecification <em>Owned Specification</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.ConstraintImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintImpl extends NamedElementImpl implements Constraint {
	/**
	 * The cached value of the '{@link #getConstrainedElements() <em>Constrained Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> constrainedElements;

	/**
	 * The cached value of the '{@link #getOwnedSpecification() <em>Owned Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification ownedSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getConstrainedElements() {
		if (constrainedElements == null) {
			constrainedElements = new EObjectResolvingEList<ModelElement>(ModelElement.class, this, CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS);
		}
		return constrainedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getOwnedSpecification() {
		return ownedSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSpecification(ValueSpecification newOwnedSpecification, NotificationChain msgs) {
		ValueSpecification oldOwnedSpecification = ownedSpecification;
		ownedSpecification = newOwnedSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION, oldOwnedSpecification, newOwnedSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSpecification(ValueSpecification newOwnedSpecification) {
		if (newOwnedSpecification != ownedSpecification) {
			NotificationChain msgs = null;
			if (ownedSpecification != null)
				msgs = ((InternalEObject)ownedSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION, null, msgs);
			if (newOwnedSpecification != null)
				msgs = ((InternalEObject)newOwnedSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION, null, msgs);
			msgs = basicSetOwnedSpecification(newOwnedSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION, newOwnedSpecification, newOwnedSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement getContext() {
		ModelElement context = basicGetContext();
		return context != null && context.eIsProxy() ? (ModelElement)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement basicGetContext() {
		// TODO: implement this method to return the 'Context' reference
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION:
				return basicSetOwnedSpecification(null, msgs);
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
			case CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS:
				return getConstrainedElements();
			case CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION:
				return getOwnedSpecification();
			case CapellacorePackage.CONSTRAINT__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS:
				getConstrainedElements().clear();
				getConstrainedElements().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION:
				setOwnedSpecification((ValueSpecification)newValue);
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
			case CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS:
				getConstrainedElements().clear();
				return;
			case CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION:
				setOwnedSpecification((ValueSpecification)null);
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
			case CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS:
				return constrainedElements != null && !constrainedElements.isEmpty();
			case CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION:
				return ownedSpecification != null;
			case CapellacorePackage.CONSTRAINT__CONTEXT:
				return basicGetContext() != null;
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
		if (baseClass == AbstractConstraint.class) {
			switch (derivedFeatureID) {
				case CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS: return ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS;
				case CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION: return ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION;
				case CapellacorePackage.CONSTRAINT__CONTEXT: return ModellingcorePackage.ABSTRACT_CONSTRAINT__CONTEXT;
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
		if (baseClass == AbstractConstraint.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_CONSTRAINT__CONSTRAINED_ELEMENTS: return CapellacorePackage.CONSTRAINT__CONSTRAINED_ELEMENTS;
				case ModellingcorePackage.ABSTRACT_CONSTRAINT__OWNED_SPECIFICATION: return CapellacorePackage.CONSTRAINT__OWNED_SPECIFICATION;
				case ModellingcorePackage.ABSTRACT_CONSTRAINT__CONTEXT: return CapellacorePackage.CONSTRAINT__CONTEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstraintImpl
