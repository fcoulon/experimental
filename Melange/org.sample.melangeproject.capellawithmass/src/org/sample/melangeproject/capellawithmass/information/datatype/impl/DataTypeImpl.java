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

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValuePkg;
import org.sample.melangeproject.capellawithmass.capellacore.Structure;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl;

import org.sample.melangeproject.capellawithmass.information.InformationRealization;

import org.sample.melangeproject.capellawithmass.information.datatype.DataType;
import org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#isDiscrete <em>Discrete</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getNullValue <em>Null Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getOwnedInformationRealizations <em>Owned Information Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getRealizedDataTypes <em>Realized Data Types</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.datatype.impl.DataTypeImpl#getRealizingDataTypes <em>Realizing Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataTypeImpl extends GeneralizableElementImpl implements DataType {
	/**
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

	/**
	 * The cached value of the '{@link #getOwnedDataValues() <em>Owned Data Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DataValue> ownedDataValues;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCRETE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDiscrete() <em>Discrete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDiscrete()
	 * @generated
	 * @ordered
	 */
	protected boolean discrete = DISCRETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusive = MIN_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_INCLUSIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean maxInclusive = MAX_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedInformationRealizations() <em>Owned Information Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInformationRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationRealization> ownedInformationRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypePackage.Literals.DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataValue> getOwnedDataValues() {
		if (ownedDataValues == null) {
			ownedDataValues = new EObjectContainmentEList<DataValue>(DataValue.class, this, DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES);
		}
		return ownedDataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDiscrete() {
		return discrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscrete(boolean newDiscrete) {
		boolean oldDiscrete = discrete;
		discrete = newDiscrete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__DISCRETE, oldDiscrete, discrete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinInclusive() {
		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusive(boolean newMinInclusive) {
		boolean oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusive(boolean newMaxInclusive) {
		boolean oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatatypePackage.DATA_TYPE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getDefaultValue() {
		DataValue defaultValue = basicGetDefaultValue();
		return defaultValue != null && defaultValue.eIsProxy() ? (DataValue)eResolveProxy((InternalEObject)defaultValue) : defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue basicGetDefaultValue() {
		// TODO: implement this method to return the 'Default Value' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getNullValue() {
		DataValue nullValue = basicGetNullValue();
		return nullValue != null && nullValue.eIsProxy() ? (DataValue)eResolveProxy((InternalEObject)nullValue) : nullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue basicGetNullValue() {
		// TODO: implement this method to return the 'Null Value' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationRealization> getOwnedInformationRealizations() {
		if (ownedInformationRealizations == null) {
			ownedInformationRealizations = new EObjectContainmentEList<InformationRealization>(InformationRealization.class, this, DatatypePackage.DATA_TYPE__OWNED_INFORMATION_REALIZATIONS);
		}
		return ownedInformationRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getRealizedDataTypes() {
		// TODO: implement this method to return the 'Realized Data Types' reference list
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
	public EList<DataType> getRealizingDataTypes() {
		// TODO: implement this method to return the 'Realizing Data Types' reference list
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				return ((InternalEList<?>)getOwnedDataValues()).basicRemove(otherEnd, msgs);
			case DatatypePackage.DATA_TYPE__OWNED_INFORMATION_REALIZATIONS:
				return ((InternalEList<?>)getOwnedInformationRealizations()).basicRemove(otherEnd, msgs);
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				return getOwnedDataValues();
			case DatatypePackage.DATA_TYPE__FINAL:
				return isFinal();
			case DatatypePackage.DATA_TYPE__DISCRETE:
				return isDiscrete();
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				return isMinInclusive();
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				return isMaxInclusive();
			case DatatypePackage.DATA_TYPE__PATTERN:
				return getPattern();
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				return getVisibility();
			case DatatypePackage.DATA_TYPE__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
			case DatatypePackage.DATA_TYPE__NULL_VALUE:
				if (resolve) return getNullValue();
				return basicGetNullValue();
			case DatatypePackage.DATA_TYPE__OWNED_INFORMATION_REALIZATIONS:
				return getOwnedInformationRealizations();
			case DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES:
				return getRealizedDataTypes();
			case DatatypePackage.DATA_TYPE__REALIZING_DATA_TYPES:
				return getRealizingDataTypes();
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				getOwnedDataValues().addAll((Collection<? extends DataValue>)newValue);
				return;
			case DatatypePackage.DATA_TYPE__FINAL:
				setFinal((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__DISCRETE:
				setDiscrete((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				setMinInclusive((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				setMaxInclusive((Boolean)newValue);
				return;
			case DatatypePackage.DATA_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case DatatypePackage.DATA_TYPE__OWNED_INFORMATION_REALIZATIONS:
				getOwnedInformationRealizations().clear();
				getOwnedInformationRealizations().addAll((Collection<? extends InformationRealization>)newValue);
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				return;
			case DatatypePackage.DATA_TYPE__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__DISCRETE:
				setDiscrete(DISCRETE_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case DatatypePackage.DATA_TYPE__OWNED_INFORMATION_REALIZATIONS:
				getOwnedInformationRealizations().clear();
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
			case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES:
				return ownedDataValues != null && !ownedDataValues.isEmpty();
			case DatatypePackage.DATA_TYPE__FINAL:
				return final_ != FINAL_EDEFAULT;
			case DatatypePackage.DATA_TYPE__DISCRETE:
				return discrete != DISCRETE_EDEFAULT;
			case DatatypePackage.DATA_TYPE__MIN_INCLUSIVE:
				return minInclusive != MIN_INCLUSIVE_EDEFAULT;
			case DatatypePackage.DATA_TYPE__MAX_INCLUSIVE:
				return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
			case DatatypePackage.DATA_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case DatatypePackage.DATA_TYPE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case DatatypePackage.DATA_TYPE__DEFAULT_VALUE:
				return basicGetDefaultValue() != null;
			case DatatypePackage.DATA_TYPE__NULL_VALUE:
				return basicGetNullValue() != null;
			case DatatypePackage.DATA_TYPE__OWNED_INFORMATION_REALIZATIONS:
				return ownedInformationRealizations != null && !ownedInformationRealizations.isEmpty();
			case DatatypePackage.DATA_TYPE__REALIZED_DATA_TYPES:
				return !getRealizedDataTypes().isEmpty();
			case DatatypePackage.DATA_TYPE__REALIZING_DATA_TYPES:
				return !getRealizingDataTypes().isEmpty();
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
		if (baseClass == Structure.class) {
			switch (derivedFeatureID) {
				case DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS: return CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (derivedFeatureID) {
				case DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES: return DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (derivedFeatureID) {
				case DatatypePackage.DATA_TYPE__FINAL: return ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
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
		if (baseClass == Structure.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS: return DatatypePackage.DATA_TYPE__OWNED_PROPERTY_VALUE_PKGS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES: return DatatypePackage.DATA_TYPE__OWNED_DATA_VALUES;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL: return DatatypePackage.DATA_TYPE__FINAL;
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
		result.append(" (final: ");
		result.append(final_);
		result.append(", discrete: ");
		result.append(discrete);
		result.append(", minInclusive: ");
		result.append(minInclusive);
		result.append(", maxInclusive: ");
		result.append(maxInclusive);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
