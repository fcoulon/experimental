/**
 */
package org.sample.melangeproject.capellawithmass.information.communication.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.StateMachine;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValuePkg;
import org.sample.melangeproject.capellawithmass.capellacore.Structure;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.capellacore.impl.ClassifierImpl;

import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationItem;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationItemImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationItemImpl#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationItemImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationItemImpl#getOwnedStateMachines <em>Owned State Machines</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationItemImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CommunicationItemImpl extends ClassifierImpl implements CommunicationItem {
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
	 * The cached value of the '{@link #getOwnedStateMachines() <em>Owned State Machines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedStateMachines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS);
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
			ownedDataValues = new EObjectContainmentEList<DataValue>(DataValue.class, this, CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES);
		}
		return ownedDataValues;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_ITEM__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getOwnedStateMachines() {
		if (ownedStateMachines == null) {
			ownedStateMachines = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, CommunicationPackage.COMMUNICATION_ITEM__OWNED_STATE_MACHINES);
		}
		return ownedStateMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		// TODO: implement this method to return the 'Properties' reference list
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
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES:
				return ((InternalEList<?>)getOwnedDataValues()).basicRemove(otherEnd, msgs);
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_STATE_MACHINES:
				return ((InternalEList<?>)getOwnedStateMachines()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES:
				return getOwnedDataValues();
			case CommunicationPackage.COMMUNICATION_ITEM__VISIBILITY:
				return getVisibility();
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_STATE_MACHINES:
				return getOwnedStateMachines();
			case CommunicationPackage.COMMUNICATION_ITEM__PROPERTIES:
				return getProperties();
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
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				getOwnedDataValues().addAll((Collection<? extends DataValue>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_ITEM__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
				getOwnedStateMachines().addAll((Collection<? extends StateMachine>)newValue);
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
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				return;
			case CommunicationPackage.COMMUNICATION_ITEM__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_STATE_MACHINES:
				getOwnedStateMachines().clear();
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
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES:
				return ownedDataValues != null && !ownedDataValues.isEmpty();
			case CommunicationPackage.COMMUNICATION_ITEM__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_ITEM__OWNED_STATE_MACHINES:
				return ownedStateMachines != null && !ownedStateMachines.isEmpty();
			case CommunicationPackage.COMMUNICATION_ITEM__PROPERTIES:
				return !getProperties().isEmpty();
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
				case CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS: return CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (derivedFeatureID) {
				case CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES: return DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES;
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
				case CapellacorePackage.STRUCTURE__OWNED_PROPERTY_VALUE_PKGS: return CommunicationPackage.COMMUNICATION_ITEM__OWNED_PROPERTY_VALUE_PKGS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES: return CommunicationPackage.COMMUNICATION_ITEM__OWNED_DATA_VALUES;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //CommunicationItemImpl
