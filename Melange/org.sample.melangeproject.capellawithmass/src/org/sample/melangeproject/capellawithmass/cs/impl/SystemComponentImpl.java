/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Classifier;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;

import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.SystemComponent;
import org.sample.melangeproject.capellawithmass.cs.SystemComponentCapabilityRealizationInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl#getInvolvingCapabilityRealizationInvolvements <em>Involving Capability Realization Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl#isDataComponent <em>Data Component</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.SystemComponentImpl#getParticipationsInCapabilityRealizations <em>Participations In Capability Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SystemComponentImpl extends ComponentImpl implements SystemComponent {
	/**
	 * The default value of the '{@link #isDataComponent() <em>Data Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataComponent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATA_COMPONENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDataComponent() <em>Data Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataComponent()
	 * @generated
	 * @ordered
	 */
	protected boolean dataComponent = DATA_COMPONENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> dataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.SYSTEM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Involvement> getInvolvingInvolvements() {
		// TODO: implement this method to return the 'Involving Involvements' reference list
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
	public EList<CapabilityRealizationInvolvement> getInvolvingCapabilityRealizationInvolvements() {
		// TODO: implement this method to return the 'Involving Capability Realization Involvements' reference list
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
	public boolean isDataComponent() {
		return dataComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataComponent(boolean newDataComponent) {
		boolean oldDataComponent = dataComponent;
		dataComponent = newDataComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT, oldDataComponent, dataComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getDataType() {
		if (dataType == null) {
			dataType = new EObjectResolvingEList<Classifier>(Classifier.class, this, CsPackage.SYSTEM_COMPONENT__DATA_TYPE);
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemComponentCapabilityRealizationInvolvement> getParticipationsInCapabilityRealizations() {
		// TODO: implement this method to return the 'Participations In Capability Realizations' reference list
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return getInvolvingCapabilityRealizationInvolvements();
			case CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				return isDataComponent();
			case CsPackage.SYSTEM_COMPONENT__DATA_TYPE:
				return getDataType();
			case CsPackage.SYSTEM_COMPONENT__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
				return getParticipationsInCapabilityRealizations();
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
			case CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				setDataComponent((Boolean)newValue);
				return;
			case CsPackage.SYSTEM_COMPONENT__DATA_TYPE:
				getDataType().clear();
				getDataType().addAll((Collection<? extends Classifier>)newValue);
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
			case CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				setDataComponent(DATA_COMPONENT_EDEFAULT);
				return;
			case CsPackage.SYSTEM_COMPONENT__DATA_TYPE:
				getDataType().clear();
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
			case CsPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case CsPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return !getInvolvingCapabilityRealizationInvolvements().isEmpty();
			case CsPackage.SYSTEM_COMPONENT__DATA_COMPONENT:
				return dataComponent != DATA_COMPONENT_EDEFAULT;
			case CsPackage.SYSTEM_COMPONENT__DATA_TYPE:
				return dataType != null && !dataType.isEmpty();
			case CsPackage.SYSTEM_COMPONENT__PARTICIPATIONS_IN_CAPABILITY_REALIZATIONS:
				return !getParticipationsInCapabilityRealizations().isEmpty();
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
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS;
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
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.SYSTEM_COMPONENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS: return CsPackage.SYSTEM_COMPONENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS;
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
		result.append(" (dataComponent: ");
		result.append(dataComponent);
		result.append(')');
		return result.toString();
	}

} //SystemComponentImpl
