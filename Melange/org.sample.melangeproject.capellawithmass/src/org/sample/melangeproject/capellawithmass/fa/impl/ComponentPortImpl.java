/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Feature;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.TypedElement;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.cs.PhysicalPort;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentPort;
import org.sample.melangeproject.capellawithmass.fa.ComponentPortKind;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionPort;
import org.sample.melangeproject.capellawithmass.fa.OrientationPortKind;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;
import org.sample.melangeproject.capellawithmass.information.AggregationKind;
import org.sample.melangeproject.capellawithmass.information.Association;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.MultiplicityElement;
import org.sample.melangeproject.capellawithmass.information.Partition;
import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.NumericValue;

import org.sample.melangeproject.capellawithmass.information.impl.PortImpl;

import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.InformationsExchanger;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedMinCard <em>Owned Min Card</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedMaxCard <em>Owned Max Card</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getAggregationKind <em>Aggregation Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#isIsPartOfKey <em>Is Part Of Key</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getRepresentingInstanceRoles <em>Representing Instance Roles</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getComponentExchanges <em>Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getAllocatedFunctionPorts <em>Allocated Function Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getDelegatedComponentPorts <em>Delegated Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getDelegatingComponentPorts <em>Delegating Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getAllocatingPhysicalPorts <em>Allocating Physical Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getRealizedComponentPorts <em>Realized Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ComponentPortImpl#getRealizingComponentPorts <em>Realizing Component Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPortImpl extends PortImpl implements ComponentPort {
	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isStatic = IS_STATIC_EDEFAULT;

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
	 * The cached value of the '{@link #getAbstractType() <em>Abstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType abstractType;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIN_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMinInclusive() <em>Min Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMinInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusive = MIN_INCLUSIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAX_INCLUSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaxInclusive() <em>Max Inclusive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaxInclusive()
	 * @generated
	 * @ordered
	 */
	protected boolean maxInclusive = MAX_INCLUSIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDefaultValue() <em>Owned Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedDefaultValue;

	/**
	 * The cached value of the '{@link #getOwnedMinValue() <em>Owned Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedMinValue;

	/**
	 * The cached value of the '{@link #getOwnedMaxValue() <em>Owned Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedMaxValue;

	/**
	 * The cached value of the '{@link #getOwnedNullValue() <em>Owned Null Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNullValue()
	 * @generated
	 * @ordered
	 */
	protected DataValue ownedNullValue;

	/**
	 * The cached value of the '{@link #getOwnedMinCard() <em>Owned Min Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinCard()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMinCard;

	/**
	 * The cached value of the '{@link #getOwnedMinLength() <em>Owned Min Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMinLength()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMinLength;

	/**
	 * The cached value of the '{@link #getOwnedMaxCard() <em>Owned Max Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxCard()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMaxCard;

	/**
	 * The cached value of the '{@link #getOwnedMaxLength() <em>Owned Max Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMaxLength()
	 * @generated
	 * @ordered
	 */
	protected NumericValue ownedMaxLength;

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
	 * The default value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationKind()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_KIND_EDEFAULT = AggregationKind.UNSET;

	/**
	 * The cached value of the '{@link #getAggregationKind() <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationKind()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregationKind = AGGREGATION_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsPartOfKey() <em>Is Part Of Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PART_OF_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartOfKey() <em>Is Part Of Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartOfKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartOfKey = IS_PART_OF_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final OrientationPortKind ORIENTATION_EDEFAULT = OrientationPortKind.UNSET;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationPortKind orientation = ORIENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentPortKind KIND_EDEFAULT = ComponentPortKind.STANDARD;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ComponentPortKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.COMPONENT_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStatic() {
		return isStatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStatic(boolean newIsStatic) {
		boolean oldIsStatic = isStatic;
		isStatic = newIsStatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__IS_STATIC, oldIsStatic, isStatic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getAbstractType() {
		if (abstractType != null && abstractType.eIsProxy()) {
			InternalEObject oldAbstractType = (InternalEObject)abstractType;
			abstractType = (AbstractType)eResolveProxy(oldAbstractType);
			if (abstractType != oldAbstractType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.COMPONENT_PORT__ABSTRACT_TYPE, oldAbstractType, abstractType));
			}
		}
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType basicGetAbstractType() {
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractType(AbstractType newAbstractType) {
		AbstractType oldAbstractType = abstractType;
		abstractType = newAbstractType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__ABSTRACT_TYPE, oldAbstractType, abstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = basicGetType();
		return type != null && type.eIsProxy() ? (Type)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(boolean newUnique) {
		boolean oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMinInclusive() {
		return minInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusive(boolean newMinInclusive) {
		boolean oldMinInclusive = minInclusive;
		minInclusive = newMinInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMaxInclusive() {
		return maxInclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusive(boolean newMaxInclusive) {
		boolean oldMaxInclusive = maxInclusive;
		maxInclusive = newMaxInclusive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getOwnedDefaultValue() {
		return ownedDefaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedDefaultValue(DataValue newOwnedDefaultValue, NotificationChain msgs) {
		DataValue oldOwnedDefaultValue = ownedDefaultValue;
		ownedDefaultValue = newOwnedDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE, oldOwnedDefaultValue, newOwnedDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedDefaultValue(DataValue newOwnedDefaultValue) {
		if (newOwnedDefaultValue != ownedDefaultValue) {
			NotificationChain msgs = null;
			if (ownedDefaultValue != null)
				msgs = ((InternalEObject)ownedDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE, null, msgs);
			if (newOwnedDefaultValue != null)
				msgs = ((InternalEObject)newOwnedDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE, null, msgs);
			msgs = basicSetOwnedDefaultValue(newOwnedDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE, newOwnedDefaultValue, newOwnedDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getOwnedMinValue() {
		return ownedMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMinValue(DataValue newOwnedMinValue, NotificationChain msgs) {
		DataValue oldOwnedMinValue = ownedMinValue;
		ownedMinValue = newOwnedMinValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE, oldOwnedMinValue, newOwnedMinValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMinValue(DataValue newOwnedMinValue) {
		if (newOwnedMinValue != ownedMinValue) {
			NotificationChain msgs = null;
			if (ownedMinValue != null)
				msgs = ((InternalEObject)ownedMinValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE, null, msgs);
			if (newOwnedMinValue != null)
				msgs = ((InternalEObject)newOwnedMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE, null, msgs);
			msgs = basicSetOwnedMinValue(newOwnedMinValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE, newOwnedMinValue, newOwnedMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getOwnedMaxValue() {
		return ownedMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMaxValue(DataValue newOwnedMaxValue, NotificationChain msgs) {
		DataValue oldOwnedMaxValue = ownedMaxValue;
		ownedMaxValue = newOwnedMaxValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE, oldOwnedMaxValue, newOwnedMaxValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMaxValue(DataValue newOwnedMaxValue) {
		if (newOwnedMaxValue != ownedMaxValue) {
			NotificationChain msgs = null;
			if (ownedMaxValue != null)
				msgs = ((InternalEObject)ownedMaxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE, null, msgs);
			if (newOwnedMaxValue != null)
				msgs = ((InternalEObject)newOwnedMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE, null, msgs);
			msgs = basicSetOwnedMaxValue(newOwnedMaxValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE, newOwnedMaxValue, newOwnedMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataValue getOwnedNullValue() {
		return ownedNullValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedNullValue(DataValue newOwnedNullValue, NotificationChain msgs) {
		DataValue oldOwnedNullValue = ownedNullValue;
		ownedNullValue = newOwnedNullValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE, oldOwnedNullValue, newOwnedNullValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedNullValue(DataValue newOwnedNullValue) {
		if (newOwnedNullValue != ownedNullValue) {
			NotificationChain msgs = null;
			if (ownedNullValue != null)
				msgs = ((InternalEObject)ownedNullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE, null, msgs);
			if (newOwnedNullValue != null)
				msgs = ((InternalEObject)newOwnedNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE, null, msgs);
			msgs = basicSetOwnedNullValue(newOwnedNullValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE, newOwnedNullValue, newOwnedNullValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getOwnedMinCard() {
		return ownedMinCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMinCard(NumericValue newOwnedMinCard, NotificationChain msgs) {
		NumericValue oldOwnedMinCard = ownedMinCard;
		ownedMinCard = newOwnedMinCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MIN_CARD, oldOwnedMinCard, newOwnedMinCard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMinCard(NumericValue newOwnedMinCard) {
		if (newOwnedMinCard != ownedMinCard) {
			NotificationChain msgs = null;
			if (ownedMinCard != null)
				msgs = ((InternalEObject)ownedMinCard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MIN_CARD, null, msgs);
			if (newOwnedMinCard != null)
				msgs = ((InternalEObject)newOwnedMinCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MIN_CARD, null, msgs);
			msgs = basicSetOwnedMinCard(newOwnedMinCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MIN_CARD, newOwnedMinCard, newOwnedMinCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getOwnedMinLength() {
		return ownedMinLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMinLength(NumericValue newOwnedMinLength, NotificationChain msgs) {
		NumericValue oldOwnedMinLength = ownedMinLength;
		ownedMinLength = newOwnedMinLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH, oldOwnedMinLength, newOwnedMinLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMinLength(NumericValue newOwnedMinLength) {
		if (newOwnedMinLength != ownedMinLength) {
			NotificationChain msgs = null;
			if (ownedMinLength != null)
				msgs = ((InternalEObject)ownedMinLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH, null, msgs);
			if (newOwnedMinLength != null)
				msgs = ((InternalEObject)newOwnedMinLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH, null, msgs);
			msgs = basicSetOwnedMinLength(newOwnedMinLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH, newOwnedMinLength, newOwnedMinLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getOwnedMaxCard() {
		return ownedMaxCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMaxCard(NumericValue newOwnedMaxCard, NotificationChain msgs) {
		NumericValue oldOwnedMaxCard = ownedMaxCard;
		ownedMaxCard = newOwnedMaxCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MAX_CARD, oldOwnedMaxCard, newOwnedMaxCard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMaxCard(NumericValue newOwnedMaxCard) {
		if (newOwnedMaxCard != ownedMaxCard) {
			NotificationChain msgs = null;
			if (ownedMaxCard != null)
				msgs = ((InternalEObject)ownedMaxCard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MAX_CARD, null, msgs);
			if (newOwnedMaxCard != null)
				msgs = ((InternalEObject)newOwnedMaxCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MAX_CARD, null, msgs);
			msgs = basicSetOwnedMaxCard(newOwnedMaxCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MAX_CARD, newOwnedMaxCard, newOwnedMaxCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericValue getOwnedMaxLength() {
		return ownedMaxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMaxLength(NumericValue newOwnedMaxLength, NotificationChain msgs) {
		NumericValue oldOwnedMaxLength = ownedMaxLength;
		ownedMaxLength = newOwnedMaxLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH, oldOwnedMaxLength, newOwnedMaxLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMaxLength(NumericValue newOwnedMaxLength) {
		if (newOwnedMaxLength != ownedMaxLength) {
			NotificationChain msgs = null;
			if (ownedMaxLength != null)
				msgs = ((InternalEObject)ownedMaxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH, null, msgs);
			if (newOwnedMaxLength != null)
				msgs = ((InternalEObject)newOwnedMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH, null, msgs);
			msgs = basicSetOwnedMaxLength(newOwnedMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH, newOwnedMaxLength, newOwnedMaxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregationKind() {
		return aggregationKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationKind(AggregationKind newAggregationKind) {
		AggregationKind oldAggregationKind = aggregationKind;
		aggregationKind = newAggregationKind == null ? AGGREGATION_KIND_EDEFAULT : newAggregationKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__AGGREGATION_KIND, oldAggregationKind, aggregationKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartOfKey() {
		return isPartOfKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartOfKey(boolean newIsPartOfKey) {
		boolean oldIsPartOfKey = isPartOfKey;
		isPartOfKey = newIsPartOfKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__IS_PART_OF_KEY, oldIsPartOfKey, isPartOfKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		Association association = basicGetAssociation();
		return association != null && association.eIsProxy() ? (Association)eResolveProxy((InternalEObject)association) : association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		// TODO: implement this method to return the 'Association' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceRole> getRepresentingInstanceRoles() {
		// TODO: implement this method to return the 'Representing Instance Roles' reference list
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
	public EList<AbstractInformationFlow> getIncomingInformationFlows() {
		// TODO: implement this method to return the 'Incoming Information Flows' reference list
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
	public EList<AbstractInformationFlow> getOutgoingInformationFlows() {
		// TODO: implement this method to return the 'Outgoing Information Flows' reference list
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
	public EList<AbstractInformationFlow> getInformationFlows() {
		// TODO: implement this method to return the 'Information Flows' reference list
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
	public OrientationPortKind getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationPortKind newOrientation) {
		OrientationPortKind oldOrientation = orientation;
		orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ComponentPortKind newKind) {
		ComponentPortKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.COMPONENT_PORT__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getComponentExchanges() {
		// TODO: implement this method to return the 'Component Exchanges' reference list
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
	public EList<FunctionPort> getAllocatedFunctionPorts() {
		// TODO: implement this method to return the 'Allocated Function Ports' reference list
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
	public EList<ComponentPort> getDelegatedComponentPorts() {
		// TODO: implement this method to return the 'Delegated Component Ports' reference list
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
	public EList<ComponentPort> getDelegatingComponentPorts() {
		// TODO: implement this method to return the 'Delegating Component Ports' reference list
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
	public EList<PhysicalPort> getAllocatingPhysicalPorts() {
		// TODO: implement this method to return the 'Allocating Physical Ports' reference list
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
	public EList<ComponentPort> getRealizedComponentPorts() {
		// TODO: implement this method to return the 'Realized Component Ports' reference list
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
	public EList<ComponentPort> getRealizingComponentPorts() {
		// TODO: implement this method to return the 'Realizing Component Ports' reference list
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
			case FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
				return basicSetOwnedDefaultValue(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
				return basicSetOwnedMinValue(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
				return basicSetOwnedMaxValue(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
				return basicSetOwnedNullValue(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
				return basicSetOwnedMinCard(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
				return basicSetOwnedMinLength(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
				return basicSetOwnedMaxCard(null, msgs);
			case FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
				return basicSetOwnedMaxLength(null, msgs);
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
			case FaPackage.COMPONENT_PORT__IS_ABSTRACT:
				return isIsAbstract();
			case FaPackage.COMPONENT_PORT__IS_STATIC:
				return isIsStatic();
			case FaPackage.COMPONENT_PORT__VISIBILITY:
				return getVisibility();
			case FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
				if (resolve) return getAbstractType();
				return basicGetAbstractType();
			case FaPackage.COMPONENT_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FaPackage.COMPONENT_PORT__ORDERED:
				return isOrdered();
			case FaPackage.COMPONENT_PORT__UNIQUE:
				return isUnique();
			case FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
				return isMinInclusive();
			case FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
				return isMaxInclusive();
			case FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
				return getOwnedDefaultValue();
			case FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
				return getOwnedMinValue();
			case FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
				return getOwnedMaxValue();
			case FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
				return getOwnedNullValue();
			case FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
				return getOwnedMinCard();
			case FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
				return getOwnedMinLength();
			case FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
				return getOwnedMaxCard();
			case FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
				return getOwnedMaxLength();
			case FaPackage.COMPONENT_PORT__FINAL:
				return isFinal();
			case FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
				return getAggregationKind();
			case FaPackage.COMPONENT_PORT__IS_DERIVED:
				return isIsDerived();
			case FaPackage.COMPONENT_PORT__IS_READ_ONLY:
				return isIsReadOnly();
			case FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
				return isIsPartOfKey();
			case FaPackage.COMPONENT_PORT__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES:
				return getRepresentingInstanceRoles();
			case FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case FaPackage.COMPONENT_PORT__INFORMATION_FLOWS:
				return getInformationFlows();
			case FaPackage.COMPONENT_PORT__ORIENTATION:
				return getOrientation();
			case FaPackage.COMPONENT_PORT__KIND:
				return getKind();
			case FaPackage.COMPONENT_PORT__COMPONENT_EXCHANGES:
				return getComponentExchanges();
			case FaPackage.COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS:
				return getAllocatedFunctionPorts();
			case FaPackage.COMPONENT_PORT__DELEGATED_COMPONENT_PORTS:
				return getDelegatedComponentPorts();
			case FaPackage.COMPONENT_PORT__DELEGATING_COMPONENT_PORTS:
				return getDelegatingComponentPorts();
			case FaPackage.COMPONENT_PORT__ALLOCATING_PHYSICAL_PORTS:
				return getAllocatingPhysicalPorts();
			case FaPackage.COMPONENT_PORT__REALIZED_COMPONENT_PORTS:
				return getRealizedComponentPorts();
			case FaPackage.COMPONENT_PORT__REALIZING_COMPONENT_PORTS:
				return getRealizingComponentPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FaPackage.COMPONENT_PORT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)newValue);
				return;
			case FaPackage.COMPONENT_PORT__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
				setMinInclusive((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
				setMaxInclusive((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((DataValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
				setOwnedMinValue((DataValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
				setOwnedMaxValue((DataValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
				setOwnedNullValue((DataValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
				setOwnedMinCard((NumericValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
				setOwnedMinLength((NumericValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
				setOwnedMaxCard((NumericValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
				setOwnedMaxLength((NumericValue)newValue);
				return;
			case FaPackage.COMPONENT_PORT__FINAL:
				setFinal((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
				setAggregationKind((AggregationKind)newValue);
				return;
			case FaPackage.COMPONENT_PORT__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
				setIsPartOfKey((Boolean)newValue);
				return;
			case FaPackage.COMPONENT_PORT__ORIENTATION:
				setOrientation((OrientationPortKind)newValue);
				return;
			case FaPackage.COMPONENT_PORT__KIND:
				setKind((ComponentPortKind)newValue);
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
			case FaPackage.COMPONENT_PORT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)null);
				return;
			case FaPackage.COMPONENT_PORT__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
				setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((DataValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
				setOwnedMinValue((DataValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
				setOwnedMaxValue((DataValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
				setOwnedNullValue((DataValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
				setOwnedMinCard((NumericValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
				setOwnedMinLength((NumericValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
				setOwnedMaxCard((NumericValue)null);
				return;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
				setOwnedMaxLength((NumericValue)null);
				return;
			case FaPackage.COMPONENT_PORT__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
				setAggregationKind(AGGREGATION_KIND_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
				setIsPartOfKey(IS_PART_OF_KEY_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__ORIENTATION:
				setOrientation(ORIENTATION_EDEFAULT);
				return;
			case FaPackage.COMPONENT_PORT__KIND:
				setKind(KIND_EDEFAULT);
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
			case FaPackage.COMPONENT_PORT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case FaPackage.COMPONENT_PORT__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case FaPackage.COMPONENT_PORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case FaPackage.COMPONENT_PORT__ABSTRACT_TYPE:
				return abstractType != null;
			case FaPackage.COMPONENT_PORT__TYPE:
				return basicGetType() != null;
			case FaPackage.COMPONENT_PORT__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case FaPackage.COMPONENT_PORT__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case FaPackage.COMPONENT_PORT__MIN_INCLUSIVE:
				return minInclusive != MIN_INCLUSIVE_EDEFAULT;
			case FaPackage.COMPONENT_PORT__MAX_INCLUSIVE:
				return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
			case FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE:
				return ownedDefaultValue != null;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE:
				return ownedMinValue != null;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE:
				return ownedMaxValue != null;
			case FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE:
				return ownedNullValue != null;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_CARD:
				return ownedMinCard != null;
			case FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH:
				return ownedMinLength != null;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_CARD:
				return ownedMaxCard != null;
			case FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH:
				return ownedMaxLength != null;
			case FaPackage.COMPONENT_PORT__FINAL:
				return final_ != FINAL_EDEFAULT;
			case FaPackage.COMPONENT_PORT__AGGREGATION_KIND:
				return aggregationKind != AGGREGATION_KIND_EDEFAULT;
			case FaPackage.COMPONENT_PORT__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case FaPackage.COMPONENT_PORT__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case FaPackage.COMPONENT_PORT__IS_PART_OF_KEY:
				return isPartOfKey != IS_PART_OF_KEY_EDEFAULT;
			case FaPackage.COMPONENT_PORT__ASSOCIATION:
				return basicGetAssociation() != null;
			case FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES:
				return !getRepresentingInstanceRoles().isEmpty();
			case FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS:
				return !getIncomingInformationFlows().isEmpty();
			case FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS:
				return !getOutgoingInformationFlows().isEmpty();
			case FaPackage.COMPONENT_PORT__INFORMATION_FLOWS:
				return !getInformationFlows().isEmpty();
			case FaPackage.COMPONENT_PORT__ORIENTATION:
				return orientation != ORIENTATION_EDEFAULT;
			case FaPackage.COMPONENT_PORT__KIND:
				return kind != KIND_EDEFAULT;
			case FaPackage.COMPONENT_PORT__COMPONENT_EXCHANGES:
				return !getComponentExchanges().isEmpty();
			case FaPackage.COMPONENT_PORT__ALLOCATED_FUNCTION_PORTS:
				return !getAllocatedFunctionPorts().isEmpty();
			case FaPackage.COMPONENT_PORT__DELEGATED_COMPONENT_PORTS:
				return !getDelegatedComponentPorts().isEmpty();
			case FaPackage.COMPONENT_PORT__DELEGATING_COMPONENT_PORTS:
				return !getDelegatingComponentPorts().isEmpty();
			case FaPackage.COMPONENT_PORT__ALLOCATING_PHYSICAL_PORTS:
				return !getAllocatingPhysicalPorts().isEmpty();
			case FaPackage.COMPONENT_PORT__REALIZED_COMPONENT_PORTS:
				return !getRealizedComponentPorts().isEmpty();
			case FaPackage.COMPONENT_PORT__REALIZING_COMPONENT_PORTS:
				return !getRealizingComponentPorts().isEmpty();
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
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__IS_ABSTRACT: return CapellacorePackage.FEATURE__IS_ABSTRACT;
				case FaPackage.COMPONENT_PORT__IS_STATIC: return CapellacorePackage.FEATURE__IS_STATIC;
				case FaPackage.COMPONENT_PORT__VISIBILITY: return CapellacorePackage.FEATURE__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == AbstractTypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__ABSTRACT_TYPE: return ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__TYPE: return CapellacorePackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__ORDERED: return InformationPackage.MULTIPLICITY_ELEMENT__ORDERED;
				case FaPackage.COMPONENT_PORT__UNIQUE: return InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE;
				case FaPackage.COMPONENT_PORT__MIN_INCLUSIVE: return InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE;
				case FaPackage.COMPONENT_PORT__MAX_INCLUSIVE: return InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE;
				case FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE;
				case FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE;
				case FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE;
				case FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE;
				case FaPackage.COMPONENT_PORT__OWNED_MIN_CARD: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD;
				case FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH;
				case FaPackage.COMPONENT_PORT__OWNED_MAX_CARD: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD;
				case FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__FINAL: return ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__AGGREGATION_KIND: return InformationPackage.PROPERTY__AGGREGATION_KIND;
				case FaPackage.COMPONENT_PORT__IS_DERIVED: return InformationPackage.PROPERTY__IS_DERIVED;
				case FaPackage.COMPONENT_PORT__IS_READ_ONLY: return InformationPackage.PROPERTY__IS_READ_ONLY;
				case FaPackage.COMPONENT_PORT__IS_PART_OF_KEY: return InformationPackage.PROPERTY__IS_PART_OF_KEY;
				case FaPackage.COMPONENT_PORT__ASSOCIATION: return InformationPackage.PROPERTY__ASSOCIATION;
				default: return -1;
			}
		}
		if (baseClass == AbstractInstance.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES: return InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES;
				default: return -1;
			}
		}
		if (baseClass == Partition.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InformationsExchanger.class) {
			switch (derivedFeatureID) {
				case FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS;
				case FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS;
				case FaPackage.COMPONENT_PORT__INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS;
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
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.FEATURE__IS_ABSTRACT: return FaPackage.COMPONENT_PORT__IS_ABSTRACT;
				case CapellacorePackage.FEATURE__IS_STATIC: return FaPackage.COMPONENT_PORT__IS_STATIC;
				case CapellacorePackage.FEATURE__VISIBILITY: return FaPackage.COMPONENT_PORT__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == AbstractTypedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE: return FaPackage.COMPONENT_PORT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.TYPED_ELEMENT__TYPE: return FaPackage.COMPONENT_PORT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case InformationPackage.MULTIPLICITY_ELEMENT__ORDERED: return FaPackage.COMPONENT_PORT__ORDERED;
				case InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE: return FaPackage.COMPONENT_PORT__UNIQUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE: return FaPackage.COMPONENT_PORT__MIN_INCLUSIVE;
				case InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE: return FaPackage.COMPONENT_PORT__MAX_INCLUSIVE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE: return FaPackage.COMPONENT_PORT__OWNED_DEFAULT_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE: return FaPackage.COMPONENT_PORT__OWNED_MIN_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE: return FaPackage.COMPONENT_PORT__OWNED_MAX_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE: return FaPackage.COMPONENT_PORT__OWNED_NULL_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD: return FaPackage.COMPONENT_PORT__OWNED_MIN_CARD;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH: return FaPackage.COMPONENT_PORT__OWNED_MIN_LENGTH;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD: return FaPackage.COMPONENT_PORT__OWNED_MAX_CARD;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH: return FaPackage.COMPONENT_PORT__OWNED_MAX_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL: return FaPackage.COMPONENT_PORT__FINAL;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (baseFeatureID) {
				case InformationPackage.PROPERTY__AGGREGATION_KIND: return FaPackage.COMPONENT_PORT__AGGREGATION_KIND;
				case InformationPackage.PROPERTY__IS_DERIVED: return FaPackage.COMPONENT_PORT__IS_DERIVED;
				case InformationPackage.PROPERTY__IS_READ_ONLY: return FaPackage.COMPONENT_PORT__IS_READ_ONLY;
				case InformationPackage.PROPERTY__IS_PART_OF_KEY: return FaPackage.COMPONENT_PORT__IS_PART_OF_KEY;
				case InformationPackage.PROPERTY__ASSOCIATION: return FaPackage.COMPONENT_PORT__ASSOCIATION;
				default: return -1;
			}
		}
		if (baseClass == AbstractInstance.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES: return FaPackage.COMPONENT_PORT__REPRESENTING_INSTANCE_ROLES;
				default: return -1;
			}
		}
		if (baseClass == Partition.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InformationsExchanger.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS: return FaPackage.COMPONENT_PORT__INCOMING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS: return FaPackage.COMPONENT_PORT__OUTGOING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS: return FaPackage.COMPONENT_PORT__INFORMATION_FLOWS;
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isStatic: ");
		result.append(isStatic);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", unique: ");
		result.append(unique);
		result.append(", minInclusive: ");
		result.append(minInclusive);
		result.append(", maxInclusive: ");
		result.append(maxInclusive);
		result.append(", final: ");
		result.append(final_);
		result.append(", aggregationKind: ");
		result.append(aggregationKind);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isPartOfKey: ");
		result.append(isPartOfKey);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //ComponentPortImpl
