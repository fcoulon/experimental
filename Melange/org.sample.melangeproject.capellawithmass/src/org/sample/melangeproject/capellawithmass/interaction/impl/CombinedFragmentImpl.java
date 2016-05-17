/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.interaction.CombinedFragment;
import org.sample.melangeproject.capellawithmass.interaction.Gate;
import org.sample.melangeproject.capellawithmass.interaction.InteractionOperand;
import org.sample.melangeproject.capellawithmass.interaction.InteractionOperatorKind;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.CombinedFragmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.CombinedFragmentImpl#getReferencedOperands <em>Referenced Operands</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.CombinedFragmentImpl#getExpressionGates <em>Expression Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinedFragmentImpl extends AbstractFragmentImpl implements CombinedFragment {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final InteractionOperatorKind OPERATOR_EDEFAULT = InteractionOperatorKind.UNSET;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected InteractionOperatorKind operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedOperands() <em>Referenced Operands</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedOperands()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionOperand> referencedOperands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CombinedFragmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.COMBINED_FRAGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperatorKind getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(InteractionOperatorKind newOperator) {
		InteractionOperatorKind oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.COMBINED_FRAGMENT__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionOperand> getReferencedOperands() {
		if (referencedOperands == null) {
			referencedOperands = new EObjectResolvingEList<InteractionOperand>(InteractionOperand.class, this, InteractionPackage.COMBINED_FRAGMENT__REFERENCED_OPERANDS);
		}
		return referencedOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getExpressionGates() {
		// TODO: implement this method to return the 'Expression Gates' reference list
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
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				return getOperator();
			case InteractionPackage.COMBINED_FRAGMENT__REFERENCED_OPERANDS:
				return getReferencedOperands();
			case InteractionPackage.COMBINED_FRAGMENT__EXPRESSION_GATES:
				return getExpressionGates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				setOperator((InteractionOperatorKind)newValue);
				return;
			case InteractionPackage.COMBINED_FRAGMENT__REFERENCED_OPERANDS:
				getReferencedOperands().clear();
				getReferencedOperands().addAll((Collection<? extends InteractionOperand>)newValue);
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
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case InteractionPackage.COMBINED_FRAGMENT__REFERENCED_OPERANDS:
				getReferencedOperands().clear();
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
			case InteractionPackage.COMBINED_FRAGMENT__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case InteractionPackage.COMBINED_FRAGMENT__REFERENCED_OPERANDS:
				return referencedOperands != null && !referencedOperands.isEmpty();
			case InteractionPackage.COMBINED_FRAGMENT__EXPRESSION_GATES:
				return !getExpressionGates().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //CombinedFragmentImpl
