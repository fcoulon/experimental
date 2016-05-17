/**
 */
package org.sample.melangeproject.capellawithmass.pa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.cs.AbstractDeploymentLink;

import org.sample.melangeproject.capellawithmass.cs.impl.ComponentArchitectureImpl;

import org.sample.melangeproject.capellawithmass.epbs.EPBSArchitecture;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealizationPkg;
import org.sample.melangeproject.capellawithmass.la.LogicalArchitecture;

import org.sample.melangeproject.capellawithmass.pa.LogicalArchitectureRealization;
import org.sample.melangeproject.capellawithmass.pa.PaPackage;
import org.sample.melangeproject.capellawithmass.pa.PhysicalActorPkg;
import org.sample.melangeproject.capellawithmass.pa.PhysicalArchitecture;
import org.sample.melangeproject.capellawithmass.pa.PhysicalComponent;
import org.sample.melangeproject.capellawithmass.pa.PhysicalComponentPkg;
import org.sample.melangeproject.capellawithmass.pa.PhysicalContext;
import org.sample.melangeproject.capellawithmass.pa.PhysicalFunctionPkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalContext <em>Owned Physical Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalComponent <em>Owned Physical Component</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalComponentPkg <em>Owned Physical Component Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getOwnedPhysicalActorPkg <em>Owned Physical Actor Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getContainedCapabilityRealizationPkg <em>Contained Capability Realization Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getContainedPhysicalFunctionPkg <em>Contained Physical Function Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getOwnedDeployments <em>Owned Deployments</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getOwnedLogicalArchitectureRealizations <em>Owned Logical Architecture Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getAllocatedLogicalArchitectureRealizations <em>Allocated Logical Architecture Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getAllocatedLogicalArchitectures <em>Allocated Logical Architectures</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalArchitectureImpl#getAllocatingEpbsArchitectures <em>Allocating Epbs Architectures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalArchitectureImpl extends ComponentArchitectureImpl implements PhysicalArchitecture {
	/**
	 * The cached value of the '{@link #getOwnedPhysicalContext() <em>Owned Physical Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalContext()
	 * @generated
	 * @ordered
	 */
	protected PhysicalContext ownedPhysicalContext;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponent() <em>Owned Physical Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponent()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponent ownedPhysicalComponent;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalComponentPkg() <em>Owned Physical Component Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalComponentPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalComponentPkg ownedPhysicalComponentPkg;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalActorPkg() <em>Owned Physical Actor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalActorPkg()
	 * @generated
	 * @ordered
	 */
	protected PhysicalActorPkg ownedPhysicalActorPkg;

	/**
	 * The cached value of the '{@link #getOwnedDeployments() <em>Owned Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeployments;

	/**
	 * The cached value of the '{@link #getOwnedLogicalArchitectureRealizations() <em>Owned Logical Architecture Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLogicalArchitectureRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<LogicalArchitectureRealization> ownedLogicalArchitectureRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalContext getOwnedPhysicalContext() {
		return ownedPhysicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalContext(PhysicalContext newOwnedPhysicalContext, NotificationChain msgs) {
		PhysicalContext oldOwnedPhysicalContext = ownedPhysicalContext;
		ownedPhysicalContext = newOwnedPhysicalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, oldOwnedPhysicalContext, newOwnedPhysicalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalContext(PhysicalContext newOwnedPhysicalContext) {
		if (newOwnedPhysicalContext != ownedPhysicalContext) {
			NotificationChain msgs = null;
			if (ownedPhysicalContext != null)
				msgs = ((InternalEObject)ownedPhysicalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, null, msgs);
			if (newOwnedPhysicalContext != null)
				msgs = ((InternalEObject)newOwnedPhysicalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, null, msgs);
			msgs = basicSetOwnedPhysicalContext(newOwnedPhysicalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT, newOwnedPhysicalContext, newOwnedPhysicalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent getOwnedPhysicalComponent() {
		return ownedPhysicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalComponent(PhysicalComponent newOwnedPhysicalComponent, NotificationChain msgs) {
		PhysicalComponent oldOwnedPhysicalComponent = ownedPhysicalComponent;
		ownedPhysicalComponent = newOwnedPhysicalComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, oldOwnedPhysicalComponent, newOwnedPhysicalComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalComponent(PhysicalComponent newOwnedPhysicalComponent) {
		if (newOwnedPhysicalComponent != ownedPhysicalComponent) {
			NotificationChain msgs = null;
			if (ownedPhysicalComponent != null)
				msgs = ((InternalEObject)ownedPhysicalComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, null, msgs);
			if (newOwnedPhysicalComponent != null)
				msgs = ((InternalEObject)newOwnedPhysicalComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, null, msgs);
			msgs = basicSetOwnedPhysicalComponent(newOwnedPhysicalComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT, newOwnedPhysicalComponent, newOwnedPhysicalComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentPkg getOwnedPhysicalComponentPkg() {
		return ownedPhysicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalComponentPkg(PhysicalComponentPkg newOwnedPhysicalComponentPkg, NotificationChain msgs) {
		PhysicalComponentPkg oldOwnedPhysicalComponentPkg = ownedPhysicalComponentPkg;
		ownedPhysicalComponentPkg = newOwnedPhysicalComponentPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, oldOwnedPhysicalComponentPkg, newOwnedPhysicalComponentPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalComponentPkg(PhysicalComponentPkg newOwnedPhysicalComponentPkg) {
		if (newOwnedPhysicalComponentPkg != ownedPhysicalComponentPkg) {
			NotificationChain msgs = null;
			if (ownedPhysicalComponentPkg != null)
				msgs = ((InternalEObject)ownedPhysicalComponentPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
			if (newOwnedPhysicalComponentPkg != null)
				msgs = ((InternalEObject)newOwnedPhysicalComponentPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, null, msgs);
			msgs = basicSetOwnedPhysicalComponentPkg(newOwnedPhysicalComponentPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG, newOwnedPhysicalComponentPkg, newOwnedPhysicalComponentPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalActorPkg getOwnedPhysicalActorPkg() {
		return ownedPhysicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPhysicalActorPkg(PhysicalActorPkg newOwnedPhysicalActorPkg, NotificationChain msgs) {
		PhysicalActorPkg oldOwnedPhysicalActorPkg = ownedPhysicalActorPkg;
		ownedPhysicalActorPkg = newOwnedPhysicalActorPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, oldOwnedPhysicalActorPkg, newOwnedPhysicalActorPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPhysicalActorPkg(PhysicalActorPkg newOwnedPhysicalActorPkg) {
		if (newOwnedPhysicalActorPkg != ownedPhysicalActorPkg) {
			NotificationChain msgs = null;
			if (ownedPhysicalActorPkg != null)
				msgs = ((InternalEObject)ownedPhysicalActorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, null, msgs);
			if (newOwnedPhysicalActorPkg != null)
				msgs = ((InternalEObject)newOwnedPhysicalActorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, null, msgs);
			msgs = basicSetOwnedPhysicalActorPkg(newOwnedPhysicalActorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG, newOwnedPhysicalActorPkg, newOwnedPhysicalActorPkg));
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
	public PhysicalFunctionPkg getContainedPhysicalFunctionPkg() {
		PhysicalFunctionPkg containedPhysicalFunctionPkg = basicGetContainedPhysicalFunctionPkg();
		return containedPhysicalFunctionPkg != null && containedPhysicalFunctionPkg.eIsProxy() ? (PhysicalFunctionPkg)eResolveProxy((InternalEObject)containedPhysicalFunctionPkg) : containedPhysicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunctionPkg basicGetContainedPhysicalFunctionPkg() {
		// TODO: implement this method to return the 'Contained Physical Function Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getOwnedDeployments() {
		if (ownedDeployments == null) {
			ownedDeployments = new EObjectContainmentEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS);
		}
		return ownedDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalArchitectureRealization> getOwnedLogicalArchitectureRealizations() {
		if (ownedLogicalArchitectureRealizations == null) {
			ownedLogicalArchitectureRealizations = new EObjectContainmentEList<LogicalArchitectureRealization>(LogicalArchitectureRealization.class, this, PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS);
		}
		return ownedLogicalArchitectureRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LogicalArchitectureRealization> getAllocatedLogicalArchitectureRealizations() {
		// TODO: implement this method to return the 'Allocated Logical Architecture Realizations' reference list
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
	public EList<LogicalArchitecture> getAllocatedLogicalArchitectures() {
		// TODO: implement this method to return the 'Allocated Logical Architectures' reference list
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
	public EList<EPBSArchitecture> getAllocatingEpbsArchitectures() {
		// TODO: implement this method to return the 'Allocating Epbs Architectures' reference list
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				return basicSetOwnedPhysicalContext(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				return basicSetOwnedPhysicalComponent(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return basicSetOwnedPhysicalComponentPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				return basicSetOwnedPhysicalActorPkg(null, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return ((InternalEList<?>)getOwnedDeployments()).basicRemove(otherEnd, msgs);
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedLogicalArchitectureRealizations()).basicRemove(otherEnd, msgs);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				return getOwnedPhysicalContext();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				return getOwnedPhysicalComponent();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return getOwnedPhysicalComponentPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				return getOwnedPhysicalActorPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				if (resolve) return getContainedCapabilityRealizationPkg();
				return basicGetContainedCapabilityRealizationPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				if (resolve) return getContainedPhysicalFunctionPkg();
				return basicGetContainedPhysicalFunctionPkg();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return getOwnedDeployments();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return getOwnedLogicalArchitectureRealizations();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return getAllocatedLogicalArchitectureRealizations();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return getAllocatedLogicalArchitectures();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES:
				return getAllocatingEpbsArchitectures();
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				setOwnedPhysicalContext((PhysicalContext)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				setOwnedPhysicalComponent((PhysicalComponent)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				setOwnedPhysicalComponentPkg((PhysicalComponentPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				setOwnedPhysicalActorPkg((PhysicalActorPkg)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				getOwnedDeployments().clear();
				getOwnedDeployments().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				getOwnedLogicalArchitectureRealizations().clear();
				getOwnedLogicalArchitectureRealizations().addAll((Collection<? extends LogicalArchitectureRealization>)newValue);
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				setOwnedPhysicalContext((PhysicalContext)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				setOwnedPhysicalComponent((PhysicalComponent)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				setOwnedPhysicalComponentPkg((PhysicalComponentPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				setOwnedPhysicalActorPkg((PhysicalActorPkg)null);
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				getOwnedDeployments().clear();
				return;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				getOwnedLogicalArchitectureRealizations().clear();
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
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_CONTEXT:
				return ownedPhysicalContext != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT:
				return ownedPhysicalComponent != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_COMPONENT_PKG:
				return ownedPhysicalComponentPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_PHYSICAL_ACTOR_PKG:
				return ownedPhysicalActorPkg != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_CAPABILITY_REALIZATION_PKG:
				return basicGetContainedCapabilityRealizationPkg() != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__CONTAINED_PHYSICAL_FUNCTION_PKG:
				return basicGetContainedPhysicalFunctionPkg() != null;
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_DEPLOYMENTS:
				return ownedDeployments != null && !ownedDeployments.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__OWNED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return ownedLogicalArchitectureRealizations != null && !ownedLogicalArchitectureRealizations.isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURE_REALIZATIONS:
				return !getAllocatedLogicalArchitectureRealizations().isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATED_LOGICAL_ARCHITECTURES:
				return !getAllocatedLogicalArchitectures().isEmpty();
			case PaPackage.PHYSICAL_ARCHITECTURE__ALLOCATING_EPBS_ARCHITECTURES:
				return !getAllocatingEpbsArchitectures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalArchitectureImpl
