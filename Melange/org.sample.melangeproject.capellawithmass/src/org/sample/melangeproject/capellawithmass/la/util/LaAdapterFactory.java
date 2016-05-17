/**
 */
package org.sample.melangeproject.capellawithmass.la.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sample.melangeproject.capellawithmass.activity.AbstractAction;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.CallAction;
import org.sample.melangeproject.capellawithmass.activity.CallBehaviorAction;
import org.sample.melangeproject.capellawithmass.activity.ExecutableNode;
import org.sample.melangeproject.capellawithmass.activity.InvocationAction;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractCapabilityPkg;
import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;
import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;
import org.sample.melangeproject.capellawithmass.capellacore.Classifier;
import org.sample.melangeproject.capellawithmass.capellacore.Feature;
import org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.InvolverElement;
import org.sample.melangeproject.capellawithmass.capellacore.ModellingArchitecture;
import org.sample.melangeproject.capellawithmass.capellacore.ModellingArchitecturePkg;
import org.sample.melangeproject.capellawithmass.capellacore.ModellingBlock;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Namespace;
import org.sample.melangeproject.capellawithmass.capellacore.Relationship;
import org.sample.melangeproject.capellawithmass.capellacore.Structure;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.TypedElement;

import org.sample.melangeproject.capellawithmass.cs.AbstractActor;
import org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation;
import org.sample.melangeproject.capellawithmass.cs.Block;
import org.sample.melangeproject.capellawithmass.cs.BlockArchitecture;
import org.sample.melangeproject.capellawithmass.cs.BlockArchitecturePkg;
import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.ComponentAllocation;
import org.sample.melangeproject.capellawithmass.cs.ComponentArchitecture;
import org.sample.melangeproject.capellawithmass.cs.ComponentContext;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator;
import org.sample.melangeproject.capellawithmass.cs.SystemComponent;

import org.sample.melangeproject.capellawithmass.emde.Element;
import org.sample.melangeproject.capellawithmass.emde.ExtensibleElement;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalArchitecture;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalBlock;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalChainContainer;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalStructure;
import org.sample.melangeproject.capellawithmass.fa.FunctionPkg;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;
import org.sample.melangeproject.capellawithmass.information.MultiplicityElement;
import org.sample.melangeproject.capellawithmass.information.PartitionableElement;
import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkExchanger;

import org.sample.melangeproject.capellawithmass.interaction.AbstractCapability;

import org.sample.melangeproject.capellawithmass.la.*;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModelElement;
import org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sample.melangeproject.capellawithmass.la.LaPackage
 * @generated
 */
