/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.Classifier;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractComplexValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Complex Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractComplexValueImpl#getComplexType <em>Complex Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComplexValueImpl extends DataValueImpl implements AbstractComplexValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComplexValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_COMPLEX_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getComplexType() {
		Classifier complexType = basicGetComplexType();
		return complexType != null && complexType.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)complexType) : complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetComplexType() {
		// TODO: implement this method to return the 'Complex Type' reference
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
			case DatavaluePackage.ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE:
				if (resolve) return getComplexType();
				return basicGetComplexType();
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
			case DatavaluePackage.ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE:
				return basicGetComplexType() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractComplexValueImpl
