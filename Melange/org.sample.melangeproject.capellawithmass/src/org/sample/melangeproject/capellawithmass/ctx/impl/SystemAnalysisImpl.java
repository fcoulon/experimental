/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.impl.ComponentArchitectureImpl;

import org.sample.melangeproject.capellawithmass.ctx.ActorPkg;
import org.sample.melangeproject.capellawithmass.ctx.CapabilityPkg;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.MissionPkg;
import org.sample.melangeproject.capellawithmass.ctx.OperationalAnalysisRealization;
import org.sample.melangeproject.capellawithmass.ctx.SystemAnalysis;
import org.sample.melangeproject.capellawithmass.ctx.SystemContext;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunctionPkg;

import org.sample.melangeproject.capellawithmass.la.LogicalArchitecture;

import org.sample.melangeproject.capellawithmass.oa.OperationalAnalysis;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getOwnedSystemContext <em>Owned System Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getOwnedSystem <em>Owned System</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getOwnedActorPkg <em>Owned Actor Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getOwnedMissionPkg <em>Owned Mission Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getContainedCapabilityPkg <em>Contained Capability Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getContainedSystemFunctionPkg <em>Contained System Function Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getOwnedOperationalAnalysisRealizations <em>Owned Operational Analysis Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getAllocatedOperationalAnalysisRealizations <em>Allocated Operational Analysis Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getAllocatedOperationalAnalyses <em>Allocated Operational Analyses</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemAnalysisImpl#getAllocatingLogicalArchitectures <em>Allocating Logical Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemAnalysisImpl extends ComponentArchitectureImpl implements SystemAnalysis {
	/**
	 * The cached value of the '{@link #getOwnedSystemContext() <em>Owned System Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemContext()
	 * @generated
	 * @ordered
	 */
	protected SystemContext ownedSystemContext;

	/**
	 * The cached value of the '{@link #getOwnedSystem() <em>Owned System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystem()
	 * @generated
	 * @ordered
	 */
	protected org.sample.melangeproject.capellawithmass.ctx.System ownedSystem;

	/**
	 * The cached value of the '{@link #getOwnedActorPkg() <em>Owned Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorPkg()
	 * @generated
	 * @ordered
	 */
	protected ActorPkg ownedActorPkg;

	/**
	 * The cached value of the '{@link #getOwnedMissionPkg() <em>Owned Mission Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMissionPkg()
	 * @generated
	 * @ordered
	 */
	protected MissionPkg ownedMissionPkg;

	/**
	 * The cached value of the '{@link #getOwnedOperationalAnalysisRealizations() <em>Owned Operational Analysis Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalAnalysisRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalAnalysisRealization> ownedOperationalAnalysisRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext getOwnedSystemContext() {
		return ownedSystemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystemContext(SystemContext newOwnedSystemContext, NotificationChain msgs) {
		SystemContext oldOwnedSystemContext = ownedSystemContext;
		ownedSystemContext = newOwnedSystemContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, oldOwnedSystemContext, newOwnedSystemContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystemContext(SystemContext newOwnedSystemContext) {
		if (newOwnedSystemContext != ownedSystemContext) {
			NotificationChain msgs = null;
			if (ownedSystemContext != null)
				msgs = ((InternalEObject)ownedSystemContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, null, msgs);
			if (newOwnedSystemContext != null)
				msgs = ((InternalEObject)newOwnedSystemContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, null, msgs);
			msgs = basicSetOwnedSystemContext(newOwnedSystemContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT, newOwnedSystemContext, newOwnedSystemContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.sample.melangeproject.capellawithmass.ctx.System getOwnedSystem() {
		return ownedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystem(org.sample.melangeproject.capellawithmass.ctx.System newOwnedSystem, NotificationChain msgs) {
		org.sample.melangeproject.capellawithmass.ctx.System oldOwnedSystem = ownedSystem;
		ownedSystem = newOwnedSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, oldOwnedSystem, newOwnedSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystem(org.sample.melangeproject.capellawithmass.ctx.System newOwnedSystem) {
		if (newOwnedSystem != ownedSystem) {
			NotificationChain msgs = null;
			if (ownedSystem != null)
				msgs = ((InternalEObject)ownedSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, null, msgs);
			if (newOwnedSystem != null)
				msgs = ((InternalEObject)newOwnedSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, null, msgs);
			msgs = basicSetOwnedSystem(newOwnedSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM, newOwnedSystem, newOwnedSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorPkg getOwnedActorPkg() {
		return ownedActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedActorPkg(ActorPkg newOwnedActorPkg, NotificationChain msgs) {
		ActorPkg oldOwnedActorPkg = ownedActorPkg;
		ownedActorPkg = newOwnedActorPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, oldOwnedActorPkg, newOwnedActorPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedActorPkg(ActorPkg newOwnedActorPkg) {
		if (newOwnedActorPkg != ownedActorPkg) {
			NotificationChain msgs = null;
			if (ownedActorPkg != null)
				msgs = ((InternalEObject)ownedActorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, null, msgs);
			if (newOwnedActorPkg != null)
				msgs = ((InternalEObject)newOwnedActorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, null, msgs);
			msgs = basicSetOwnedActorPkg(newOwnedActorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG, newOwnedActorPkg, newOwnedActorPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg getOwnedMissionPkg() {
		return ownedMissionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMissionPkg(MissionPkg newOwnedMissionPkg, NotificationChain msgs) {
		MissionPkg oldOwnedMissionPkg = ownedMissionPkg;
		ownedMissionPkg = newOwnedMissionPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, oldOwnedMissionPkg, newOwnedMissionPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMissionPkg(MissionPkg newOwnedMissionPkg) {
		if (newOwnedMissionPkg != ownedMissionPkg) {
			NotificationChain msgs = null;
			if (ownedMissionPkg != null)
				msgs = ((InternalEObject)ownedMissionPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
			if (newOwnedMissionPkg != null)
				msgs = ((InternalEObject)newOwnedMissionPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, null, msgs);
			msgs = basicSetOwnedMissionPkg(newOwnedMissionPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG, newOwnedMissionPkg, newOwnedMissionPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg getContainedCapabilityPkg() {
		CapabilityPkg containedCapabilityPkg = basicGetContainedCapabilityPkg();
		return containedCapabilityPkg != null && containedCapabilityPkg.eIsProxy() ? (CapabilityPkg)eResolveProxy((InternalEObject)containedCapabilityPkg) : containedCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg basicGetContainedCapabilityPkg() {
		// TODO: implement this method to return the 'Contained Capability Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg getContainedSystemFunctionPkg() {
		SystemFunctionPkg containedSystemFunctionPkg = basicGetContainedSystemFunctionPkg();
		return containedSystemFunctionPkg != null && containedSystemFunctionPkg.eIsProxy() ? (SystemFunctionPkg)eResolveProxy((InternalEObject)containedSystemFunctionPkg) : containedSystemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg basicGetContainedSystemFunctionPkg() {
		// TODO: implement this method to return the 'Contained System Function Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalAnalysisRealization> getOwnedOperationalAnalysisRealizations() {
		if (ownedOperationalAnalysisRealizations == null) {
			ownedOperationalAnalysisRealizations = new EObjectContainmentEList<OperationalAnalysisRealization>(OperationalAnalysisRealization.class, this, CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS);
		}
		return ownedOperationalAnalysisRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalAnalysisRealization> getAllocatedOperationalAnalysisRealizations() {
		// TODO: implement this method to return the 'Allocated Operational Analysis Realizations' reference list
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
	public EList<OperationalAnalysis> getAllocatedOperationalAnalyses() {
		// TODO: implement this method to return the 'Allocated Operational Analyses' reference list
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
	public EList<LogicalArchitecture> getAllocatingLogicalArchitectures() {
		// TODO: implement this method to return the 'Allocating Logical Architectures' reference list
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				return basicSetOwnedSystemContext(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				return basicSetOwnedSystem(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				return basicSetOwnedActorPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return basicSetOwnedMissionPkg(null, msgs);
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return ((InternalEList<?>)getOwnedOperationalAnalysisRealizations()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				return getOwnedSystemContext();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				return getOwnedSystem();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				return getOwnedActorPkg();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return getOwnedMissionPkg();
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				if (resolve) return getContainedCapabilityPkg();
				return basicGetContainedCapabilityPkg();
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				if (resolve) return getContainedSystemFunctionPkg();
				return basicGetContainedSystemFunctionPkg();
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return getOwnedOperationalAnalysisRealizations();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return getAllocatedOperationalAnalysisRealizations();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return getAllocatedOperationalAnalyses();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES:
				return getAllocatingLogicalArchitectures();
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				setOwnedSystemContext((SystemContext)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				setOwnedSystem((org.sample.melangeproject.capellawithmass.ctx.System)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				setOwnedActorPkg((ActorPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				setOwnedMissionPkg((MissionPkg)newValue);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				getOwnedOperationalAnalysisRealizations().clear();
				getOwnedOperationalAnalysisRealizations().addAll((Collection<? extends OperationalAnalysisRealization>)newValue);
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				setOwnedSystemContext((SystemContext)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				setOwnedSystem((org.sample.melangeproject.capellawithmass.ctx.System)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				setOwnedActorPkg((ActorPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				setOwnedMissionPkg((MissionPkg)null);
				return;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				getOwnedOperationalAnalysisRealizations().clear();
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
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM_CONTEXT:
				return ownedSystemContext != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_SYSTEM:
				return ownedSystem != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_ACTOR_PKG:
				return ownedActorPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_MISSION_PKG:
				return ownedMissionPkg != null;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_CAPABILITY_PKG:
				return basicGetContainedCapabilityPkg() != null;
			case CtxPackage.SYSTEM_ANALYSIS__CONTAINED_SYSTEM_FUNCTION_PKG:
				return basicGetContainedSystemFunctionPkg() != null;
			case CtxPackage.SYSTEM_ANALYSIS__OWNED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return ownedOperationalAnalysisRealizations != null && !ownedOperationalAnalysisRealizations.isEmpty();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSIS_REALIZATIONS:
				return !getAllocatedOperationalAnalysisRealizations().isEmpty();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATED_OPERATIONAL_ANALYSES:
				return !getAllocatedOperationalAnalyses().isEmpty();
			case CtxPackage.SYSTEM_ANALYSIS__ALLOCATING_LOGICAL_ARCHITECTURES:
				return !getAllocatingLogicalArchitectures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemAnalysisImpl
