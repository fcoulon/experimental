/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;

import org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl;

import org.sample.melangeproject.capellawithmass.ctx.Capability;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.Mission;
import org.sample.melangeproject.capellawithmass.ctx.OperationalEntityRealization;
import org.sample.melangeproject.capellawithmass.ctx.SystemCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunicationHook;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;
import org.sample.melangeproject.capellawithmass.ctx.SystemMissionInvolvement;

import org.sample.melangeproject.capellawithmass.la.LogicalComponent;

import org.sample.melangeproject.capellawithmass.oa.Entity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getInvolvingCapabilityRealizationInvolvements <em>Involving Capability Realization Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getContributedCapabilities <em>Contributed Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getParticipationsInCapabilities <em>Participations In Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getContributedMissions <em>Contributed Missions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getParticipationsInMissions <em>Participations In Missions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getExternalCommunication <em>External Communication</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getOwnedEntityRealizations <em>Owned Entity Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getAllocatedEntityRealizations <em>Allocated Entity Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getAllocatedSystemFunctions <em>Allocated System Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getRealizedEntities <em>Realized Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.ctx.impl.SystemImpl#getRealizingLogicalComponents <em>Realizing Logical Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends ComponentImpl implements org.sample.melangeproject.capellawithmass.ctx.System {
	/**
	 * The cached value of the '{@link #getExternalCommunication() <em>External Communication</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalCommunication()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemCommunicationHook> externalCommunication;

	/**
	 * The cached value of the '{@link #getOwnedEntityRealizations() <em>Owned Entity Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalEntityRealization> ownedEntityRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CtxPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Involvement> getInvolvingInvolvements() {
		// TODO: implement this method to return the 'Involving Involvements' reference list
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
	public EList<CapabilityRealizationInvolvement> getInvolvingCapabilityRealizationInvolvements() {
		// TODO: implement this method to return the 'Involving Capability Realization Involvements' reference list
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
	public EList<Capability> getContributedCapabilities() {
		// TODO: implement this method to return the 'Contributed Capabilities' reference list
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
	public EList<SystemCapabilityInvolvement> getParticipationsInCapabilities() {
		// TODO: implement this method to return the 'Participations In Capabilities' reference list
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
	public EList<Mission> getContributedMissions() {
		// TODO: implement this method to return the 'Contributed Missions' reference list
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
	public EList<SystemMissionInvolvement> getParticipationsInMissions() {
		// TODO: implement this method to return the 'Participations In Missions' reference list
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
	public EList<SystemCommunicationHook> getExternalCommunication() {
		if (externalCommunication == null) {
			externalCommunication = new EObjectResolvingEList<SystemCommunicationHook>(SystemCommunicationHook.class, this, CtxPackage.SYSTEM__EXTERNAL_COMMUNICATION);
		}
		return externalCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalEntityRealization> getOwnedEntityRealizations() {
		if (ownedEntityRealizations == null) {
			ownedEntityRealizations = new EObjectContainmentEList<OperationalEntityRealization>(OperationalEntityRealization.class, this, CtxPackage.SYSTEM__OWNED_ENTITY_REALIZATIONS);
		}
		return ownedEntityRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationalEntityRealization> getAllocatedEntityRealizations() {
		// TODO: implement this method to return the 'Allocated Entity Realizations' reference list
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
	public EList<SystemFunction> getAllocatedSystemFunctions() {
		// TODO: implement this method to return the 'Allocated System Functions' reference list
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
	public EList<Entity> getRealizedEntities() {
		// TODO: implement this method to return the 'Realized Entities' reference list
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
	public EList<LogicalComponent> getRealizingLogicalComponents() {
		// TODO: implement this method to return the 'Realizing Logical Components' reference list
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
			case CtxPackage.SYSTEM__OWNED_ENTITY_REALIZATIONS:
				return ((InternalEList<?>)getOwnedEntityRealizations()).basicRemove(otherEnd, msgs);
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
			case CtxPackage.SYSTEM__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CtxPackage.SYSTEM__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return getInvolvingCapabilityRealizationInvolvements();
			case CtxPackage.SYSTEM__CONTRIBUTED_CAPABILITIES:
				return getContributedCapabilities();
			case CtxPackage.SYSTEM__PARTICIPATIONS_IN_CAPABILITIES:
				return getParticipationsInCapabilities();
			case CtxPackage.SYSTEM__CONTRIBUTED_MISSIONS:
				return getContributedMissions();
			case CtxPackage.SYSTEM__PARTICIPATIONS_IN_MISSIONS:
				return getParticipationsInMissions();
			case CtxPackage.SYSTEM__EXTERNAL_COMMUNICATION:
				return getExternalCommunication();
			case CtxPackage.SYSTEM__OWNED_ENTITY_REALIZATIONS:
				return getOwnedEntityRealizations();
			case CtxPackage.SYSTEM__ALLOCATED_ENTITY_REALIZATIONS:
				return getAllocatedEntityRealizations();
			case CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS:
				return getAllocatedSystemFunctions();
			case CtxPackage.SYSTEM__REALIZED_ENTITIES:
				return getRealizedEntities();
			case CtxPackage.SYSTEM__REALIZING_LOGICAL_COMPONENTS:
				return getRealizingLogicalComponents();
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
			case CtxPackage.SYSTEM__EXTERNAL_COMMUNICATION:
				getExternalCommunication().clear();
				getExternalCommunication().addAll((Collection<? extends SystemCommunicationHook>)newValue);
				return;
			case CtxPackage.SYSTEM__OWNED_ENTITY_REALIZATIONS:
				getOwnedEntityRealizations().clear();
				getOwnedEntityRealizations().addAll((Collection<? extends OperationalEntityRealization>)newValue);
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
			case CtxPackage.SYSTEM__EXTERNAL_COMMUNICATION:
				getExternalCommunication().clear();
				return;
			case CtxPackage.SYSTEM__OWNED_ENTITY_REALIZATIONS:
				getOwnedEntityRealizations().clear();
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
			case CtxPackage.SYSTEM__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case CtxPackage.SYSTEM__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return !getInvolvingCapabilityRealizationInvolvements().isEmpty();
			case CtxPackage.SYSTEM__CONTRIBUTED_CAPABILITIES:
				return !getContributedCapabilities().isEmpty();
			case CtxPackage.SYSTEM__PARTICIPATIONS_IN_CAPABILITIES:
				return !getParticipationsInCapabilities().isEmpty();
			case CtxPackage.SYSTEM__CONTRIBUTED_MISSIONS:
				return !getContributedMissions().isEmpty();
			case CtxPackage.SYSTEM__PARTICIPATIONS_IN_MISSIONS:
				return !getParticipationsInMissions().isEmpty();
			case CtxPackage.SYSTEM__EXTERNAL_COMMUNICATION:
				return externalCommunication != null && !externalCommunication.isEmpty();
			case CtxPackage.SYSTEM__OWNED_ENTITY_REALIZATIONS:
				return ownedEntityRealizations != null && !ownedEntityRealizations.isEmpty();
			case CtxPackage.SYSTEM__ALLOCATED_ENTITY_REALIZATIONS:
				return !getAllocatedEntityRealizations().isEmpty();
			case CtxPackage.SYSTEM__ALLOCATED_SYSTEM_FUNCTIONS:
				return !getAllocatedSystemFunctions().isEmpty();
			case CtxPackage.SYSTEM__REALIZED_ENTITIES:
				return !getRealizedEntities().isEmpty();
			case CtxPackage.SYSTEM__REALIZING_LOGICAL_COMPONENTS:
				return !getRealizingLogicalComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CtxPackage.SYSTEM__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (derivedFeatureID) {
				case CtxPackage.SYSTEM__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CtxPackage.SYSTEM__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS: return CtxPackage.SYSTEM__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SystemImpl
