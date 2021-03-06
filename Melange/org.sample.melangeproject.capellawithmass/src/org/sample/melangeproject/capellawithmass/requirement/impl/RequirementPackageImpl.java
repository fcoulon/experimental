/**
 */
package org.sample.melangeproject.capellawithmass.requirement.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;

import org.sample.melangeproject.capellawithmass.activity.impl.ActivityPackageImpl;

import org.sample.melangeproject.capellawithmass.behavior.BehaviorPackage;

import org.sample.melangeproject.capellawithmass.behavior.impl.BehaviorPackageImpl;

import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;

import org.sample.melangeproject.capellawithmass.capellacommon.impl.CapellacommonPackageImpl;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;

import org.sample.melangeproject.capellawithmass.capellacore.impl.CapellacorePackageImpl;

import org.sample.melangeproject.capellawithmass.capellamodeller.CapellamodellerPackage;

import org.sample.melangeproject.capellawithmass.capellamodeller.impl.CapellamodellerPackageImpl;

import org.sample.melangeproject.capellawithmass.cs.CsPackage;

import org.sample.melangeproject.capellawithmass.cs.impl.CsPackageImpl;

import org.sample.melangeproject.capellawithmass.ctx.CtxPackage;

import org.sample.melangeproject.capellawithmass.ctx.impl.CtxPackageImpl;

import org.sample.melangeproject.capellawithmass.emde.EmdePackage;

import org.sample.melangeproject.capellawithmass.emde.impl.EmdePackageImpl;

import org.sample.melangeproject.capellawithmass.epbs.EpbsPackage;

import org.sample.melangeproject.capellawithmass.epbs.impl.EpbsPackageImpl;

import org.sample.melangeproject.capellawithmass.fa.FaPackage;

import org.sample.melangeproject.capellawithmass.fa.impl.FaPackageImpl;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;

import org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationPackageImpl;

import org.sample.melangeproject.capellawithmass.information.datatype.DatatypePackage;

import org.sample.melangeproject.capellawithmass.information.datatype.impl.DatatypePackageImpl;

import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

import org.sample.melangeproject.capellawithmass.information.datavalue.impl.DatavaluePackageImpl;

import org.sample.melangeproject.capellawithmass.information.impl.InformationPackageImpl;

import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;

import org.sample.melangeproject.capellawithmass.interaction.impl.InteractionPackageImpl;

import org.sample.melangeproject.capellawithmass.la.LaPackage;

import org.sample.melangeproject.capellawithmass.la.impl.LaPackageImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.ModellingcorePackageImpl;

import org.sample.melangeproject.capellawithmass.oa.OaPackage;

import org.sample.melangeproject.capellawithmass.oa.impl.OaPackageImpl;

import org.sample.melangeproject.capellawithmass.pa.PaPackage;

import org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage;

import org.sample.melangeproject.capellawithmass.pa.deployment.impl.DeploymentPackageImpl;

import org.sample.melangeproject.capellawithmass.pa.impl.PaPackageImpl;

import org.sample.melangeproject.capellawithmass.requirement.Requirement;
import org.sample.melangeproject.capellawithmass.requirement.RequirementFactory;
import org.sample.melangeproject.capellawithmass.requirement.RequirementPackage;
import org.sample.melangeproject.capellawithmass.requirement.RequirementsPkg;
import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;
import org.sample.melangeproject.capellawithmass.requirement.SystemFunctionalInterfaceRequirement;
import org.sample.melangeproject.capellawithmass.requirement.SystemFunctionalRequirement;
import org.sample.melangeproject.capellawithmass.requirement.SystemNonFunctionalInterfaceRequirement;
import org.sample.melangeproject.capellawithmass.requirement.SystemNonFunctionalRequirement;
import org.sample.melangeproject.capellawithmass.requirement.SystemUserRequirement;

import org.sample.melangeproject.capellawithmass.sharedmodel.SharedmodelPackage;

