/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.interaction.AbstractCapability;
import org.sample.melangeproject.capellawithmass.interaction.AbstractCapabilityRealization;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Capability Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityRealizationImpl#getRealizedCapability <em>Realized Capability</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityRealizationImpl#getRealizingCapability <em>Realizing Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractCapabilityRealizationImpl extends AllocationImpl implements AbstractCapabilityRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCapabilityRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_CAPABILITY_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getRealizedCapability() {
		AbstractCapability realizedCapability = basicGetRealizedCapability();
		return realizedCapability != null && realizedCapability.eIsProxy() ? (AbstractCapability)eResolveProxy((InternalEObject)realizedCapability) : realizedCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetRealizedCapability() {
		// TODO: implement this method to return the 'Realized Capability' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getRealizingCapability() {
		AbstractCapability realizingCapability = basicGetRealizingCapability();
		return realizingCapability != null && realizingCapability.eIsProxy() ? (AbstractCapability)eResolveProxy((InternalEObject)realizingCapability) : realizingCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetRealizingCapability() {
		// TODO: implement this method to return the 'Realizing Capability' reference
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
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY:
				if (resolve) return getRealizedCapability();
				return basicGetRealizedCapability();
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY:
				if (resolve) return getRealizingCapability();
				return basicGetRealizingCapability();
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
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZED_CAPABILITY:
				return basicGetRealizedCapability() != null;
			case InteractionPackage.ABSTRACT_CAPABILITY_REALIZATION__REALIZING_CAPABILITY:
				return basicGetRealizingCapability() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractCapabilityRealizationImpl
