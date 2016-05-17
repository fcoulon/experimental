/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

import org.sample.melangeproject.capellawithmass.interaction.AbstractCapability;
import org.sample.melangeproject.capellawithmass.interaction.AbstractFunctionAbstractCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Function Abstract Capability Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.AbstractFunctionAbstractCapabilityInvolvementImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractFunctionAbstractCapabilityInvolvementImpl extends RelationshipImpl implements AbstractFunctionAbstractCapabilityInvolvement {
	/**
	 * The cached value of the '{@link #getInvolver() <em>Involver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolver()
	 * @generated
	 * @ordered
	 */
	protected InvolverElement involver;

	/**
	 * The cached value of the '{@link #getInvolved() <em>Involved</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolved()
	 * @generated
	 * @ordered
	 */
	protected InvolvedElement involved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFunctionAbstractCapabilityInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolverElement getInvolver() {
		if (involver != null && involver.eIsProxy()) {
			InternalEObject oldInvolver = (InternalEObject)involver;
			involver = (InvolverElement)eResolveProxy(oldInvolver);
			if (involver != oldInvolver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER, oldInvolver, involver));
			}
		}
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolverElement basicGetInvolver() {
		return involver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolver(InvolverElement newInvolver) {
		InvolverElement oldInvolver = involver;
		involver = newInvolver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER, oldInvolver, involver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement getInvolved() {
		if (involved != null && involved.eIsProxy()) {
			InternalEObject oldInvolved = (InternalEObject)involved;
			involved = (InvolvedElement)eResolveProxy(oldInvolved);
			if (involved != oldInvolved) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED, oldInvolved, involved));
			}
		}
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvolvedElement basicGetInvolved() {
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolved(InvolvedElement newInvolved) {
		InvolvedElement oldInvolved = involved;
		involved = newInvolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability getCapability() {
		AbstractCapability capability = basicGetCapability();
		return capability != null && capability.eIsProxy() ? (AbstractCapability)eResolveProxy((InternalEObject)capability) : capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCapability basicGetCapability() {
		// TODO: implement this method to return the 'Capability' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction getFunction() {
		AbstractFunction function = basicGetFunction();
		return function != null && function.eIsProxy() ? (AbstractFunction)eResolveProxy((InternalEObject)function) : function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFunction basicGetFunction() {
		// TODO: implement this method to return the 'Function' reference
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)newValue);
				return;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)newValue);
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)null);
				return;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)null);
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
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVER:
				return involver != null;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__INVOLVED:
				return involved != null;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__CAPABILITY:
				return basicGetCapability() != null;
			case InteractionPackage.ABSTRACT_FUNCTION_ABSTRACT_CAPABILITY_INVOLVEMENT__FUNCTION:
				return basicGetFunction() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFunctionAbstractCapabilityInvolvementImpl
