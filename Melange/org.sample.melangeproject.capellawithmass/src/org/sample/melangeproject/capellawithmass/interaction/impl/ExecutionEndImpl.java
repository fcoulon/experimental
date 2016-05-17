/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.interaction.Execution;
import org.sample.melangeproject.capellawithmass.interaction.ExecutionEnd;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ExecutionEndImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionEndImpl extends AbstractEndImpl implements ExecutionEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.EXECUTION_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution getExecution() {
		Execution execution = basicGetExecution();
		return execution != null && execution.eIsProxy() ? (Execution)eResolveProxy((InternalEObject)execution) : execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execution basicGetExecution() {
		// TODO: implement this method to return the 'Execution' reference
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
			case InteractionPackage.EXECUTION_END__EXECUTION:
				if (resolve) return getExecution();
				return basicGetExecution();
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
			case InteractionPackage.EXECUTION_END__EXECUTION:
				return basicGetExecution() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExecutionEndImpl
