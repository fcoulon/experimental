/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.Classifier;

import org.sample.melangeproject.capellawithmass.information.Unit;

import org.sample.melangeproject.capellawithmass.information.datatype.DataType;
import org.sample.melangeproject.capellawithmass.information.datatype.Enumeration;
import org.sample.melangeproject.capellawithmass.information.datatype.NumericType;
import org.sample.melangeproject.capellawithmass.information.datatype.StringType;

import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractComplexValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractEnumerationValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractExpressionValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.AbstractStringValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;
import org.sample.melangeproject.capellawithmass.information.datavalue.NumericValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Expression Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getEnumerationType <em>Enumeration Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getNumericType <em>Numeric Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getStringType <em>String Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getUnparsedExpression <em>Unparsed Expression</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datavalue.impl.AbstractExpressionValueImpl#getExpressionType <em>Expression Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractExpressionValueImpl extends AbstractBooleanValueImpl implements AbstractExpressionValue {
	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected Unit unit;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUnparsedExpression() <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparsedExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String UNPARSED_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnparsedExpression() <em>Unparsed Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnparsedExpression()
	 * @generated
	 * @ordered
	 */
	protected String unparsedExpression = UNPARSED_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractExpressionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatavaluePackage.Literals.ABSTRACT_EXPRESSION_VALUE;
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
	public Unit getUnit() {
		if (unit != null && unit.eIsProxy()) {
			InternalEObject oldUnit = (InternalEObject)unit;
			unit = (Unit)eResolveProxy(oldUnit);
			if (unit != oldUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT, oldUnit, unit));
			}
		}
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit basicGetUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(Unit newUnit) {
		Unit oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType getNumericType() {
		NumericType numericType = basicGetNumericType();
		return numericType != null && numericType.eIsProxy() ? (NumericType)eResolveProxy((InternalEObject)numericType) : numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType basicGetNumericType() {
		// TODO: implement this method to return the 'Numeric Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public String getExpression() {
		// TODO: implement this method to return the 'Expression' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnparsedExpression() {
		return unparsedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnparsedExpression(String newUnparsedExpression) {
		String oldUnparsedExpression = unparsedExpression;
		unparsedExpression = newUnparsedExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION, oldUnparsedExpression, unparsedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getExpressionType() {
		DataType expressionType = basicGetExpressionType();
		return expressionType != null && expressionType.eIsProxy() ? (DataType)eResolveProxy((InternalEObject)expressionType) : expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetExpressionType() {
		// TODO: implement this method to return the 'Expression Type' reference
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE:
				if (resolve) return getComplexType();
				return basicGetComplexType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE:
				if (resolve) return getEnumerationType();
				return basicGetEnumerationType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				if (resolve) return getUnit();
				return basicGetUnit();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE:
				if (resolve) return getNumericType();
				return basicGetNumericType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE:
				if (resolve) return getStringType();
				return basicGetStringType();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				return getExpression();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				return getUnparsedExpression();
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION_TYPE:
				if (resolve) return getExpressionType();
				return basicGetExpressionType();
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				setUnit((Unit)newValue);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				setUnparsedExpression((String)newValue);
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				setUnit((Unit)null);
				return;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				setUnparsedExpression(UNPARSED_EXPRESSION_EDEFAULT);
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
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE:
				return basicGetComplexType() != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE:
				return basicGetEnumerationType() != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT:
				return unit != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE:
				return basicGetNumericType() != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE:
				return basicGetStringType() != null;
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? getExpression() != null : !EXPRESSION_EDEFAULT.equals(getExpression());
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNPARSED_EXPRESSION:
				return UNPARSED_EXPRESSION_EDEFAULT == null ? unparsedExpression != null : !UNPARSED_EXPRESSION_EDEFAULT.equals(unparsedExpression);
			case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__EXPRESSION_TYPE:
				return basicGetExpressionType() != null;
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
		if (baseClass == AbstractComplexValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE: return DatavaluePackage.ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractEnumerationValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE: return DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE;
				default: return -1;
			}
		}
		if (baseClass == NumericValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT: return DatavaluePackage.NUMERIC_VALUE__UNIT;
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE: return DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringValue.class) {
			switch (derivedFeatureID) {
				case DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE: return DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE;
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
		if (baseClass == AbstractComplexValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.ABSTRACT_COMPLEX_VALUE__COMPLEX_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__COMPLEX_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractEnumerationValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.ABSTRACT_ENUMERATION_VALUE__ENUMERATION_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__ENUMERATION_TYPE;
				default: return -1;
			}
		}
		if (baseClass == NumericValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.NUMERIC_VALUE__UNIT: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__UNIT;
				case DatavaluePackage.NUMERIC_VALUE__NUMERIC_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__NUMERIC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringValue.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.ABSTRACT_STRING_VALUE__STRING_TYPE: return DatavaluePackage.ABSTRACT_EXPRESSION_VALUE__STRING_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (unparsedExpression: ");
		result.append(unparsedExpression);
		result.append(')');
		return result.toString();
	}

} //AbstractExpressionValueImpl
