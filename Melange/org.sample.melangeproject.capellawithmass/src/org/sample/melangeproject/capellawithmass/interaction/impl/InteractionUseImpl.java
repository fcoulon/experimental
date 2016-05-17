/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.interaction.Gate;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;
import org.sample.melangeproject.capellawithmass.interaction.InteractionUse;
import org.sample.melangeproject.capellawithmass.interaction.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InteractionUseImpl#getReferencedScenario <em>Referenced Scenario</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.InteractionUseImpl#getActualGates <em>Actual Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionUseImpl extends AbstractFragmentImpl implements InteractionUse {
	/**
	 * The cached value of the '{@link #getReferencedScenario() <em>Referenced Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedScenario()
	 * @generated
	 * @ordered
	 */
	protected Scenario referencedScenario;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.INTERACTION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario getReferencedScenario() {
		if (referencedScenario != null && referencedScenario.eIsProxy()) {
			InternalEObject oldReferencedScenario = (InternalEObject)referencedScenario;
			referencedScenario = (Scenario)eResolveProxy(oldReferencedScenario);
			if (referencedScenario != oldReferencedScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO, oldReferencedScenario, referencedScenario));
			}
		}
		return referencedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario basicGetReferencedScenario() {
		return referencedScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedScenario(Scenario newReferencedScenario) {
		Scenario oldReferencedScenario = referencedScenario;
		referencedScenario = newReferencedScenario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO, oldReferencedScenario, referencedScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getActualGates() {
		// TODO: implement this method to return the 'Actual Gates' reference list
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
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				if (resolve) return getReferencedScenario();
				return basicGetReferencedScenario();
			case InteractionPackage.INTERACTION_USE__ACTUAL_GATES:
				return getActualGates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				setReferencedScenario((Scenario)newValue);
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
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				setReferencedScenario((Scenario)null);
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
			case InteractionPackage.INTERACTION_USE__REFERENCED_SCENARIO:
				return referencedScenario != null;
			case InteractionPackage.INTERACTION_USE__ACTUAL_GATES:
				return !getActualGates().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionUseImpl
