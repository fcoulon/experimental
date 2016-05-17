/**
 */
package org.sample.melangeproject.capellawithmass.information.datatype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.information.datatype.DataType;
import org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage;
import org.sample.melangeproject.capellawithmass.information.datatype.Enumeration;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractEnumerationValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.EnumerationImpl#getOwnedLiterals <em>Owned Literals</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.EnumerationImpl#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.EnumerationImpl#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.EnumerationImpl#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.EnumerationImpl#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.EnumerationImpl#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends DataTypeImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getOwnedLiterals() <em>Owned Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> ownedLiterals;

	/**
	 * The cached value of the '{@link #getOwnedDefaultValue() <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractEnumerationValue ownedDefaultValue;

	/**
	 * The cached value of the '{@link #getOwnedNullValue() <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNullValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractEnumerationValue ownedNullValue;

	/**
	 * The cached value of the '{@link #getOwnedMinValue() <em>Owned Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractEnumerationValue ownedMinValue;

	/**
	 * The cached value of the '{@link #getOwnedMaxValue() <em>Owned Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxValue()
	 * @generated
	 * @ordered
	 */
	protected AbstractEnumerationValue ownedMaxValue;

	/**
	 * The cached value of the '{@link #getDomainType() <em>Domain Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainType()
	 * @generated
	 * @ordered
	 */
	protected DataType domainType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getOwnedLiterals() {
		if (ownedLiterals == null) {
			ownedLiterals = new EObjectContainmentEList<EnumerationLiteral>(EnumerationLiteral.class, this, DatatypePackage.ENUMERATION__OWNED_LITERALS);
		}
		return ownedLiterals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEnumerationValue getOwnedDefaultValue() {
		return ownedDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefaultValue(AbstractEnumerationValue newOwnedDefaultValue, NotificationChain msgs) {
		AbstractEnumerationValue oldOwnedDefaultValue = ownedDefaultValue;
		ownedDefaultValue = newOwnedDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE, oldOwnedDefaultValue, newOwnedDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefaultValue(AbstractEnumerationValue newOwnedDefaultValue) {
		if (newOwnedDefaultValue != ownedDefaultValue) {
			NotificationChain msgs = null;
			if (ownedDefaultValue != null)
				msgs = ((InternalEObject)ownedDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE, null, msgs);
			if (newOwnedDefaultValue != null)
				msgs = ((InternalEObject)newOwnedDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE, null, msgs);
			msgs = basicSetOwnedDefaultValue(newOwnedDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE, newOwnedDefaultValue, newOwnedDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEnumerationValue getOwnedNullValue() {
		return ownedNullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedNullValue(AbstractEnumerationValue newOwnedNullValue, NotificationChain msgs) {
		AbstractEnumerationValue oldOwnedNullValue = ownedNullValue;
		ownedNullValue = newOwnedNullValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_NULL_VALUE, oldOwnedNullValue, newOwnedNullValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedNullValue(AbstractEnumerationValue newOwnedNullValue) {
		if (newOwnedNullValue != ownedNullValue) {
			NotificationChain msgs = null;
			if (ownedNullValue != null)
				msgs = ((InternalEObject)ownedNullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_NULL_VALUE, null, msgs);
			if (newOwnedNullValue != null)
				msgs = ((InternalEObject)newOwnedNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_NULL_VALUE, null, msgs);
			msgs = basicSetOwnedNullValue(newOwnedNullValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_NULL_VALUE, newOwnedNullValue, newOwnedNullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEnumerationValue getOwnedMinValue() {
		return ownedMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMinValue(AbstractEnumerationValue newOwnedMinValue, NotificationChain msgs) {
		AbstractEnumerationValue oldOwnedMinValue = ownedMinValue;
		ownedMinValue = newOwnedMinValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_MIN_VALUE, oldOwnedMinValue, newOwnedMinValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMinValue(AbstractEnumerationValue newOwnedMinValue) {
		if (newOwnedMinValue != ownedMinValue) {
			NotificationChain msgs = null;
			if (ownedMinValue != null)
				msgs = ((InternalEObject)ownedMinValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_MIN_VALUE, null, msgs);
			if (newOwnedMinValue != null)
				msgs = ((InternalEObject)newOwnedMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_MIN_VALUE, null, msgs);
			msgs = basicSetOwnedMinValue(newOwnedMinValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_MIN_VALUE, newOwnedMinValue, newOwnedMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEnumerationValue getOwnedMaxValue() {
		return ownedMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMaxValue(AbstractEnumerationValue newOwnedMaxValue, NotificationChain msgs) {
		AbstractEnumerationValue oldOwnedMaxValue = ownedMaxValue;
		ownedMaxValue = newOwnedMaxValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_MAX_VALUE, oldOwnedMaxValue, newOwnedMaxValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMaxValue(AbstractEnumerationValue newOwnedMaxValue) {
		if (newOwnedMaxValue != ownedMaxValue) {
			NotificationChain msgs = null;
			if (ownedMaxValue != null)
				msgs = ((InternalEObject)ownedMaxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_MAX_VALUE, null, msgs);
			if (newOwnedMaxValue != null)
				msgs = ((InternalEObject)newOwnedMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatatypePackage.ENUMERATION__OWNED_MAX_VALUE, null, msgs);
			msgs = basicSetOwnedMaxValue(newOwnedMaxValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__OWNED_MAX_VALUE, newOwnedMaxValue, newOwnedMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDomainType() {
		if (domainType != null && domainType.eIsProxy()) {
			InternalEObject oldDomainType = (InternalEObject)domainType;
			domainType = (DataType)eResolveProxy(oldDomainType);
			if (domainType != oldDomainType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatatypePackage.ENUMERATION__DOMAIN_TYPE, oldDomainType, domainType));
			}
		}
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDomainType() {
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainType(DataType newDomainType) {
		DataType oldDomainType = domainType;
		domainType = newDomainType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.ENUMERATION__DOMAIN_TYPE, oldDomainType, domainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypePackage.ENUMERATION__OWNED_LITERALS:
				return ((InternalEList<?>)getOwnedLiterals()).basicRemove(otherEnd, msgs);
			case DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE:
				return basicSetOwnedDefaultValue(null, msgs);
			case DatatypePackage.ENUMERATION__OWNED_NULL_VALUE:
				return basicSetOwnedNullValue(null, msgs);
			case DatatypePackage.ENUMERATION__OWNED_MIN_VALUE:
				return basicSetOwnedMinValue(null, msgs);
			case DatatypePackage.ENUMERATION__OWNED_MAX_VALUE:
				return basicSetOwnedMaxValue(null, msgs);
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
			case DatatypePackage.ENUMERATION__OWNED_LITERALS:
				return getOwnedLiterals();
			case DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE:
				return getOwnedDefaultValue();
			case DatatypePackage.ENUMERATION__OWNED_NULL_VALUE:
				return getOwnedNullValue();
			case DatatypePackage.ENUMERATION__OWNED_MIN_VALUE:
				return getOwnedMinValue();
			case DatatypePackage.ENUMERATION__OWNED_MAX_VALUE:
				return getOwnedMaxValue();
			case DatatypePackage.ENUMERATION__DOMAIN_TYPE:
				if (resolve) return getDomainType();
				return basicGetDomainType();
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
			case DatatypePackage.ENUMERATION__OWNED_LITERALS:
				getOwnedLiterals().clear();
				getOwnedLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
				return;
			case DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((AbstractEnumerationValue)newValue);
				return;
			case DatatypePackage.ENUMERATION__OWNED_NULL_VALUE:
				setOwnedNullValue((AbstractEnumerationValue)newValue);
				return;
			case DatatypePackage.ENUMERATION__OWNED_MIN_VALUE:
				setOwnedMinValue((AbstractEnumerationValue)newValue);
				return;
			case DatatypePackage.ENUMERATION__OWNED_MAX_VALUE:
				setOwnedMaxValue((AbstractEnumerationValue)newValue);
				return;
			case DatatypePackage.ENUMERATION__DOMAIN_TYPE:
				setDomainType((DataType)newValue);
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
			case DatatypePackage.ENUMERATION__OWNED_LITERALS:
				getOwnedLiterals().clear();
				return;
			case DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((AbstractEnumerationValue)null);
				return;
			case DatatypePackage.ENUMERATION__OWNED_NULL_VALUE:
				setOwnedNullValue((AbstractEnumerationValue)null);
				return;
			case DatatypePackage.ENUMERATION__OWNED_MIN_VALUE:
				setOwnedMinValue((AbstractEnumerationValue)null);
				return;
			case DatatypePackage.ENUMERATION__OWNED_MAX_VALUE:
				setOwnedMaxValue((AbstractEnumerationValue)null);
				return;
			case DatatypePackage.ENUMERATION__DOMAIN_TYPE:
				setDomainType((DataType)null);
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
			case DatatypePackage.ENUMERATION__OWNED_LITERALS:
				return ownedLiterals != null && !ownedLiterals.isEmpty();
			case DatatypePackage.ENUMERATION__OWNED_DEFAULT_VALUE:
				return ownedDefaultValue != null;
			case DatatypePackage.ENUMERATION__OWNED_NULL_VALUE:
				return ownedNullValue != null;
			case DatatypePackage.ENUMERATION__OWNED_MIN_VALUE:
				return ownedMinValue != null;
			case DatatypePackage.ENUMERATION__OWNED_MAX_VALUE:
				return ownedMaxValue != null;
			case DatatypePackage.ENUMERATION__DOMAIN_TYPE:
				return domainType != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationImpl
