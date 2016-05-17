/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;
import org.sample.melangeproject.capellawithmass.capellacommon.Region;
import org.sample.melangeproject.capellawithmass.capellacommon.State;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChain;

import org.sample.melangeproject.capellawithmass.interaction.AbstractCapability;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getOwnedRegions <em>Owned Regions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getAvailableAbstractFunctions <em>Available Abstract Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getAvailableFunctionalChains <em>Available Functional Chains</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getAvailableAbstractCapabilities <em>Available Abstract Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends AbstractStateImpl implements State {
	/**
	 * The cached value of the '{@link #getOwnedRegions() <em>Owned Regions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRegions()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> ownedRegions;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected AbstractEvent entry;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected AbstractEvent doActivity;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected AbstractEvent exit;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstraint stateInvariant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacommonPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getOwnedRegions() {
		if (ownedRegions == null) {
			ownedRegions = new EObjectContainmentEList<Region>(Region.class, this, CapellacommonPackage.STATE__OWNED_REGIONS);
		}
		return ownedRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFunction> getAvailableAbstractFunctions() {
		// TODO: implement this method to return the 'Available Abstract Functions' reference list
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
	public EList<FunctionalChain> getAvailableFunctionalChains() {
		// TODO: implement this method to return the 'Available Functional Chains' reference list
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
	public EList<AbstractCapability> getAvailableAbstractCapabilities() {
		// TODO: implement this method to return the 'Available Abstract Capabilities' reference list
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
	public AbstractEvent getEntry() {
		if (entry != null && entry.eIsProxy()) {
			InternalEObject oldEntry = (InternalEObject)entry;
			entry = (AbstractEvent)eResolveProxy(oldEntry);
			if (entry != oldEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE__ENTRY, oldEntry, entry));
			}
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent basicGetEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(AbstractEvent newEntry) {
		AbstractEvent oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE__ENTRY, oldEntry, entry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent getDoActivity() {
		if (doActivity != null && doActivity.eIsProxy()) {
			InternalEObject oldDoActivity = (InternalEObject)doActivity;
			doActivity = (AbstractEvent)eResolveProxy(oldDoActivity);
			if (doActivity != oldDoActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE__DO_ACTIVITY, oldDoActivity, doActivity));
			}
		}
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent basicGetDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(AbstractEvent newDoActivity) {
		AbstractEvent oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE__DO_ACTIVITY, oldDoActivity, doActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent getExit() {
		if (exit != null && exit.eIsProxy()) {
			InternalEObject oldExit = (InternalEObject)exit;
			exit = (AbstractEvent)eResolveProxy(oldExit);
			if (exit != oldExit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacommonPackage.STATE__EXIT, oldExit, exit));
			}
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEvent basicGetExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(AbstractEvent newExit) {
		AbstractEvent oldExit = exit;
		exit = newExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE__EXIT, oldExit, exit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstraint getStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateInvariant(AbstractConstraint newStateInvariant, NotificationChain msgs) {
		AbstractConstraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE__STATE_INVARIANT, oldStateInvariant, newStateInvariant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(AbstractConstraint newStateInvariant) {
		if (newStateInvariant != stateInvariant) {
			NotificationChain msgs = null;
			if (stateInvariant != null)
				msgs = ((InternalEObject)stateInvariant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CapellacommonPackage.STATE__STATE_INVARIANT, null, msgs);
			if (newStateInvariant != null)
				msgs = ((InternalEObject)newStateInvariant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CapellacommonPackage.STATE__STATE_INVARIANT, null, msgs);
			msgs = basicSetStateInvariant(newStateInvariant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacommonPackage.STATE__STATE_INVARIANT, newStateInvariant, newStateInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				return ((InternalEList<?>)getOwnedRegions()).basicRemove(otherEnd, msgs);
			case CapellacommonPackage.STATE__STATE_INVARIANT:
				return basicSetStateInvariant(null, msgs);
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
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				return getOwnedRegions();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
				return getAvailableAbstractFunctions();
			case CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS:
				return getAvailableFunctionalChains();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
				return getAvailableAbstractCapabilities();
			case CapellacommonPackage.STATE__ENTRY:
				if (resolve) return getEntry();
				return basicGetEntry();
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				if (resolve) return getDoActivity();
				return basicGetDoActivity();
			case CapellacommonPackage.STATE__EXIT:
				if (resolve) return getExit();
				return basicGetExit();
			case CapellacommonPackage.STATE__STATE_INVARIANT:
				return getStateInvariant();
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
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				getOwnedRegions().clear();
				getOwnedRegions().addAll((Collection<? extends Region>)newValue);
				return;
			case CapellacommonPackage.STATE__ENTRY:
				setEntry((AbstractEvent)newValue);
				return;
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				setDoActivity((AbstractEvent)newValue);
				return;
			case CapellacommonPackage.STATE__EXIT:
				setExit((AbstractEvent)newValue);
				return;
			case CapellacommonPackage.STATE__STATE_INVARIANT:
				setStateInvariant((AbstractConstraint)newValue);
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
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				getOwnedRegions().clear();
				return;
			case CapellacommonPackage.STATE__ENTRY:
				setEntry((AbstractEvent)null);
				return;
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				setDoActivity((AbstractEvent)null);
				return;
			case CapellacommonPackage.STATE__EXIT:
				setExit((AbstractEvent)null);
				return;
			case CapellacommonPackage.STATE__STATE_INVARIANT:
				setStateInvariant((AbstractConstraint)null);
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
			case CapellacommonPackage.STATE__OWNED_REGIONS:
				return ownedRegions != null && !ownedRegions.isEmpty();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_FUNCTIONS:
				return !getAvailableAbstractFunctions().isEmpty();
			case CapellacommonPackage.STATE__AVAILABLE_FUNCTIONAL_CHAINS:
				return !getAvailableFunctionalChains().isEmpty();
			case CapellacommonPackage.STATE__AVAILABLE_ABSTRACT_CAPABILITIES:
				return !getAvailableAbstractCapabilities().isEmpty();
			case CapellacommonPackage.STATE__ENTRY:
				return entry != null;
			case CapellacommonPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
			case CapellacommonPackage.STATE__EXIT:
				return exit != null;
			case CapellacommonPackage.STATE__STATE_INVARIANT:
				return stateInvariant != null;
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
