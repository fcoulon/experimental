/**
 */
package org.sample.melangeproject.capellawithmass.activity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;
import org.sample.melangeproject.capellawithmass.activity.ExceptionHandler;
import org.sample.melangeproject.capellawithmass.activity.ExecutableNode;
import org.sample.melangeproject.capellawithmass.activity.InterruptibleActivityRegion;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ExecutableNodeImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ExecutableNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ExecutableNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ExecutableNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ExecutableNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ExecutableNodeImpl#getOwnedHandlers <em>Owned Handlers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ExecutableNodeImpl extends AbstractNamedElementImpl implements ExecutableNode {
	/**
	 * The cached value of the '{@link #getOwnedHandlers() <em>Owned Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> ownedHandlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.EXECUTABLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getInActivityPartition() {
		ActivityPartition inActivityPartition = basicGetInActivityPartition();
		return inActivityPartition != null && inActivityPartition.eIsProxy() ? (ActivityPartition)eResolveProxy((InternalEObject)inActivityPartition) : inActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetInActivityPartition() {
		// TODO: implement this method to return the 'In Activity Partition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInInterruptibleRegion() {
		InterruptibleActivityRegion inInterruptibleRegion = basicGetInInterruptibleRegion();
		return inInterruptibleRegion != null && inInterruptibleRegion.eIsProxy() ? (InterruptibleActivityRegion)eResolveProxy((InternalEObject)inInterruptibleRegion) : inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInInterruptibleRegion() {
		// TODO: implement this method to return the 'In Interruptible Region' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInStructuredNode() {
		InterruptibleActivityRegion inStructuredNode = basicGetInStructuredNode();
		return inStructuredNode != null && inStructuredNode.eIsProxy() ? (InterruptibleActivityRegion)eResolveProxy((InternalEObject)inStructuredNode) : inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInStructuredNode() {
		// TODO: implement this method to return the 'In Structured Node' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		// TODO: implement this method to return the 'Outgoing' reference list
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
	public EList<ActivityEdge> getIncoming() {
		// TODO: implement this method to return the 'Incoming' reference list
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
	public EList<ExceptionHandler> getOwnedHandlers() {
		if (ownedHandlers == null) {
			ownedHandlers = new EObjectContainmentWithInverseEList<ExceptionHandler>(ExceptionHandler.class, this, ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS, ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE);
		}
		return ownedHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedHandlers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return ((InternalEList<?>)getOwnedHandlers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.EXECUTABLE_NODE__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case ActivityPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case ActivityPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case ActivityPackage.EXECUTABLE_NODE__OUTGOING:
				return getOutgoing();
			case ActivityPackage.EXECUTABLE_NODE__INCOMING:
				return getIncoming();
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return getOwnedHandlers();
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
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				getOwnedHandlers().clear();
				getOwnedHandlers().addAll((Collection<? extends ExceptionHandler>)newValue);
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
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				getOwnedHandlers().clear();
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
			case ActivityPackage.EXECUTABLE_NODE__IN_ACTIVITY_PARTITION:
				return basicGetInActivityPartition() != null;
			case ActivityPackage.EXECUTABLE_NODE__IN_INTERRUPTIBLE_REGION:
				return basicGetInInterruptibleRegion() != null;
			case ActivityPackage.EXECUTABLE_NODE__IN_STRUCTURED_NODE:
				return basicGetInStructuredNode() != null;
			case ActivityPackage.EXECUTABLE_NODE__OUTGOING:
				return !getOutgoing().isEmpty();
			case ActivityPackage.EXECUTABLE_NODE__INCOMING:
				return !getIncoming().isEmpty();
			case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS:
				return ownedHandlers != null && !ownedHandlers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExecutableNodeImpl
