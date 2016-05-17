/**
 */
package org.sample.melangeproject.capellawithmass.ctx.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.ctx.Actor;
import org.sample.melangeproject.capellawithmass.ctx.ActorCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.ActorMissionInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.ActorPkg;
import org.sample.melangeproject.capellawithmass.ctx.Capability;
import org.sample.melangeproject.capellawithmass.ctx.CapabilityExploitation;
import org.sample.melangeproject.capellawithmass.ctx.CapabilityPkg;
import org.sample.melangeproject.capellawithmass.ctx.CtxFactory;
import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;
import org.sample.melangeproject.capellawithmass.ctx.Mission;
import org.sample.melangeproject.capellawithmass.ctx.MissionPkg;
import org.sample.melangeproject.capellawithmass.ctx.OperationalActorRealization;
import org.sample.melangeproject.capellawithmass.ctx.OperationalAnalysisRealization;
import org.sample.melangeproject.capellawithmass.ctx.OperationalEntityRealization;
import org.sample.melangeproject.capellawithmass.ctx.SystemAnalysis;
import org.sample.melangeproject.capellawithmass.ctx.SystemCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunication;
import org.sample.melangeproject.capellawithmass.ctx.SystemCommunicationHook;
import org.sample.melangeproject.capellawithmass.ctx.SystemContext;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunction;
import org.sample.melangeproject.capellawithmass.ctx.SystemFunctionPkg;
import org.sample.melangeproject.capellawithmass.ctx.SystemMissionInvolvement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtxFactoryImpl extends EFactoryImpl implements CtxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CtxFactory init() {
		try {
			CtxFactory theCtxFactory = (CtxFactory)EPackage.Registry.INSTANCE.getEFactory(CtxPackage.eNS_URI);
			if (theCtxFactory != null) {
				return theCtxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CtxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CtxPackage.SYSTEM_ANALYSIS: return createSystemAnalysis();
			case CtxPackage.SYSTEM: return createSystem();
			case CtxPackage.SYSTEM_FUNCTION: return createSystemFunction();
			case CtxPackage.SYSTEM_FUNCTION_PKG: return createSystemFunctionPkg();
			case CtxPackage.SYSTEM_COMMUNICATION_HOOK: return createSystemCommunicationHook();
			case CtxPackage.SYSTEM_COMMUNICATION: return createSystemCommunication();
			case CtxPackage.ACTOR: return createActor();
			case CtxPackage.ACTOR_CAPABILITY_INVOLVEMENT: return createActorCapabilityInvolvement();
			case CtxPackage.ACTOR_MISSION_INVOLVEMENT: return createActorMissionInvolvement();
			case CtxPackage.ACTOR_PKG: return createActorPkg();
			case CtxPackage.MISSION: return createMission();
			case CtxPackage.MISSION_PKG: return createMissionPkg();
			case CtxPackage.SYSTEM_MISSION_INVOLVEMENT: return createSystemMissionInvolvement();
			case CtxPackage.CAPABILITY: return createCapability();
			case CtxPackage.CAPABILITY_EXPLOITATION: return createCapabilityExploitation();
			case CtxPackage.CAPABILITY_PKG: return createCapabilityPkg();
			case CtxPackage.SYSTEM_CAPABILITY_INVOLVEMENT: return createSystemCapabilityInvolvement();
			case CtxPackage.OPERATIONAL_ACTOR_REALIZATION: return createOperationalActorRealization();
			case CtxPackage.OPERATIONAL_ANALYSIS_REALIZATION: return createOperationalAnalysisRealization();
			case CtxPackage.OPERATIONAL_ENTITY_REALIZATION: return createOperationalEntityRealization();
			case CtxPackage.SYSTEM_CONTEXT: return createSystemContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemAnalysis createSystemAnalysis() {
		SystemAnalysisImpl systemAnalysis = new SystemAnalysisImpl();
		return systemAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.sample.melangeproject.capellawithmass.ctx.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunction createSystemFunction() {
		SystemFunctionImpl systemFunction = new SystemFunctionImpl();
		return systemFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionPkg createSystemFunctionPkg() {
		SystemFunctionPkgImpl systemFunctionPkg = new SystemFunctionPkgImpl();
		return systemFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCommunicationHook createSystemCommunicationHook() {
		SystemCommunicationHookImpl systemCommunicationHook = new SystemCommunicationHookImpl();
		return systemCommunicationHook;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCommunication createSystemCommunication() {
		SystemCommunicationImpl systemCommunication = new SystemCommunicationImpl();
		return systemCommunication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorCapabilityInvolvement createActorCapabilityInvolvement() {
		ActorCapabilityInvolvementImpl actorCapabilityInvolvement = new ActorCapabilityInvolvementImpl();
		return actorCapabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorMissionInvolvement createActorMissionInvolvement() {
		ActorMissionInvolvementImpl actorMissionInvolvement = new ActorMissionInvolvementImpl();
		return actorMissionInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorPkg createActorPkg() {
		ActorPkgImpl actorPkg = new ActorPkgImpl();
		return actorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mission createMission() {
		MissionImpl mission = new MissionImpl();
		return mission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionPkg createMissionPkg() {
		MissionPkgImpl missionPkg = new MissionPkgImpl();
		return missionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemMissionInvolvement createSystemMissionInvolvement() {
		SystemMissionInvolvementImpl systemMissionInvolvement = new SystemMissionInvolvementImpl();
		return systemMissionInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityExploitation createCapabilityExploitation() {
		CapabilityExploitationImpl capabilityExploitation = new CapabilityExploitationImpl();
		return capabilityExploitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityPkg createCapabilityPkg() {
		CapabilityPkgImpl capabilityPkg = new CapabilityPkgImpl();
		return capabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemCapabilityInvolvement createSystemCapabilityInvolvement() {
		SystemCapabilityInvolvementImpl systemCapabilityInvolvement = new SystemCapabilityInvolvementImpl();
		return systemCapabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActorRealization createOperationalActorRealization() {
		OperationalActorRealizationImpl operationalActorRealization = new OperationalActorRealizationImpl();
		return operationalActorRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysisRealization createOperationalAnalysisRealization() {
		OperationalAnalysisRealizationImpl operationalAnalysisRealization = new OperationalAnalysisRealizationImpl();
		return operationalAnalysisRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalEntityRealization createOperationalEntityRealization() {
		OperationalEntityRealizationImpl operationalEntityRealization = new OperationalEntityRealizationImpl();
		return operationalEntityRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext createSystemContext() {
		SystemContextImpl systemContext = new SystemContextImpl();
		return systemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtxPackage getCtxPackage() {
		return (CtxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CtxPackage getPackage() {
		return CtxPackage.eINSTANCE;
	}

} //CtxFactoryImpl