import org.sample.melangeproject.capellawithmass.sharedmodel.impl.SharedmodelPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementPackageImpl extends EPackageImpl implements RequirementPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsPkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsTraceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionalInterfaceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemNonFunctionalInterfaceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemNonFunctionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemUserRequirementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.sample.melangeproject.capellawithmass.requirement.RequirementPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequirementPackageImpl() {
		super(eNS_URI, RequirementFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RequirementPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequirementPackage init() {
		if (isInited) return (RequirementPackage)EPackage.Registry.INSTANCE.getEPackage(RequirementPackage.eNS_URI);

		// Obtain or create and register package
		RequirementPackageImpl theRequirementPackage = (RequirementPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequirementPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequirementPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CsPackageImpl theCsPackage = (CsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) instanceof CsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CsPackage.eNS_URI) : CsPackage.eINSTANCE);
		EpbsPackageImpl theEpbsPackage = (EpbsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) instanceof EpbsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EpbsPackage.eNS_URI) : EpbsPackage.eINSTANCE);
		CapellamodellerPackageImpl theCapellamodellerPackage = (CapellamodellerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) instanceof CapellamodellerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellamodellerPackage.eNS_URI) : CapellamodellerPackage.eINSTANCE);
		EmdePackageImpl theEmdePackage = (EmdePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) instanceof EmdePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EmdePackage.eNS_URI) : EmdePackage.eINSTANCE);
		ActivityPackageImpl theActivityPackage = (ActivityPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) instanceof ActivityPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivityPackage.eNS_URI) : ActivityPackage.eINSTANCE);
		LaPackageImpl theLaPackage = (LaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) instanceof LaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LaPackage.eNS_URI) : LaPackage.eINSTANCE);
		InformationPackageImpl theInformationPackage = (InformationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) instanceof InformationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationPackage.eNS_URI) : InformationPackage.eINSTANCE);
		CommunicationPackageImpl theCommunicationPackage = (CommunicationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) instanceof CommunicationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommunicationPackage.eNS_URI) : CommunicationPackage.eINSTANCE);
		DatatypePackageImpl theDatatypePackage = (DatatypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) instanceof DatatypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypePackage.eNS_URI) : DatatypePackage.eINSTANCE);
		DatavaluePackageImpl theDatavaluePackage = (DatavaluePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) instanceof DatavaluePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatavaluePackage.eNS_URI) : DatavaluePackage.eINSTANCE);
		ModellingcorePackageImpl theModellingcorePackage = (ModellingcorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI) instanceof ModellingcorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI) : ModellingcorePackage.eINSTANCE);
		CapellacorePackageImpl theCapellacorePackage = (CapellacorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) instanceof CapellacorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI) : CapellacorePackage.eINSTANCE);
		SharedmodelPackageImpl theSharedmodelPackage = (SharedmodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) instanceof SharedmodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SharedmodelPackage.eNS_URI) : SharedmodelPackage.eINSTANCE);
		CapellacommonPackageImpl theCapellacommonPackage = (CapellacommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) instanceof CapellacommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CapellacommonPackage.eNS_URI) : CapellacommonPackage.eINSTANCE);
		InteractionPackageImpl theInteractionPackage = (InteractionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) instanceof InteractionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionPackage.eNS_URI) : InteractionPackage.eINSTANCE);
		FaPackageImpl theFaPackage = (FaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) instanceof FaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FaPackage.eNS_URI) : FaPackage.eINSTANCE);
		CtxPackageImpl theCtxPackage = (CtxPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI) instanceof CtxPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CtxPackage.eNS_URI) : CtxPackage.eINSTANCE);
		PaPackageImpl thePaPackage = (PaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) instanceof PaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PaPackage.eNS_URI) : PaPackage.eINSTANCE);
		DeploymentPackageImpl theDeploymentPackage = (DeploymentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) instanceof DeploymentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI) : DeploymentPackage.eINSTANCE);
		OaPackageImpl theOaPackage = (OaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) instanceof OaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OaPackage.eNS_URI) : OaPackage.eINSTANCE);
		BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

		// Create package meta-data objects
		theRequirementPackage.createPackageContents();
		theCsPackage.createPackageContents();
		theEpbsPackage.createPackageContents();
		theCapellamodellerPackage.createPackageContents();
		theEmdePackage.createPackageContents();
		theActivityPackage.createPackageContents();
		theLaPackage.createPackageContents();
		theInformationPackage.createPackageContents();
		theCommunicationPackage.createPackageContents();
		theDatatypePackage.createPackageContents();
		theDatavaluePackage.createPackageContents();
		theModellingcorePackage.createPackageContents();
		theCapellacorePackage.createPackageContents();
		theSharedmodelPackage.createPackageContents();
		theCapellacommonPackage.createPackageContents();
		theInteractionPackage.createPackageContents();
		theFaPackage.createPackageContents();
		theCtxPackage.createPackageContents();
		thePaPackage.createPackageContents();
		theDeploymentPackage.createPackageContents();
		theOaPackage.createPackageContents();
		theBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theRequirementPackage.initializePackageContents();
		theCsPackage.initializePackageContents();
		theEpbsPackage.initializePackageContents();
		theCapellamodellerPackage.initializePackageContents();
		theEmdePackage.initializePackageContents();
		theActivityPackage.initializePackageContents();
		theLaPackage.initializePackageContents();
		theInformationPackage.initializePackageContents();
		theCommunicationPackage.initializePackageContents();
		theDatatypePackage.initializePackageContents();
		theDatavaluePackage.initializePackageContents();
		theModellingcorePackage.initializePackageContents();
		theCapellacorePackage.initializePackageContents();
		theSharedmodelPackage.initializePackageContents();
		theCapellacommonPackage.initializePackageContents();
		theInteractionPackage.initializePackageContents();
		theFaPackage.initializePackageContents();
		theCtxPackage.initializePackageContents();
		thePaPackage.initializePackageContents();
		theDeploymentPackage.initializePackageContents();
		theOaPackage.initializePackageContents();
		theBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirementPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequirementPackage.eNS_URI, theRequirementPackage);
		return theRequirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsPkg() {
		return requirementsPkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsPkg_AdditionalInformation() {
		return (EAttribute)requirementsPkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsPkg_Level() {
		return (EAttribute)requirementsPkgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsPkg_OwnedRequirements() {
		return (EReference)requirementsPkgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsPkg_OwnedRequirementPkgs() {
		return (EReference)requirementsPkgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsTrace() {
		return requirementsTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsTrace_Source() {
		return (EReference)requirementsTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsTrace_Target() {
		return (EReference)requirementsTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_IsObsolete() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_RequirementId() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_AdditionalInformation() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_VerificationMethod() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_VerificationPhase() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ImplementationVersion() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Feature() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_RelatedCapellaElements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFunctionalInterfaceRequirement() {
		return systemFunctionalInterfaceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFunctionalRequirement() {
		return systemFunctionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemNonFunctionalInterfaceRequirement() {
		return systemNonFunctionalInterfaceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemNonFunctionalRequirement() {
		return systemNonFunctionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemUserRequirement() {
		return systemUserRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementFactory getRequirementFactory() {
		return (RequirementFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementsPkgEClass = createEClass(REQUIREMENTS_PKG);
		createEAttribute(requirementsPkgEClass, REQUIREMENTS_PKG__ADDITIONAL_INFORMATION);
		createEAttribute(requirementsPkgEClass, REQUIREMENTS_PKG__LEVEL);
		createEReference(requirementsPkgEClass, REQUIREMENTS_PKG__OWNED_REQUIREMENTS);
		createEReference(requirementsPkgEClass, REQUIREMENTS_PKG__OWNED_REQUIREMENT_PKGS);

		requirementsTraceEClass = createEClass(REQUIREMENTS_TRACE);
		createEReference(requirementsTraceEClass, REQUIREMENTS_TRACE__SOURCE);
		createEReference(requirementsTraceEClass, REQUIREMENTS_TRACE__TARGET);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__IS_OBSOLETE);
		createEAttribute(requirementEClass, REQUIREMENT__REQUIREMENT_ID);
		createEAttribute(requirementEClass, REQUIREMENT__ADDITIONAL_INFORMATION);
		createEAttribute(requirementEClass, REQUIREMENT__VERIFICATION_METHOD);
		createEAttribute(requirementEClass, REQUIREMENT__VERIFICATION_PHASE);
		createEAttribute(requirementEClass, REQUIREMENT__IMPLEMENTATION_VERSION);
		createEAttribute(requirementEClass, REQUIREMENT__FEATURE);
		createEReference(requirementEClass, REQUIREMENT__RELATED_CAPELLA_ELEMENTS);

		systemFunctionalInterfaceRequirementEClass = createEClass(SYSTEM_FUNCTIONAL_INTERFACE_REQUIREMENT);

		systemFunctionalRequirementEClass = createEClass(SYSTEM_FUNCTIONAL_REQUIREMENT);

		systemNonFunctionalInterfaceRequirementEClass = createEClass(SYSTEM_NON_FUNCTIONAL_INTERFACE_REQUIREMENT);

		systemNonFunctionalRequirementEClass = createEClass(SYSTEM_NON_FUNCTIONAL_REQUIREMENT);

		systemUserRequirementEClass = createEClass(SYSTEM_USER_REQUIREMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CapellacorePackage theCapellacorePackage = (CapellacorePackage)EPackage.Registry.INSTANCE.getEPackage(CapellacorePackage.eNS_URI);
		ModellingcorePackage theModellingcorePackage = (ModellingcorePackage)EPackage.Registry.INSTANCE.getEPackage(ModellingcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementsPkgEClass.getESuperTypes().add(theCapellacorePackage.getStructure());
		requirementsTraceEClass.getESuperTypes().add(theCapellacorePackage.getTrace());
		requirementEClass.getESuperTypes().add(theCapellacorePackage.getNamespace());
		systemFunctionalInterfaceRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemFunctionalRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemNonFunctionalInterfaceRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemNonFunctionalRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemUserRequirementEClass.getESuperTypes().add(this.getRequirement());

		// Initialize classes and features; add operations and parameters
		initEClass(requirementsPkgEClass, RequirementsPkg.class, "RequirementsPkg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsPkg_AdditionalInformation(), ecorePackage.getEString(), "additionalInformation", null, 0, 1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementsPkg_Level(), ecorePackage.getEString(), "level", null, 0, 1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsPkg_OwnedRequirements(), this.getRequirement(), null, "ownedRequirements", null, 0, -1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsPkg_OwnedRequirementPkgs(), this.getRequirementsPkg(), null, "ownedRequirementPkgs", null, 0, -1, RequirementsPkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsTraceEClass, RequirementsTrace.class, "RequirementsTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsTrace_Source(), theModellingcorePackage.getTraceableElement(), null, "source", null, 1, 1, RequirementsTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsTrace_Target(), theModellingcorePackage.getTraceableElement(), null, "target", null, 1, 1, RequirementsTrace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_IsObsolete(), ecorePackage.getEBoolean(), "isObsolete", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_RequirementId(), ecorePackage.getEString(), "requirementId", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_AdditionalInformation(), ecorePackage.getEString(), "additionalInformation", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_VerificationMethod(), ecorePackage.getEString(), "verificationMethod", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_VerificationPhase(), ecorePackage.getEString(), "verificationPhase", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ImplementationVersion(), ecorePackage.getEString(), "implementationVersion", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RelatedCapellaElements(), theCapellacorePackage.getCapellaElement(), null, "relatedCapellaElements", null, 0, -1, Requirement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionalInterfaceRequirementEClass, SystemFunctionalInterfaceRequirement.class, "SystemFunctionalInterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemFunctionalRequirementEClass, SystemFunctionalRequirement.class, "SystemFunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemNonFunctionalInterfaceRequirementEClass, SystemNonFunctionalInterfaceRequirement.class, "SystemNonFunctionalInterfaceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemNonFunctionalRequirementEClass, SystemNonFunctionalRequirement.class, "SystemNonFunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemUserRequirementEClass, SystemUserRequirement.class, "SystemUserRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.polarsys.org/kitalpha/dsl/2007/dslfactory
		createDslfactoryAnnotations();
		// http://www.polarsys.org/kitalpha/ecore/documentation
		createDocumentationAnnotations();
		// http://www.polarsys.org/capella/semantic
		createSemanticAnnotations();
		// http://www.polarsys.org/capella/2007/BusinessInformation
		createBusinessInformationAnnotations();
		// http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping
		createMappingAnnotations();
		// http://www.polarsys.org/capella/2007/UML2Mapping
		createUML2MappingAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment
		createSegmentAnnotations();
		// http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore
		createIgnoreAnnotations();
		// http://www.polarsys.org/capella/derived
		createDerivedAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/dsl/2007/dslfactory</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDslfactoryAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/dsl/2007/dslfactory";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "trackResourceModification", "true",
			 "useUUIDs", "false",
			 "useIDAttributes", "true",
			 "extensibleProviderFactory", "true",
			 "childCreationExtenders", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/kitalpha/ecore/documentation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDocumentationAnnotations() {
		String source = "http://www.polarsys.org/kitalpha/ecore/documentation";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "description", "Requirement aims at defining the requirements expression language.\r\n[source: Capella study]",
			 "usage guideline", "none",
			 "used in levels", "n/a",
			 "usage examples", "none",
			 "constraints", "This package depends on the model CapellaCore.ecore",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (requirementsPkgEClass, 
		   source, 
		   new String[] {
			 "description", "a container for Requirement elements, and sub packages containing Requirements\r\n[source: Capella study]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_AdditionalInformation(), 
		   source, 
		   new String[] {
			 "description", "free information field to characterize this requirement package\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_Level(), 
		   source, 
		   new String[] {
			 "description", "the design level to which this requirement package applies\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirements(), 
		   source, 
		   new String[] {
			 "description", "the Requirements contained in this requirement package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "description", "the sub-(Requirement) packages contained in this requirement package\r\n[source: Capella study]",
			 "constraints", "none",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (requirementsTraceEClass, 
		   source, 
		   new String[] {
			 "description", "a specialized kind of Trace to indicate the relationship between two Requirements\r\n[source: Capella study]",
			 "usage guideline", "used to keep track of links between Requirements, typically which requirement answers to which other requirement",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "description", "a capability or condition that must (or should) be satisfied\r\n[source: SysML glossary for SysML v1.0]",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical,epbs",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (getRequirement_IsObsolete(), 
		   source, 
		   new String[] {
			 "description", "field used to flag obsolete requirement (that for some reason we want to keep in the model though)\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirement_RequirementId(), 
		   source, 
		   new String[] {
			 "description", "a unique identifier for this requirement\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirement_AdditionalInformation(), 
		   source, 
		   new String[] {
			 "description", "a free field to capture any additional information required to complement this requirement statement\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirement_VerificationMethod(), 
		   source, 
		   new String[] {
			 "description", "this field receives the description of the method that will be used to verify that this requirement is fulfilled.\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirement_VerificationPhase(), 
		   source, 
		   new String[] {
			 "description", "a field receiving the description of the design phase in which this requirement can/will be verified\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirement_ImplementationVersion(), 
		   source, 
		   new String[] {
			 "description", "a unique identifier to keep track of the version of this requirement\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (getRequirement_Feature(), 
		   source, 
		   new String[] {
			 "description", "the system feature that this requirement corresponds to\r\n[source: Capella study]",
			 "constraints", "none",
			 "type", "n/a",
			 "comment/notes", "none"
		   });	
		addAnnotation
		  (systemFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "description", "A requirement related to an interface functional property",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system, logical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "description", "A requirement related a system functional property",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemNonFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "description", "Any non functional constraint to be satisfied at interfaces level.\r\n(e.g. resources usage, environmental constraints, criticity, performance...) ",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemNonFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "description", "Non functional requirements are any non functional constraints to be satisfied.\r\n(e.g. resources usage, environmental constraints, criticity, performance...) ",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system,logical,physical",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });	
		addAnnotation
		  (systemUserRequirementEClass, 
		   source, 
		   new String[] {
			 "description", "A User requirement that has to be fulfilled by the System",
			 "usage guideline", "n/a",
			 "used in levels", "operational,system",
			 "usage examples", "n/a",
			 "constraints", "none",
			 "comment/notes", "none",
			 "reference documentation", "none"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/semantic</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSemanticAnnotations() {
		String source = "http://www.polarsys.org/capella/semantic";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (requirementsPkgEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsPkg_AdditionalInformation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsPkg_Level(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (requirementsTraceEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsTrace_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsTrace_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_IsObsolete(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_RequirementId(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_AdditionalInformation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_VerificationMethod(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_VerificationPhase(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_ImplementationVersion(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_Feature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_RelatedCapellaElements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemFunctionalRequirementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemNonFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemNonFunctionalRequirementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (systemUserRequirementEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/BusinessInformation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createBusinessInformationAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/BusinessInformation";	
		addAnnotation
		  (requirementsPkgEClass, 
		   source, 
		   new String[] {
			 "Label", "RequirementPkg"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirements(), 
		   source, 
		   new String[] {
			 "Label", "ownedRequirements"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "Label", "subRequirementPkgs"
		   });	
		addAnnotation
		  (requirementsTraceEClass, 
		   source, 
		   new String[] {
			 "Label", "RequirementTrace"
		   });	
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "Label", "Requirement"
		   });	
		addAnnotation
		  (systemFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemFunctionalInterfaceRequirement"
		   });	
		addAnnotation
		  (systemFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemFunctionalRequirement"
		   });	
		addAnnotation
		  (systemNonFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemNonFunctionalInterfaceRequirement"
		   });	
		addAnnotation
		  (systemNonFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemNonFunctionalRequirement"
		   });	
		addAnnotation
		  (systemUserRequirementEClass, 
		   source, 
		   new String[] {
			 "Label", "SystemUserRequirement"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMappingAnnotations() {
		String source = "http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping";	
		addAnnotation
		  (requirementsPkgEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Package",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_AdditionalInformation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_Level(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::packagedElement elements on which Requirement stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "uml::Package::nestedPackage#uml::Package::packagedElement",
			 "explanation", "none",
			 "constraints", "uml::Package::nestedPackage elements on which RequirementPkg stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed"
		   });	
		addAnnotation
		  (requirementsTraceEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "uml::Dependency",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "",
			 "explanation", "SysML::Requirements::Requirement",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_IsObsolete(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_RequirementId(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "SysML::Requirements::Requirement::id",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_AdditionalInformation(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_VerificationMethod(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_VerificationPhase(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_ImplementationVersion(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_Feature(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (getRequirement_RelatedCapellaElements(), 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "keyword::none",
			 "explanation", "Derived and transient",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemNonFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemNonFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement",
			 "explanation", "none",
			 "constraints", "none"
		   });	
		addAnnotation
		  (systemUserRequirementEClass, 
		   source, 
		   new String[] {
			 "UML/SysML semantic equivalences", "",
			 "base metaclass in UML/SysML profile ", "SysML::Requirements::Requirement",
			 "explanation", "none",
			 "constraints", "none"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/UML2Mapping</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUML2MappingAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/UML2Mapping";	
		addAnnotation
		  (getRequirementsPkg_AdditionalInformation(), 
		   source, 
		   new String[] {
			 "featureName", "additionalInformation",
			 "featureOwner", "eng.RequirementPkg",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirementsPkg_Level(), 
		   source, 
		   new String[] {
			 "featureName", "level",
			 "featureOwner", "eng.RequirementPkg",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirements(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
			 "featureName", "packagedElement",
			 "featureOwner", "Package"
		   });	
		addAnnotation
		  (requirementsTraceEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Dependency",
			 "stereotype", "eng.RequirementTrace"
		   });	
		addAnnotation
		  (requirementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.Requirement"
		   });	
		addAnnotation
		  (getRequirement_RequirementId(), 
		   source, 
		   new String[] {
			 "featureName", "requirementId",
			 "featureOwner", "eng.Requirement",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirement_AdditionalInformation(), 
		   source, 
		   new String[] {
			 "featureName", "additionalInformation",
			 "featureOwner", "eng.Requirement",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirement_VerificationMethod(), 
		   source, 
		   new String[] {
			 "featureName", "verificationMethod",
			 "featureOwner", "eng.Requirement",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirement_VerificationPhase(), 
		   source, 
		   new String[] {
			 "featureName", "verificationPhase",
			 "featureOwner", "eng.Requirement",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirement_ImplementationVersion(), 
		   source, 
		   new String[] {
			 "featureName", "implementationVersion",
			 "featureOwner", "eng.Requirement",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (getRequirement_Feature(), 
		   source, 
		   new String[] {
			 "featureName", "feature",
			 "featureOwner", "eng.Requirement",
			 "fromStereotype", "true"
		   });	
		addAnnotation
		  (systemFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.sys.SystemFunctionalInterfaceRequirement"
		   });	
		addAnnotation
		  (systemFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.sys.SystemFunctionalRequirement"
		   });	
		addAnnotation
		  (systemNonFunctionalInterfaceRequirementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.sys.SystemNonFunctionalInterfaceRequirement"
		   });	
		addAnnotation
		  (systemNonFunctionalRequirementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.sys.SystemNonFunctionalRequirement"
		   });	
		addAnnotation
		  (systemUserRequirementEClass, 
		   source, 
		   new String[] {
			 "metaclass", "Class",
			 "stereotype", "eng.sys.SystemUserRequirement"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSegmentAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/ImpactAnalysis/Segment";	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirements(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsPkg_OwnedRequirementPkgs(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIgnoreAnnotations() {
		String source = "http://www.polarsys.org/capella/2007/ImpactAnalysis/Ignore";	
		addAnnotation
		  (requirementsTraceEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.polarsys.org/capella/derived</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDerivedAnnotations() {
		String source = "http://www.polarsys.org/capella/derived";	
		addAnnotation
		  (getRequirementsTrace_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirementsTrace_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRequirement_RelatedCapellaElements(), 
		   source, 
		   new String[] {
		   });
	}

} //RequirementPackageImpl
