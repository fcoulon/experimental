/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AllocationImpl;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Port;
import org.sample.melangeproject.capellawithmass.information.PortRealization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.PortRealizationImpl#getRealizedPort <em>Realized Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.PortRealizationImpl#getRealizingPort <em>Realizing Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortRealizationImpl extends AllocationImpl implements PortRealization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortRealizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PORT_REALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRealizedPort() {
		Port realizedPort = basicGetRealizedPort();
		return realizedPort != null && realizedPort.eIsProxy() ? (Port)eResolveProxy((InternalEObject)realizedPort) : realizedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetRealizedPort() {
		// TODO: implement this method to return the 'Realized Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getRealizingPort() {
		Port realizingPort = basicGetRealizingPort();
		return realizingPort != null && realizingPort.eIsProxy() ? (Port)eResolveProxy((InternalEObject)realizingPort) : realizingPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetRealizingPort() {
		// TODO: implement this method to return the 'Realizing Port' reference
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
			case InformationPackage.PORT_REALIZATION__REALIZED_PORT:
				if (resolve) return getRealizedPort();
				return basicGetRealizedPort();
			case InformationPackage.PORT_REALIZATION__REALIZING_PORT:
				if (resolve) return getRealizingPort();
				return basicGetRealizingPort();
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
			case InformationPackage.PORT_REALIZATION__REALIZED_PORT:
				return basicGetRealizedPort() != null;
			case InformationPackage.PORT_REALIZATION__REALIZING_PORT:
				return basicGetRealizingPort() != null;
		}
		return super.eIsSet(featureID);
	}

} //PortRealizationImpl
