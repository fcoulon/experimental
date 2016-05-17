/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainImpl;

import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalCapability;
import org.sample.melangeproject.capellawithmass.oa.OperationalProcess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalProcessImpl#getInvolvingOperationalCapabilities <em>Involving Operational Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalProcessImpl extends FunctionalChainImpl implements OperationalProcess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalCapability> getInvolvingOperationalCapabilities() {
		// TODO: implement this method to return the 'Involving Operational Capabilities' reference list
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
			case OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES:
				return getInvolvingOperationalCapabilities();
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
			case OaPackage.OPERATIONAL_PROCESS__INVOLVING_OPERATIONAL_CAPABILITIES:
				return !getInvolvingOperationalCapabilities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalProcessImpl
