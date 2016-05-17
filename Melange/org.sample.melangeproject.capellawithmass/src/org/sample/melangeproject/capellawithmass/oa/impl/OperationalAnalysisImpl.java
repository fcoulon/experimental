/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.cs.impl.BlockArchitectureImpl;

import org.sample.melangeproject.capellawithmass.ctx.SystemAnalysis;

import org.sample.melangeproject.capellawithmass.oa.ConceptPkg;
import org.sample.melangeproject.capellawithmass.oa.EntityPkg;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalActivityPkg;
import org.sample.melangeproject.capellawithmass.oa.OperationalAnalysis;
import org.sample.melangeproject.capellawithmass.oa.OperationalCapabilityPkg;
import org.sample.melangeproject.capellawithmass.oa.OperationalContext;
import org.sample.melangeproject.capellawithmass.oa.RolePkg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getOwnedOperationalContext <em>Owned Operational Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getOwnedRolePkg <em>Owned Role Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getOwnedEntityPkg <em>Owned Entity Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getOwnedConceptPkg <em>Owned Concept Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getContainedOperationalCapabilityPkg <em>Contained Operational Capability Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getContainedOperationalActivityPkg <em>Contained Operational Activity Pkg</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalAnalysisImpl#getAllocatingSystemAnalyses <em>Allocating System Analyses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalAnalysisImpl extends BlockArchitectureImpl implements OperationalAnalysis {
	/**
	 * The cached value of the '{@link #getOwnedOperationalContext() <em>Owned Operational Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperationalContext()
	 * @generated
	 * @ordered
	 */
	protected OperationalContext ownedOperationalContext;

	/**
	 * The cached value of the '{@link #getOwnedRolePkg() <em>Owned Role Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRolePkg()
	 * @generated
	 * @ordered
	 */
	protected RolePkg ownedRolePkg;

	/**
	 * The cached value of the '{@link #getOwnedEntityPkg() <em>Owned Entity Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityPkg()
	 * @generated
	 * @ordered
	 */
	protected EntityPkg ownedEntityPkg;

	/**
	 * The cached value of the '{@link #getOwnedConceptPkg() <em>Owned Concept Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConceptPkg()
	 * @generated
	 * @ordered
	 */
	protected ConceptPkg ownedConceptPkg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalContext getOwnedOperationalContext() {
		return ownedOperationalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedOperationalContext(OperationalContext newOwnedOperationalContext, NotificationChain msgs) {
		OperationalContext oldOwnedOperationalContext = ownedOperationalContext;
		ownedOperationalContext = newOwnedOperationalContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, oldOwnedOperationalContext, newOwnedOperationalContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedOperationalContext(OperationalContext newOwnedOperationalContext) {
		if (newOwnedOperationalContext != ownedOperationalContext) {
			NotificationChain msgs = null;
			if (ownedOperationalContext != null)
				msgs = ((InternalEObject)ownedOperationalContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, null, msgs);
			if (newOwnedOperationalContext != null)
				msgs = ((InternalEObject)newOwnedOperationalContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, null, msgs);
			msgs = basicSetOwnedOperationalContext(newOwnedOperationalContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT, newOwnedOperationalContext, newOwnedOperationalContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg getOwnedRolePkg() {
		return ownedRolePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedRolePkg(RolePkg newOwnedRolePkg, NotificationChain msgs) {
		RolePkg oldOwnedRolePkg = ownedRolePkg;
		ownedRolePkg = newOwnedRolePkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, oldOwnedRolePkg, newOwnedRolePkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedRolePkg(RolePkg newOwnedRolePkg) {
		if (newOwnedRolePkg != ownedRolePkg) {
			NotificationChain msgs = null;
			if (ownedRolePkg != null)
				msgs = ((InternalEObject)ownedRolePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, null, msgs);
			if (newOwnedRolePkg != null)
				msgs = ((InternalEObject)newOwnedRolePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, null, msgs);
			msgs = basicSetOwnedRolePkg(newOwnedRolePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG, newOwnedRolePkg, newOwnedRolePkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg getOwnedEntityPkg() {
		return ownedEntityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEntityPkg(EntityPkg newOwnedEntityPkg, NotificationChain msgs) {
		EntityPkg oldOwnedEntityPkg = ownedEntityPkg;
		ownedEntityPkg = newOwnedEntityPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, oldOwnedEntityPkg, newOwnedEntityPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEntityPkg(EntityPkg newOwnedEntityPkg) {
		if (newOwnedEntityPkg != ownedEntityPkg) {
			NotificationChain msgs = null;
			if (ownedEntityPkg != null)
				msgs = ((InternalEObject)ownedEntityPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, null, msgs);
			if (newOwnedEntityPkg != null)
				msgs = ((InternalEObject)newOwnedEntityPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, null, msgs);
			msgs = basicSetOwnedEntityPkg(newOwnedEntityPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG, newOwnedEntityPkg, newOwnedEntityPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPkg getOwnedConceptPkg() {
		return ownedConceptPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedConceptPkg(ConceptPkg newOwnedConceptPkg, NotificationChain msgs) {
		ConceptPkg oldOwnedConceptPkg = ownedConceptPkg;
		ownedConceptPkg = newOwnedConceptPkg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG, oldOwnedConceptPkg, newOwnedConceptPkg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConceptPkg(ConceptPkg newOwnedConceptPkg) {
		if (newOwnedConceptPkg != ownedConceptPkg) {
			NotificationChain msgs = null;
			if (ownedConceptPkg != null)
				msgs = ((InternalEObject)ownedConceptPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG, null, msgs);
			if (newOwnedConceptPkg != null)
				msgs = ((InternalEObject)newOwnedConceptPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG, null, msgs);
			msgs = basicSetOwnedConceptPkg(newOwnedConceptPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG, newOwnedConceptPkg, newOwnedConceptPkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg getContainedOperationalCapabilityPkg() {
		OperationalCapabilityPkg containedOperationalCapabilityPkg = basicGetContainedOperationalCapabilityPkg();
		return containedOperationalCapabilityPkg != null && containedOperationalCapabilityPkg.eIsProxy() ? (OperationalCapabilityPkg)eResolveProxy((InternalEObject)containedOperationalCapabilityPkg) : containedOperationalCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg basicGetContainedOperationalCapabilityPkg() {
		// TODO: implement this method to return the 'Contained Operational Capability Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg getContainedOperationalActivityPkg() {
		OperationalActivityPkg containedOperationalActivityPkg = basicGetContainedOperationalActivityPkg();
		return containedOperationalActivityPkg != null && containedOperationalActivityPkg.eIsProxy() ? (OperationalActivityPkg)eResolveProxy((InternalEObject)containedOperationalActivityPkg) : containedOperationalActivityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg basicGetContainedOperationalActivityPkg() {
		// TODO: implement this method to return the 'Contained Operational Activity Pkg' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemAnalysis> getAllocatingSystemAnalyses() {
		// TODO: implement this method to return the 'Allocating System Analyses' reference list
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				return basicSetOwnedOperationalContext(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				return basicSetOwnedRolePkg(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				return basicSetOwnedEntityPkg(null, msgs);
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG:
				return basicSetOwnedConceptPkg(null, msgs);
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				return getOwnedOperationalContext();
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				return getOwnedRolePkg();
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				return getOwnedEntityPkg();
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG:
				return getOwnedConceptPkg();
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				if (resolve) return getContainedOperationalCapabilityPkg();
				return basicGetContainedOperationalCapabilityPkg();
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				if (resolve) return getContainedOperationalActivityPkg();
				return basicGetContainedOperationalActivityPkg();
			case OaPackage.OPERATIONAL_ANALYSIS__ALLOCATING_SYSTEM_ANALYSES:
				return getAllocatingSystemAnalyses();
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				setOwnedOperationalContext((OperationalContext)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				setOwnedRolePkg((RolePkg)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				setOwnedEntityPkg((EntityPkg)newValue);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG:
				setOwnedConceptPkg((ConceptPkg)newValue);
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				setOwnedOperationalContext((OperationalContext)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				setOwnedRolePkg((RolePkg)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				setOwnedEntityPkg((EntityPkg)null);
				return;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG:
				setOwnedConceptPkg((ConceptPkg)null);
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
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_OPERATIONAL_CONTEXT:
				return ownedOperationalContext != null;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ROLE_PKG:
				return ownedRolePkg != null;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_ENTITY_PKG:
				return ownedEntityPkg != null;
			case OaPackage.OPERATIONAL_ANALYSIS__OWNED_CONCEPT_PKG:
				return ownedConceptPkg != null;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_CAPABILITY_PKG:
				return basicGetContainedOperationalCapabilityPkg() != null;
			case OaPackage.OPERATIONAL_ANALYSIS__CONTAINED_OPERATIONAL_ACTIVITY_PKG:
				return basicGetContainedOperationalActivityPkg() != null;
			case OaPackage.OPERATIONAL_ANALYSIS__ALLOCATING_SYSTEM_ANALYSES:
				return !getAllocatingSystemAnalyses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalAnalysisImpl
