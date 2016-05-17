/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityExchange;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.cs.Part;
import org.sample.melangeproject.capellawithmass.cs.PhysicalLink;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeCategory;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeEnd;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeKind;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeRealization;
import org.sample.melangeproject.capellawithmass.fa.ExchangeContainment;
import org.sample.melangeproject.capellawithmass.fa.ExchangeLink;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecificationRealization;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Port;

import org.sample.melangeproject.capellawithmass.interaction.SequenceMessage;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

import org.sample.melangeproject.capellawithmass.oa.CommunicationMean;
import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Mean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getContainingLink <em>Containing Link</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getOutgoingExchangeSpecificationRealizations <em>Outgoing Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getIncomingExchangeSpecificationRealizations <em>Incoming Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#isOriented <em>Oriented</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getIncomingComponentExchangeRealizations <em>Incoming Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getOutgoingComponentExchangeRealizations <em>Outgoing Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getOutgoingComponentExchangeFunctionalExchangeAllocations <em>Outgoing Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getOwnedComponentExchangeFunctionalExchangeAllocations <em>Owned Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getOwnedComponentExchangeEnds <em>Owned Component Exchange Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getSourcePart <em>Source Part</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getAllocatorPhysicalLinks <em>Allocator Physical Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getRealizedComponentExchanges <em>Realized Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getRealizingComponentExchanges <em>Realizing Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getSourceEntity <em>Source Entity</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.CommunicationMeanImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationMeanImpl extends RelationshipImpl implements CommunicationMean {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNamingRules() <em>Naming Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingRule> namingRules;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected ExchangeContainment link;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentExchangeKind KIND_EDEFAULT = ComponentExchangeKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentExchangeKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isOriented() <em>Oriented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOriented()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORIENTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOriented() <em>Oriented</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOriented()
	 * @generated
	 * @ordered
	 */
	protected boolean oriented = ORIENTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeFunctionalExchangeAllocations() <em>Owned Component Exchange Functional Exchange Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeFunctionalExchangeAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeFunctionalExchangeAllocation> ownedComponentExchangeFunctionalExchangeAllocations;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeRealizations() <em>Owned Component Exchange Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeRealization> ownedComponentExchangeRealizations;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeEnds() <em>Owned Component Exchange Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeEnd> ownedComponentExchangeEnds;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeCategory> categories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationMeanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.COMMUNICATION_MEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, OaPackage.COMMUNICATION_MEAN__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTypedElement> getAbstractTypedElements() {
		// TODO: implement this method to return the 'Abstract Typed Elements' reference list
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
	public EList<SequenceMessage> getInvokingSequenceMessages() {
		// TODO: implement this method to return the 'Invoking Sequence Messages' reference list
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
	public EList<ActivityEdge> getRealizingActivityFlows() {
		// TODO: implement this method to return the 'Realizing Activity Flows' reference list
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
	public ExchangeLink getContainingLink() {
		ExchangeLink containingLink = basicGetContainingLink();
		return containingLink != null && containingLink.eIsProxy() ? (ExchangeLink)eResolveProxy((InternalEObject)containingLink) : containingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeLink basicGetContainingLink() {
		// TODO: implement this method to return the 'Containing Link' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeContainment getLink() {
		if (link != null && link.eIsProxy()) {
			InternalEObject oldLink = (InternalEObject)link;
			link = (ExchangeContainment)eResolveProxy(oldLink);
			if (link != oldLink) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.COMMUNICATION_MEAN__LINK, oldLink, link));
			}
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeContainment basicGetLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(ExchangeContainment newLink, NotificationChain msgs) {
		ExchangeContainment oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(ExchangeContainment newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeSpecificationRealization> getOutgoingExchangeSpecificationRealizations() {
		// TODO: implement this method to return the 'Outgoing Exchange Specification Realizations' reference list
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
	public EList<ExchangeSpecificationRealization> getIncomingExchangeSpecificationRealizations() {
		// TODO: implement this method to return the 'Incoming Exchange Specification Realizations' reference list
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
	public ComponentExchangeKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ComponentExchangeKind newKind) {
		ComponentExchangeKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOriented() {
		return oriented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriented(boolean newOriented) {
		boolean oldOriented = oriented;
		oriented = newOriented;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.COMMUNICATION_MEAN__ORIENTED, oldOriented, oriented));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchange> getAllocatedFunctionalExchanges() {
		// TODO: implement this method to return the 'Allocated Functional Exchanges' reference list
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
	public EList<ComponentExchangeRealization> getIncomingComponentExchangeRealizations() {
		// TODO: implement this method to return the 'Incoming Component Exchange Realizations' reference list
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
	public EList<ComponentExchangeRealization> getOutgoingComponentExchangeRealizations() {
		// TODO: implement this method to return the 'Outgoing Component Exchange Realizations' reference list
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
	public EList<ComponentExchangeFunctionalExchangeAllocation> getOutgoingComponentExchangeFunctionalExchangeAllocations() {
		// TODO: implement this method to return the 'Outgoing Component Exchange Functional Exchange Allocations' reference list
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
	public EList<ComponentExchangeFunctionalExchangeAllocation> getOwnedComponentExchangeFunctionalExchangeAllocations() {
		if (ownedComponentExchangeFunctionalExchangeAllocations == null) {
			ownedComponentExchangeFunctionalExchangeAllocations = new EObjectContainmentEList<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
		}
		return ownedComponentExchangeFunctionalExchangeAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeRealization> getOwnedComponentExchangeRealizations() {
		if (ownedComponentExchangeRealizations == null) {
			ownedComponentExchangeRealizations = new EObjectContainmentEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
		}
		return ownedComponentExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeEnd> getOwnedComponentExchangeEnds() {
		if (ownedComponentExchangeEnds == null) {
			ownedComponentExchangeEnds = new EObjectContainmentEList<ComponentExchangeEnd>(ComponentExchangeEnd.class, this, OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS);
		}
		return ownedComponentExchangeEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSourcePort() {
		Port sourcePort = basicGetSourcePort();
		return sourcePort != null && sourcePort.eIsProxy() ? (Port)eResolveProxy((InternalEObject)sourcePort) : sourcePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetSourcePort() {
		// TODO: implement this method to return the 'Source Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getSourcePart() {
		Part sourcePart = basicGetSourcePart();
		return sourcePart != null && sourcePart.eIsProxy() ? (Part)eResolveProxy((InternalEObject)sourcePart) : sourcePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetSourcePart() {
		// TODO: implement this method to return the 'Source Part' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTargetPort() {
		Port targetPort = basicGetTargetPort();
		return targetPort != null && targetPort.eIsProxy() ? (Port)eResolveProxy((InternalEObject)targetPort) : targetPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTargetPort() {
		// TODO: implement this method to return the 'Target Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part getTargetPart() {
		Part targetPart = basicGetTargetPart();
		return targetPart != null && targetPart.eIsProxy() ? (Part)eResolveProxy((InternalEObject)targetPart) : targetPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Part basicGetTargetPart() {
		// TODO: implement this method to return the 'Target Part' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, OaPackage.COMMUNICATION_MEAN__CATEGORIES, FaPackage.COMPONENT_EXCHANGE_CATEGORY__EXCHANGES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalLink> getAllocatorPhysicalLinks() {
		// TODO: implement this method to return the 'Allocator Physical Links' reference list
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
	public EList<ComponentExchange> getRealizedComponentExchanges() {
		// TODO: implement this method to return the 'Realized Component Exchanges' reference list
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
	public EList<ComponentExchange> getRealizingComponentExchanges() {
		// TODO: implement this method to return the 'Realizing Component Exchanges' reference list
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
	public Entity getSourceEntity() {
		Entity sourceEntity = basicGetSourceEntity();
		return sourceEntity != null && sourceEntity.eIsProxy() ? (Entity)eResolveProxy((InternalEObject)sourceEntity) : sourceEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSourceEntity() {
		// TODO: implement this method to return the 'Source Entity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getTargetEntity() {
		Entity targetEntity = basicGetTargetEntity();
		return targetEntity != null && targetEntity.eIsProxy() ? (Entity)eResolveProxy((InternalEObject)targetEntity) : targetEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetTargetEntity() {
		// TODO: implement this method to return the 'Target Entity' reference
		// -> do not perform proxy resolution
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
			case OaPackage.COMMUNICATION_MEAN__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
				return basicSetLink((ExchangeContainment)otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCategories()).basicAdd(otherEnd, msgs);
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
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__LINK:
				return basicSetLink(null, msgs);
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ((InternalEList<?>)getOwnedComponentExchangeEnds()).basicRemove(otherEnd, msgs);
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				return getName();
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				return getNamingRules();
			case OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
			case OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK:
				if (resolve) return getContainingLink();
				return basicGetContainingLink();
			case OaPackage.COMMUNICATION_MEAN__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOutgoingExchangeSpecificationRealizations();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getIncomingExchangeSpecificationRealizations();
			case OaPackage.COMMUNICATION_MEAN__KIND:
				return getKind();
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				return isOriented();
			case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return getAllocatedFunctionalExchanges();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getIncomingComponentExchangeRealizations();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOutgoingComponentExchangeRealizations();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOutgoingComponentExchangeFunctionalExchangeAllocations();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeFunctionalExchangeAllocations();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOwnedComponentExchangeRealizations();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				return getOwnedComponentExchangeEnds();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PART:
				if (resolve) return getSourcePart();
				return basicGetSourcePart();
			case OaPackage.COMMUNICATION_MEAN__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case OaPackage.COMMUNICATION_MEAN__TARGET_PART:
				if (resolve) return getTargetPart();
				return basicGetTargetPart();
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				return getCategories();
			case OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS:
				return getAllocatorPhysicalLinks();
			case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES:
				return getRealizedComponentExchanges();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES:
				return getRealizingComponentExchanges();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_ENTITY:
				if (resolve) return getSourceEntity();
				return basicGetSourceEntity();
			case OaPackage.COMMUNICATION_MEAN__TARGET_ENTITY:
				if (resolve) return getTargetEntity();
				return basicGetTargetEntity();
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				setName((String)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__LINK:
				setLink((ExchangeContainment)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__KIND:
				setKind((ComponentExchangeKind)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				setOriented((Boolean)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				getOwnedComponentExchangeFunctionalExchangeAllocations().addAll((Collection<? extends ComponentExchangeFunctionalExchangeAllocation>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				getOwnedComponentExchangeRealizations().addAll((Collection<? extends ComponentExchangeRealization>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				getOwnedComponentExchangeEnds().clear();
				getOwnedComponentExchangeEnds().addAll((Collection<? extends ComponentExchangeEnd>)newValue);
				return;
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends ComponentExchangeCategory>)newValue);
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				getNamingRules().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__LINK:
				setLink((ExchangeContainment)null);
				return;
			case OaPackage.COMMUNICATION_MEAN__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				setOriented(ORIENTED_EDEFAULT);
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				getOwnedComponentExchangeEnds().clear();
				return;
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				getCategories().clear();
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
			case OaPackage.COMMUNICATION_MEAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OaPackage.COMMUNICATION_MEAN__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS:
				return !getAbstractTypedElements().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES:
				return !getInvokingSequenceMessages().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS:
				return !getRealizingActivityFlows().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK:
				return basicGetContainingLink() != null;
			case OaPackage.COMMUNICATION_MEAN__LINK:
				return link != null;
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return !getOutgoingExchangeSpecificationRealizations().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return !getIncomingExchangeSpecificationRealizations().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__KIND:
				return kind != KIND_EDEFAULT;
			case OaPackage.COMMUNICATION_MEAN__ORIENTED:
				return oriented != ORIENTED_EDEFAULT;
			case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return !getAllocatedFunctionalExchanges().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return !getIncomingComponentExchangeRealizations().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return !getOutgoingComponentExchangeRealizations().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return !getOutgoingComponentExchangeFunctionalExchangeAllocations().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeFunctionalExchangeAllocations != null && !ownedComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ownedComponentExchangeRealizations != null && !ownedComponentExchangeRealizations.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ownedComponentExchangeEnds != null && !ownedComponentExchangeEnds.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PORT:
				return basicGetSourcePort() != null;
			case OaPackage.COMMUNICATION_MEAN__SOURCE_PART:
				return basicGetSourcePart() != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET_PORT:
				return basicGetTargetPort() != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET_PART:
				return basicGetTargetPart() != null;
			case OaPackage.COMMUNICATION_MEAN__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS:
				return !getAllocatorPhysicalLinks().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES:
				return !getRealizedComponentExchanges().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES:
				return !getRealizingComponentExchanges().isEmpty();
			case OaPackage.COMMUNICATION_MEAN__SOURCE_ENTITY:
				return basicGetSourceEntity() != null;
			case OaPackage.COMMUNICATION_MEAN__TARGET_ENTITY:
				return basicGetTargetEntity() != null;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS: return ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK: return FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK;
				case OaPackage.COMMUNICATION_MEAN__LINK: return FaPackage.EXCHANGE_SPECIFICATION__LINK;
				case OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				default: return -1;
			}
		}
		if (baseClass == ComponentExchange.class) {
			switch (derivedFeatureID) {
				case OaPackage.COMMUNICATION_MEAN__KIND: return FaPackage.COMPONENT_EXCHANGE__KIND;
				case OaPackage.COMMUNICATION_MEAN__ORIENTED: return FaPackage.COMPONENT_EXCHANGE__ORIENTED;
				case OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES;
				case OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS;
				case OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS: return FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS;
				case OaPackage.COMMUNICATION_MEAN__SOURCE_PORT: return FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT;
				case OaPackage.COMMUNICATION_MEAN__SOURCE_PART: return FaPackage.COMPONENT_EXCHANGE__SOURCE_PART;
				case OaPackage.COMMUNICATION_MEAN__TARGET_PORT: return FaPackage.COMPONENT_EXCHANGE__TARGET_PORT;
				case OaPackage.COMMUNICATION_MEAN__TARGET_PART: return FaPackage.COMPONENT_EXCHANGE__TARGET_PART;
				case OaPackage.COMMUNICATION_MEAN__CATEGORIES: return FaPackage.COMPONENT_EXCHANGE__CATEGORIES;
				case OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS: return FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS;
				case OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES;
				case OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES: return FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return OaPackage.COMMUNICATION_MEAN__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return OaPackage.COMMUNICATION_MEAN__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return OaPackage.COMMUNICATION_MEAN__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractInformationFlow.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ActivityExchange.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return OaPackage.COMMUNICATION_MEAN__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (baseFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK: return OaPackage.COMMUNICATION_MEAN__CONTAINING_LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__LINK: return OaPackage.COMMUNICATION_MEAN__LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				default: return -1;
			}
		}
		if (baseClass == ComponentExchange.class) {
			switch (baseFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__KIND: return OaPackage.COMMUNICATION_MEAN__KIND;
				case FaPackage.COMPONENT_EXCHANGE__ORIENTED: return OaPackage.COMMUNICATION_MEAN__ORIENTED;
				case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES: return OaPackage.COMMUNICATION_MEAN__ALLOCATED_FUNCTIONAL_EXCHANGES;
				case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return OaPackage.COMMUNICATION_MEAN__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS: return OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS: return OaPackage.COMMUNICATION_MEAN__OWNED_COMPONENT_EXCHANGE_ENDS;
				case FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT: return OaPackage.COMMUNICATION_MEAN__SOURCE_PORT;
				case FaPackage.COMPONENT_EXCHANGE__SOURCE_PART: return OaPackage.COMMUNICATION_MEAN__SOURCE_PART;
				case FaPackage.COMPONENT_EXCHANGE__TARGET_PORT: return OaPackage.COMMUNICATION_MEAN__TARGET_PORT;
				case FaPackage.COMPONENT_EXCHANGE__TARGET_PART: return OaPackage.COMMUNICATION_MEAN__TARGET_PART;
				case FaPackage.COMPONENT_EXCHANGE__CATEGORIES: return OaPackage.COMMUNICATION_MEAN__CATEGORIES;
				case FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS: return OaPackage.COMMUNICATION_MEAN__ALLOCATOR_PHYSICAL_LINKS;
				case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES: return OaPackage.COMMUNICATION_MEAN__REALIZED_COMPONENT_EXCHANGES;
				case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES: return OaPackage.COMMUNICATION_MEAN__REALIZING_COMPONENT_EXCHANGES;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", kind: ");
		result.append(kind);
		result.append(", oriented: ");
		result.append(oriented);
		result.append(')');
		return result.toString();
	}

} //CommunicationMeanImpl
