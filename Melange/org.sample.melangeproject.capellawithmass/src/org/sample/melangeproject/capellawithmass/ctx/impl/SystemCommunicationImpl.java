/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunication;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunicationHook;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemCommunicationImpl#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemCommunicationImpl extends RelationshipImpl implements SystemCommunication {
	/**
	 * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemCommunicationHook> ends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemCommunicationHook> getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList<SystemCommunicationHook>(SystemCommunicationHook.class, this, CtxPackage.SYSTEM_COMMUNICATION__ENDS);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_COMMUNICATION__ENDS:
				return ((InternalEList<?>)getEnds()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_COMMUNICATION__ENDS:
				return getEnds();
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
			case CtxPackage.SYSTEM_COMMUNICATION__ENDS:
				getEnds().clear();
				getEnds().addAll((Collection<? extends SystemCommunicationHook>)newValue);
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
			case CtxPackage.SYSTEM_COMMUNICATION__ENDS:
				getEnds().clear();
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
			case CtxPackage.SYSTEM_COMMUNICATION__ENDS:
				return ends != null && !ends.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemCommunicationImpl
