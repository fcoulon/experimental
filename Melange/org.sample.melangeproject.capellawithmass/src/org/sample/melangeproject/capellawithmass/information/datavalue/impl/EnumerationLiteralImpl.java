/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;
import org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.EnumerationLiteralImpl#getDomainValue <em>Domain Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationLiteralImpl extends AbstractEnumerationValueImpl implements EnumerationLiteral {
	/**
	 * The cached value of the '{@link #getDomainValue() <em>Domain Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue domainValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationLiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ENUMERATION_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getDomainValue() {
		return domainValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainValue(DataValue newDomainValue, NotificationChain msgs) {
		DataValue oldDomainValue = domainValue;
		domainValue = newDomainValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE, oldDomainValue, newDomainValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainValue(DataValue newDomainValue) {
		if (newDomainValue != domainValue) {
			NotificationChain msgs = null;
			if (domainValue != null)
				msgs = ((InternalEObject)domainValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE, null, msgs);
			if (newDomainValue != null)
				msgs = ((InternalEObject)newDomainValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE, null, msgs);
			msgs = basicSetDomainValue(newDomainValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE, newDomainValue, newDomainValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE:
				return basicSetDomainValue(null, msgs);
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
			case DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE:
				return getDomainValue();
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
			case DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE:
				setDomainValue((DataValue)newValue);
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
			case DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE:
				setDomainValue((DataValue)null);
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
			case DatavaluePackage.ENUMERATION_LITERAL__DOMAIN_VALUE:
				return domainValue != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationLiteralImpl
