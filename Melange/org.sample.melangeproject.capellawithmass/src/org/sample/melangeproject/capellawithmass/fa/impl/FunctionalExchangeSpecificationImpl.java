/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeSpecificationImpl#getFunctionalExchanges <em>Functional Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalExchangeSpecificationImpl extends ExchangeSpecificationImpl implements FunctionalExchangeSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchange> getFunctionalExchanges() {
		// TODO: implement this method to return the 'Functional Exchanges' reference list
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
			case FaPackage.FUNCTIONAL_EXCHANGE_SPECIFICATION__FUNCTIONAL_EXCHANGES:
				return getFunctionalExchanges();
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
			case FaPackage.FUNCTIONAL_EXCHANGE_SPECIFICATION__FUNCTIONAL_EXCHANGES:
				return !getFunctionalExchanges().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalExchangeSpecificationImpl
