/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChain;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChainReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Chain Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalChainReferenceImpl#getReferencedFunctionalChain <em>Referenced Functional Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalChainReferenceImpl extends FunctionalChainInvolvementImpl implements FunctionalChainReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalChainReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_CHAIN_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChain getReferencedFunctionalChain() {
		FunctionalChain referencedFunctionalChain = basicGetReferencedFunctionalChain();
		return referencedFunctionalChain != null && referencedFunctionalChain.eIsProxy() ? (FunctionalChain)eResolveProxy((InternalEObject)referencedFunctionalChain) : referencedFunctionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChain basicGetReferencedFunctionalChain() {
		// TODO: implement this method to return the 'Referenced Functional Chain' reference
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
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				if (resolve) return getReferencedFunctionalChain();
				return basicGetReferencedFunctionalChain();
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
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE__REFERENCED_FUNCTIONAL_CHAIN:
				return basicGetReferencedFunctionalChain() != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalChainReferenceImpl
