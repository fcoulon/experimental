/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;
import org.sample.melangeproject.capellawithmass.interaction.Scenario;
import org.sample.melangeproject.capellawithmass.interaction.ScenarioRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioRealizationImpl#getRealizedScenario <em>Realized Scenario</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioRealizationImpl#getRealizingScenario <em>Realizing Scenario</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioRealizationImpl extends AllocationImpl implements ScenarioRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.SCENARIO_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getRealizedScenario() {
		Scenario realizedScenario = basicGetRealizedScenario();
		return realizedScenario != null && realizedScenario.eIsProxy() ? (Scenario)eResolveProxy((InternalEObject)realizedScenario) : realizedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetRealizedScenario() {
		// TODO: implement this method to return the 'Realized Scenario' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getRealizingScenario() {
		Scenario realizingScenario = basicGetRealizingScenario();
		return realizingScenario != null && realizingScenario.eIsProxy() ? (Scenario)eResolveProxy((InternalEObject)realizingScenario) : realizingScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetRealizingScenario() {
		// TODO: implement this method to return the 'Realizing Scenario' reference
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
			case InteractionPackage.SCENARIO_REALIZATION__REALIZED_SCENARIO:
				if (resolve) return getRealizedScenario();
				return basicGetRealizedScenario();
			case InteractionPackage.SCENARIO_REALIZATION__REALIZING_SCENARIO:
				if (resolve) return getRealizingScenario();
				return basicGetRealizingScenario();
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
			case InteractionPackage.SCENARIO_REALIZATION__REALIZED_SCENARIO:
				return basicGetRealizedScenario() != null;
			case InteractionPackage.SCENARIO_REALIZATION__REALIZING_SCENARIO:
				return basicGetRealizingScenario() != null;
		}
		return super.eIsSet(featureID);
	}

} //ScenarioRealizationImpl
