/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.oa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OaFactoryImpl extends EFactoryImpl implements OaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OaFactory init() {
		try {
			OaFactory theOaFactory = (OaFactory)EPackage.Registry.INSTANCE.getEFactory(OaPackage.eNS_URI);
			if (theOaFactory != null) {
				return theOaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaFactoryImpl() {
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
			case OaPackage.OPERATIONAL_ANALYSIS: return createOperationalAnalysis();
			case OaPackage.OPERATIONAL_ACTIVITY_PKG: return createOperationalActivityPkg();
			case OaPackage.OPERATIONAL_ACTIVITY: return createOperationalActivity();
			case OaPackage.OPERATIONAL_PROCESS: return createOperationalProcess();
			case OaPackage.SWIMLANE: return createSwimlane();
			case OaPackage.OPERATIONAL_CAPABILITY_PKG: return createOperationalCapabilityPkg();
			case OaPackage.OPERATIONAL_CAPABILITY: return createOperationalCapability();
			case OaPackage.ACTIVITY_ALLOCATION: return createActivityAllocation();
			case OaPackage.ROLE_PKG: return createRolePkg();
			case OaPackage.ROLE: return createRole();
			case OaPackage.ROLE_ASSEMBLY_USAGE: return createRoleAssemblyUsage();
			case OaPackage.ROLE_ALLOCATION: return createRoleAllocation();
			case OaPackage.ENTITY_PKG: return createEntityPkg();
			case OaPackage.ENTITY: return createEntity();
			case OaPackage.CONCEPT_PKG: return createConceptPkg();
			case OaPackage.CONCEPT: return createConcept();
			case OaPackage.CONCEPT_COMPLIANCE: return createConceptCompliance();
			case OaPackage.ITEM_IN_CONCEPT: return createItemInConcept();
			case OaPackage.OPERATIONAL_ACTOR: return createOperationalActor();
			case OaPackage.COMMUNITY_OF_INTEREST: return createCommunityOfInterest();
			case OaPackage.COMMUNITY_OF_INTEREST_COMPOSITION: return createCommunityOfInterestComposition();
			case OaPackage.ORGANISATIONAL_UNIT: return createOrganisationalUnit();
			case OaPackage.ORGANISATIONAL_UNIT_COMPOSITION: return createOrganisationalUnitComposition();
			case OaPackage.LOCATION: return createLocation();
			case OaPackage.CAPABILITY_CONFIGURATION: return createCapabilityConfiguration();
			case OaPackage.COMMUNICATION_MEAN: return createCommunicationMean();
			case OaPackage.ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENT: return createEntityOperationalCapabilityInvolvement();
			case OaPackage.OPERATIONAL_CONTEXT: return createOperationalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalAnalysis createOperationalAnalysis() {
		OperationalAnalysisImpl operationalAnalysis = new OperationalAnalysisImpl();
		return operationalAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivityPkg createOperationalActivityPkg() {
		OperationalActivityPkgImpl operationalActivityPkg = new OperationalActivityPkgImpl();
		return operationalActivityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActivity createOperationalActivity() {
		OperationalActivityImpl operationalActivity = new OperationalActivityImpl();
		return operationalActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalProcess createOperationalProcess() {
		OperationalProcessImpl operationalProcess = new OperationalProcessImpl();
		return operationalProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Swimlane createSwimlane() {
		SwimlaneImpl swimlane = new SwimlaneImpl();
		return swimlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapabilityPkg createOperationalCapabilityPkg() {
		OperationalCapabilityPkgImpl operationalCapabilityPkg = new OperationalCapabilityPkgImpl();
		return operationalCapabilityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalCapability createOperationalCapability() {
		OperationalCapabilityImpl operationalCapability = new OperationalCapabilityImpl();
		return operationalCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityAllocation createActivityAllocation() {
		ActivityAllocationImpl activityAllocation = new ActivityAllocationImpl();
		return activityAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePkg createRolePkg() {
		RolePkgImpl rolePkg = new RolePkgImpl();
		return rolePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleAssemblyUsage createRoleAssemblyUsage() {
		RoleAssemblyUsageImpl roleAssemblyUsage = new RoleAssemblyUsageImpl();
		return roleAssemblyUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleAllocation createRoleAllocation() {
		RoleAllocationImpl roleAllocation = new RoleAllocationImpl();
		return roleAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPkg createEntityPkg() {
		EntityPkgImpl entityPkg = new EntityPkgImpl();
		return entityPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptPkg createConceptPkg() {
		ConceptPkgImpl conceptPkg = new ConceptPkgImpl();
		return conceptPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptCompliance createConceptCompliance() {
		ConceptComplianceImpl conceptCompliance = new ConceptComplianceImpl();
		return conceptCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemInConcept createItemInConcept() {
		ItemInConceptImpl itemInConcept = new ItemInConceptImpl();
		return itemInConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalActor createOperationalActor() {
		OperationalActorImpl operationalActor = new OperationalActorImpl();
		return operationalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunityOfInterest createCommunityOfInterest() {
		CommunityOfInterestImpl communityOfInterest = new CommunityOfInterestImpl();
		return communityOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunityOfInterestComposition createCommunityOfInterestComposition() {
		CommunityOfInterestCompositionImpl communityOfInterestComposition = new CommunityOfInterestCompositionImpl();
		return communityOfInterestComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalUnit createOrganisationalUnit() {
		OrganisationalUnitImpl organisationalUnit = new OrganisationalUnitImpl();
		return organisationalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganisationalUnitComposition createOrganisationalUnitComposition() {
		OrganisationalUnitCompositionImpl organisationalUnitComposition = new OrganisationalUnitCompositionImpl();
		return organisationalUnitComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location createLocation() {
		LocationImpl location = new LocationImpl();
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityConfiguration createCapabilityConfiguration() {
		CapabilityConfigurationImpl capabilityConfiguration = new CapabilityConfigurationImpl();
		return capabilityConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMean createCommunicationMean() {
		CommunicationMeanImpl communicationMean = new CommunicationMeanImpl();
		return communicationMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityOperationalCapabilityInvolvement createEntityOperationalCapabilityInvolvement() {
		EntityOperationalCapabilityInvolvementImpl entityOperationalCapabilityInvolvement = new EntityOperationalCapabilityInvolvementImpl();
		return entityOperationalCapabilityInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalContext createOperationalContext() {
		OperationalContextImpl operationalContext = new OperationalContextImpl();
		return operationalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OaPackage getOaPackage() {
		return (OaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OaPackage getPackage() {
		return OaPackage.eINSTANCE;
	}

} //OaFactoryImpl
