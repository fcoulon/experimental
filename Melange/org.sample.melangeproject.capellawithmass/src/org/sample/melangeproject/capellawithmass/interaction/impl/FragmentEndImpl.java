/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.interaction.AbstractFragment;
import org.sample.melangeproject.capellawithmass.interaction.FragmentEnd;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fragment End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.FragmentEndImpl#getAbstractFragment <em>Abstract Fragment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FragmentEndImpl extends InteractionFragmentImpl implements FragmentEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FragmentEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.FRAGMENT_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFragment getAbstractFragment() {
		AbstractFragment abstractFragment = basicGetAbstractFragment();
		return abstractFragment != null && abstractFragment.eIsProxy() ? (AbstractFragment)eResolveProxy((InternalEObject)abstractFragment) : abstractFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFragment basicGetAbstractFragment() {
		// TODO: implement this method to return the 'Abstract Fragment' reference
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
			case InteractionPackage.FRAGMENT_END__ABSTRACT_FRAGMENT:
				if (resolve) return getAbstractFragment();
				return basicGetAbstractFragment();
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
			case InteractionPackage.FRAGMENT_END__ABSTRACT_FRAGMENT:
				return basicGetAbstractFragment() != null;
		}
		return super.eIsSet(featureID);
	}

} //FragmentEndImpl