public class LaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaSwitch<Adapter> modelSwitch =
		new LaSwitch<Adapter>() {
			@Override
			public Adapter caseLogicalArchitecturePkg(LogicalArchitecturePkg object) {
				return createLogicalArchitecturePkgAdapter();
			}
			@Override
			public Adapter caseLogicalArchitecture(LogicalArchitecture object) {
				return createLogicalArchitectureAdapter();
			}
			@Override
			public Adapter caseLogicalFunction(LogicalFunction object) {
				return createLogicalFunctionAdapter();
			}
			@Override
			public Adapter caseLogicalFunctionPkg(LogicalFunctionPkg object) {
				return createLogicalFunctionPkgAdapter();
			}
			@Override
			public Adapter caseLogicalComponent(LogicalComponent object) {
				return createLogicalComponentAdapter();
			}
			@Override
			public Adapter caseLogicalComponentPkg(LogicalComponentPkg object) {
				return createLogicalComponentPkgAdapter();
			}
			@Override
			public Adapter caseCapabilityRealization(CapabilityRealization object) {
				return createCapabilityRealizationAdapter();
			}
			@Override
			public Adapter caseCapabilityRealizationPkg(CapabilityRealizationPkg object) {
				return createCapabilityRealizationPkgAdapter();
			}
			@Override
			public Adapter caseSystemAnalysisRealization(SystemAnalysisRealization object) {
				return createSystemAnalysisRealizationAdapter();
			}
			@Override
			public Adapter caseSystemRealization(SystemRealization object) {
				return createSystemRealizationAdapter();
			}
			@Override
			public Adapter caseContextInterfaceRealization(ContextInterfaceRealization object) {
				return createContextInterfaceRealizationAdapter();
			}
			@Override
			public Adapter caseLogicalActorPkg(LogicalActorPkg object) {
				return createLogicalActorPkgAdapter();
			}
			@Override
			public Adapter caseLogicalActor(LogicalActor object) {
				return createLogicalActorAdapter();
			}
			@Override
			public Adapter caseSystemActorRealization(SystemActorRealization object) {
				return createSystemActorRealizationAdapter();
			}
			@Override
			public Adapter caseLogicalContext(LogicalContext object) {
				return createLogicalContextAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
				return createAbstractNamedElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter casePublishableElement(PublishableElement object) {
				return createPublishableElementAdapter();
			}
			@Override
			public Adapter caseCapellaElement(CapellaElement object) {
				return createCapellaElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseModellingArchitecturePkg(ModellingArchitecturePkg object) {
				return createModellingArchitecturePkgAdapter();
			}
			@Override
			public Adapter caseBlockArchitecturePkg(BlockArchitecturePkg object) {
				return createBlockArchitecturePkgAdapter();
			}
			@Override
			public Adapter caseModellingArchitecture(ModellingArchitecture object) {
				return createModellingArchitectureAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalArchitecture(AbstractFunctionalArchitecture object) {
				return createAbstractFunctionalArchitectureAdapter();
			}
			@Override
			public Adapter caseBlockArchitecture(BlockArchitecture object) {
				return createBlockArchitectureAdapter();
			}
			@Override
			public Adapter caseComponentArchitecture(ComponentArchitecture object) {
				return createComponentArchitectureAdapter();
			}
			@Override
			public Adapter caseInvolvedElement(InvolvedElement object) {
				return createInvolvedElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseAbstractTypedElement(AbstractTypedElement object) {
				return createAbstractTypedElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseFinalizableElement(FinalizableElement object) {
				return createFinalizableElementAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseAbstractInstance(AbstractInstance object) {
				return createAbstractInstanceAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalChainContainer(AbstractFunctionalChainContainer object) {
				return createAbstractFunctionalChainContainerAdapter();
			}
			@Override
			public Adapter caseActivityNode(ActivityNode object) {
				return createActivityNodeAdapter();
			}
			@Override
			public Adapter caseExecutableNode(ExecutableNode object) {
				return createExecutableNodeAdapter();
			}
			@Override
			public Adapter caseAbstractAction(AbstractAction object) {
				return createAbstractActionAdapter();
			}
			@Override
			public Adapter caseInvocationAction(InvocationAction object) {
				return createInvocationActionAdapter();
			}
			@Override
			public Adapter caseCallAction(CallAction object) {
				return createCallActionAdapter();
			}
			@Override
			public Adapter caseCallBehaviorAction(CallBehaviorAction object) {
				return createCallBehaviorActionAdapter();
			}
			@Override
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
			}
			@Override
			public Adapter caseAbstractEvent(AbstractEvent object) {
				return createAbstractEventAdapter();
			}
			@Override
			public Adapter caseAbstractFunction(AbstractFunction object) {
				return createAbstractFunctionAdapter();
			}
			@Override
			public Adapter caseFunctionPkg(FunctionPkg object) {
				return createFunctionPkgAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseModellingBlock(ModellingBlock object) {
				return createModellingBlockAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalBlock(AbstractFunctionalBlock object) {
				return createAbstractFunctionalBlockAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseGeneralizableElement(GeneralizableElement object) {
				return createGeneralizableElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter casePartitionableElement(PartitionableElement object) {
				return createPartitionableElementAdapter();
			}
			@Override
			public Adapter caseInterfaceAllocator(InterfaceAllocator object) {
				return createInterfaceAllocatorAdapter();
			}
			@Override
			public Adapter caseCommunicationLinkExchanger(CommunicationLinkExchanger object) {
				return createCommunicationLinkExchangerAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseCapabilityRealizationInvolvedElement(CapabilityRealizationInvolvedElement object) {
				return createCapabilityRealizationInvolvedElementAdapter();
			}
			@Override
			public Adapter caseSystemComponent(SystemComponent object) {
				return createSystemComponentAdapter();
			}
			@Override
			public Adapter caseAbstractFunctionalStructure(AbstractFunctionalStructure object) {
				return createAbstractFunctionalStructureAdapter();
			}
			@Override
			public Adapter caseInvolverElement(InvolverElement object) {
				return createInvolverElementAdapter();
			}
			@Override
			public Adapter caseAbstractCapability(AbstractCapability object) {
				return createAbstractCapabilityAdapter();
			}
			@Override
			public Adapter caseAbstractCapabilityPkg(AbstractCapabilityPkg object) {
				return createAbstractCapabilityPkgAdapter();
			}
			@Override
			public Adapter caseAbstractRelationship(AbstractRelationship object) {
				return createAbstractRelationshipAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseAbstractTrace(AbstractTrace object) {
				return createAbstractTraceAdapter();
			}
			@Override
			public Adapter caseAllocation(Allocation object) {
				return createAllocationAdapter();
			}
			@Override
			public Adapter caseArchitectureAllocation(ArchitectureAllocation object) {
				return createArchitectureAllocationAdapter();
			}
			@Override
			public Adapter caseComponentAllocation(ComponentAllocation object) {
				return createComponentAllocationAdapter();
			}
			@Override
			public Adapter caseInterfaceAllocation(InterfaceAllocation object) {
				return createInterfaceAllocationAdapter();
			}
			@Override
			public Adapter caseAbstractActor(AbstractActor object) {
				return createAbstractActorAdapter();
			}
			@Override
			public Adapter caseComponentContext(ComponentContext object) {
				return createComponentContextAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalArchitecturePkg <em>Logical Architecture Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalArchitecturePkg
	 * @generated
	 */
	public Adapter createLogicalArchitecturePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalArchitecture <em>Logical Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalArchitecture
	 * @generated
	 */
	public Adapter createLogicalArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalFunction <em>Logical Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalFunction
	 * @generated
	 */
	public Adapter createLogicalFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg <em>Logical Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalFunctionPkg
	 * @generated
	 */
	public Adapter createLogicalFunctionPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalComponent <em>Logical Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalComponent
	 * @generated
	 */
	public Adapter createLogicalComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalComponentPkg <em>Logical Component Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalComponentPkg
	 * @generated
	 */
	public Adapter createLogicalComponentPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.CapabilityRealization <em>Capability Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.CapabilityRealization
	 * @generated
	 */
	public Adapter createCapabilityRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.CapabilityRealizationPkg <em>Capability Realization Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.CapabilityRealizationPkg
	 * @generated
	 */
	public Adapter createCapabilityRealizationPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.SystemAnalysisRealization <em>System Analysis Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.SystemAnalysisRealization
	 * @generated
	 */
	public Adapter createSystemAnalysisRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.SystemRealization <em>System Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.SystemRealization
	 * @generated
	 */
	public Adapter createSystemRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.ContextInterfaceRealization <em>Context Interface Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.ContextInterfaceRealization
	 * @generated
	 */
	public Adapter createContextInterfaceRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalActorPkg <em>Logical Actor Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalActorPkg
	 * @generated
	 */
	public Adapter createLogicalActorPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalActor <em>Logical Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalActor
	 * @generated
	 */
	public Adapter createLogicalActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.SystemActorRealization <em>System Actor Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.SystemActorRealization
	 * @generated
	 */
	public Adapter createSystemActorRealizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.la.LogicalContext <em>Logical Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.la.LogicalContext
	 * @generated
	 */
	public Adapter createLogicalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.emde.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.emde.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.emde.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.emde.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement <em>Publishable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement
	 * @generated
	 */
	public Adapter createPublishableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.CapellaElement <em>Capella Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellaElement
	 * @generated
	 */
	public Adapter createCapellaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.ModellingArchitecturePkg <em>Modelling Architecture Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.ModellingArchitecturePkg
	 * @generated
	 */
	public Adapter createModellingArchitecturePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecturePkg <em>Block Architecture Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.BlockArchitecturePkg
	 * @generated
	 */
	public Adapter createBlockArchitecturePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.ModellingArchitecture <em>Modelling Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.ModellingArchitecture
	 * @generated
	 */
	public Adapter createModellingArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalArchitecture <em>Abstract Functional Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalArchitecture
	 * @generated
	 */
	public Adapter createAbstractFunctionalArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.BlockArchitecture <em>Block Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.BlockArchitecture
	 * @generated
	 */
	public Adapter createBlockArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.ComponentArchitecture <em>Component Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.ComponentArchitecture
	 * @generated
	 */
	public Adapter createComponentArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement <em>Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement
	 * @generated
	 */
	public Adapter createInvolvedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement <em>Abstract Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement
	 * @generated
	 */
	public Adapter createAbstractTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement <em>Finalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement
	 * @generated
	 */
	public Adapter createFinalizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.AbstractInstance <em>Abstract Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.AbstractInstance
	 * @generated
	 */
	public Adapter createAbstractInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalChainContainer <em>Abstract Functional Chain Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalChainContainer
	 * @generated
	 */
	public Adapter createAbstractFunctionalChainContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.activity.ActivityNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityNode
	 * @generated
	 */
	public Adapter createActivityNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.activity.ExecutableNode <em>Executable Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.activity.ExecutableNode
	 * @generated
	 */
	public Adapter createExecutableNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.activity.AbstractAction <em>Abstract Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.activity.AbstractAction
	 * @generated
	 */
	public Adapter createAbstractActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.activity.InvocationAction <em>Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.activity.InvocationAction
	 * @generated
	 */
	public Adapter createInvocationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.activity.CallAction <em>Call Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.activity.CallAction
	 * @generated
	 */
	public Adapter createCallActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.activity.CallBehaviorAction <em>Call Behavior Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.activity.CallBehaviorAction
	 * @generated
	 */
	public Adapter createCallBehaviorActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractType
	 * @generated
	 */
	public Adapter createAbstractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.behavior.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.behavior.AbstractEvent
	 * @generated
	 */
	public Adapter createAbstractEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunction <em>Abstract Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunction
	 * @generated
	 */
	public Adapter createAbstractFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.fa.FunctionPkg <em>Function Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.fa.FunctionPkg
	 * @generated
	 */
	public Adapter createFunctionPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.ModellingBlock <em>Modelling Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.ModellingBlock
	 * @generated
	 */
	public Adapter createModellingBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalBlock <em>Abstract Functional Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalBlock
	 * @generated
	 */
	public Adapter createAbstractFunctionalBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement <em>Generalizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement
	 * @generated
	 */
	public Adapter createGeneralizableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.PartitionableElement <em>Partitionable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.PartitionableElement
	 * @generated
	 */
	public Adapter createPartitionableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator <em>Interface Allocator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator
	 * @generated
	 */
	public Adapter createInterfaceAllocatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkExchanger <em>Link Exchanger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkExchanger
	 * @generated
	 */
	public Adapter createCommunicationLinkExchangerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement <em>Capability Realization Involved Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement
	 * @generated
	 */
	public Adapter createCapabilityRealizationInvolvedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.SystemComponent <em>System Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.SystemComponent
	 * @generated
	 */
	public Adapter createSystemComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalStructure <em>Abstract Functional Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalStructure
	 * @generated
	 */
	public Adapter createAbstractFunctionalStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.InvolverElement <em>Involver Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.InvolverElement
	 * @generated
	 */
	public Adapter createInvolverElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.interaction.AbstractCapability <em>Abstract Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.interaction.AbstractCapability
	 * @generated
	 */
	public Adapter createAbstractCapabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacommon.AbstractCapabilityPkg <em>Abstract Capability Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.AbstractCapabilityPkg
	 * @generated
	 */
	public Adapter createAbstractCapabilityPkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship <em>Abstract Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship
	 * @generated
	 */
	public Adapter createAbstractRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace <em>Abstract Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace
	 * @generated
	 */
	public Adapter createAbstractTraceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Allocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Allocation
	 * @generated
	 */
	public Adapter createAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation <em>Architecture Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.ArchitectureAllocation
	 * @generated
	 */
	public Adapter createArchitectureAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.ComponentAllocation <em>Component Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.ComponentAllocation
	 * @generated
	 */
	public Adapter createComponentAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation <em>Interface Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation
	 * @generated
	 */
	public Adapter createInterfaceAllocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.AbstractActor <em>Abstract Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.AbstractActor
	 * @generated
	 */
	public Adapter createAbstractActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.cs.ComponentContext <em>Component Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.cs.ComponentContext
	 * @generated
	 */
	public Adapter createComponentContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LaAdapterFactory
