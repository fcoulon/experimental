/**
 */
package org.sample.melangeproject.capellawithmass.information.communication.impl;

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

import org.sample.melangeproject.capellawithmass.capellacore.AbstractPropertyValue;
import org.sample.melangeproject.capellawithmass.capellacore.EnumerationPropertyLiteral;
import org.sample.melangeproject.capellawithmass.capellacore.EnumerationPropertyType;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValueGroup;

import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkKind;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol;
import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.ModelElementImpl;

import org.sample.melangeproject.capellawithmass.requirement.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#isVisibleInDoc <em>Visible In Doc</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#isVisibleInLM <em>Visible In LM</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getOwnedPropertyValues <em>Owned Property Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getOwnedEnumerationPropertyTypes <em>Owned Enumeration Property Types</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getAppliedPropertyValues <em>Applied Property Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getOwnedPropertyValueGroups <em>Owned Property Value Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getAppliedPropertyValueGroups <em>Applied Property Value Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getAppliedRequirements <em>Applied Requirements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.impl.CommunicationLinkImpl#getExchangeItem <em>Exchange Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationLinkImpl extends ModelElementImpl implements CommunicationLink {
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
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationLinkKind KIND_EDEFAULT = CommunicationLinkKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final CommunicationLinkProtocol PROTOCOL_EDEFAULT = CommunicationLinkProtocol.UNSET;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected CommunicationLinkProtocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExchangeItem() <em>Exchange Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeItem()
	 * @generated
	 * @ordered
	 */
	protected ExchangeItem exchangeItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPackage.Literals.COMMUNICATION_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC, oldVisibleInDoc, visibleInDoc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM, oldVisibleInLM, visibleInLM));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__REVIEW, oldReview, review));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractPropertyValue> getOwnedPropertyValues() {
		if (ownedPropertyValues == null) {
			ownedPropertyValues = new EObjectContainmentEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES);
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
			ownedEnumerationPropertyTypes = new EObjectContainmentEList<EnumerationPropertyType>(EnumerationPropertyType.class, this, CommunicationPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES);
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
			appliedPropertyValues = new EObjectResolvingEList<AbstractPropertyValue>(AbstractPropertyValue.class, this, CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES);
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
			ownedPropertyValueGroups = new EObjectContainmentEList<PropertyValueGroup>(PropertyValueGroup.class, this, CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS);
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
			appliedPropertyValueGroups = new EObjectResolvingEList<PropertyValueGroup>(PropertyValueGroup.class, this, CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.COMMUNICATION_LINK__STATUS, oldStatus, status));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationPropertyLiteral> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<EnumerationPropertyLiteral>(EnumerationPropertyLiteral.class, this, CommunicationPackage.COMMUNICATION_LINK__FEATURES);
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
	public CommunicationLinkKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(CommunicationLinkKind newKind) {
		CommunicationLinkKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationLinkProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(CommunicationLinkProtocol newProtocol) {
		CommunicationLinkProtocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem getExchangeItem() {
		if (exchangeItem != null && exchangeItem.eIsProxy()) {
			InternalEObject oldExchangeItem = (InternalEObject)exchangeItem;
			exchangeItem = (ExchangeItem)eResolveProxy(oldExchangeItem);
			if (exchangeItem != oldExchangeItem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CommunicationPackage.COMMUNICATION_LINK__EXCHANGE_ITEM, oldExchangeItem, exchangeItem));
			}
		}
		return exchangeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem basicGetExchangeItem() {
		return exchangeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeItem(ExchangeItem newExchangeItem) {
		ExchangeItem oldExchangeItem = exchangeItem;
		exchangeItem = newExchangeItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommunicationPackage.COMMUNICATION_LINK__EXCHANGE_ITEM, oldExchangeItem, exchangeItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
				return ((InternalEList<?>)getOwnedPropertyValues()).basicRemove(otherEnd, msgs);
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ((InternalEList<?>)getOwnedEnumerationPropertyTypes()).basicRemove(otherEnd, msgs);
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
				return ((InternalEList<?>)getOwnedPropertyValueGroups()).basicRemove(otherEnd, msgs);
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
			case CommunicationPackage.COMMUNICATION_LINK__INCOMING_TRACES:
				return getIncomingTraces();
			case CommunicationPackage.COMMUNICATION_LINK__OUTGOING_TRACES:
				return getOutgoingTraces();
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
				return isVisibleInDoc();
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
				return isVisibleInLM();
			case CommunicationPackage.COMMUNICATION_LINK__SUMMARY:
				return getSummary();
			case CommunicationPackage.COMMUNICATION_LINK__DESCRIPTION:
				return getDescription();
			case CommunicationPackage.COMMUNICATION_LINK__REVIEW:
				return getReview();
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
				return getOwnedPropertyValues();
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
				return getOwnedEnumerationPropertyTypes();
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
				return getAppliedPropertyValues();
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
				return getOwnedPropertyValueGroups();
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
				return getAppliedPropertyValueGroups();
			case CommunicationPackage.COMMUNICATION_LINK__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case CommunicationPackage.COMMUNICATION_LINK__FEATURES:
				return getFeatures();
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_REQUIREMENTS:
				return getAppliedRequirements();
			case CommunicationPackage.COMMUNICATION_LINK__KIND:
				return getKind();
			case CommunicationPackage.COMMUNICATION_LINK__PROTOCOL:
				return getProtocol();
			case CommunicationPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
				if (resolve) return getExchangeItem();
				return basicGetExchangeItem();
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
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
				setVisibleInDoc((Boolean)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
				setVisibleInLM((Boolean)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__SUMMARY:
				setSummary((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__REVIEW:
				setReview((String)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				getOwnedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				getOwnedEnumerationPropertyTypes().addAll((Collection<? extends EnumerationPropertyType>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				getAppliedPropertyValues().addAll((Collection<? extends AbstractPropertyValue>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				getOwnedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				getAppliedPropertyValueGroups().addAll((Collection<? extends PropertyValueGroup>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__STATUS:
				setStatus((EnumerationPropertyLiteral)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EnumerationPropertyLiteral>)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__KIND:
				setKind((CommunicationLinkKind)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__PROTOCOL:
				setProtocol((CommunicationLinkProtocol)newValue);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
				setExchangeItem((ExchangeItem)newValue);
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
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
				setVisibleInDoc(VISIBLE_IN_DOC_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
				setVisibleInLM(VISIBLE_IN_LM_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__REVIEW:
				setReview(REVIEW_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
				getOwnedPropertyValues().clear();
				return;
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
				getOwnedEnumerationPropertyTypes().clear();
				return;
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
				getAppliedPropertyValues().clear();
				return;
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
				getOwnedPropertyValueGroups().clear();
				return;
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
				getAppliedPropertyValueGroups().clear();
				return;
			case CommunicationPackage.COMMUNICATION_LINK__STATUS:
				setStatus((EnumerationPropertyLiteral)null);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__FEATURES:
				getFeatures().clear();
				return;
			case CommunicationPackage.COMMUNICATION_LINK__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__PROTOCOL:
				setProtocol(PROTOCOL_EDEFAULT);
				return;
			case CommunicationPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
				setExchangeItem((ExchangeItem)null);
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
			case CommunicationPackage.COMMUNICATION_LINK__INCOMING_TRACES:
				return !getIncomingTraces().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__OUTGOING_TRACES:
				return !getOutgoingTraces().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC:
				return visibleInDoc != VISIBLE_IN_DOC_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM:
				return visibleInLM != VISIBLE_IN_LM_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_LINK__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CommunicationPackage.COMMUNICATION_LINK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CommunicationPackage.COMMUNICATION_LINK__REVIEW:
				return REVIEW_EDEFAULT == null ? review != null : !REVIEW_EDEFAULT.equals(review);
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUES:
				return ownedPropertyValues != null && !ownedPropertyValues.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_ENUMERATION_PROPERTY_TYPES:
				return ownedEnumerationPropertyTypes != null && !ownedEnumerationPropertyTypes.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUES:
				return appliedPropertyValues != null && !appliedPropertyValues.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__OWNED_PROPERTY_VALUE_GROUPS:
				return ownedPropertyValueGroups != null && !ownedPropertyValueGroups.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_PROPERTY_VALUE_GROUPS:
				return appliedPropertyValueGroups != null && !appliedPropertyValueGroups.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__STATUS:
				return status != null;
			case CommunicationPackage.COMMUNICATION_LINK__FEATURES:
				return features != null && !features.isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__APPLIED_REQUIREMENTS:
				return !getAppliedRequirements().isEmpty();
			case CommunicationPackage.COMMUNICATION_LINK__KIND:
				return kind != KIND_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_LINK__PROTOCOL:
				return protocol != PROTOCOL_EDEFAULT;
			case CommunicationPackage.COMMUNICATION_LINK__EXCHANGE_ITEM:
				return exchangeItem != null;
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
		if (baseClass == PublishableElement.class) {
			switch (derivedFeatureID) {
				case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC;
				case CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM: return ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM;
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
		if (baseClass == PublishableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC: return CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_DOC;
				case ModellingcorePackage.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM: return CommunicationPackage.COMMUNICATION_LINK__VISIBLE_IN_LM;
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
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //CommunicationLinkImpl
