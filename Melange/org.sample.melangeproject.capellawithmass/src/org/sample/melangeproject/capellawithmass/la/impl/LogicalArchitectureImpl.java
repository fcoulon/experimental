/**
 */
package org.sample.melangeproject.capellawithmass.la.impl;

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

import org.sample.melangeproject.capellawithmass.ctx.SystemAnalysis;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealizationPkg;
import org.sample.melangeproject.capellawithmass.la.LaPackage;
import org.sample.melangeproject.capellawithmass.la.LogicalActorPkg;
import org.sample.melangeproject.capellawithmass.la.LogicalArchitecture;
import org.sample.melangeproject.capellawithmass.la.LogicalComponent;
import org.sample.melangeproject.capellawithmass.la.LogicalComponentPkg;
import org.sample.melangeproject.capellawithmass.la.LogicalContext;
import org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg;
import org.sample.melangeproject.capellawithmass.la.SystemAnalysisRealization;

import org.sample.melangeproject.capellawithmass.pa.PhysicalArchitecture;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getOwnedLogicalContext <em>Owned Logical Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getOwnedLogicalComponent <em>Owned Logical Component</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getOwnedLogicalComponentPkg <em>Owned Logical Component Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getOwnedLogicalActorPkg <em>Owned Logical Actor Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getContainedLogicalFunctionPkg <em>Contained Logical Function Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getOwnedSystemAnalysisRealizations <em>Owned System Analysis Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getAllocatedSystemAnalysisRealizations <em>Allocated System Analysis Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getAllocatedSystemAnalyses <em>Allocated System Analyses</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.la.impl.LogicalArchitectureImpl#getAllocatingPhysicalArchitectures <em>Allocating Physical Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalArchitectureImpl extends ComponentArchitectureImpl implements LogicalArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedLogicalContext() <em>Owned Logical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalContext()
	 * @generated
	 * @ordered
	 */
	protected LogicalContext ownedLogicalContext;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponent() <em>Owned Logical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponent()
	 * @generated
	 * @ordered
	 */
	protected LogicalComponent ownedLogicalComponent;

	/**
	 * The cached value of the '{@link #getOwnedLogicalComponentPkg() <em>Owned Logical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalComponentPkg ownedLogicalComponentPkg;

	/**
	 * The cached value of the '{@link #getOwnedLogicalActorPkg() <em>Owned Logical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalActorPkg()
	 * @generated
	 * @ordered
	 */
	protected LogicalActorPkg ownedLogicalActorPkg;

	/**
	 * The cached value of the '{@link #getOwnedSystemAnalysisRealizations() <em>Owned System Analysis Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemAnalysisRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemAnalysisRealization> ownedSystemAnalysisRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaPackage.Literals.LOGICAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalContext getOwnedLogicalContext() {
		return ownedLogicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalContext(LogicalContext newOwnedLogicalContext, NotificationChain msgs) {
		LogicalContext oldOwnedLogicalContext = ownedLogicalContext;
		ownedLogicalContext = newOwnedLogicalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, oldOwnedLogicalContext, newOwnedLogicalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalContext(LogicalContext newOwnedLogicalContext) {
		if (newOwnedLogicalContext != ownedLogicalContext) {
			NotificationChain msgs = null;
			if (ownedLogicalContext != null)
				msgs = ((InternalEObject)ownedLogicalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, null, msgs);
			if (newOwnedLogicalContext != null)
				msgs = ((InternalEObject)newOwnedLogicalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, null, msgs);
			msgs = basicSetOwnedLogicalContext(newOwnedLogicalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT, newOwnedLogicalContext, newOwnedLogicalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponent getOwnedLogicalComponent() {
		return ownedLogicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalComponent(LogicalComponent newOwnedLogicalComponent, NotificationChain msgs) {
		LogicalComponent oldOwnedLogicalComponent = ownedLogicalComponent;
		ownedLogicalComponent = newOwnedLogicalComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, oldOwnedLogicalComponent, newOwnedLogicalComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalComponent(LogicalComponent newOwnedLogicalComponent) {
		if (newOwnedLogicalComponent != ownedLogicalComponent) {
			NotificationChain msgs = null;
			if (ownedLogicalComponent != null)
				msgs = ((InternalEObject)ownedLogicalComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, null, msgs);
			if (newOwnedLogicalComponent != null)
				msgs = ((InternalEObject)newOwnedLogicalComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, null, msgs);
			msgs = basicSetOwnedLogicalComponent(newOwnedLogicalComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT, newOwnedLogicalComponent, newOwnedLogicalComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponentPkg getOwnedLogicalComponentPkg() {
		return ownedLogicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalComponentPkg(LogicalComponentPkg newOwnedLogicalComponentPkg, NotificationChain msgs) {
		LogicalComponentPkg oldOwnedLogicalComponentPkg = ownedLogicalComponentPkg;
		ownedLogicalComponentPkg = newOwnedLogicalComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, oldOwnedLogicalComponentPkg, newOwnedLogicalComponentPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalComponentPkg(LogicalComponentPkg newOwnedLogicalComponentPkg) {
		if (newOwnedLogicalComponentPkg != ownedLogicalComponentPkg) {
			NotificationChain msgs = null;
			if (ownedLogicalComponentPkg != null)
				msgs = ((InternalEObject)ownedLogicalComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
			if (newOwnedLogicalComponentPkg != null)
				msgs = ((InternalEObject)newOwnedLogicalComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedLogicalComponentPkg(newOwnedLogicalComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG, newOwnedLogicalComponentPkg, newOwnedLogicalComponentPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActorPkg getOwnedLogicalActorPkg() {
		return ownedLogicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedLogicalActorPkg(LogicalActorPkg newOwnedLogicalActorPkg, NotificationChain msgs) {
		LogicalActorPkg oldOwnedLogicalActorPkg = ownedLogicalActorPkg;
		ownedLogicalActorPkg = newOwnedLogicalActorPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, oldOwnedLogicalActorPkg, newOwnedLogicalActorPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLogicalActorPkg(LogicalActorPkg newOwnedLogicalActorPkg) {
		if (newOwnedLogicalActorPkg != ownedLogicalActorPkg) {
			NotificationChain msgs = null;
			if (ownedLogicalActorPkg != null)
				msgs = ((InternalEObject)ownedLogicalActorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, null, msgs);
			if (newOwnedLogicalActorPkg != null)
				msgs = ((InternalEObject)newOwnedLogicalActorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, null, msgs);
			msgs = basicSetOwnedLogicalActorPkg(newOwnedLogicalActorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG, newOwnedLogicalActorPkg, newOwnedLogicalActorPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg getContainedCapabilityRealizationPkg() {
		CapabilityRealizationPkg containedCapabilityRealizationPkg = basicGetContainedCapabilityRealizationPkg();
		return containedCapabilityRealizationPkg != null && containedCapabilityRealizationPkg.eIsProxy() ? (CapabilityRealizationPkg)eResolveProxy((InternalEObject)containedCapabilityRealizationPkg) : containedCapabilityRealizationPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityRealizationPkg basicGetContainedCapabilityRealizationPkg() {
		// TODO: implement this method to return the 'Contained Capability Realization Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunctionPkg getContainedLogicalFunctionPkg() {
		LogicalFunctionPkg containedLogicalFunctionPkg = basicGetContainedLogicalFunctionPkg();
		return containedLogicalFunctionPkg != null && containedLogicalFunctionPkg.eIsProxy() ? (LogicalFunctionPkg)eResolveProxy((InternalEObject)containedLogicalFunctionPkg) : containedLogicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalFunctionPkg basicGetContainedLogicalFunctionPkg() {
		// TODO: implement this method to return the 'Contained Logical Function Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAnalysisRealization> getOwnedSystemAnalysisRealizations() {
		if (ownedSystemAnalysisRealizations == null) {
			ownedSystemAnalysisRealizations = new EObjectContainmentEList<SystemAnalysisRealization>(SystemAnalysisRealization.class, this, LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS);
		}
		return ownedSystemAnalysisRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAnalysisRealization> getAllocatedSystemAnalysisRealizations() {
		// TODO: implement this method to return the 'Allocated System Analysis Realizations' reference list
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
	public EList<SystemAnalysis> getAllocatedSystemAnalyses() {
		// TODO: implement this method to return the 'Allocated System Analyses' reference list
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
	public EList<PhysicalArchitecture> getAllocatingPhysicalArchitectures() {
		// TODO: implement this method to return the 'Allocating Physical Architectures' reference list
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				return basicSetOwnedLogicalContext(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				return basicSetOwnedLogicalComponent(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return basicSetOwnedLogicalComponentPkg(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				return basicSetOwnedLogicalActorPkg(null, msgs);
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				return ((InternalEList<?>)getOwnedSystemAnalysisRealizations()).basicRemove(otherEnd, msgs);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				return getOwnedLogicalContext();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				return getOwnedLogicalComponent();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return getOwnedLogicalComponentPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				return getOwnedLogicalActorPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				if (resolve) return getContainedCapabilityRealizationPkg();
				return basicGetContainedCapabilityRealizationPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				if (resolve) return getContainedLogicalFunctionPkg();
				return basicGetContainedLogicalFunctionPkg();
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				return getOwnedSystemAnalysisRealizations();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS:
				return getAllocatedSystemAnalysisRealizations();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return getAllocatedSystemAnalyses();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
				return getAllocatingPhysicalArchitectures();
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				setOwnedLogicalContext((LogicalContext)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				setOwnedLogicalComponent((LogicalComponent)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				setOwnedLogicalComponentPkg((LogicalComponentPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				setOwnedLogicalActorPkg((LogicalActorPkg)newValue);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				getOwnedSystemAnalysisRealizations().clear();
				getOwnedSystemAnalysisRealizations().addAll((Collection<? extends SystemAnalysisRealization>)newValue);
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				setOwnedLogicalContext((LogicalContext)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				setOwnedLogicalComponent((LogicalComponent)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				setOwnedLogicalComponentPkg((LogicalComponentPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				setOwnedLogicalActorPkg((LogicalActorPkg)null);
				return;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				getOwnedSystemAnalysisRealizations().clear();
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
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_CONTEXT:
				return ownedLogicalContext != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT:
				return ownedLogicalComponent != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_COMPONENT_PKG:
				return ownedLogicalComponentPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_LOGICAL_ACTOR_PKG:
				return ownedLogicalActorPkg != null;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return basicGetContainedCapabilityRealizationPkg() != null;
			case LaPackage.LOGICAL_ARCHITECTURE__CONTAINED_LOGICAL_FUNCTION_PKG:
				return basicGetContainedLogicalFunctionPkg() != null;
			case LaPackage.LOGICAL_ARCHITECTURE__OWNED_SYSTEM_ANALYSIS_REALIZATIONS:
				return ownedSystemAnalysisRealizations != null && !ownedSystemAnalysisRealizations.isEmpty();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSIS_REALIZATIONS:
				return !getAllocatedSystemAnalysisRealizations().isEmpty();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATED_SYSTEM_ANALYSES:
				return !getAllocatedSystemAnalyses().isEmpty();
			case LaPackage.LOGICAL_ARCHITECTURE__ALLOCATING_PHYSICAL_ARCHITECTURES:
				return !getAllocatingPhysicalArchitectures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LogicalArchitectureImpl
