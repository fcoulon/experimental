/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractStringValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;
import org.sample.melangeproject.capellawithmass.information.datavalue.StringReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.StringReferenceImpl#getReferencedValue <em>Referenced Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.StringReferenceImpl#getReferencedProperty <em>Referenced Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringReferenceImpl extends AbstractStringValueImpl implements StringReference {
	/**
	 * The cached value of the '{@link #getReferencedValue() <em>Referenced Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringValue referencedValue;

	/**
	 * The cached value of the '{@link #getReferencedProperty() <em>Referenced Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedProperty()
	 * @generated
	 * @ordered
	 */
	protected Property referencedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.STRING_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringValue getReferencedValue() {
		if (referencedValue != null && referencedValue.eIsProxy()) {
			InternalEObject oldReferencedValue = (InternalEObject)referencedValue;
			referencedValue = (AbstractStringValue)eResolveProxy(oldReferencedValue);
			if (referencedValue != oldReferencedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.STRING_REFERENCE__REFERENCED_VALUE, oldReferencedValue, referencedValue));
			}
		}
		return referencedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringValue basicGetReferencedValue() {
		return referencedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedValue(AbstractStringValue newReferencedValue) {
		AbstractStringValue oldReferencedValue = referencedValue;
		referencedValue = newReferencedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.STRING_REFERENCE__REFERENCED_VALUE, oldReferencedValue, referencedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getReferencedProperty() {
		if (referencedProperty != null && referencedProperty.eIsProxy()) {
			InternalEObject oldReferencedProperty = (InternalEObject)referencedProperty;
			referencedProperty = (Property)eResolveProxy(oldReferencedProperty);
			if (referencedProperty != oldReferencedProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.STRING_REFERENCE__REFERENCED_PROPERTY, oldReferencedProperty, referencedProperty));
			}
		}
		return referencedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetReferencedProperty() {
		return referencedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedProperty(Property newReferencedProperty) {
		Property oldReferencedProperty = referencedProperty;
		referencedProperty = newReferencedProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.STRING_REFERENCE__REFERENCED_PROPERTY, oldReferencedProperty, referencedProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_VALUE:
				if (resolve) return getReferencedValue();
				return basicGetReferencedValue();
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_PROPERTY:
				if (resolve) return getReferencedProperty();
				return basicGetReferencedProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_VALUE:
				setReferencedValue((AbstractStringValue)newValue);
				return;
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_PROPERTY:
				setReferencedProperty((Property)newValue);
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
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_VALUE:
				setReferencedValue((AbstractStringValue)null);
				return;
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_PROPERTY:
				setReferencedProperty((Property)null);
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
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_VALUE:
				return referencedValue != null;
			case DatavaluePackage.STRING_REFERENCE__REFERENCED_PROPERTY:
				return referencedProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //StringReferenceImpl
