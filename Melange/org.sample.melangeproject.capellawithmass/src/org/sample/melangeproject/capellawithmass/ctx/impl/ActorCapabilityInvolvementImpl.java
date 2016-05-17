/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.ActorCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.Capability;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Capability Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorCapabilityInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorCapabilityInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorCapabilityInvolvementImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.ActorCapabilityInvolvementImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorCapabilityInvolvementImpl extends RelationshipImpl implements ActorCapabilityInvolvement {
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
	protected ActorCapabilityInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.ACTOR_CAPABILITY_INVOLVEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVED, oldInvolved, involved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getActor() {
		Actor actor = basicGetActor();
		return actor != null && actor.eIsProxy() ? (Actor)eResolveProxy((InternalEObject)actor) : actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActor() {
		// TODO: implement this method to return the 'Actor' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability getCapability() {
		Capability capability = basicGetCapability();
		return capability != null && capability.eIsProxy() ? (Capability)eResolveProxy((InternalEObject)capability) : capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability basicGetCapability() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__CAPABILITY:
				if (resolve) return getCapability();
				return basicGetCapability();
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
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)newValue);
				return;
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVED:
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
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)null);
				return;
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVED:
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
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVER:
				return involver != null;
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__INVOLVED:
				return involved != null;
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__ACTOR:
				return basicGetActor() != null;
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT__CAPABILITY:
				return basicGetCapability() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActorCapabilityInvolvementImpl
