/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Realization Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.CapabilityRealizationInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.CapabilityRealizationInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.CapabilityRealizationInvolvementImpl#getInvolvedCapabilityRealizationInvolvedElement <em>Involved Capability Realization Involved Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CapabilityRealizationInvolvementImpl extends RelationshipImpl implements CapabilityRealizationInvolvement {
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
	protected CapabilityRealizationInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.CAPABILITY_REALIZATION_INVOLVEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED, oldInvolved, involved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationInvolvedElement getInvolvedCapabilityRealizationInvolvedElement() {
		CapabilityRealizationInvolvedElement involvedCapabilityRealizationInvolvedElement = basicGetInvolvedCapabilityRealizationInvolvedElement();
		return involvedCapabilityRealizationInvolvedElement != null && involvedCapabilityRealizationInvolvedElement.eIsProxy() ? (CapabilityRealizationInvolvedElement)eResolveProxy((InternalEObject)involvedCapabilityRealizationInvolvedElement) : involvedCapabilityRealizationInvolvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationInvolvedElement basicGetInvolvedCapabilityRealizationInvolvedElement() {
		// TODO: implement this method to return the 'Involved Capability Realization Involved Element' reference
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED_CAPABILITY_REALIZATION_INVOLVED_ELEMENT:
				if (resolve) return getInvolvedCapabilityRealizationInvolvedElement();
				return basicGetInvolvedCapabilityRealizationInvolvedElement();
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)newValue);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)null);
				return;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
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
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVER:
				return involver != null;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED:
				return involved != null;
			case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVEMENT__INVOLVED_CAPABILITY_REALIZATION_INVOLVED_ELEMENT:
				return basicGetInvolvedCapabilityRealizationInvolvedElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityRealizationInvolvementImpl
