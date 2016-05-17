/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.information.datatype.Enumeration;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractEnumerationValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractEnumerationValueImpl#getEnumerationType <em>Enumeration Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractEnumerationValueImpl extends DataValueImpl implements AbstractEnumerationValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEnumerationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_ENUMERATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getEnumerationType() {
		Enumeration enumerationType = basicGetEnumerationType();
		return enumerationType != null && enumerationType.eIsProxy() ? (Enumeration)eResolveProxy((InternalEObject)enumerationType) : enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetEnumerationType() {
		// TODO: implement this method to return the 'Enumeration Type' reference
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
			case DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE:
				if (resolve) return getEnumerationType();
				return basicGetEnumerationType();
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
			case DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE:
				return basicGetEnumerationType() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractEnumerationValueImpl
