/**
 */
package org.sample.melangeproject.capellawithmass.pa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.pa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaFactoryImpl extends EFactoryImpl implements PaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PaFactory init() {
		try {
			PaFactory thePaFactory = (PaFactory)EPackage.Registry.INSTANCE.getEFactory(PaPackage.eNS_URI);
			if (thePaFactory != null) {
				return thePaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaFactoryImpl() {
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
			case PaPackage.PHYSICAL_ARCHITECTURE_PKG: return createPhysicalArchitecturePkg();
			case PaPackage.PHYSICAL_ARCHITECTURE: return createPhysicalArchitecture();
			case PaPackage.PHYSICAL_FUNCTION: return createPhysicalFunction();
			case PaPackage.PHYSICAL_FUNCTION_PKG: return createPhysicalFunctionPkg();
			case PaPackage.PHYSICAL_COMPONENT: return createPhysicalComponent();
			case PaPackage.PHYSICAL_ACTOR_PKG: return createPhysicalActorPkg();
			case PaPackage.PHYSICAL_COMPONENT_PKG: return createPhysicalComponentPkg();
			case PaPackage.PHYSICAL_ACTOR: return createPhysicalActor();
			case PaPackage.LOGICAL_ACTOR_REALIZATION: return createLogicalActorRealization();
			case PaPackage.PHYSICAL_NODE: return createPhysicalNode();
			case PaPackage.LOGICAL_ARCHITECTURE_REALIZATION: return createLogicalArchitectureRealization();
			case PaPackage.LOGICAL_COMPONENT_REALIZATION: return createLogicalComponentRealization();
			case PaPackage.LOGICAL_INTERFACE_REALIZATION: return createLogicalInterfaceRealization();
			case PaPackage.PHYSICAL_CONTEXT: return createPhysicalContext();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PaPackage.PHYSICAL_COMPONENT_KIND:
				return createPhysicalComponentKindFromString(eDataType, initialValue);
			case PaPackage.PHYSICAL_COMPONENT_NATURE:
				return createPhysicalComponentNatureFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PaPackage.PHYSICAL_COMPONENT_KIND:
				return convertPhysicalComponentKindToString(eDataType, instanceValue);
			case PaPackage.PHYSICAL_COMPONENT_NATURE:
				return convertPhysicalComponentNatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalArchitecturePkg createPhysicalArchitecturePkg() {
		PhysicalArchitecturePkgImpl physicalArchitecturePkg = new PhysicalArchitecturePkgImpl();
		return physicalArchitecturePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalArchitecture createPhysicalArchitecture() {
		PhysicalArchitectureImpl physicalArchitecture = new PhysicalArchitectureImpl();
		return physicalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunction createPhysicalFunction() {
		PhysicalFunctionImpl physicalFunction = new PhysicalFunctionImpl();
		return physicalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFunctionPkg createPhysicalFunctionPkg() {
		PhysicalFunctionPkgImpl physicalFunctionPkg = new PhysicalFunctionPkgImpl();
		return physicalFunctionPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponent createPhysicalComponent() {
		PhysicalComponentImpl physicalComponent = new PhysicalComponentImpl();
		return physicalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalActorPkg createPhysicalActorPkg() {
		PhysicalActorPkgImpl physicalActorPkg = new PhysicalActorPkgImpl();
		return physicalActorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentPkg createPhysicalComponentPkg() {
		PhysicalComponentPkgImpl physicalComponentPkg = new PhysicalComponentPkgImpl();
		return physicalComponentPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalActor createPhysicalActor() {
		PhysicalActorImpl physicalActor = new PhysicalActorImpl();
		return physicalActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalActorRealization createLogicalActorRealization() {
		LogicalActorRealizationImpl logicalActorRealization = new LogicalActorRealizationImpl();
		return logicalActorRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalNode createPhysicalNode() {
		PhysicalNodeImpl physicalNode = new PhysicalNodeImpl();
		return physicalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalArchitectureRealization createLogicalArchitectureRealization() {
		LogicalArchitectureRealizationImpl logicalArchitectureRealization = new LogicalArchitectureRealizationImpl();
		return logicalArchitectureRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalComponentRealization createLogicalComponentRealization() {
		LogicalComponentRealizationImpl logicalComponentRealization = new LogicalComponentRealizationImpl();
		return logicalComponentRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalInterfaceRealization createLogicalInterfaceRealization() {
		LogicalInterfaceRealizationImpl logicalInterfaceRealization = new LogicalInterfaceRealizationImpl();
		return logicalInterfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalContext createPhysicalContext() {
		PhysicalContextImpl physicalContext = new PhysicalContextImpl();
		return physicalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentKind createPhysicalComponentKindFromString(EDataType eDataType, String initialValue) {
		PhysicalComponentKind result = PhysicalComponentKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalComponentKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalComponentNature createPhysicalComponentNatureFromString(EDataType eDataType, String initialValue) {
		PhysicalComponentNature result = PhysicalComponentNature.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhysicalComponentNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaPackage getPaPackage() {
		return (PaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PaPackage getPackage() {
		return PaPackage.eINSTANCE;
	}

} //PaFactoryImpl
