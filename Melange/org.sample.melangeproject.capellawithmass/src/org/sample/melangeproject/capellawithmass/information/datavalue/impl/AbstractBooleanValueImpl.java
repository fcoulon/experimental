/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.information.datatype.BooleanType;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractBooleanValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Boolean Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractBooleanValueImpl#getBooleanType <em>Boolean Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractBooleanValueImpl extends DataValueImpl implements AbstractBooleanValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractBooleanValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_BOOLEAN_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType getBooleanType() {
		BooleanType booleanType = basicGetBooleanType();
		return booleanType != null && booleanType.eIsProxy() ? (BooleanType)eResolveProxy((InternalEObject)booleanType) : booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType basicGetBooleanType() {
		// TODO: implement this method to return the 'Boolean Type' reference
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
			case DatavaluePackage.ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE:
				if (resolve) return getBooleanType();
				return basicGetBooleanType();
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
			case DatavaluePackage.ABSTRACT_BOOLEAN_VALUE__BOOLEAN_TYPE:
				return basicGetBooleanType() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractBooleanValueImpl
