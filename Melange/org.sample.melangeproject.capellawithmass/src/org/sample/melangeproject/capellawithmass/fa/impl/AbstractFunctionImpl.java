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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.activity.AbstractAction;
import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;
import org.sample.melangeproject.capellawithmass.activity.CallAction;
import org.sample.melangeproject.capellawithmass.activity.CallBehaviorAction;
import org.sample.melangeproject.capellawithmass.activity.ExceptionHandler;
import org.sample.melangeproject.capellawithmass.activity.ExecutableNode;
import org.sample.melangeproject.capellawithmass.activity.InputPin;
import org.sample.melangeproject.capellawithmass.activity.InterruptibleActivityRegion;
import org.sample.melangeproject.capellawithmass.activity.InvocationAction;
import org.sample.melangeproject.capellawithmass.activity.OutputPin;

import org.sample.melangeproject.capellawithmass.behavior.AbstractBehavior;
import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;
import org.sample.melangeproject.capellawithmass.capellacommon.State;
import org.sample.melangeproject.capellawithmass.capellacommon.StateMachine;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Feature;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;
import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.TypedElement;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.ctx.Capability;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalBlock;
import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalChainContainer;
import org.sample.melangeproject.capellawithmass.fa.ComponentFunctionalAllocation;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionKind;
import org.sample.melangeproject.capellawithmass.fa.FunctionRealization;
import org.sample.melangeproject.capellawithmass.fa.FunctionSpecification;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChain;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;

import org.sample.melangeproject.capellawithmass.information.AbstractInstance;
import org.sample.melangeproject.capellawithmass.information.AggregationKind;
import org.sample.melangeproject.capellawithmass.information.Association;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.MultiplicityElement;
import org.sample.melangeproject.capellawithmass.information.Property;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;
import org.sample.melangeproject.capellawithmass.information.datavalue.NumericValue;

import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;

