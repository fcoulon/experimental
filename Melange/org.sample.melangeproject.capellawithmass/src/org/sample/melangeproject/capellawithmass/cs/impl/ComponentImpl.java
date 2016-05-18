/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Classifier;
import org.sample.melangeproject.capellawithmass.capellacore.Feature;
import org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement;
import org.sample.melangeproject.capellawithmass.capellacore.Generalization;

import org.sample.melangeproject.capellawithmass.cs.Component;
import org.sample.melangeproject.capellawithmass.cs.ComponentAllocation;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocation;
import org.sample.melangeproject.capellawithmass.cs.InterfaceAllocator;
import org.sample.melangeproject.capellawithmass.cs.InterfaceImplementation;
import org.sample.melangeproject.capellawithmass.cs.InterfaceUse;
import org.sample.melangeproject.capellawithmass.cs.Part;
import org.sample.melangeproject.capellawithmass.cs.PhysicalLink;
import org.sample.melangeproject.capellawithmass.cs.PhysicalLinkCategory;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPath;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPort;

import org.sample.melangeproject.capellawithmass.fa.ComponentPort;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Partition;
import org.sample.melangeproject.capellawithmass.information.PartitionableElement;
import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkExchanger;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedGeneralizations <em>Owned Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getSuperGeneralizations <em>Super Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getSubGeneralizations <em>Sub Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedFeatures <em>Owned Features</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getContainedProperties <em>Contained Properties</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedPartitions <em>Owned Partitions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getRepresentingPartitions <em>Representing Partitions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedInterfaceAllocations <em>Owned Interface Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getProvisionedInterfaceAllocations <em>Provisioned Interface Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getAllocatedInterfaces <em>Allocated Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedCommunicationLinks <em>Owned Communication Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getProduce <em>Produce</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getConsume <em>Consume</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getSend <em>Send</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getReceive <em>Receive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getCall <em>Call</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getAcquire <em>Acquire</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getTransmit <em>Transmit</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedInterfaceUses <em>Owned Interface Uses</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getUsedInterfaceLinks <em>Used Interface Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getUsedInterfaces <em>Used Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedInterfaceImplementations <em>Owned Interface Implementations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getImplementedInterfaceLinks <em>Implemented Interface Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getImplementedInterfaces <em>Implemented Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getProvisionedComponentAllocations <em>Provisioned Component Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getProvisioningComponentAllocations <em>Provisioning Component Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getAllocatedComponents <em>Allocated Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getAllocatingComponents <em>Allocating Components</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getContainedComponentPorts <em>Contained Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getContainedPhysicalPorts <em>Contained Physical Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedPhysicalPath <em>Owned Physical Path</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedPhysicalLinks <em>Owned Physical Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.ComponentImpl#getOwnedPhysicalLinkCategories <em>Owned Physical Link Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends BlockImpl implements Component {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedGeneralizations() <em>Owned Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralizations;

	/**
	 * The cached value of the '{@link #getOwnedFeatures() <em>Owned Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeatures;

	/**
	 * The cached value of the '{@link #getOwnedInterfaceAllocations() <em>Owned Interface Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAllocation> ownedInterfaceAllocations;

	/**
	 * The cached value of the '{@link #getProvisionedInterfaceAllocations() <em>Provisioned Interface Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionedInterfaceAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAllocation> provisionedInterfaceAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedInterfaces() <em>Allocated Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> allocatedInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedCommunicationLinks() <em>Owned Communication Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationLink> ownedCommunicationLinks;

	/**
	 * The cached value of the '{@link #getOwnedInterfaceUses() <em>Owned Interface Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceUses()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceUse> ownedInterfaceUses;

	/**
	 * The cached value of the '{@link #getUsedInterfaceLinks() <em>Used Interface Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInterfaceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceUse> usedInterfaceLinks;

	/**
	 * The cached value of the '{@link #getUsedInterfaces() <em>Used Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> usedInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedInterfaceImplementations() <em>Owned Interface Implementations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterfaceImplementations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> ownedInterfaceImplementations;

	/**
	 * The cached value of the '{@link #getImplementedInterfaceLinks() <em>Implemented Interface Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaceLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> implementedInterfaceLinks;

	/**
	 * The cached value of the '{@link #getImplementedInterfaces() <em>Implemented Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> implementedInterfaces;

	/**
	 * The cached value of the '{@link #getProvisionedComponentAllocations() <em>Provisioned Component Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisionedComponentAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentAllocation> provisionedComponentAllocations;

	/**
	 * The cached value of the '{@link #getProvisioningComponentAllocations() <em>Provisioning Component Allocations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvisioningComponentAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentAllocation> provisioningComponentAllocations;

	/**
	 * The cached value of the '{@link #getAllocatedComponents() <em>Allocated Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> allocatedComponents;

	/**
	 * The cached value of the '{@link #getAllocatingComponents() <em>Allocating Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatingComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> allocatingComponents;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getContainedComponentPorts() <em>Contained Component Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedComponentPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPort> containedComponentPorts;

	/**
	 * The cached value of the '{@link #getContainedParts() <em>Contained Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> containedParts;

	/**
	 * The cached value of the '{@link #getContainedPhysicalPorts() <em>Contained Physical Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedPhysicalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPort> containedPhysicalPorts;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPath() <em>Owned Physical Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPath()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPath> ownedPhysicalPath;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinks() <em>Owned Physical Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> ownedPhysicalLinks;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalLinkCategories() <em>Owned Physical Link Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalLinkCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLinkCategory> ownedPhysicalLinkCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.COMPONENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralizations() {
		if (ownedGeneralizations == null) {
			ownedGeneralizations = new EObjectContainmentEList<Generalization>(Generalization.class, this, CsPackage.COMPONENT__OWNED_GENERALIZATIONS);
		}
		return ownedGeneralizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getSuperGeneralizations() {
		// TODO: implement this method to return the 'Super Generalizations' reference list
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
	public EList<Generalization> getSubGeneralizations() {
		// TODO: implement this method to return the 'Sub Generalizations' reference list
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
	public EList<GeneralizableElement> getSuper() {
		// TODO: implement this method to return the 'Super' reference list
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
	public EList<GeneralizableElement> getSub() {
		// TODO: implement this method to return the 'Sub' reference list
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
	public EList<Feature> getOwnedFeatures() {
		if (ownedFeatures == null) {
			ownedFeatures = new EObjectContainmentEList<Feature>(Feature.class, this, CsPackage.COMPONENT__OWNED_FEATURES);
		}
		return ownedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getContainedProperties() {
		// TODO: implement this method to return the 'Contained Properties' reference list
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
	public EList<Partition> getOwnedPartitions() {
		// TODO: implement this method to return the 'Owned Partitions' reference list
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
	public EList<Partition> getRepresentingPartitions() {
		// TODO: implement this method to return the 'Representing Partitions' reference list
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
	public EList<InterfaceAllocation> getOwnedInterfaceAllocations() {
		if (ownedInterfaceAllocations == null) {
			ownedInterfaceAllocations = new EObjectContainmentEList<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS);
		}
		return ownedInterfaceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceAllocation> getProvisionedInterfaceAllocations() {
		if (provisionedInterfaceAllocations == null) {
			provisionedInterfaceAllocations = new EObjectWithInverseResolvingEList<InterfaceAllocation>(InterfaceAllocation.class, this, CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS, CsPackage.INTERFACE_ALLOCATION__ALLOCATING_INTERFACE_ALLOCATOR);
		}
		return provisionedInterfaceAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllocatedInterfaces() {
		if (allocatedInterfaces == null) {
			allocatedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__ALLOCATED_INTERFACES);
		}
		return allocatedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getOwnedCommunicationLinks() {
		if (ownedCommunicationLinks == null) {
			ownedCommunicationLinks = new EObjectContainmentEList<CommunicationLink>(CommunicationLink.class, this, CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS);
		}
		return ownedCommunicationLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationLink> getProduce() {
		// TODO: implement this method to return the 'Produce' reference list
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
	public EList<CommunicationLink> getConsume() {
		// TODO: implement this method to return the 'Consume' reference list
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
	public EList<CommunicationLink> getSend() {
		// TODO: implement this method to return the 'Send' reference list
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
	public EList<CommunicationLink> getReceive() {
		// TODO: implement this method to return the 'Receive' reference list
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
	public EList<CommunicationLink> getCall() {
		// TODO: implement this method to return the 'Call' reference list
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
	public EList<CommunicationLink> getExecute() {
		// TODO: implement this method to return the 'Execute' reference list
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
	public EList<CommunicationLink> getWrite() {
		// TODO: implement this method to return the 'Write' reference list
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
	public EList<CommunicationLink> getAccess() {
		// TODO: implement this method to return the 'Access' reference list
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
	public EList<CommunicationLink> getAcquire() {
		// TODO: implement this method to return the 'Acquire' reference list
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
	public EList<CommunicationLink> getTransmit() {
		// TODO: implement this method to return the 'Transmit' reference list
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
	public EList<InterfaceUse> getOwnedInterfaceUses() {
		if (ownedInterfaceUses == null) {
			ownedInterfaceUses = new EObjectContainmentEList<InterfaceUse>(InterfaceUse.class, this, CsPackage.COMPONENT__OWNED_INTERFACE_USES);
		}
		return ownedInterfaceUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceUse> getUsedInterfaceLinks() {
		if (usedInterfaceLinks == null) {
			usedInterfaceLinks = new EObjectWithInverseResolvingEList<InterfaceUse>(InterfaceUse.class, this, CsPackage.COMPONENT__USED_INTERFACE_LINKS, CsPackage.INTERFACE_USE__INTERFACE_USER);
		}
		return usedInterfaceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUsedInterfaces() {
		if (usedInterfaces == null) {
			usedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, CsPackage.COMPONENT__USED_INTERFACES, CsPackage.INTERFACE__USER_COMPONENTS);
		}
		return usedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceImplementation> getOwnedInterfaceImplementations() {
		if (ownedInterfaceImplementations == null) {
			ownedInterfaceImplementations = new EObjectContainmentEList<InterfaceImplementation>(InterfaceImplementation.class, this, CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS);
		}
		return ownedInterfaceImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceImplementation> getImplementedInterfaceLinks() {
		if (implementedInterfaceLinks == null) {
			implementedInterfaceLinks = new EObjectWithInverseResolvingEList<InterfaceImplementation>(InterfaceImplementation.class, this, CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS, CsPackage.INTERFACE_IMPLEMENTATION__INTERFACE_IMPLEMENTOR);
		}
		return implementedInterfaceLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		if (implementedInterfaces == null) {
			implementedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<Interface>(Interface.class, this, CsPackage.COMPONENT__IMPLEMENTED_INTERFACES, CsPackage.INTERFACE__IMPLEMENTOR_COMPONENTS);
		}
		return implementedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentAllocation> getProvisionedComponentAllocations() {
		if (provisionedComponentAllocations == null) {
			provisionedComponentAllocations = new EObjectWithInverseResolvingEList<ComponentAllocation>(ComponentAllocation.class, this, CsPackage.COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS, CsPackage.COMPONENT_ALLOCATION__ALLOCATING_COMPONENT);
		}
		return provisionedComponentAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentAllocation> getProvisioningComponentAllocations() {
		if (provisioningComponentAllocations == null) {
			provisioningComponentAllocations = new EObjectWithInverseResolvingEList<ComponentAllocation>(ComponentAllocation.class, this, CsPackage.COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS, CsPackage.COMPONENT_ALLOCATION__ALLOCATED_COMPONENT);
		}
		return provisioningComponentAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getAllocatedComponents() {
		if (allocatedComponents == null) {
			allocatedComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.COMPONENT__ALLOCATED_COMPONENTS);
		}
		return allocatedComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getAllocatingComponents() {
		if (allocatingComponents == null) {
			allocatingComponents = new EObjectResolvingEList<Component>(Component.class, this, CsPackage.COMPONENT__ALLOCATING_COMPONENTS);
		}
		return allocatingComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.COMPONENT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPort> getContainedComponentPorts() {
		if (containedComponentPorts == null) {
			containedComponentPorts = new EObjectResolvingEList<ComponentPort>(ComponentPort.class, this, CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS);
		}
		return containedComponentPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getContainedParts() {
		if (containedParts == null) {
			containedParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.COMPONENT__CONTAINED_PARTS);
		}
		return containedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPort> getContainedPhysicalPorts() {
		if (containedPhysicalPorts == null) {
			containedPhysicalPorts = new EObjectResolvingEList<PhysicalPort>(PhysicalPort.class, this, CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS);
		}
		return containedPhysicalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPath> getOwnedPhysicalPath() {
		if (ownedPhysicalPath == null) {
			ownedPhysicalPath = new EObjectContainmentEList<PhysicalPath>(PhysicalPath.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_PATH);
		}
		return ownedPhysicalPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLink> getOwnedPhysicalLinks() {
		if (ownedPhysicalLinks == null) {
			ownedPhysicalLinks = new EObjectContainmentEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS);
		}
		return ownedPhysicalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLinkCategory> getOwnedPhysicalLinkCategories() {
		if (ownedPhysicalLinkCategories == null) {
			ownedPhysicalLinkCategories = new EObjectContainmentEList<PhysicalLinkCategory>(PhysicalLinkCategory.class, this, CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES);
		}
		return ownedPhysicalLinkCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDecomposed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisionedInterfaceAllocations()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedInterfaceLinks()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedInterfaces()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaceLinks()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementedInterfaces()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisionedComponentAllocations()).basicAdd(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProvisioningComponentAllocations()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				return ((InternalEList<?>)getOwnedGeneralizations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_FEATURES:
				return ((InternalEList<?>)getOwnedFeatures()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return ((InternalEList<?>)getProvisionedInterfaceAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ((InternalEList<?>)getOwnedCommunicationLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				return ((InternalEList<?>)getOwnedInterfaceUses()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return ((InternalEList<?>)getUsedInterfaceLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__USED_INTERFACES:
				return ((InternalEList<?>)getUsedInterfaces()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return ((InternalEList<?>)getOwnedInterfaceImplementations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return ((InternalEList<?>)getImplementedInterfaceLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return ((InternalEList<?>)getImplementedInterfaces()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS:
				return ((InternalEList<?>)getProvisionedComponentAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS:
				return ((InternalEList<?>)getProvisioningComponentAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return ((InternalEList<?>)getOwnedPhysicalPath()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return ((InternalEList<?>)getOwnedPhysicalLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ((InternalEList<?>)getOwnedPhysicalLinkCategories()).basicRemove(otherEnd, msgs);
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
			case CsPackage.COMPONENT__ABSTRACT:
				return isAbstract();
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				return getOwnedGeneralizations();
			case CsPackage.COMPONENT__SUPER_GENERALIZATIONS:
				return getSuperGeneralizations();
			case CsPackage.COMPONENT__SUB_GENERALIZATIONS:
				return getSubGeneralizations();
			case CsPackage.COMPONENT__SUPER:
				return getSuper();
			case CsPackage.COMPONENT__SUB:
				return getSub();
			case CsPackage.COMPONENT__OWNED_FEATURES:
				return getOwnedFeatures();
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return getContainedProperties();
			case CsPackage.COMPONENT__OWNED_PARTITIONS:
				return getOwnedPartitions();
			case CsPackage.COMPONENT__REPRESENTING_PARTITIONS:
				return getRepresentingPartitions();
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return getOwnedInterfaceAllocations();
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return getProvisionedInterfaceAllocations();
			case CsPackage.COMPONENT__ALLOCATED_INTERFACES:
				return getAllocatedInterfaces();
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return getOwnedCommunicationLinks();
			case CsPackage.COMPONENT__PRODUCE:
				return getProduce();
			case CsPackage.COMPONENT__CONSUME:
				return getConsume();
			case CsPackage.COMPONENT__SEND:
				return getSend();
			case CsPackage.COMPONENT__RECEIVE:
				return getReceive();
			case CsPackage.COMPONENT__CALL:
				return getCall();
			case CsPackage.COMPONENT__EXECUTE:
				return getExecute();
			case CsPackage.COMPONENT__WRITE:
				return getWrite();
			case CsPackage.COMPONENT__ACCESS:
				return getAccess();
			case CsPackage.COMPONENT__ACQUIRE:
				return getAcquire();
			case CsPackage.COMPONENT__TRANSMIT:
				return getTransmit();
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				return getOwnedInterfaceUses();
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return getUsedInterfaceLinks();
			case CsPackage.COMPONENT__USED_INTERFACES:
				return getUsedInterfaces();
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return getOwnedInterfaceImplementations();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return getImplementedInterfaceLinks();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case CsPackage.COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS:
				return getProvisionedComponentAllocations();
			case CsPackage.COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS:
				return getProvisioningComponentAllocations();
			case CsPackage.COMPONENT__ALLOCATED_COMPONENTS:
				return getAllocatedComponents();
			case CsPackage.COMPONENT__ALLOCATING_COMPONENTS:
				return getAllocatingComponents();
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return getContainedComponentPorts();
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return getContainedParts();
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return getContainedPhysicalPorts();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return getOwnedPhysicalPath();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return getOwnedPhysicalLinks();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return getOwnedPhysicalLinkCategories();
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
			case CsPackage.COMPONENT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				getOwnedGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_FEATURES:
				getOwnedFeatures().clear();
				getOwnedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				getOwnedInterfaceAllocations().addAll((Collection<? extends InterfaceAllocation>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				getOwnedCommunicationLinks().addAll((Collection<? extends CommunicationLink>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				getOwnedInterfaceUses().clear();
				getOwnedInterfaceUses().addAll((Collection<? extends InterfaceUse>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				getOwnedInterfaceImplementations().clear();
				getOwnedInterfaceImplementations().addAll((Collection<? extends InterfaceImplementation>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				getOwnedPhysicalPath().addAll((Collection<? extends PhysicalPath>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				getOwnedPhysicalLinks().addAll((Collection<? extends PhysicalLink>)newValue);
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
				getOwnedPhysicalLinkCategories().addAll((Collection<? extends PhysicalLinkCategory>)newValue);
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
			case CsPackage.COMPONENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_FEATURES:
				getOwnedFeatures().clear();
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				getOwnedInterfaceAllocations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				getOwnedCommunicationLinks().clear();
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				getOwnedInterfaceUses().clear();
				return;
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				getOwnedInterfaceImplementations().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				getOwnedPhysicalPath().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				getOwnedPhysicalLinks().clear();
				return;
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				getOwnedPhysicalLinkCategories().clear();
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
			case CsPackage.COMPONENT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case CsPackage.COMPONENT__OWNED_GENERALIZATIONS:
				return ownedGeneralizations != null && !ownedGeneralizations.isEmpty();
			case CsPackage.COMPONENT__SUPER_GENERALIZATIONS:
				return !getSuperGeneralizations().isEmpty();
			case CsPackage.COMPONENT__SUB_GENERALIZATIONS:
				return !getSubGeneralizations().isEmpty();
			case CsPackage.COMPONENT__SUPER:
				return !getSuper().isEmpty();
			case CsPackage.COMPONENT__SUB:
				return !getSub().isEmpty();
			case CsPackage.COMPONENT__OWNED_FEATURES:
				return ownedFeatures != null && !ownedFeatures.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PROPERTIES:
				return !getContainedProperties().isEmpty();
			case CsPackage.COMPONENT__OWNED_PARTITIONS:
				return !getOwnedPartitions().isEmpty();
			case CsPackage.COMPONENT__REPRESENTING_PARTITIONS:
				return !getRepresentingPartitions().isEmpty();
			case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS:
				return ownedInterfaceAllocations != null && !ownedInterfaceAllocations.isEmpty();
			case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS:
				return provisionedInterfaceAllocations != null && !provisionedInterfaceAllocations.isEmpty();
			case CsPackage.COMPONENT__ALLOCATED_INTERFACES:
				return allocatedInterfaces != null && !allocatedInterfaces.isEmpty();
			case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS:
				return ownedCommunicationLinks != null && !ownedCommunicationLinks.isEmpty();
			case CsPackage.COMPONENT__PRODUCE:
				return !getProduce().isEmpty();
			case CsPackage.COMPONENT__CONSUME:
				return !getConsume().isEmpty();
			case CsPackage.COMPONENT__SEND:
				return !getSend().isEmpty();
			case CsPackage.COMPONENT__RECEIVE:
				return !getReceive().isEmpty();
			case CsPackage.COMPONENT__CALL:
				return !getCall().isEmpty();
			case CsPackage.COMPONENT__EXECUTE:
				return !getExecute().isEmpty();
			case CsPackage.COMPONENT__WRITE:
				return !getWrite().isEmpty();
			case CsPackage.COMPONENT__ACCESS:
				return !getAccess().isEmpty();
			case CsPackage.COMPONENT__ACQUIRE:
				return !getAcquire().isEmpty();
			case CsPackage.COMPONENT__TRANSMIT:
				return !getTransmit().isEmpty();
			case CsPackage.COMPONENT__OWNED_INTERFACE_USES:
				return ownedInterfaceUses != null && !ownedInterfaceUses.isEmpty();
			case CsPackage.COMPONENT__USED_INTERFACE_LINKS:
				return usedInterfaceLinks != null && !usedInterfaceLinks.isEmpty();
			case CsPackage.COMPONENT__USED_INTERFACES:
				return usedInterfaces != null && !usedInterfaces.isEmpty();
			case CsPackage.COMPONENT__OWNED_INTERFACE_IMPLEMENTATIONS:
				return ownedInterfaceImplementations != null && !ownedInterfaceImplementations.isEmpty();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACE_LINKS:
				return implementedInterfaceLinks != null && !implementedInterfaceLinks.isEmpty();
			case CsPackage.COMPONENT__IMPLEMENTED_INTERFACES:
				return implementedInterfaces != null && !implementedInterfaces.isEmpty();
			case CsPackage.COMPONENT__PROVISIONED_COMPONENT_ALLOCATIONS:
				return provisionedComponentAllocations != null && !provisionedComponentAllocations.isEmpty();
			case CsPackage.COMPONENT__PROVISIONING_COMPONENT_ALLOCATIONS:
				return provisioningComponentAllocations != null && !provisioningComponentAllocations.isEmpty();
			case CsPackage.COMPONENT__ALLOCATED_COMPONENTS:
				return allocatedComponents != null && !allocatedComponents.isEmpty();
			case CsPackage.COMPONENT__ALLOCATING_COMPONENTS:
				return allocatingComponents != null && !allocatingComponents.isEmpty();
			case CsPackage.COMPONENT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.COMPONENT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_COMPONENT_PORTS:
				return containedComponentPorts != null && !containedComponentPorts.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PARTS:
				return containedParts != null && !containedParts.isEmpty();
			case CsPackage.COMPONENT__CONTAINED_PHYSICAL_PORTS:
				return containedPhysicalPorts != null && !containedPhysicalPorts.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_PATH:
				return ownedPhysicalPath != null && !ownedPhysicalPath.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINKS:
				return ownedPhysicalLinks != null && !ownedPhysicalLinks.isEmpty();
			case CsPackage.COMPONENT__OWNED_PHYSICAL_LINK_CATEGORIES:
				return ownedPhysicalLinkCategories != null && !ownedPhysicalLinkCategories.isEmpty();
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
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__ABSTRACT: return CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
				case CsPackage.COMPONENT__OWNED_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS;
				case CsPackage.COMPONENT__SUPER_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS;
				case CsPackage.COMPONENT__SUB_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS;
				case CsPackage.COMPONENT__SUPER: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
				case CsPackage.COMPONENT__SUB: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_FEATURES: return CapellacorePackage.CLASSIFIER__OWNED_FEATURES;
				case CsPackage.COMPONENT__CONTAINED_PROPERTIES: return CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == PartitionableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_PARTITIONS: return InformationPackage.PARTITIONABLE_ELEMENT__OWNED_PARTITIONS;
				case CsPackage.COMPONENT__REPRESENTING_PARTITIONS: return InformationPackage.PARTITIONABLE_ELEMENT__REPRESENTING_PARTITIONS;
				default: return -1;
			}
		}
		if (baseClass == InterfaceAllocator.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.COMPONENT__ALLOCATED_INTERFACES: return CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (derivedFeatureID) {
				case CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS;
				case CsPackage.COMPONENT__PRODUCE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE;
				case CsPackage.COMPONENT__CONSUME: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME;
				case CsPackage.COMPONENT__SEND: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND;
				case CsPackage.COMPONENT__RECEIVE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE;
				case CsPackage.COMPONENT__CALL: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL;
				case CsPackage.COMPONENT__EXECUTE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE;
				case CsPackage.COMPONENT__WRITE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE;
				case CsPackage.COMPONENT__ACCESS: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS;
				case CsPackage.COMPONENT__ACQUIRE: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE;
				case CsPackage.COMPONENT__TRANSMIT: return CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT;
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
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT: return CsPackage.COMPONENT__ABSTRACT;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS: return CsPackage.COMPONENT__OWNED_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS: return CsPackage.COMPONENT__SUPER_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS: return CsPackage.COMPONENT__SUB_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER: return CsPackage.COMPONENT__SUPER;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB: return CsPackage.COMPONENT__SUB;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CLASSIFIER__OWNED_FEATURES: return CsPackage.COMPONENT__OWNED_FEATURES;
				case CapellacorePackage.CLASSIFIER__CONTAINED_PROPERTIES: return CsPackage.COMPONENT__CONTAINED_PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == PartitionableElement.class) {
			switch (baseFeatureID) {
				case InformationPackage.PARTITIONABLE_ELEMENT__OWNED_PARTITIONS: return CsPackage.COMPONENT__OWNED_PARTITIONS;
				case InformationPackage.PARTITIONABLE_ELEMENT__REPRESENTING_PARTITIONS: return CsPackage.COMPONENT__REPRESENTING_PARTITIONS;
				default: return -1;
			}
		}
		if (baseClass == InterfaceAllocator.class) {
			switch (baseFeatureID) {
				case CsPackage.INTERFACE_ALLOCATOR__OWNED_INTERFACE_ALLOCATIONS: return CsPackage.COMPONENT__OWNED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__PROVISIONED_INTERFACE_ALLOCATIONS: return CsPackage.COMPONENT__PROVISIONED_INTERFACE_ALLOCATIONS;
				case CsPackage.INTERFACE_ALLOCATOR__ALLOCATED_INTERFACES: return CsPackage.COMPONENT__ALLOCATED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == CommunicationLinkExchanger.class) {
			switch (baseFeatureID) {
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__OWNED_COMMUNICATION_LINKS: return CsPackage.COMPONENT__OWNED_COMMUNICATION_LINKS;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__PRODUCE: return CsPackage.COMPONENT__PRODUCE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CONSUME: return CsPackage.COMPONENT__CONSUME;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__SEND: return CsPackage.COMPONENT__SEND;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__RECEIVE: return CsPackage.COMPONENT__RECEIVE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__CALL: return CsPackage.COMPONENT__CALL;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__EXECUTE: return CsPackage.COMPONENT__EXECUTE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__WRITE: return CsPackage.COMPONENT__WRITE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACCESS: return CsPackage.COMPONENT__ACCESS;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__ACQUIRE: return CsPackage.COMPONENT__ACQUIRE;
				case CommunicationPackage.COMMUNICATION_LINK_EXCHANGER__TRANSMIT: return CsPackage.COMPONENT__TRANSMIT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
