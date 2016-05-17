/**
 */
package org.sample.melangeproject.capellawithmass.information.communication.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sample.melangeproject.capellawithmass.behavior.AbstractSignal;

import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;
import org.sample.melangeproject.capellawithmass.capellacore.Classifier;
import org.sample.melangeproject.capellawithmass.capellacore.Feature;
import org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Namespace;
import org.sample.melangeproject.capellawithmass.capellacore.Relationship;
import org.sample.melangeproject.capellawithmass.capellacore.Structure;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.TypedElement;

import org.sample.melangeproject.capellawithmass.emde.Element;
import org.sample.melangeproject.capellawithmass.emde.ExtensibleElement;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;
import org.sample.melangeproject.capellawithmass.information.MultiplicityElement;
import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationItem;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkExchanger;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;
import org.sample.melangeproject.capellawithmass.information.communication.Message;
import org.sample.melangeproject.capellawithmass.information.communication.MessageReference;
import org.sample.melangeproject.capellawithmass.information.communication.MessageReferencePkg;
import org.sample.melangeproject.capellawithmass.information.communication.Signal;
import org.sample.melangeproject.capellawithmass.information.communication.SignalInstance;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship;
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
 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage
 * @generated
 */
public class CommunicationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommunicationPackage.eINSTANCE;
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
	protected CommunicationSwitch<Adapter> modelSwitch =
		new CommunicationSwitch<Adapter>() {
			@Override
			public Adapter caseCommunicationItem(CommunicationItem object) {
				return createCommunicationItemAdapter();
			}
			@Override
			public Adapter caseException(org.sample.melangeproject.capellawithmass.information.communication.Exception object) {
				return createExceptionAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseMessageReference(MessageReference object) {
				return createMessageReferenceAdapter();
			}
			@Override
			public Adapter caseMessageReferencePkg(MessageReferencePkg object) {
				return createMessageReferencePkgAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignalInstance(SignalInstance object) {
				return createSignalInstanceAdapter();
			}
			@Override
			public Adapter caseCommunicationLink(CommunicationLink object) {
				return createCommunicationLinkAdapter();
			}
			@Override
			public Adapter caseCommunicationLinkExchanger(CommunicationLinkExchanger object) {
				return createCommunicationLinkExchangerAdapter();
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
			public Adapter caseAbstractType(AbstractType object) {
				return createAbstractTypeAdapter();
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
			public Adapter caseType(Type object) {
				return createTypeAdapter();
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
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseDataValueContainer(DataValueContainer object) {
				return createDataValueContainerAdapter();
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
			public Adapter caseAbstractSignal(AbstractSignal object) {
				return createAbstractSignalAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationItem
	 * @generated
	 */
	public Adapter createCommunicationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.Exception
	 * @generated
	 */
	public Adapter createExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.MessageReference <em>Message Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.MessageReference
	 * @generated
	 */
	public Adapter createMessageReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.MessageReferencePkg <em>Message Reference Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.MessageReferencePkg
	 * @generated
	 */
	public Adapter createMessageReferencePkgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.SignalInstance <em>Signal Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.SignalInstance
	 * @generated
	 */
	public Adapter createSignalInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink
	 * @generated
	 */
	public Adapter createCommunicationLinkAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer <em>Data Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer
	 * @generated
	 */
	public Adapter createDataValueContainerAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.behavior.AbstractSignal <em>Abstract Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.behavior.AbstractSignal
	 * @generated
	 */
	public Adapter createAbstractSignalAdapter() {
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

} //CommunicationAdapterFactory
