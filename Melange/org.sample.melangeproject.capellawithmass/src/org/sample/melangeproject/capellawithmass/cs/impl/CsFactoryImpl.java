/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.cs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsFactoryImpl extends EFactoryImpl implements CsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsFactory init() {
		try {
			CsFactory theCsFactory = (CsFactory)EPackage.Registry.INSTANCE.getEFactory(CsPackage.eNS_URI);
			if (theCsFactory != null) {
				return theCsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsFactoryImpl() {
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
			case CsPackage.PART: return createPart();
			case CsPackage.INTERFACE_PKG: return createInterfacePkg();
			case CsPackage.INTERFACE: return createInterface();
			case CsPackage.INTERFACE_IMPLEMENTATION: return createInterfaceImplementation();
			case CsPackage.INTERFACE_USE: return createInterfaceUse();
			case CsPackage.ACTOR_CAPABILITY_REALIZATION_INVOLVEMENT: return createActorCapabilityRealizationInvolvement();
			case CsPackage.SYSTEM_COMPONENT_CAPABILITY_REALIZATION_INVOLVEMENT: return createSystemComponentCapabilityRealizationInvolvement();
			case CsPackage.EXCHANGE_ITEM_ALLOCATION: return createExchangeItemAllocation();
			case CsPackage.PHYSICAL_LINK: return createPhysicalLink();
			case CsPackage.PHYSICAL_LINK_CATEGORY: return createPhysicalLinkCategory();
			case CsPackage.PHYSICAL_LINK_END: return createPhysicalLinkEnd();
			case CsPackage.PHYSICAL_LINK_REALIZATION: return createPhysicalLinkRealization();
			case CsPackage.PHYSICAL_PATH: return createPhysicalPath();
			case CsPackage.PHYSICAL_PATH_INVOLVEMENT: return createPhysicalPathInvolvement();
			case CsPackage.PHYSICAL_PATH_REFERENCE: return createPhysicalPathReference();
			case CsPackage.PHYSICAL_PATH_REALIZATION: return createPhysicalPathRealization();
			case CsPackage.PHYSICAL_PORT: return createPhysicalPort();
			case CsPackage.PHYSICAL_PORT_REALIZATION: return createPhysicalPortRealization();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part createPart() {
		PartImpl part = new PartImpl();
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacePkg createInterfacePkg() {
		InterfacePkgImpl interfacePkg = new InterfacePkgImpl();
		return interfacePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceImplementation createInterfaceImplementation() {
		InterfaceImplementationImpl interfaceImplementation = new InterfaceImplementationImpl();
		return interfaceImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceUse createInterfaceUse() {
		InterfaceUseImpl interfaceUse = new InterfaceUseImpl();
		return interfaceUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorCapabilityRealizationInvolvement createActorCapabilityRealizationInvolvement() {
		ActorCapabilityRealizationInvolvementImpl actorCapabilityRealizationInvolvement = new ActorCapabilityRealizationInvolvementImpl();
		return actorCapabilityRealizationInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentCapabilityRealizationInvolvement createSystemComponentCapabilityRealizationInvolvement() {
		SystemComponentCapabilityRealizationInvolvementImpl systemComponentCapabilityRealizationInvolvement = new SystemComponentCapabilityRealizationInvolvementImpl();
		return systemComponentCapabilityRealizationInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItemAllocation createExchangeItemAllocation() {
		ExchangeItemAllocationImpl exchangeItemAllocation = new ExchangeItemAllocationImpl();
		return exchangeItemAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLink createPhysicalLink() {
		PhysicalLinkImpl physicalLink = new PhysicalLinkImpl();
		return physicalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLinkCategory createPhysicalLinkCategory() {
		PhysicalLinkCategoryImpl physicalLinkCategory = new PhysicalLinkCategoryImpl();
		return physicalLinkCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLinkEnd createPhysicalLinkEnd() {
		PhysicalLinkEndImpl physicalLinkEnd = new PhysicalLinkEndImpl();
		return physicalLinkEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalLinkRealization createPhysicalLinkRealization() {
		PhysicalLinkRealizationImpl physicalLinkRealization = new PhysicalLinkRealizationImpl();
		return physicalLinkRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPath createPhysicalPath() {
		PhysicalPathImpl physicalPath = new PhysicalPathImpl();
		return physicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPathInvolvement createPhysicalPathInvolvement() {
		PhysicalPathInvolvementImpl physicalPathInvolvement = new PhysicalPathInvolvementImpl();
		return physicalPathInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPathReference createPhysicalPathReference() {
		PhysicalPathReferenceImpl physicalPathReference = new PhysicalPathReferenceImpl();
		return physicalPathReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPathRealization createPhysicalPathRealization() {
		PhysicalPathRealizationImpl physicalPathRealization = new PhysicalPathRealizationImpl();
		return physicalPathRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPort createPhysicalPort() {
		PhysicalPortImpl physicalPort = new PhysicalPortImpl();
		return physicalPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalPortRealization createPhysicalPortRealization() {
		PhysicalPortRealizationImpl physicalPortRealization = new PhysicalPortRealizationImpl();
		return physicalPortRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsPackage getCsPackage() {
		return (CsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsPackage getPackage() {
		return CsPackage.eINSTANCE;
	}

} //CsFactoryImpl
