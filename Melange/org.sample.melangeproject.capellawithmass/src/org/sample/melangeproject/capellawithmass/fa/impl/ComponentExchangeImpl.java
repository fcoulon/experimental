/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

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

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityExchange;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;

import org.sample.melangeproject.capellawithmass.capellacore.AbstractPropertyValue;
import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;
import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.EnumerationPropertyLiteral;
import org.sample.melangeproject.capellawithmass.capellacore.EnumerationPropertyType;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValueGroup;

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
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.AbstractTypeImpl;

import org.sample.melangeproject.capellawithmass.requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getContainingLink <em>Containing Link</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOutgoingExchangeSpecificationRealizations <em>Outgoing Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getIncomingExchangeSpecificationRealizations <em>Incoming Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#isOriented <em>Oriented</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getAllocatedFunctionalExchanges <em>Allocated Functional Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getIncomingComponentExchangeRealizations <em>Incoming Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOutgoingComponentExchangeRealizations <em>Outgoing Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOutgoingComponentExchangeFunctionalExchangeAllocations <em>Outgoing Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOwnedComponentExchangeFunctionalExchangeAllocations <em>Owned Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getOwnedComponentExchangeEnds <em>Owned Component Exchange Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getSourcePort <em>Source Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getSourcePart <em>Source Part</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getTargetPort <em>Target Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getTargetPart <em>Target Part</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getAllocatorPhysicalLinks <em>Allocator Physical Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getRealizedComponentExchanges <em>Realized Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentExchangeImpl#getRealizingComponentExchanges <em>Realizing Component Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentExchangeImpl extends AbstractTypeImpl implements ComponentExchange {
	/**
	 * The default value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_DOC_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInDoc() <em>Visible In Doc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInDoc()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInDoc = VISIBLE_IN_DOC_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_IN_LM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibleInLM() <em>Visible In LM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibleInLM()
	 * @generated
	 * @ordered
	 */
	protected boolean visibleInLM = VISIBLE_IN_LM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected static final String REVIEW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected String review = REVIEW_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValues() <em>Owned Property Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> ownedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedEnumerationPropertyTypes() <em>Owned Enumeration Property Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnumerationPropertyTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyType> ownedEnumerationPropertyTypes;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValues() <em>Applied Property Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractPropertyValue> appliedPropertyValues;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValueGroups() <em>Owned Property Value Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> ownedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getAppliedPropertyValueGroups() <em>Applied Property Value Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedPropertyValueGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValueGroup> appliedPropertyValueGroups;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected EnumerationPropertyLiteral status;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationPropertyLiteral> features;

	/**
	 * The cached value of the '{@link #getRealizedFlow() <em>Realized Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedFlow()
	 * @generated
	 * @ordered
	 */
	protected AbstractInformationFlow realizedFlow;

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
	protected ComponentExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTrace> getIncomingTraces() {
		// TODO: implement this method to return the 'Incoming Traces' reference list
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
	public EList<AbstractTrace> getOutgoingTraces() {
		// TODO: implement this method to return the 'Outgoing Traces' reference list
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
	public boolean isVisibleInDoc() {
		return visibleInDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleInDoc(boolean newVisibleInDoc) {
		boolean oldVisibleInDoc = visibleInDoc;
		visibleInDoc = newVisibleInDoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisibleInLM() {
		return visibleInLM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleInLM(boolean newVisibleInLM) {
		boolean oldVisibleInLM = visibleInLM;
		visibleInLM = newVisibleInLM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReview() {
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReview(String newReview) {
		String oldReview = review;
		review = newReview;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES);
		}
		return ownedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyType> getOwnedEnumerationPropertyTypes() {
		if (ownedEnumerationPropertyTypes == null) {
			ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES);
		}
		return ownedEnumerationPropertyTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getAppliedPropertyValues() {
		if (appliedPropertyValues == null) {
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES);
		}
		return appliedPropertyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueGroup> getOwnedPropertyValueGroups() {
		if (ownedPropertyValueGroups == null) {
			ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS);
		}
		return ownedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValueGroup> getAppliedPropertyValueGroups() {
		if (appliedPropertyValueGroups == null) {
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS);
		}
		return appliedPropertyValueGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (EnumerationPropertyLiteral)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPropertyLiteral basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EnumerationPropertyLiteral newStatus) {
		EnumerationPropertyLiteral oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, FaPackage.COMPONENT_EXCHANGE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getAppliedRequirements() {
		// TODO: implement this method to return the 'Applied Requirements' reference list
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
	public AbstractInformationFlow getRealizedFlow() {
		if (realizedFlow != null && realizedFlow.eIsProxy()) {
			InternalEObject oldRealizedFlow = (InternalEObject)realizedFlow;
			realizedFlow = (AbstractInformationFlow)eResolveProxy(oldRealizedFlow);
			if (realizedFlow != oldRealizedFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
			}
		}
		return realizedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInformationFlow basicGetRealizedFlow() {
		return realizedFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizedFlow(AbstractInformationFlow newRealizedFlow) {
		AbstractInformationFlow oldRealizedFlow = realizedFlow;
		realizedFlow = newRealizedFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_EXCHANGE__LINK, oldLink, link));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__LINK, oldLink, newLink);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__LINK, newLink, newLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_EXCHANGE__ORIENTED, oldOriented, oriented));
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
			ownedComponentExchangeFunctionalExchangeAllocations = new EObjectContainmentEList<ComponentExchangeFunctionalExchangeAllocation>(ComponentExchangeFunctionalExchangeAllocation.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS);
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
			ownedComponentExchangeRealizations = new EObjectContainmentEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
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
			ownedComponentExchangeEnds = new EObjectContainmentEList<ComponentExchangeEnd>(ComponentExchangeEnd.class, this, FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS);
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
			categories = new EObjectWithInverseResolvingEList.ManyInverse<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, FaPackage.COMPONENT_EXCHANGE__CATEGORIES, FaPackage.COMPONENT_EXCHANGE_CATEGORY__EXCHANGES);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				if (link != null)
					msgs = ((InternalEObject)link).eInverseRemove(this, FaPackage.EXCHANGE_CONTAINMENT__EXCHANGE, ExchangeContainment.class, msgs);
				return basicSetLink((ExchangeContainment)otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
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
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				return basicSetLink(null, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeFunctionalExchangeAllocations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ((InternalEList<?>)getOwnedComponentExchangeEnds()).basicRemove(otherEnd, msgs);
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
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
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
				return getIncomingTraces();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
				return getOutgoingTraces();
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				return isVisibleInDoc();
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				return isVisibleInLM();
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				return getSummary();
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				return getDescription();
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				return getReview();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				return getFeatures();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				if (resolve) return getRealizedFlow();
				return basicGetRealizedFlow();
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return getRealizingActivityFlows();
			case FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
				if (resolve) return getContainingLink();
				return basicGetContainingLink();
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				if (resolve) return getLink();
				return basicGetLink();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOutgoingExchangeSpecificationRealizations();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getIncomingExchangeSpecificationRealizations();
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				return getKind();
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				return isOriented();
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return getAllocatedFunctionalExchanges();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getIncomingComponentExchangeRealizations();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOutgoingComponentExchangeRealizations();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOutgoingComponentExchangeFunctionalExchangeAllocations();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return getOwnedComponentExchangeFunctionalExchangeAllocations();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOwnedComponentExchangeRealizations();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				return getOwnedComponentExchangeEnds();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT:
				if (resolve) return getSourcePort();
				return basicGetSourcePort();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PART:
				if (resolve) return getSourcePart();
				return basicGetSourcePart();
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PORT:
				if (resolve) return getTargetPort();
				return basicGetTargetPort();
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PART:
				if (resolve) return getTargetPart();
				return basicGetTargetPart();
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
				return getCategories();
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS:
				return getAllocatorPhysicalLinks();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
				return getRealizedComponentExchanges();
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
				return getRealizingComponentExchanges();
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
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				setVisibleInDoc((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				setVisibleInLM((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				setSummary((String)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				setReview((String)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				setLink((ExchangeContainment)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				setKind((ComponentExchangeKind)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				setOriented((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				getOwnedComponentExchangeFunctionalExchangeAllocations().addAll((Collection<? extends ComponentExchangeFunctionalExchangeAllocation>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				getOwnedComponentExchangeRealizations().addAll((Collection<? extends ComponentExchangeRealization>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				getOwnedComponentExchangeEnds().clear();
				getOwnedComponentExchangeEnds().addAll((Collection<? extends ComponentExchangeEnd>)newValue);
				return;
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
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
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				getFeatures().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				setLink((ExchangeContainment)null);
				return;
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				setOriented(ORIENTED_EDEFAULT);
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				getOwnedComponentExchangeFunctionalExchangeAllocations().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				getOwnedComponentExchangeEnds().clear();
				return;
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
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
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES:
				return !getIncomingTraces().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES:
				return !getOutgoingTraces().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC:
				return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM:
				return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FaPackage.COMPONENT_EXCHANGE__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__STATUS:
				return status != null;
			case FaPackage.COMPONENT_EXCHANGE__FEATURES:
				return features != null && !features.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS:
				return !getAppliedRequirements().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return !getInvokingSequenceMessages().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW:
				return realizedFlow != null;
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS:
				return !getRealizingActivityFlows().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK:
				return basicGetContainingLink() != null;
			case FaPackage.COMPONENT_EXCHANGE__LINK:
				return link != null;
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return !getOutgoingExchangeSpecificationRealizations().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return !getIncomingExchangeSpecificationRealizations().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__KIND:
				return kind != KIND_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__ORIENTED:
				return oriented != ORIENTED_EDEFAULT;
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATED_FUNCTIONAL_EXCHANGES:
				return !getAllocatedFunctionalExchanges().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_REALIZATIONS:
				return !getIncomingComponentExchangeRealizations().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_REALIZATIONS:
				return !getOutgoingComponentExchangeRealizations().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OUTGOING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return !getOutgoingComponentExchangeFunctionalExchangeAllocations().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATIONS:
				return ownedComponentExchangeFunctionalExchangeAllocations != null && !ownedComponentExchangeFunctionalExchangeAllocations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ownedComponentExchangeRealizations != null && !ownedComponentExchangeRealizations.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__OWNED_COMPONENT_EXCHANGE_ENDS:
				return ownedComponentExchangeEnds != null && !ownedComponentExchangeEnds.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PORT:
				return basicGetSourcePort() != null;
			case FaPackage.COMPONENT_EXCHANGE__SOURCE_PART:
				return basicGetSourcePart() != null;
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PORT:
				return basicGetTargetPort() != null;
			case FaPackage.COMPONENT_EXCHANGE__TARGET_PART:
				return basicGetTargetPart() != null;
			case FaPackage.COMPONENT_EXCHANGE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__ALLOCATOR_PHYSICAL_LINKS:
				return !getAllocatorPhysicalLinks().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__REALIZED_COMPONENT_EXCHANGES:
				return !getRealizedComponentExchanges().isEmpty();
			case FaPackage.COMPONENT_EXCHANGE__REALIZING_COMPONENT_EXCHANGES:
				return !getRealizingComponentExchanges().isEmpty();
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
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
				case FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__SUMMARY: return CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
				case FaPackage.COMPONENT_EXCHANGE__DESCRIPTION: return CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
				case FaPackage.COMPONENT_EXCHANGE__REVIEW: return CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
				case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
				case FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
				case FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
				case FaPackage.COMPONENT_EXCHANGE__STATUS: return CapellacorePackage.CAPELLA_ELEMENT__STATUS;
				case FaPackage.COMPONENT_EXCHANGE__FEATURES: return CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
				case FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractRelationship.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW: return ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
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
				case FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK: return FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK;
				case FaPackage.COMPONENT_EXCHANGE__LINK: return FaPackage.EXCHANGE_SPECIFICATION__LINK;
				case FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
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
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES: return FaPackage.COMPONENT_EXCHANGE__INCOMING_TRACES;
				case ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC: return FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_DOC;
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM: return FaPackage.COMPONENT_EXCHANGE__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CAPELLA_ELEMENT__SUMMARY: return FaPackage.COMPONENT_EXCHANGE__SUMMARY;
				case CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION: return FaPackage.COMPONENT_EXCHANGE__DESCRIPTION;
				case CapellacorePackage.CAPELLA_ELEMENT__REVIEW: return FaPackage.COMPONENT_EXCHANGE__REVIEW;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES: return FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES: return FaPackage.COMPONENT_EXCHANGE__OWNED_ENUMERATION_PROPERTY_TYPES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES: return FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS: return FaPackage.COMPONENT_EXCHANGE__OWNED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS: return FaPackage.COMPONENT_EXCHANGE__APPLIED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__STATUS: return FaPackage.COMPONENT_EXCHANGE__STATUS;
				case CapellacorePackage.CAPELLA_ELEMENT__FEATURES: return FaPackage.COMPONENT_EXCHANGE__FEATURES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS: return FaPackage.COMPONENT_EXCHANGE__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractEventOperation.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return FaPackage.COMPONENT_EXCHANGE__INVOKING_SEQUENCE_MESSAGES;
				default: return -1;
			}
		}
		if (baseClass == AbstractRelationship.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW: return FaPackage.COMPONENT_EXCHANGE__REALIZED_FLOW;
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
				case ActivityPackage.ACTIVITY_EXCHANGE__REALIZING_ACTIVITY_FLOWS: return FaPackage.COMPONENT_EXCHANGE__REALIZING_ACTIVITY_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == ExchangeSpecification.class) {
			switch (baseFeatureID) {
				case FaPackage.EXCHANGE_SPECIFICATION__CONTAINING_LINK: return FaPackage.COMPONENT_EXCHANGE__CONTAINING_LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__LINK: return FaPackage.COMPONENT_EXCHANGE__LINK;
				case FaPackage.EXCHANGE_SPECIFICATION__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__OUTGOING_EXCHANGE_SPECIFICATION_REALIZATIONS;
				case FaPackage.EXCHANGE_SPECIFICATION__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS: return FaPackage.COMPONENT_EXCHANGE__INCOMING_EXCHANGE_SPECIFICATION_REALIZATIONS;
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
		result.append(" (visibleInDoc: ");
		result.append(visibleInDoc);
		result.append(", visibleInLM: ");
		result.append(visibleInLM);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", review: ");
		result.append(review);
		result.append(", kind: ");
		result.append(kind);
		result.append(", oriented: ");
		result.append(oriented);
		result.append(')');
		return result.toString();
	}

} //ComponentExchangeImpl