import org.sample.melangeproject.capellawithmass.la.CapabilityRealization;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractConstraint;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedDefaultValue <em>Owned Default Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedMinValue <em>Owned Min Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedMaxValue <em>Owned Max Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedNullValue <em>Owned Null Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedMinCard <em>Owned Min Card</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedMinLength <em>Owned Min Length</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedMaxCard <em>Owned Max Card</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedMaxLength <em>Owned Max Length</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getAggregationKind <em>Aggregation Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#isIsPartOfKey <em>Is Part Of Key</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getRepresentingInstanceRoles <em>Representing Instance Roles</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedFunctionalChains <em>Owned Functional Chains</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedHandlers <em>Owned Handlers</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedFunctions <em>Owned Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedFunctionRealizations <em>Owned Function Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOwnedFunctionalExchanges <em>Owned Functional Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getOutFunctionRealizations <em>Out Function Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInFunctionRealizations <em>In Function Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getComponentFunctionalAllocations <em>Component Functional Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getAllocationBlocks <em>Allocation Blocks</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getAvailableInStates <em>Available In States</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInvolvingCapabilities <em>Involving Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInvolvingCapabilityRealizations <em>Involving Capability Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getInvolvingFunctionalChains <em>Involving Functional Chains</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getLinkedStateMachine <em>Linked State Machine</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.AbstractFunctionImpl#getLinkedFunctionSpecification <em>Linked Function Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFunctionImpl extends NamedElementImpl implements AbstractFunction {
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
	 * The cached value of the '{@link #getOwnedFunctionalChains() <em>Owned Functional Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalChains()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChain> ownedFunctionalChains;

	/**
	 * The cached value of the '{@link #getOwnedHandlers() <em>Owned Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<ExceptionHandler> ownedHandlers;

	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstraint localPrecondition;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstraint localPostcondition;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected AbstractType context;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> outputs;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> arguments;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> results;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior behavior;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionKind KIND_EDEFAULT = FunctionKind.FUNCTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected FunctionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedFunctions() <em>Owned Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFunction> ownedFunctions;

	/**
	 * The cached value of the '{@link #getOwnedFunctionRealizations() <em>Owned Function Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionRealization> ownedFunctionRealizations;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalExchanges() <em>Owned Functional Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchange> ownedFunctionalExchanges;

	/**
	 * The cached value of the '{@link #getAvailableInStates() <em>Available In States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableInStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> availableInStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.ABSTRACT_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, FaPackage.ABSTRACT_FUNCTION__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, FaPackage.ABSTRACT_FUNCTION__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Involvement> getInvolvingInvolvements() {
		// TODO: implement this method to return the 'Involving Involvements' reference list
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT, oldIsAbstract, isAbstract));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__IS_STATIC, oldIsStatic, isStatic));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__VISIBILITY, oldVisibility, visibility));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE, oldAbstractType, abstractType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE, oldAbstractType, abstractType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__ORDERED, oldOrdered, ordered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__UNIQUE, oldUnique, unique));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE, oldMinInclusive, minInclusive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE, oldMaxInclusive, maxInclusive));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE, oldOwnedDefaultValue, newOwnedDefaultValue);
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
				msgs = ((InternalEObject)ownedDefaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE, null, msgs);
			if (newOwnedDefaultValue != null)
				msgs = ((InternalEObject)newOwnedDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE, null, msgs);
			msgs = basicSetOwnedDefaultValue(newOwnedDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE, newOwnedDefaultValue, newOwnedDefaultValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE, oldOwnedMinValue, newOwnedMinValue);
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
				msgs = ((InternalEObject)ownedMinValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE, null, msgs);
			if (newOwnedMinValue != null)
				msgs = ((InternalEObject)newOwnedMinValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE, null, msgs);
			msgs = basicSetOwnedMinValue(newOwnedMinValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE, newOwnedMinValue, newOwnedMinValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE, oldOwnedMaxValue, newOwnedMaxValue);
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
				msgs = ((InternalEObject)ownedMaxValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE, null, msgs);
			if (newOwnedMaxValue != null)
				msgs = ((InternalEObject)newOwnedMaxValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE, null, msgs);
			msgs = basicSetOwnedMaxValue(newOwnedMaxValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE, newOwnedMaxValue, newOwnedMaxValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE, oldOwnedNullValue, newOwnedNullValue);
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
				msgs = ((InternalEObject)ownedNullValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE, null, msgs);
			if (newOwnedNullValue != null)
				msgs = ((InternalEObject)newOwnedNullValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE, null, msgs);
			msgs = basicSetOwnedNullValue(newOwnedNullValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE, newOwnedNullValue, newOwnedNullValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD, oldOwnedMinCard, newOwnedMinCard);
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
				msgs = ((InternalEObject)ownedMinCard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD, null, msgs);
			if (newOwnedMinCard != null)
				msgs = ((InternalEObject)newOwnedMinCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD, null, msgs);
			msgs = basicSetOwnedMinCard(newOwnedMinCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD, newOwnedMinCard, newOwnedMinCard));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH, oldOwnedMinLength, newOwnedMinLength);
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
				msgs = ((InternalEObject)ownedMinLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH, null, msgs);
			if (newOwnedMinLength != null)
				msgs = ((InternalEObject)newOwnedMinLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH, null, msgs);
			msgs = basicSetOwnedMinLength(newOwnedMinLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH, newOwnedMinLength, newOwnedMinLength));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD, oldOwnedMaxCard, newOwnedMaxCard);
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
				msgs = ((InternalEObject)ownedMaxCard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD, null, msgs);
			if (newOwnedMaxCard != null)
				msgs = ((InternalEObject)newOwnedMaxCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD, null, msgs);
			msgs = basicSetOwnedMaxCard(newOwnedMaxCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD, newOwnedMaxCard, newOwnedMaxCard));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH, oldOwnedMaxLength, newOwnedMaxLength);
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
				msgs = ((InternalEObject)ownedMaxLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH, null, msgs);
			if (newOwnedMaxLength != null)
				msgs = ((InternalEObject)newOwnedMaxLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH, null, msgs);
			msgs = basicSetOwnedMaxLength(newOwnedMaxLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH, newOwnedMaxLength, newOwnedMaxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__FINAL, oldFinal, final_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND, oldAggregationKind, aggregationKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__IS_DERIVED, oldIsDerived, isDerived));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY, oldIsPartOfKey, isPartOfKey));
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
	public EList<FunctionalChain> getOwnedFunctionalChains() {
		if (ownedFunctionalChains == null) {
			ownedFunctionalChains = new EObjectContainmentEList<FunctionalChain>(FunctionalChain.class, this, FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS);
		}
		return ownedFunctionalChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getInActivityPartition() {
		ActivityPartition inActivityPartition = basicGetInActivityPartition();
		return inActivityPartition != null && inActivityPartition.eIsProxy() ? (ActivityPartition)eResolveProxy((InternalEObject)inActivityPartition) : inActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetInActivityPartition() {
		// TODO: implement this method to return the 'In Activity Partition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInInterruptibleRegion() {
		InterruptibleActivityRegion inInterruptibleRegion = basicGetInInterruptibleRegion();
		return inInterruptibleRegion != null && inInterruptibleRegion.eIsProxy() ? (InterruptibleActivityRegion)eResolveProxy((InternalEObject)inInterruptibleRegion) : inInterruptibleRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInInterruptibleRegion() {
		// TODO: implement this method to return the 'In Interruptible Region' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInStructuredNode() {
		InterruptibleActivityRegion inStructuredNode = basicGetInStructuredNode();
		return inStructuredNode != null && inStructuredNode.eIsProxy() ? (InterruptibleActivityRegion)eResolveProxy((InternalEObject)inStructuredNode) : inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInStructuredNode() {
		// TODO: implement this method to return the 'In Structured Node' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOutgoing() {
		// TODO: implement this method to return the 'Outgoing' reference list
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
	public EList<ActivityEdge> getIncoming() {
		// TODO: implement this method to return the 'Incoming' reference list
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
	public EList<ExceptionHandler> getOwnedHandlers() {
		if (ownedHandlers == null) {
			ownedHandlers = new EObjectContainmentWithInverseEList<ExceptionHandler>(ExceptionHandler.class, this, FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS, ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE);
		}
		return ownedHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstraint getLocalPrecondition() {
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalPrecondition(AbstractConstraint newLocalPrecondition, NotificationChain msgs) {
		AbstractConstraint oldLocalPrecondition = localPrecondition;
		localPrecondition = newLocalPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION, oldLocalPrecondition, newLocalPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPrecondition(AbstractConstraint newLocalPrecondition) {
		if (newLocalPrecondition != localPrecondition) {
			NotificationChain msgs = null;
			if (localPrecondition != null)
				msgs = ((InternalEObject)localPrecondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION, null, msgs);
			if (newLocalPrecondition != null)
				msgs = ((InternalEObject)newLocalPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION, null, msgs);
			msgs = basicSetLocalPrecondition(newLocalPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION, newLocalPrecondition, newLocalPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstraint getLocalPostcondition() {
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalPostcondition(AbstractConstraint newLocalPostcondition, NotificationChain msgs) {
		AbstractConstraint oldLocalPostcondition = localPostcondition;
		localPostcondition = newLocalPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION, oldLocalPostcondition, newLocalPostcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPostcondition(AbstractConstraint newLocalPostcondition) {
		if (newLocalPostcondition != localPostcondition) {
			NotificationChain msgs = null;
			if (localPostcondition != null)
				msgs = ((InternalEObject)localPostcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION, null, msgs);
			if (newLocalPostcondition != null)
				msgs = ((InternalEObject)newLocalPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION, null, msgs);
			msgs = basicSetLocalPostcondition(newLocalPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION, newLocalPostcondition, newLocalPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (AbstractType)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.ABSTRACT_FUNCTION__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(AbstractType newContext) {
		AbstractType oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputPin>(InputPin.class, this, FaPackage.ABSTRACT_FUNCTION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, FaPackage.ABSTRACT_FUNCTION__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<InputPin>(InputPin.class, this, FaPackage.ABSTRACT_FUNCTION__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, FaPackage.ABSTRACT_FUNCTION__RESULTS);
		}
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (AbstractBehavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.ABSTRACT_FUNCTION__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(AbstractBehavior newBehavior) {
		AbstractBehavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__BEHAVIOR, oldBehavior, behavior));
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
	public FunctionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(FunctionKind newKind) {
		FunctionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.ABSTRACT_FUNCTION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFunction> getOwnedFunctions() {
		if (ownedFunctions == null) {
			ownedFunctions = new EObjectContainmentEList<AbstractFunction>(AbstractFunction.class, this, FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONS);
		}
		return ownedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionRealization> getOwnedFunctionRealizations() {
		if (ownedFunctionRealizations == null) {
			ownedFunctionRealizations = new EObjectContainmentEList<FunctionRealization>(FunctionRealization.class, this, FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS);
		}
		return ownedFunctionRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchange> getOwnedFunctionalExchanges() {
		if (ownedFunctionalExchanges == null) {
			ownedFunctionalExchanges = new EObjectContainmentEList<FunctionalExchange>(FunctionalExchange.class, this, FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES);
		}
		return ownedFunctionalExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFunction> getSubFunctions() {
		// TODO: implement this method to return the 'Sub Functions' reference list
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
	public EList<FunctionRealization> getOutFunctionRealizations() {
		// TODO: implement this method to return the 'Out Function Realizations' reference list
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
	public EList<FunctionRealization> getInFunctionRealizations() {
		// TODO: implement this method to return the 'In Function Realizations' reference list
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
	public EList<ComponentFunctionalAllocation> getComponentFunctionalAllocations() {
		// TODO: implement this method to return the 'Component Functional Allocations' reference list
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
	public EList<AbstractFunctionalBlock> getAllocationBlocks() {
		// TODO: implement this method to return the 'Allocation Blocks' reference list
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
	public EList<State> getAvailableInStates() {
		if (availableInStates == null) {
			availableInStates = new EObjectResolvingEList<State>(State.class, this, FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES);
		}
		return availableInStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getInvolvingCapabilities() {
		// TODO: implement this method to return the 'Involving Capabilities' reference list
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
	public EList<CapabilityRealization> getInvolvingCapabilityRealizations() {
		// TODO: implement this method to return the 'Involving Capability Realizations' reference list
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
	public EList<FunctionalChain> getInvolvingFunctionalChains() {
		// TODO: implement this method to return the 'Involving Functional Chains' reference list
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
	public StateMachine getLinkedStateMachine() {
		// TODO: implement this method to return the 'Linked State Machine' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionSpecification getLinkedFunctionSpecification() {
		// TODO: implement this method to return the 'Linked Function Specification' reference
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
			case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedHandlers()).basicAdd(otherEnd, msgs);
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
			case FaPackage.ABSTRACT_FUNCTION__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE:
				return basicSetOwnedDefaultValue(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE:
				return basicSetOwnedMinValue(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE:
				return basicSetOwnedMaxValue(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE:
				return basicSetOwnedNullValue(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD:
				return basicSetOwnedMinCard(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH:
				return basicSetOwnedMinLength(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD:
				return basicSetOwnedMaxCard(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH:
				return basicSetOwnedMaxLength(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS:
				return ((InternalEList<?>)getOwnedFunctionalChains()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS:
				return ((InternalEList<?>)getOwnedHandlers()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION:
				return basicSetLocalPrecondition(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION:
				return basicSetLocalPostcondition(null, msgs);
			case FaPackage.ABSTRACT_FUNCTION__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONS:
				return ((InternalEList<?>)getOwnedFunctions()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS:
				return ((InternalEList<?>)getOwnedFunctionRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES:
				return ((InternalEList<?>)getOwnedFunctionalExchanges()).basicRemove(otherEnd, msgs);
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
			case FaPackage.ABSTRACT_FUNCTION__OWNED_TRACES:
				return getOwnedTraces();
			case FaPackage.ABSTRACT_FUNCTION__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case FaPackage.ABSTRACT_FUNCTION__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case FaPackage.ABSTRACT_FUNCTION__NAMING_RULES:
				return getNamingRules();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT:
				return isIsAbstract();
			case FaPackage.ABSTRACT_FUNCTION__IS_STATIC:
				return isIsStatic();
			case FaPackage.ABSTRACT_FUNCTION__VISIBILITY:
				return getVisibility();
			case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE:
				if (resolve) return getAbstractType();
				return basicGetAbstractType();
			case FaPackage.ABSTRACT_FUNCTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FaPackage.ABSTRACT_FUNCTION__ORDERED:
				return isOrdered();
			case FaPackage.ABSTRACT_FUNCTION__UNIQUE:
				return isUnique();
			case FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE:
				return isMinInclusive();
			case FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE:
				return isMaxInclusive();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE:
				return getOwnedDefaultValue();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE:
				return getOwnedMinValue();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE:
				return getOwnedMaxValue();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE:
				return getOwnedNullValue();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD:
				return getOwnedMinCard();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH:
				return getOwnedMinLength();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD:
				return getOwnedMaxCard();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH:
				return getOwnedMaxLength();
			case FaPackage.ABSTRACT_FUNCTION__FINAL:
				return isFinal();
			case FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND:
				return getAggregationKind();
			case FaPackage.ABSTRACT_FUNCTION__IS_DERIVED:
				return isIsDerived();
			case FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY:
				return isIsReadOnly();
			case FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY:
				return isIsPartOfKey();
			case FaPackage.ABSTRACT_FUNCTION__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case FaPackage.ABSTRACT_FUNCTION__REPRESENTING_INSTANCE_ROLES:
				return getRepresentingInstanceRoles();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS:
				return getOwnedFunctionalChains();
			case FaPackage.ABSTRACT_FUNCTION__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case FaPackage.ABSTRACT_FUNCTION__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case FaPackage.ABSTRACT_FUNCTION__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case FaPackage.ABSTRACT_FUNCTION__OUTGOING:
				return getOutgoing();
			case FaPackage.ABSTRACT_FUNCTION__INCOMING:
				return getIncoming();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS:
				return getOwnedHandlers();
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case FaPackage.ABSTRACT_FUNCTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case FaPackage.ABSTRACT_FUNCTION__INPUTS:
				return getInputs();
			case FaPackage.ABSTRACT_FUNCTION__OUTPUTS:
				return getOutputs();
			case FaPackage.ABSTRACT_FUNCTION__ARGUMENTS:
				return getArguments();
			case FaPackage.ABSTRACT_FUNCTION__RESULTS:
				return getResults();
			case FaPackage.ABSTRACT_FUNCTION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case FaPackage.ABSTRACT_FUNCTION__KIND:
				return getKind();
			case FaPackage.ABSTRACT_FUNCTION__CONDITION:
				return getCondition();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONS:
				return getOwnedFunctions();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS:
				return getOwnedFunctionRealizations();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES:
				return getOwnedFunctionalExchanges();
			case FaPackage.ABSTRACT_FUNCTION__SUB_FUNCTIONS:
				return getSubFunctions();
			case FaPackage.ABSTRACT_FUNCTION__OUT_FUNCTION_REALIZATIONS:
				return getOutFunctionRealizations();
			case FaPackage.ABSTRACT_FUNCTION__IN_FUNCTION_REALIZATIONS:
				return getInFunctionRealizations();
			case FaPackage.ABSTRACT_FUNCTION__COMPONENT_FUNCTIONAL_ALLOCATIONS:
				return getComponentFunctionalAllocations();
			case FaPackage.ABSTRACT_FUNCTION__ALLOCATION_BLOCKS:
				return getAllocationBlocks();
			case FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES:
				return getAvailableInStates();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_CAPABILITIES:
				return getInvolvingCapabilities();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_CAPABILITY_REALIZATIONS:
				return getInvolvingCapabilityRealizations();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_FUNCTIONAL_CHAINS:
				return getInvolvingFunctionalChains();
			case FaPackage.ABSTRACT_FUNCTION__LINKED_STATE_MACHINE:
				return getLinkedStateMachine();
			case FaPackage.ABSTRACT_FUNCTION__LINKED_FUNCTION_SPECIFICATION:
				return getLinkedFunctionSpecification();
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
			case FaPackage.ABSTRACT_FUNCTION__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_STATIC:
				setIsStatic((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE:
				setAbstractType((AbstractType)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__UNIQUE:
				setUnique((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE:
				setMinInclusive((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE:
				setMaxInclusive((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((DataValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE:
				setOwnedMinValue((DataValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE:
				setOwnedMaxValue((DataValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE:
				setOwnedNullValue((DataValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD:
				setOwnedMinCard((NumericValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH:
				setOwnedMinLength((NumericValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD:
				setOwnedMaxCard((NumericValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH:
				setOwnedMaxLength((NumericValue)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__FINAL:
				setFinal((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND:
				setAggregationKind((AggregationKind)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY:
				setIsPartOfKey((Boolean)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS:
				getOwnedFunctionalChains().clear();
				getOwnedFunctionalChains().addAll((Collection<? extends FunctionalChain>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS:
				getOwnedHandlers().clear();
				getOwnedHandlers().addAll((Collection<? extends ExceptionHandler>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION:
				setLocalPrecondition((AbstractConstraint)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION:
				setLocalPostcondition((AbstractConstraint)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__CONTEXT:
				setContext((AbstractType)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputPin>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends InputPin>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__BEHAVIOR:
				setBehavior((AbstractBehavior)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__KIND:
				setKind((FunctionKind)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__CONDITION:
				setCondition((String)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONS:
				getOwnedFunctions().clear();
				getOwnedFunctions().addAll((Collection<? extends AbstractFunction>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS:
				getOwnedFunctionRealizations().clear();
				getOwnedFunctionRealizations().addAll((Collection<? extends FunctionRealization>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES:
				getOwnedFunctionalExchanges().clear();
				getOwnedFunctionalExchanges().addAll((Collection<? extends FunctionalExchange>)newValue);
				return;
			case FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES:
				getAvailableInStates().clear();
				getAvailableInStates().addAll((Collection<? extends State>)newValue);
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
			case FaPackage.ABSTRACT_FUNCTION__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__NAMING_RULES:
				getNamingRules().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_STATIC:
				setIsStatic(IS_STATIC_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE:
				setAbstractType((AbstractType)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE:
				setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE:
				setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE:
				setOwnedDefaultValue((DataValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE:
				setOwnedMinValue((DataValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE:
				setOwnedMaxValue((DataValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE:
				setOwnedNullValue((DataValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD:
				setOwnedMinCard((NumericValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH:
				setOwnedMinLength((NumericValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD:
				setOwnedMaxCard((NumericValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH:
				setOwnedMaxLength((NumericValue)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND:
				setAggregationKind(AGGREGATION_KIND_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY:
				setIsPartOfKey(IS_PART_OF_KEY_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS:
				getOwnedFunctionalChains().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS:
				getOwnedHandlers().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION:
				setLocalPrecondition((AbstractConstraint)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION:
				setLocalPostcondition((AbstractConstraint)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__CONTEXT:
				setContext((AbstractType)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__INPUTS:
				getInputs().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__OUTPUTS:
				getOutputs().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__ARGUMENTS:
				getArguments().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__RESULTS:
				getResults().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__BEHAVIOR:
				setBehavior((AbstractBehavior)null);
				return;
			case FaPackage.ABSTRACT_FUNCTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONS:
				getOwnedFunctions().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS:
				getOwnedFunctionRealizations().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES:
				getOwnedFunctionalExchanges().clear();
				return;
			case FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES:
				getAvailableInStates().clear();
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
			case FaPackage.ABSTRACT_FUNCTION__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__IS_STATIC:
				return isStatic != IS_STATIC_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE:
				return abstractType != null;
			case FaPackage.ABSTRACT_FUNCTION__TYPE:
				return basicGetType() != null;
			case FaPackage.ABSTRACT_FUNCTION__ORDERED:
				return ordered != ORDERED_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__UNIQUE:
				return unique != UNIQUE_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE:
				return minInclusive != MIN_INCLUSIVE_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE:
				return maxInclusive != MAX_INCLUSIVE_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE:
				return ownedDefaultValue != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE:
				return ownedMinValue != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE:
				return ownedMaxValue != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE:
				return ownedNullValue != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD:
				return ownedMinCard != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH:
				return ownedMinLength != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD:
				return ownedMaxCard != null;
			case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH:
				return ownedMaxLength != null;
			case FaPackage.ABSTRACT_FUNCTION__FINAL:
				return final_ != FINAL_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND:
				return aggregationKind != AGGREGATION_KIND_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY:
				return isPartOfKey != IS_PART_OF_KEY_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__ASSOCIATION:
				return basicGetAssociation() != null;
			case FaPackage.ABSTRACT_FUNCTION__REPRESENTING_INSTANCE_ROLES:
				return !getRepresentingInstanceRoles().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS:
				return ownedFunctionalChains != null && !ownedFunctionalChains.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__IN_ACTIVITY_PARTITION:
				return basicGetInActivityPartition() != null;
			case FaPackage.ABSTRACT_FUNCTION__IN_INTERRUPTIBLE_REGION:
				return basicGetInInterruptibleRegion() != null;
			case FaPackage.ABSTRACT_FUNCTION__IN_STRUCTURED_NODE:
				return basicGetInStructuredNode() != null;
			case FaPackage.ABSTRACT_FUNCTION__OUTGOING:
				return !getOutgoing().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__INCOMING:
				return !getIncoming().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS:
				return ownedHandlers != null && !ownedHandlers.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION:
				return localPrecondition != null;
			case FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION:
				return localPostcondition != null;
			case FaPackage.ABSTRACT_FUNCTION__CONTEXT:
				return context != null;
			case FaPackage.ABSTRACT_FUNCTION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__RESULTS:
				return results != null && !results.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__BEHAVIOR:
				return behavior != null;
			case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPED_ELEMENTS:
				return !getAbstractTypedElements().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__KIND:
				return kind != KIND_EDEFAULT;
			case FaPackage.ABSTRACT_FUNCTION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONS:
				return ownedFunctions != null && !ownedFunctions.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTION_REALIZATIONS:
				return ownedFunctionRealizations != null && !ownedFunctionRealizations.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_EXCHANGES:
				return ownedFunctionalExchanges != null && !ownedFunctionalExchanges.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__SUB_FUNCTIONS:
				return !getSubFunctions().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__OUT_FUNCTION_REALIZATIONS:
				return !getOutFunctionRealizations().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__IN_FUNCTION_REALIZATIONS:
				return !getInFunctionRealizations().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__COMPONENT_FUNCTIONAL_ALLOCATIONS:
				return !getComponentFunctionalAllocations().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__ALLOCATION_BLOCKS:
				return !getAllocationBlocks().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__AVAILABLE_IN_STATES:
				return availableInStates != null && !availableInStates.isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_CAPABILITIES:
				return !getInvolvingCapabilities().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_CAPABILITY_REALIZATIONS:
				return !getInvolvingCapabilityRealizations().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__INVOLVING_FUNCTIONAL_CHAINS:
				return !getInvolvingFunctionalChains().isEmpty();
			case FaPackage.ABSTRACT_FUNCTION__LINKED_STATE_MACHINE:
				return getLinkedStateMachine() != null;
			case FaPackage.ABSTRACT_FUNCTION__LINKED_FUNCTION_SPECIFICATION:
				return getLinkedFunctionSpecification() != null;
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
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT: return CapellacorePackage.FEATURE__IS_ABSTRACT;
				case FaPackage.ABSTRACT_FUNCTION__IS_STATIC: return CapellacorePackage.FEATURE__IS_STATIC;
				case FaPackage.ABSTRACT_FUNCTION__VISIBILITY: return CapellacorePackage.FEATURE__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == AbstractTypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE: return ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__TYPE: return CapellacorePackage.TYPED_ELEMENT__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__ORDERED: return InformationPackage.MULTIPLICITY_ELEMENT__ORDERED;
				case FaPackage.ABSTRACT_FUNCTION__UNIQUE: return InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE;
				case FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE: return InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE;
				case FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE: return InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD;
				case FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH: return InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__FINAL: return ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND: return InformationPackage.PROPERTY__AGGREGATION_KIND;
				case FaPackage.ABSTRACT_FUNCTION__IS_DERIVED: return InformationPackage.PROPERTY__IS_DERIVED;
				case FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY: return InformationPackage.PROPERTY__IS_READ_ONLY;
				case FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY: return InformationPackage.PROPERTY__IS_PART_OF_KEY;
				case FaPackage.ABSTRACT_FUNCTION__ASSOCIATION: return InformationPackage.PROPERTY__ASSOCIATION;
				default: return -1;
			}
		}
		if (baseClass == AbstractInstance.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__REPRESENTING_INSTANCE_ROLES: return InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES;
				default: return -1;
			}
		}
		if (baseClass == AbstractFunctionalChainContainer.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS: return FaPackage.ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_FUNCTIONAL_CHAINS;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__IN_ACTIVITY_PARTITION: return ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
				case FaPackage.ABSTRACT_FUNCTION__IN_INTERRUPTIBLE_REGION: return ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case FaPackage.ABSTRACT_FUNCTION__IN_STRUCTURED_NODE: return ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
				case FaPackage.ABSTRACT_FUNCTION__OUTGOING: return ActivityPackage.ACTIVITY_NODE__OUTGOING;
				case FaPackage.ABSTRACT_FUNCTION__INCOMING: return ActivityPackage.ACTIVITY_NODE__INCOMING;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS: return ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION: return ActivityPackage.ABSTRACT_ACTION__LOCAL_PRECONDITION;
				case FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION: return ActivityPackage.ABSTRACT_ACTION__LOCAL_POSTCONDITION;
				case FaPackage.ABSTRACT_FUNCTION__CONTEXT: return ActivityPackage.ABSTRACT_ACTION__CONTEXT;
				case FaPackage.ABSTRACT_FUNCTION__INPUTS: return ActivityPackage.ABSTRACT_ACTION__INPUTS;
				case FaPackage.ABSTRACT_FUNCTION__OUTPUTS: return ActivityPackage.ABSTRACT_ACTION__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == InvocationAction.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__ARGUMENTS: return ActivityPackage.INVOCATION_ACTION__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == CallAction.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__RESULTS: return ActivityPackage.CALL_ACTION__RESULTS;
				default: return -1;
			}
		}
		if (baseClass == CallBehaviorAction.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__BEHAVIOR: return ActivityPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return FaPackage.ABSTRACT_FUNCTION__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Feature.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.FEATURE__IS_ABSTRACT: return FaPackage.ABSTRACT_FUNCTION__IS_ABSTRACT;
				case CapellacorePackage.FEATURE__IS_STATIC: return FaPackage.ABSTRACT_FUNCTION__IS_STATIC;
				case CapellacorePackage.FEATURE__VISIBILITY: return FaPackage.ABSTRACT_FUNCTION__VISIBILITY;
				default: return -1;
			}
		}
		if (baseClass == AbstractTypedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE: return FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.TYPED_ELEMENT__TYPE: return FaPackage.ABSTRACT_FUNCTION__TYPE;
				default: return -1;
			}
		}
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case InformationPackage.MULTIPLICITY_ELEMENT__ORDERED: return FaPackage.ABSTRACT_FUNCTION__ORDERED;
				case InformationPackage.MULTIPLICITY_ELEMENT__UNIQUE: return FaPackage.ABSTRACT_FUNCTION__UNIQUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__MIN_INCLUSIVE: return FaPackage.ABSTRACT_FUNCTION__MIN_INCLUSIVE;
				case InformationPackage.MULTIPLICITY_ELEMENT__MAX_INCLUSIVE: return FaPackage.ABSTRACT_FUNCTION__MAX_INCLUSIVE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_DEFAULT_VALUE: return FaPackage.ABSTRACT_FUNCTION__OWNED_DEFAULT_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_VALUE: return FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_VALUE: return FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_NULL_VALUE: return FaPackage.ABSTRACT_FUNCTION__OWNED_NULL_VALUE;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_CARD: return FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_CARD;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MIN_LENGTH: return FaPackage.ABSTRACT_FUNCTION__OWNED_MIN_LENGTH;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_CARD: return FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_CARD;
				case InformationPackage.MULTIPLICITY_ELEMENT__OWNED_MAX_LENGTH: return FaPackage.ABSTRACT_FUNCTION__OWNED_MAX_LENGTH;
				default: return -1;
			}
		}
		if (baseClass == FinalizableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.FINALIZABLE_ELEMENT__FINAL: return FaPackage.ABSTRACT_FUNCTION__FINAL;
				default: return -1;
			}
		}
		if (baseClass == Property.class) {
			switch (baseFeatureID) {
				case InformationPackage.PROPERTY__AGGREGATION_KIND: return FaPackage.ABSTRACT_FUNCTION__AGGREGATION_KIND;
				case InformationPackage.PROPERTY__IS_DERIVED: return FaPackage.ABSTRACT_FUNCTION__IS_DERIVED;
				case InformationPackage.PROPERTY__IS_READ_ONLY: return FaPackage.ABSTRACT_FUNCTION__IS_READ_ONLY;
				case InformationPackage.PROPERTY__IS_PART_OF_KEY: return FaPackage.ABSTRACT_FUNCTION__IS_PART_OF_KEY;
				case InformationPackage.PROPERTY__ASSOCIATION: return FaPackage.ABSTRACT_FUNCTION__ASSOCIATION;
				default: return -1;
			}
		}
		if (baseClass == AbstractInstance.class) {
			switch (baseFeatureID) {
				case InformationPackage.ABSTRACT_INSTANCE__REPRESENTING_INSTANCE_ROLES: return FaPackage.ABSTRACT_FUNCTION__REPRESENTING_INSTANCE_ROLES;
				default: return -1;
			}
		}
		if (baseClass == AbstractFunctionalChainContainer.class) {
			switch (baseFeatureID) {
				case FaPackage.ABSTRACT_FUNCTIONAL_CHAIN_CONTAINER__OWNED_FUNCTIONAL_CHAINS: return FaPackage.ABSTRACT_FUNCTION__OWNED_FUNCTIONAL_CHAINS;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION: return FaPackage.ABSTRACT_FUNCTION__IN_ACTIVITY_PARTITION;
				case ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return FaPackage.ABSTRACT_FUNCTION__IN_INTERRUPTIBLE_REGION;
				case ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE: return FaPackage.ABSTRACT_FUNCTION__IN_STRUCTURED_NODE;
				case ActivityPackage.ACTIVITY_NODE__OUTGOING: return FaPackage.ABSTRACT_FUNCTION__OUTGOING;
				case ActivityPackage.ACTIVITY_NODE__INCOMING: return FaPackage.ABSTRACT_FUNCTION__INCOMING;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS: return FaPackage.ABSTRACT_FUNCTION__OWNED_HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ABSTRACT_ACTION__LOCAL_PRECONDITION: return FaPackage.ABSTRACT_FUNCTION__LOCAL_PRECONDITION;
				case ActivityPackage.ABSTRACT_ACTION__LOCAL_POSTCONDITION: return FaPackage.ABSTRACT_FUNCTION__LOCAL_POSTCONDITION;
				case ActivityPackage.ABSTRACT_ACTION__CONTEXT: return FaPackage.ABSTRACT_FUNCTION__CONTEXT;
				case ActivityPackage.ABSTRACT_ACTION__INPUTS: return FaPackage.ABSTRACT_FUNCTION__INPUTS;
				case ActivityPackage.ABSTRACT_ACTION__OUTPUTS: return FaPackage.ABSTRACT_FUNCTION__OUTPUTS;
				default: return -1;
			}
		}
		if (baseClass == InvocationAction.class) {
			switch (baseFeatureID) {
				case ActivityPackage.INVOCATION_ACTION__ARGUMENTS: return FaPackage.ABSTRACT_FUNCTION__ARGUMENTS;
				default: return -1;
			}
		}
		if (baseClass == CallAction.class) {
			switch (baseFeatureID) {
				case ActivityPackage.CALL_ACTION__RESULTS: return FaPackage.ABSTRACT_FUNCTION__RESULTS;
				default: return -1;
			}
		}
		if (baseClass == CallBehaviorAction.class) {
			switch (baseFeatureID) {
				case ActivityPackage.CALL_BEHAVIOR_ACTION__BEHAVIOR: return FaPackage.ABSTRACT_FUNCTION__BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return FaPackage.ABSTRACT_FUNCTION__ABSTRACT_TYPED_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractEvent.class) {
			switch (baseFeatureID) {
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
		result.append(", kind: ");
		result.append(kind);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //AbstractFunctionImpl
