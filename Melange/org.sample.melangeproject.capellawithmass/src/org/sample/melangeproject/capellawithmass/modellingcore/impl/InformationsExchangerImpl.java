/**
 */
package org.sample.melangeproject.capellawithmass.modellingcore.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.InformationsExchanger;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informations Exchanger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.impl.InformationsExchangerImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.impl.InformationsExchangerImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.impl.InformationsExchangerImpl#getInformationFlows <em>Information Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InformationsExchangerImpl extends ModelElementImpl implements InformationsExchanger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationsExchangerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModellingcorePackage.Literals.INFORMATIONS_EXCHANGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInformationFlow> getIncomingInformationFlows() {
		// TODO: implement this method to return the 'Incoming Information Flows' reference list
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
	public EList<AbstractInformationFlow> getOutgoingInformationFlows() {
		// TODO: implement this method to return the 'Outgoing Information Flows' reference list
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
	public EList<AbstractInformationFlow> getInformationFlows() {
		// TODO: implement this method to return the 'Information Flows' reference list
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
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
				return getInformationFlows();
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
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS:
				return !getIncomingInformationFlows().isEmpty();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS:
				return !getOutgoingInformationFlows().isEmpty();
			case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS:
				return !getInformationFlows().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationsExchangerImpl
