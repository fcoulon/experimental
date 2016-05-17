/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.cs.AbstractPathInvolvedElement;
import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPathInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Path Involvement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathInvolvementImpl#getInvolver <em>Involver</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathInvolvementImpl#getInvolved <em>Involved</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathInvolvementImpl#getNextInvolvements <em>Next Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathInvolvementImpl#getPreviousInvolvements <em>Previous Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathInvolvementImpl#getInvolvedElement <em>Involved Element</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPathInvolvementImpl#getInvolvedComponent <em>Involved Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalPathInvolvementImpl extends RelationshipImpl implements PhysicalPathInvolvement {
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
	 * The cached value of the '{@link #getNextInvolvements() <em>Next Involvements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPathInvolvement> nextInvolvements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPathInvolvementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PATH_INVOLVEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER, oldInvolver, involver));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED, oldInvolved, involved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getNextInvolvements() {
		if (nextInvolvements == null) {
			nextInvolvements = new EObjectResolvingEList<PhysicalPathInvolvement>(PhysicalPathInvolvement.class, this, CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS);
		}
		return nextInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPathInvolvement> getPreviousInvolvements() {
		// TODO: implement this method to return the 'Previous Involvements' reference list
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
	public AbstractPathInvolvedElement getInvolvedElement() {
		AbstractPathInvolvedElement involvedElement = basicGetInvolvedElement();
		return involvedElement != null && involvedElement.eIsProxy() ? (AbstractPathInvolvedElement)eResolveProxy((InternalEObject)involvedElement) : involvedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPathInvolvedElement basicGetInvolvedElement() {
		// TODO: implement this method to return the 'Involved Element' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getInvolvedComponent() {
		Component involvedComponent = basicGetInvolvedComponent();
		return involvedComponent != null && involvedComponent.eIsProxy() ? (Component)eResolveProxy((InternalEObject)involvedComponent) : involvedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetInvolvedComponent() {
		// TODO: implement this method to return the 'Involved Component' reference
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER:
				if (resolve) return getInvolver();
				return basicGetInvolver();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				if (resolve) return getInvolved();
				return basicGetInvolved();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				return getNextInvolvements();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__PREVIOUS_INVOLVEMENTS:
				return getPreviousInvolvements();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				if (resolve) return getInvolvedElement();
				return basicGetInvolvedElement();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_COMPONENT:
				if (resolve) return getInvolvedComponent();
				return basicGetInvolvedComponent();
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)newValue);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				getNextInvolvements().clear();
				getNextInvolvements().addAll((Collection<? extends PhysicalPathInvolvement>)newValue);
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER:
				setInvolver((InvolverElement)null);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				setInvolved((InvolvedElement)null);
				return;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				getNextInvolvements().clear();
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
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVER:
				return involver != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED:
				return involved != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__NEXT_INVOLVEMENTS:
				return nextInvolvements != null && !nextInvolvements.isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__PREVIOUS_INVOLVEMENTS:
				return !getPreviousInvolvements().isEmpty();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_ELEMENT:
				return basicGetInvolvedElement() != null;
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT__INVOLVED_COMPONENT:
				return basicGetInvolvedComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalPathInvolvementImpl
