/**
 */
package org.sample.melangeproject.capellawithmass.activity.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityExchange;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.AbstractInformationFlowImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityExchangeImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityExchangeImpl extends AbstractInformationFlowImpl implements ActivityExchange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRealizingActivityFlows() {
		// TODO: implement this method to return the 'Realizing Activity Flows' reference list
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
			case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
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
			case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return !getRealizingActivityFlows().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityExchangeImpl
