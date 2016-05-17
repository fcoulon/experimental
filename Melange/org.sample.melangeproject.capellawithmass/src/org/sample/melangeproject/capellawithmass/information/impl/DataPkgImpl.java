/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.StateEvent;

import org.sample.melangeproject.capellawithmass.capellacore.AbstractExchangeItemPkg;
import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.capellacore.impl.AbstractDependenciesPkgImpl;

import org.sample.melangeproject.capellawithmass.information.Association;
import org.sample.melangeproject.capellawithmass.information.AssociationPkg;
import org.sample.melangeproject.capellawithmass.information.Collection;
import org.sample.melangeproject.capellawithmass.information.DataPkg;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.KeyPart;
import org.sample.melangeproject.capellawithmass.information.Unit;

import org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage;
import org.sample.melangeproject.capellawithmass.information.communication.Message;
import org.sample.melangeproject.capellawithmass.information.communication.MessageReference;
import org.sample.melangeproject.capellawithmass.information.communication.MessageReferencePkg;
import org.sample.melangeproject.capellawithmass.information.communication.Signal;

import org.sample.melangeproject.capellawithmass.information.datatype.DataType;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer;
import org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedExchangeItems <em>Owned Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedAssociations <em>Owned Associations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedDataValues <em>Owned Data Values</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedMessageReferences <em>Owned Message References</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedDataPkgs <em>Owned Data Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedClasses <em>Owned Classes</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedKeyParts <em>Owned Key Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedCollections <em>Owned Collections</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedUnits <em>Owned Units</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedDataTypes <em>Owned Data Types</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedSignals <em>Owned Signals</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedMessages <em>Owned Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedExceptions <em>Owned Exceptions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.DataPkgImpl#getOwnedStateEvents <em>Owned State Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPkgImpl extends AbstractDependenciesPkgImpl implements DataPkg {
	/**
	 * The cached value of the '{@link #getOwnedExchangeItems() <em>Owned Exchange Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> ownedExchangeItems;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAssociations() <em>Owned Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> ownedAssociations;

	/**
	 * The cached value of the '{@link #getOwnedDataValues() <em>Owned Data Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DataValue> ownedDataValues;

	/**
	 * The cached value of the '{@link #getOwnedMessageReferences() <em>Owned Message References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMessageReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageReference> ownedMessageReferences;

	/**
	 * The cached value of the '{@link #getOwnedDataPkgs() <em>Owned Data Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPkg> ownedDataPkgs;

	/**
	 * The cached value of the '{@link #getOwnedClasses() <em>Owned Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.sample.melangeproject.capellawithmass.information.Class> ownedClasses;

	/**
	 * The cached value of the '{@link #getOwnedKeyParts() <em>Owned Key Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedKeyParts()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyPart> ownedKeyParts;

	/**
	 * The cached value of the '{@link #getOwnedCollections() <em>Owned Collections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<Collection> ownedCollections;

	/**
	 * The cached value of the '{@link #getOwnedUnits() <em>Owned Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> ownedUnits;

	/**
	 * The cached value of the '{@link #getOwnedDataTypes() <em>Owned Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> ownedDataTypes;

	/**
	 * The cached value of the '{@link #getOwnedSignals() <em>Owned Signals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSignals()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> ownedSignals;

	/**
	 * The cached value of the '{@link #getOwnedMessages() <em>Owned Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> ownedMessages;

	/**
	 * The cached value of the '{@link #getOwnedExceptions() <em>Owned Exceptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<org.sample.melangeproject.capellawithmass.information.communication.Exception> ownedExceptions;

	/**
	 * The cached value of the '{@link #getOwnedStateEvents() <em>Owned State Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStateEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<StateEvent> ownedStateEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.DATA_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItem> getOwnedExchangeItems() {
		if (ownedExchangeItems == null) {
			ownedExchangeItems = new EObjectContainmentEList<ExchangeItem>(ExchangeItem.class, this, InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS);
		}
		return ownedExchangeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.DATA_PKG__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getOwnedAssociations() {
		if (ownedAssociations == null) {
			ownedAssociations = new EObjectContainmentEList<Association>(Association.class, this, InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS);
		}
		return ownedAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataValue> getOwnedDataValues() {
		if (ownedDataValues == null) {
			ownedDataValues = new EObjectContainmentEList<DataValue>(DataValue.class, this, InformationPackage.DATA_PKG__OWNED_DATA_VALUES);
		}
		return ownedDataValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageReference> getOwnedMessageReferences() {
		if (ownedMessageReferences == null) {
			ownedMessageReferences = new EObjectContainmentEList<MessageReference>(MessageReference.class, this, InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES);
		}
		return ownedMessageReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPkg> getOwnedDataPkgs() {
		if (ownedDataPkgs == null) {
			ownedDataPkgs = new EObjectContainmentEList<DataPkg>(DataPkg.class, this, InformationPackage.DATA_PKG__OWNED_DATA_PKGS);
		}
		return ownedDataPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.sample.melangeproject.capellawithmass.information.Class> getOwnedClasses() {
		if (ownedClasses == null) {
			ownedClasses = new EObjectContainmentEList<org.sample.melangeproject.capellawithmass.information.Class>(org.sample.melangeproject.capellawithmass.information.Class.class, this, InformationPackage.DATA_PKG__OWNED_CLASSES);
		}
		return ownedClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeyPart> getOwnedKeyParts() {
		if (ownedKeyParts == null) {
			ownedKeyParts = new EObjectContainmentEList<KeyPart>(KeyPart.class, this, InformationPackage.DATA_PKG__OWNED_KEY_PARTS);
		}
		return ownedKeyParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Collection> getOwnedCollections() {
		if (ownedCollections == null) {
			ownedCollections = new EObjectContainmentEList<Collection>(Collection.class, this, InformationPackage.DATA_PKG__OWNED_COLLECTIONS);
		}
		return ownedCollections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getOwnedUnits() {
		if (ownedUnits == null) {
			ownedUnits = new EObjectContainmentEList<Unit>(Unit.class, this, InformationPackage.DATA_PKG__OWNED_UNITS);
		}
		return ownedUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getOwnedDataTypes() {
		if (ownedDataTypes == null) {
			ownedDataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, InformationPackage.DATA_PKG__OWNED_DATA_TYPES);
		}
		return ownedDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signal> getOwnedSignals() {
		if (ownedSignals == null) {
			ownedSignals = new EObjectContainmentEList<Signal>(Signal.class, this, InformationPackage.DATA_PKG__OWNED_SIGNALS);
		}
		return ownedSignals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getOwnedMessages() {
		if (ownedMessages == null) {
			ownedMessages = new EObjectContainmentEList<Message>(Message.class, this, InformationPackage.DATA_PKG__OWNED_MESSAGES);
		}
		return ownedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.sample.melangeproject.capellawithmass.information.communication.Exception> getOwnedExceptions() {
		if (ownedExceptions == null) {
			ownedExceptions = new EObjectContainmentEList<org.sample.melangeproject.capellawithmass.information.communication.Exception>(org.sample.melangeproject.capellawithmass.information.communication.Exception.class, this, InformationPackage.DATA_PKG__OWNED_EXCEPTIONS);
		}
		return ownedExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateEvent> getOwnedStateEvents() {
		if (ownedStateEvents == null) {
			ownedStateEvents = new EObjectContainmentEList<StateEvent>(StateEvent.class, this, InformationPackage.DATA_PKG__OWNED_STATE_EVENTS);
		}
		return ownedStateEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS:
				return ((InternalEList<?>)getOwnedExchangeItems()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS:
				return ((InternalEList<?>)getOwnedAssociations()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_DATA_VALUES:
				return ((InternalEList<?>)getOwnedDataValues()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES:
				return ((InternalEList<?>)getOwnedMessageReferences()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_DATA_PKGS:
				return ((InternalEList<?>)getOwnedDataPkgs()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_CLASSES:
				return ((InternalEList<?>)getOwnedClasses()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_KEY_PARTS:
				return ((InternalEList<?>)getOwnedKeyParts()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_COLLECTIONS:
				return ((InternalEList<?>)getOwnedCollections()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_UNITS:
				return ((InternalEList<?>)getOwnedUnits()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_DATA_TYPES:
				return ((InternalEList<?>)getOwnedDataTypes()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_SIGNALS:
				return ((InternalEList<?>)getOwnedSignals()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_MESSAGES:
				return ((InternalEList<?>)getOwnedMessages()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_EXCEPTIONS:
				return ((InternalEList<?>)getOwnedExceptions()).basicRemove(otherEnd, msgs);
			case InformationPackage.DATA_PKG__OWNED_STATE_EVENTS:
				return ((InternalEList<?>)getOwnedStateEvents()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS:
				return getOwnedExchangeItems();
			case InformationPackage.DATA_PKG__VISIBILITY:
				return getVisibility();
			case InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS:
				return getOwnedAssociations();
			case InformationPackage.DATA_PKG__OWNED_DATA_VALUES:
				return getOwnedDataValues();
			case InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES:
				return getOwnedMessageReferences();
			case InformationPackage.DATA_PKG__OWNED_DATA_PKGS:
				return getOwnedDataPkgs();
			case InformationPackage.DATA_PKG__OWNED_CLASSES:
				return getOwnedClasses();
			case InformationPackage.DATA_PKG__OWNED_KEY_PARTS:
				return getOwnedKeyParts();
			case InformationPackage.DATA_PKG__OWNED_COLLECTIONS:
				return getOwnedCollections();
			case InformationPackage.DATA_PKG__OWNED_UNITS:
				return getOwnedUnits();
			case InformationPackage.DATA_PKG__OWNED_DATA_TYPES:
				return getOwnedDataTypes();
			case InformationPackage.DATA_PKG__OWNED_SIGNALS:
				return getOwnedSignals();
			case InformationPackage.DATA_PKG__OWNED_MESSAGES:
				return getOwnedMessages();
			case InformationPackage.DATA_PKG__OWNED_EXCEPTIONS:
				return getOwnedExceptions();
			case InformationPackage.DATA_PKG__OWNED_STATE_EVENTS:
				return getOwnedStateEvents();
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
			case InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS:
				getOwnedExchangeItems().clear();
				getOwnedExchangeItems().addAll((java.util.Collection<? extends ExchangeItem>)newValue);
				return;
			case InformationPackage.DATA_PKG__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS:
				getOwnedAssociations().clear();
				getOwnedAssociations().addAll((java.util.Collection<? extends Association>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				getOwnedDataValues().addAll((java.util.Collection<? extends DataValue>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES:
				getOwnedMessageReferences().clear();
				getOwnedMessageReferences().addAll((java.util.Collection<? extends MessageReference>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_DATA_PKGS:
				getOwnedDataPkgs().clear();
				getOwnedDataPkgs().addAll((java.util.Collection<? extends DataPkg>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_CLASSES:
				getOwnedClasses().clear();
				getOwnedClasses().addAll((java.util.Collection<? extends org.sample.melangeproject.capellawithmass.information.Class>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_KEY_PARTS:
				getOwnedKeyParts().clear();
				getOwnedKeyParts().addAll((java.util.Collection<? extends KeyPart>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_COLLECTIONS:
				getOwnedCollections().clear();
				getOwnedCollections().addAll((java.util.Collection<? extends Collection>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_UNITS:
				getOwnedUnits().clear();
				getOwnedUnits().addAll((java.util.Collection<? extends Unit>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_DATA_TYPES:
				getOwnedDataTypes().clear();
				getOwnedDataTypes().addAll((java.util.Collection<? extends DataType>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_SIGNALS:
				getOwnedSignals().clear();
				getOwnedSignals().addAll((java.util.Collection<? extends Signal>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_MESSAGES:
				getOwnedMessages().clear();
				getOwnedMessages().addAll((java.util.Collection<? extends Message>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_EXCEPTIONS:
				getOwnedExceptions().clear();
				getOwnedExceptions().addAll((java.util.Collection<? extends org.sample.melangeproject.capellawithmass.information.communication.Exception>)newValue);
				return;
			case InformationPackage.DATA_PKG__OWNED_STATE_EVENTS:
				getOwnedStateEvents().clear();
				getOwnedStateEvents().addAll((java.util.Collection<? extends StateEvent>)newValue);
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
			case InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS:
				getOwnedExchangeItems().clear();
				return;
			case InformationPackage.DATA_PKG__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS:
				getOwnedAssociations().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_DATA_VALUES:
				getOwnedDataValues().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES:
				getOwnedMessageReferences().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_DATA_PKGS:
				getOwnedDataPkgs().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_CLASSES:
				getOwnedClasses().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_KEY_PARTS:
				getOwnedKeyParts().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_COLLECTIONS:
				getOwnedCollections().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_UNITS:
				getOwnedUnits().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_DATA_TYPES:
				getOwnedDataTypes().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_SIGNALS:
				getOwnedSignals().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_MESSAGES:
				getOwnedMessages().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_EXCEPTIONS:
				getOwnedExceptions().clear();
				return;
			case InformationPackage.DATA_PKG__OWNED_STATE_EVENTS:
				getOwnedStateEvents().clear();
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
			case InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS:
				return ownedExchangeItems != null && !ownedExchangeItems.isEmpty();
			case InformationPackage.DATA_PKG__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS:
				return ownedAssociations != null && !ownedAssociations.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_DATA_VALUES:
				return ownedDataValues != null && !ownedDataValues.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES:
				return ownedMessageReferences != null && !ownedMessageReferences.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_DATA_PKGS:
				return ownedDataPkgs != null && !ownedDataPkgs.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_CLASSES:
				return ownedClasses != null && !ownedClasses.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_KEY_PARTS:
				return ownedKeyParts != null && !ownedKeyParts.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_COLLECTIONS:
				return ownedCollections != null && !ownedCollections.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_UNITS:
				return ownedUnits != null && !ownedUnits.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_DATA_TYPES:
				return ownedDataTypes != null && !ownedDataTypes.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_SIGNALS:
				return ownedSignals != null && !ownedSignals.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_MESSAGES:
				return ownedMessages != null && !ownedMessages.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_EXCEPTIONS:
				return ownedExceptions != null && !ownedExceptions.isEmpty();
			case InformationPackage.DATA_PKG__OWNED_STATE_EVENTS:
				return ownedStateEvents != null && !ownedStateEvents.isEmpty();
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
		if (baseClass == AbstractExchangeItemPkg.class) {
			switch (derivedFeatureID) {
				case InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS: return CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS;
				default: return -1;
			}
		}
		if (baseClass == AssociationPkg.class) {
			switch (derivedFeatureID) {
				case InformationPackage.DATA_PKG__VISIBILITY: return InformationPackage.ASSOCIATION_PKG__VISIBILITY;
				case InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS: return InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (derivedFeatureID) {
				case InformationPackage.DATA_PKG__OWNED_DATA_VALUES: return DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES;
				default: return -1;
			}
		}
		if (baseClass == MessageReferencePkg.class) {
			switch (derivedFeatureID) {
				case InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES: return CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_MESSAGE_REFERENCES;
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
		if (baseClass == AbstractExchangeItemPkg.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.ABSTRACT_EXCHANGE_ITEM_PKG__OWNED_EXCHANGE_ITEMS: return InformationPackage.DATA_PKG__OWNED_EXCHANGE_ITEMS;
				default: return -1;
			}
		}
		if (baseClass == AssociationPkg.class) {
			switch (baseFeatureID) {
				case InformationPackage.ASSOCIATION_PKG__VISIBILITY: return InformationPackage.DATA_PKG__VISIBILITY;
				case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS: return InformationPackage.DATA_PKG__OWNED_ASSOCIATIONS;
				default: return -1;
			}
		}
		if (baseClass == DataValueContainer.class) {
			switch (baseFeatureID) {
				case DatavaluePackage.DATA_VALUE_CONTAINER__OWNED_DATA_VALUES: return InformationPackage.DATA_PKG__OWNED_DATA_VALUES;
				default: return -1;
			}
		}
		if (baseClass == MessageReferencePkg.class) {
			switch (baseFeatureID) {
				case CommunicationPackage.MESSAGE_REFERENCE_PKG__OWNED_MESSAGE_REFERENCES: return InformationPackage.DATA_PKG__OWNED_MESSAGE_REFERENCES;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //DataPkgImpl
