/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;
import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.KeyValue;

import org.sample.melangeproject.capellawithmass.capellacore.impl.TraceImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.GenericTraceImpl#getKeyValuePairs <em>Key Value Pairs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.GenericTraceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.GenericTraceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTraceImpl extends TraceImpl implements GenericTrace {
	/**
	 * The cached value of the '{@link #getKeyValuePairs() <em>Key Value Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValuePairs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValue> keyValuePairs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.GENERIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyValue> getKeyValuePairs() {
		if (keyValuePairs == null) {
			keyValuePairs = new EObjectContainmentEList<KeyValue>(KeyValue.class, this, CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS);
		}
		return keyValuePairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement getSource() {
		// TODO: implement this method to return the 'Source' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement getTarget() {
		// TODO: implement this method to return the 'Target' reference
		// Ensure that you remove @generated or mark it @generated NOT
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				return ((InternalEList<?>)getKeyValuePairs()).basicRemove(otherEnd, msgs);
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				return getKeyValuePairs();
			case CapellacommonPackage.GENERIC_TRACE__SOURCE:
				return getSource();
			case CapellacommonPackage.GENERIC_TRACE__TARGET:
				return getTarget();
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				getKeyValuePairs().clear();
				getKeyValuePairs().addAll((Collection<? extends KeyValue>)newValue);
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				getKeyValuePairs().clear();
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
			case CapellacommonPackage.GENERIC_TRACE__KEY_VALUE_PAIRS:
				return keyValuePairs != null && !keyValuePairs.isEmpty();
			case CapellacommonPackage.GENERIC_TRACE__SOURCE:
				return getSource() != null;
			case CapellacommonPackage.GENERIC_TRACE__TARGET:
				return getTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //GenericTraceImpl
