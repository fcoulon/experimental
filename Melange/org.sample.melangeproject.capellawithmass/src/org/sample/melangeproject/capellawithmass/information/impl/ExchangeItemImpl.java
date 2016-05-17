/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;
import org.sample.melangeproject.capellawithmass.behavior.AbstractSignal;

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.AbstractPropertyValue;
import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;
import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.EnumerationPropertyLiteral;
import org.sample.melangeproject.capellawithmass.capellacore.EnumerationPropertyType;
import org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement;
import org.sample.melangeproject.capellawithmass.capellacore.Generalization;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Namespace;
import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValueGroup;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.TypedElement;

import org.sample.melangeproject.capellawithmass.cs.Interface;

import org.sample.melangeproject.capellawithmass.information.ExchangeItem;
import org.sample.melangeproject.capellawithmass.information.ExchangeItemElement;
import org.sample.melangeproject.capellawithmass.information.ExchangeItemInstance;
import org.sample.melangeproject.capellawithmass.information.ExchangeMechanism;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.InformationRealization;
import org.sample.melangeproject.capellawithmass.information.Operation;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace;
import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.AbstractExchangeItemImpl;

import org.sample.melangeproject.capellawithmass.requirement.Requirement;
import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getTypedElements <em>Typed Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedGeneralizations <em>Owned Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getSuperGeneralizations <em>Super Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getSubGeneralizations <em>Sub Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getExchangeMechanism <em>Exchange Mechanism</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedInformationRealizations <em>Owned Information Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getOwnedExchangeItemInstances <em>Owned Exchange Item Instances</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getAllocatorInterfaces <em>Allocator Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getRealizingExchangeItems <em>Realizing Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ExchangeItemImpl#getRealizingOperations <em>Realizing Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeItemImpl extends AbstractExchangeItemImpl implements ExchangeItem {
	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

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
	 * The cached value of the '{@link #getOwnedTraces() <em>Owned Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> ownedTraces;

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
	 * The default value of the '{@link #getExchangeMechanism() <em>Exchange Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMechanism()
	 * @generated
	 * @ordered
	 */
	protected static final ExchangeMechanism EXCHANGE_MECHANISM_EDEFAULT = ExchangeMechanism.UNSET;

	/**
	 * The cached value of the '{@link #getExchangeMechanism() <em>Exchange Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeMechanism()
	 * @generated
	 * @ordered
	 */
	protected ExchangeMechanism exchangeMechanism = EXCHANGE_MECHANISM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedElements() <em>Owned Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItemElement> ownedElements;

	/**
	 * The cached value of the '{@link #getOwnedInformationRealizations() <em>Owned Information Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInformationRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<InformationRealization> ownedInformationRealizations;

	/**
	 * The cached value of the '{@link #getOwnedExchangeItemInstances() <em>Owned Exchange Item Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItemInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItemInstance> ownedExchangeItemInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.EXCHANGE_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES);
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
			ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES);
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
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES);
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
			ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS);
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
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InformationPackage.EXCHANGE_ITEM__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, InformationPackage.EXCHANGE_ITEM__FEATURES);
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
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_TRACES);
		}
		return ownedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		// TODO: implement this method to return the 'Contained Generic Traces' reference list
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
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		// TODO: implement this method to return the 'Contained Requirements Traces' reference list
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
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, InformationPackage.EXCHANGE_ITEM__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypedElement> getTypedElements() {
		// TODO: implement this method to return the 'Typed Elements' reference list
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
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralizations() {
		if (ownedGeneralizations == null) {
			ownedGeneralizations = new EObjectContainmentEList<Generalization>(Generalization.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS);
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
	public ExchangeMechanism getExchangeMechanism() {
		return exchangeMechanism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeMechanism(ExchangeMechanism newExchangeMechanism) {
		ExchangeMechanism oldExchangeMechanism = exchangeMechanism;
		exchangeMechanism = newExchangeMechanism == null ? EXCHANGE_MECHANISM_EDEFAULT : newExchangeMechanism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM, oldExchangeMechanism, exchangeMechanism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItemElement> getOwnedElements() {
		if (ownedElements == null) {
			ownedElements = new EObjectContainmentEList<ExchangeItemElement>(ExchangeItemElement.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS);
		}
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationRealization> getOwnedInformationRealizations() {
		if (ownedInformationRealizations == null) {
			ownedInformationRealizations = new EObjectContainmentEList<InformationRealization>(InformationRealization.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS);
		}
		return ownedInformationRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItemInstance> getOwnedExchangeItemInstances() {
		if (ownedExchangeItemInstances == null) {
			ownedExchangeItemInstances = new EObjectContainmentEList<ExchangeItemInstance>(ExchangeItemInstance.class, this, InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES);
		}
		return ownedExchangeItemInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllocatorInterfaces() {
		// TODO: implement this method to return the 'Allocator Interfaces' reference list
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
	public EList<ExchangeItem> getRealizedExchangeItems() {
		// TODO: implement this method to return the 'Realized Exchange Items' reference list
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
	public EList<ExchangeItem> getRealizingExchangeItems() {
		// TODO: implement this method to return the 'Realizing Exchange Items' reference list
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
	public EList<Operation> getRealizingOperations() {
		// TODO: implement this method to return the 'Realizing Operations' reference list
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
				return ((InternalEList<?>)getOwnedGeneralizations()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
				return ((InternalEList<?>)getOwnedElements()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
				return ((InternalEList<?>)getOwnedInformationRealizations()).basicRemove(otherEnd, msgs);
			case InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
				return ((InternalEList<?>)getOwnedExchangeItemInstances()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.EXCHANGE_ITEM__FINAL:
				return isFinal();
			case InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES:
				return getIncomingTraces();
			case InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES:
				return getOutgoingTraces();
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
				return isVisibleInDoc();
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
				return isVisibleInLM();
			case InformationPackage.EXCHANGE_ITEM__SUMMARY:
				return getSummary();
			case InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
				return getDescription();
			case InformationPackage.EXCHANGE_ITEM__REVIEW:
				return getReview();
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case InformationPackage.EXCHANGE_ITEM__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case InformationPackage.EXCHANGE_ITEM__FEATURES:
				return getFeatures();
			case InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
				return getOwnedTraces();
			case InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
				return getNamingRules();
			case InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS:
				return getTypedElements();
			case InformationPackage.EXCHANGE_ITEM__ABSTRACT:
				return isAbstract();
			case InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
				return getOwnedGeneralizations();
			case InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS:
				return getSuperGeneralizations();
			case InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS:
				return getSubGeneralizations();
			case InformationPackage.EXCHANGE_ITEM__SUPER:
				return getSuper();
			case InformationPackage.EXCHANGE_ITEM__SUB:
				return getSub();
			case InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
				return getExchangeMechanism();
			case InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
				return getOwnedElements();
			case InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
				return getOwnedInformationRealizations();
			case InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
				return getOwnedExchangeItemInstances();
			case InformationPackage.EXCHANGE_ITEM__ALLOCATOR_INTERFACES:
				return getAllocatorInterfaces();
			case InformationPackage.EXCHANGE_ITEM__REALIZED_EXCHANGE_ITEMS:
				return getRealizedExchangeItems();
			case InformationPackage.EXCHANGE_ITEM__REALIZING_EXCHANGE_ITEMS:
				return getRealizingExchangeItems();
			case InformationPackage.EXCHANGE_ITEM__REALIZING_OPERATIONS:
				return getRealizingOperations();
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
			case InformationPackage.EXCHANGE_ITEM__FINAL:
				setFinal((Boolean)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
				setVisibleInDoc((Boolean)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
				setVisibleInLM((Boolean)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__SUMMARY:
				setSummary((String)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__REVIEW:
				setReview((String)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				getOwnedGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
				setExchangeMechanism((ExchangeMechanism)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
				getOwnedElements().clear();
				getOwnedElements().addAll((Collection<? extends ExchangeItemElement>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
				getOwnedInformationRealizations().clear();
				getOwnedInformationRealizations().addAll((Collection<? extends InformationRealization>)newValue);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
				getOwnedExchangeItemInstances().clear();
				getOwnedExchangeItemInstances().addAll((Collection<? extends ExchangeItemInstance>)newValue);
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
			case InformationPackage.EXCHANGE_ITEM__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
				setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
				setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case InformationPackage.EXCHANGE_ITEM__FEATURES:
				getFeatures().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
				getNamingRules().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
				setExchangeMechanism(EXCHANGE_MECHANISM_EDEFAULT);
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
				getOwnedElements().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
				getOwnedInformationRealizations().clear();
				return;
			case InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
				getOwnedExchangeItemInstances().clear();
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
			case InformationPackage.EXCHANGE_ITEM__FINAL:
				return final_ != FINAL_EDEFAULT;
			case InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES:
				return !getIncomingTraces().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES:
				return !getOutgoingTraces().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC:
				return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
			case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM:
				return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
			case InformationPackage.EXCHANGE_ITEM__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case InformationPackage.EXCHANGE_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case InformationPackage.EXCHANGE_ITEM__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__STATUS:
				return status != null;
			case InformationPackage.EXCHANGE_ITEM__FEATURES:
				return features != null && !features.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS:
				return !getAppliedRequirements().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS:
				return !getTypedElements().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS:
				return ownedGeneralizations != null && !ownedGeneralizations.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS:
				return !getSuperGeneralizations().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS:
				return !getSubGeneralizations().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__SUPER:
				return !getSuper().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__SUB:
				return !getSub().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__EXCHANGE_MECHANISM:
				return exchangeMechanism != EXCHANGE_MECHANISM_EDEFAULT;
			case InformationPackage.EXCHANGE_ITEM__OWNED_ELEMENTS:
				return ownedElements != null && !ownedElements.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__OWNED_INFORMATION_REALIZATIONS:
				return ownedInformationRealizations != null && !ownedInformationRealizations.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__OWNED_EXCHANGE_ITEM_INSTANCES:
				return ownedExchangeItemInstances != null && !ownedExchangeItemInstances.isEmpty();
			case InformationPackage.EXCHANGE_ITEM__ALLOCATOR_INTERFACES:
				return !getAllocatorInterfaces().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__REALIZED_EXCHANGE_ITEMS:
				return !getRealizedExchangeItems().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__REALIZING_EXCHANGE_ITEMS:
				return !getRealizingExchangeItems().isEmpty();
			case InformationPackage.EXCHANGE_ITEM__REALIZING_OPERATIONS:
				return !getRealizingOperations().isEmpty();
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
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractSignal.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__FINAL: return ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
				default: return -1;
			}
		}
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
				case InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
				case InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__SUMMARY: return CapellacorePackage.CAPELLA_ELEMENT__SUMMARY;
				case InformationPackage.EXCHANGE_ITEM__DESCRIPTION: return CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION;
				case InformationPackage.EXCHANGE_ITEM__REVIEW: return CapellacorePackage.CAPELLA_ELEMENT__REVIEW;
				case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES;
				case InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES;
				case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES;
				case InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS;
				case InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS;
				case InformationPackage.EXCHANGE_ITEM__STATUS: return CapellacorePackage.CAPELLA_ELEMENT__STATUS;
				case InformationPackage.EXCHANGE_ITEM__FEATURES: return CapellacorePackage.CAPELLA_ELEMENT__FEATURES;
				case InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS: return CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__OWNED_TRACES: return CapellacorePackage.NAMESPACE__OWNED_TRACES;
				case InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES;
				case InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES: return CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES;
				case InformationPackage.EXCHANGE_ITEM__NAMING_RULES: return CapellacorePackage.NAMESPACE__NAMING_RULES;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS: return CapellacorePackage.TYPE__TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == GeneralizableElement.class) {
			switch (derivedFeatureID) {
				case InformationPackage.EXCHANGE_ITEM__ABSTRACT: return CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT;
				case InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS;
				case InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS;
				case InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS;
				case InformationPackage.EXCHANGE_ITEM__SUPER: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER;
				case InformationPackage.EXCHANGE_ITEM__SUB: return CapellacorePackage.GENERALIZABLE_ELEMENT__SUB;
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
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == AbstractSignal.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL: return InformationPackage.EXCHANGE_ITEM__FINAL;
				default: return -1;
			}
		}
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES: return InformationPackage.EXCHANGE_ITEM__INCOMING_TRACES;
				case ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES: return InformationPackage.EXCHANGE_ITEM__OUTGOING_TRACES;
				default: return -1;
			}
		}
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC: return InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_DOC;
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM: return InformationPackage.EXCHANGE_ITEM__VISIBLE_IN_LM;
				default: return -1;
			}
		}
		if (baseClass == CapellaElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.CAPELLA_ELEMENT__SUMMARY: return InformationPackage.EXCHANGE_ITEM__SUMMARY;
				case CapellacorePackage.CAPELLA_ELEMENT__DESCRIPTION: return InformationPackage.EXCHANGE_ITEM__DESCRIPTION;
				case CapellacorePackage.CAPELLA_ELEMENT__REVIEW: return InformationPackage.EXCHANGE_ITEM__REVIEW;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES: return InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES: return InformationPackage.EXCHANGE_ITEM__OWNED_ENUMERATION_PROPERTY_TYPES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES: return InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUES;
				case CapellacorePackage.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS: return InformationPackage.EXCHANGE_ITEM__OWNED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS: return InformationPackage.EXCHANGE_ITEM__APPLIED_PROPERTY_VALUE_GROUPS;
				case CapellacorePackage.CAPELLA_ELEMENT__STATUS: return InformationPackage.EXCHANGE_ITEM__STATUS;
				case CapellacorePackage.CAPELLA_ELEMENT__FEATURES: return InformationPackage.EXCHANGE_ITEM__FEATURES;
				case CapellacorePackage.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS: return InformationPackage.EXCHANGE_ITEM__APPLIED_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.NAMESPACE__OWNED_TRACES: return InformationPackage.EXCHANGE_ITEM__OWNED_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_GENERIC_TRACES: return InformationPackage.EXCHANGE_ITEM__CONTAINED_GENERIC_TRACES;
				case CapellacorePackage.NAMESPACE__CONTAINED_REQUIREMENTS_TRACES: return InformationPackage.EXCHANGE_ITEM__CONTAINED_REQUIREMENTS_TRACES;
				case CapellacorePackage.NAMESPACE__NAMING_RULES: return InformationPackage.EXCHANGE_ITEM__NAMING_RULES;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.TYPE__TYPED_ELEMENTS: return InformationPackage.EXCHANGE_ITEM__TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == GeneralizableElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT: return InformationPackage.EXCHANGE_ITEM__ABSTRACT;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS: return InformationPackage.EXCHANGE_ITEM__OWNED_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS: return InformationPackage.EXCHANGE_ITEM__SUPER_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS: return InformationPackage.EXCHANGE_ITEM__SUB_GENERALIZATIONS;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER: return InformationPackage.EXCHANGE_ITEM__SUPER;
				case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB: return InformationPackage.EXCHANGE_ITEM__SUB;
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
		result.append(" (final: ");
		result.append(final_);
		result.append(", visibleInDoc: ");
		result.append(visibleInDoc);
		result.append(", visibleInLM: ");
		result.append(visibleInLM);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", review: ");
		result.append(review);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", exchangeMechanism: ");
		result.append(exchangeMechanism);
		result.append(')');
		return result.toString();
	}

} //ExchangeItemImpl
