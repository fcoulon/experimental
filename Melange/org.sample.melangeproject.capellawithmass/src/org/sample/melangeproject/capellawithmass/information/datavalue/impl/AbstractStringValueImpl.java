/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.information.datatype.StringType;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractStringValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract String Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractStringValueImpl#getStringType <em>String Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStringValueImpl extends DataValueImpl implements AbstractStringValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_STRING_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getStringType() {
		StringType stringType = basicGetStringType();
		return stringType != null && stringType.eIsProxy() ? (StringType)eResolveProxy((InternalEObject)stringType) : stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType basicGetStringType() {
		// TODO: implement this method to return the 'String Type' reference
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
			case DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE:
				if (resolve) return getStringType();
				return basicGetStringType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE:
				return basicGetStringType() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractStringValueImpl
