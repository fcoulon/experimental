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
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;
import org.sample.melangeproject.capellawithmass.activity.InterruptibleActivityRegion;
import org.sample.melangeproject.capellawithmass.activity.ObjectFlow;
import org.sample.melangeproject.capellawithmass.activity.StructuredActivityNode;

import org.sample.melangeproject.capellawithmass.behavior.AbstractBehavior;
import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;
import org.sample.melangeproject.capellawithmass.capellacore.Relationship;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation;
import org.sample.melangeproject.capellawithmass.fa.ExchangeCategory;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionInputPort;
import org.sample.melangeproject.capellawithmass.fa.FunctionOutputPort;
import org.sample.melangeproject.capellawithmass.fa.FunctionalChain;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeRealization;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeSpecification;

import org.sample.melangeproject.capellawithmass.information.AbstractEventOperation;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;

import org.sample.melangeproject.capellawithmass.interaction.SequenceMessage;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractRelationship;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.RateKind;
import org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getRealizedFlow <em>Realized Flow</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInterrupts <em>Interrupts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#isIsMulticast <em>Is Multicast</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#isIsMultireceive <em>Is Multireceive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getAbstractTypedElements <em>Abstract Typed Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInvokingSequenceMessages <em>Invoking Sequence Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getExchangeSpecifications <em>Exchange Specifications</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getInvolvingFunctionalChains <em>Involving Functional Chains</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getExchangedItems <em>Exchanged Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getAllocatingComponentExchanges <em>Allocating Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getIncomingComponentExchangeFunctionalExchangeRealizations <em>Incoming Component Exchange Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getIncomingFunctionalExchangeRealizations <em>Incoming Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getOutgoingFunctionalExchangeRealizations <em>Outgoing Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getOwnedFunctionalExchangeRealizations <em>Owned Functional Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getSourceFunctionOutputPort <em>Source Function Output Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getTargetFunctionInputPort <em>Target Function Input Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getRealizedFunctionalExchanges <em>Realized Functional Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionalExchangeImpl#getRealizingFunctionalExchanges <em>Realizing Functional Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalExchangeImpl extends NamedElementImpl implements FunctionalExchange {
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
	 * The default value of the '{@link #getKindOfRate() <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfRate()
	 * @generated
	 * @ordered
	 */
	protected static final RateKind KIND_OF_RATE_EDEFAULT = RateKind.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getKindOfRate() <em>Kind Of Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfRate()
	 * @generated
	 * @ordered
	 */
	protected RateKind kindOfRate = KIND_OF_RATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification rate;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification probability;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode source;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification guard;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification weight;

	/**
	 * The cached value of the '{@link #getInterrupts() <em>Interrupts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterrupts()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion interrupts;

	/**
	 * The default value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTICAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMulticast() <em>Is Multicast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMulticast()
	 * @generated
	 * @ordered
	 */
	protected boolean isMulticast = IS_MULTICAST_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MULTIRECEIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMultireceive() <em>Is Multireceive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMultireceive()
	 * @generated
	 * @ordered
	 */
	protected boolean isMultireceive = IS_MULTIRECEIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransformation() <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior transformation;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected AbstractBehavior selection;

	/**
	 * The cached value of the '{@link #getExchangeSpecifications() <em>Exchange Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeSpecification> exchangeSpecifications;

	/**
	 * The cached value of the '{@link #getExchangedItems() <em>Exchanged Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> exchangedItems;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeCategory> categories;

	/**
	 * The cached value of the '{@link #getOwnedFunctionalExchangeRealizations() <em>Owned Functional Exchange Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeRealization> ownedFunctionalExchangeRealizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTIONAL_EXCHANGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW, oldRealizedFlow, realizedFlow));
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
	public RateKind getKindOfRate() {
		return kindOfRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfRate(RateKind newKindOfRate) {
		RateKind oldKindOfRate = kindOfRate;
		kindOfRate = newKindOfRate == null ? KIND_OF_RATE_EDEFAULT : newKindOfRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE, oldKindOfRate, kindOfRate));
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
	public StructuredActivityNode getInStructuredNode() {
		StructuredActivityNode inStructuredNode = basicGetInStructuredNode();
		return inStructuredNode != null && inStructuredNode.eIsProxy() ? (StructuredActivityNode)eResolveProxy((InternalEObject)inStructuredNode) : inStructuredNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetInStructuredNode() {
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
	public ValueSpecification getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRate(ValueSpecification newRate, NotificationChain msgs) {
		ValueSpecification oldRate = rate;
		rate = newRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__RATE, oldRate, newRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(ValueSpecification newRate) {
		if (newRate != rate) {
			NotificationChain msgs = null;
			if (rate != null)
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__RATE, newRate, newRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProbability(ValueSpecification newProbability, NotificationChain msgs) {
		ValueSpecification oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, oldProbability, newProbability);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(ValueSpecification newProbability) {
		if (newProbability != probability) {
			NotificationChain msgs = null;
			if (probability != null)
				msgs = ((InternalEObject)probability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
			if (newProbability != null)
				msgs = ((InternalEObject)newProbability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, null, msgs);
			msgs = basicSetProbability(newProbability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY, newProbability, newProbability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ActivityNode)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ActivityNode newTarget) {
		ActivityNode oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ActivityNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ActivityNode newSource) {
		ActivityNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(ValueSpecification newGuard, NotificationChain msgs) {
		ValueSpecification oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(ValueSpecification newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeight(ValueSpecification newWeight, NotificationChain msgs) {
		ValueSpecification oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, oldWeight, newWeight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(ValueSpecification newWeight) {
		if (newWeight != weight) {
			NotificationChain msgs = null;
			if (weight != null)
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT, newWeight, newWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getInterrupts() {
		if (interrupts != null && interrupts.eIsProxy()) {
			InternalEObject oldInterrupts = (InternalEObject)interrupts;
			interrupts = (InterruptibleActivityRegion)eResolveProxy(oldInterrupts);
			if (interrupts != oldInterrupts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS, oldInterrupts, interrupts));
			}
		}
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetInterrupts() {
		return interrupts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterrupts(InterruptibleActivityRegion newInterrupts, NotificationChain msgs) {
		InterruptibleActivityRegion oldInterrupts = interrupts;
		interrupts = newInterrupts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS, oldInterrupts, newInterrupts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterrupts(InterruptibleActivityRegion newInterrupts) {
		if (newInterrupts != interrupts) {
			NotificationChain msgs = null;
			if (interrupts != null)
				msgs = ((InternalEObject)interrupts).eInverseRemove(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
			if (newInterrupts != null)
				msgs = ((InternalEObject)newInterrupts).eInverseAdd(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
			msgs = basicSetInterrupts(newInterrupts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS, newInterrupts, newInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMulticast() {
		return isMulticast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMulticast(boolean newIsMulticast) {
		boolean oldIsMulticast = isMulticast;
		isMulticast = newIsMulticast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST, oldIsMulticast, isMulticast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMultireceive() {
		return isMultireceive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMultireceive(boolean newIsMultireceive) {
		boolean oldIsMultireceive = isMultireceive;
		isMultireceive = newIsMultireceive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE, oldIsMultireceive, isMultireceive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior getTransformation() {
		if (transformation != null && transformation.eIsProxy()) {
			InternalEObject oldTransformation = (InternalEObject)transformation;
			transformation = (AbstractBehavior)eResolveProxy(oldTransformation);
			if (transformation != oldTransformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION, oldTransformation, transformation));
			}
		}
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetTransformation() {
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(AbstractBehavior newTransformation) {
		AbstractBehavior oldTransformation = transformation;
		transformation = newTransformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION, oldTransformation, transformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (AbstractBehavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTIONAL_EXCHANGE__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBehavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(AbstractBehavior newSelection) {
		AbstractBehavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTIONAL_EXCHANGE__SELECTION, oldSelection, selection));
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
	public EList<FunctionalExchangeSpecification> getExchangeSpecifications() {
		if (exchangeSpecifications == null) {
			exchangeSpecifications = new EObjectResolvingEList<FunctionalExchangeSpecification>(FunctionalExchangeSpecification.class, this, FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS);
		}
		return exchangeSpecifications;
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
	public EList<ExchangeItem> getExchangedItems() {
		if (exchangedItems == null) {
			exchangedItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS);
		}
		return exchangedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getAllocatingComponentExchanges() {
		// TODO: implement this method to return the 'Allocating Component Exchanges' reference list
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
	public EList<ComponentExchangeFunctionalExchangeAllocation> getIncomingComponentExchangeFunctionalExchangeRealizations() {
		// TODO: implement this method to return the 'Incoming Component Exchange Functional Exchange Realizations' reference list
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
	public EList<FunctionalExchangeRealization> getIncomingFunctionalExchangeRealizations() {
		// TODO: implement this method to return the 'Incoming Functional Exchange Realizations' reference list
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
	public EList<FunctionalExchangeRealization> getOutgoingFunctionalExchangeRealizations() {
		// TODO: implement this method to return the 'Outgoing Functional Exchange Realizations' reference list
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
	public EList<ExchangeCategory> getCategories() {
		if (categories == null) {
			categories = new EObjectWithInverseResolvingEList.ManyInverse<ExchangeCategory>(ExchangeCategory.class, this, FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES, FaPackage.EXCHANGE_CATEGORY__EXCHANGES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchangeRealization> getOwnedFunctionalExchangeRealizations() {
		if (ownedFunctionalExchangeRealizations == null) {
			ownedFunctionalExchangeRealizations = new EObjectContainmentEList<FunctionalExchangeRealization>(FunctionalExchangeRealization.class, this, FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS);
		}
		return ownedFunctionalExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort getSourceFunctionOutputPort() {
		FunctionOutputPort sourceFunctionOutputPort = basicGetSourceFunctionOutputPort();
		return sourceFunctionOutputPort != null && sourceFunctionOutputPort.eIsProxy() ? (FunctionOutputPort)eResolveProxy((InternalEObject)sourceFunctionOutputPort) : sourceFunctionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort basicGetSourceFunctionOutputPort() {
		// TODO: implement this method to return the 'Source Function Output Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort getTargetFunctionInputPort() {
		FunctionInputPort targetFunctionInputPort = basicGetTargetFunctionInputPort();
		return targetFunctionInputPort != null && targetFunctionInputPort.eIsProxy() ? (FunctionInputPort)eResolveProxy((InternalEObject)targetFunctionInputPort) : targetFunctionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort basicGetTargetFunctionInputPort() {
		// TODO: implement this method to return the 'Target Function Input Port' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchange> getRealizedFunctionalExchanges() {
		// TODO: implement this method to return the 'Realized Functional Exchanges' reference list
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
	public EList<FunctionalExchange> getRealizingFunctionalExchanges() {
		// TODO: implement this method to return the 'Realizing Functional Exchanges' reference list
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
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				if (interrupts != null)
					msgs = ((InternalEObject)interrupts).eInverseRemove(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts((InterruptibleActivityRegion)otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
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
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return basicSetRate(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return basicSetProbability(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return basicSetGuard(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return basicSetWeight(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				return basicSetInterrupts(null, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedFunctionalExchangeRealizations()).basicRemove(otherEnd, msgs);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				if (resolve) return getRealizedFlow();
				return basicGetRealizedFlow();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				return getKindOfRate();
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return getRate();
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return getProbability();
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return getGuard();
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return getWeight();
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				return isIsMulticast();
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				return isIsMultireceive();
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				if (resolve) return getTransformation();
				return basicGetTransformation();
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
				return getAbstractTypedElements();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return getInvokingSequenceMessages();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				return getExchangeSpecifications();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
				return getInvolvingFunctionalChains();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				return getExchangedItems();
			case FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
				return getAllocatingComponentExchanges();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getIncomingComponentExchangeFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getIncomingFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getOutgoingFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return getCategories();
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return getOwnedFunctionalExchangeRealizations();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				if (resolve) return getSourceFunctionOutputPort();
				return basicGetSourceFunctionOutputPort();
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				if (resolve) return getTargetFunctionInputPort();
				return basicGetTargetFunctionInputPort();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return getRealizedFunctionalExchanges();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
				return getRealizingFunctionalExchanges();
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				setKindOfRate((RateKind)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				setRate((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				setProbability((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				setIsMulticast((Boolean)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				setIsMultireceive((Boolean)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				setTransformation((AbstractBehavior)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				setSelection((AbstractBehavior)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				getExchangeSpecifications().clear();
				getExchangeSpecifications().addAll((Collection<? extends FunctionalExchangeSpecification>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				getExchangedItems().addAll((Collection<? extends ExchangeItem>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends ExchangeCategory>)newValue);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				getOwnedFunctionalExchangeRealizations().clear();
				getOwnedFunctionalExchangeRealizations().addAll((Collection<? extends FunctionalExchangeRealization>)newValue);
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				setRealizedFlow((AbstractInformationFlow)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				setKindOfRate(KIND_OF_RATE_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				setRate((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				setProbability((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				setIsMulticast(IS_MULTICAST_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				setIsMultireceive(IS_MULTIRECEIVE_EDEFAULT);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				setTransformation((AbstractBehavior)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				setSelection((AbstractBehavior)null);
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				getExchangeSpecifications().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				getExchangedItems().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				getCategories().clear();
				return;
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				getOwnedFunctionalExchangeRealizations().clear();
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
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW:
				return realizedFlow != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE:
				return kindOfRate != KIND_OF_RATE_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION:
				return basicGetInActivityPartition() != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION:
				return basicGetInInterruptibleRegion() != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE:
				return basicGetInStructuredNode() != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__RATE:
				return rate != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY:
				return probability != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET:
				return target != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE:
				return source != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__GUARD:
				return guard != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT:
				return weight != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS:
				return interrupts != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST:
				return isMulticast != IS_MULTICAST_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE:
				return isMultireceive != IS_MULTIRECEIVE_EDEFAULT;
			case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION:
				return transformation != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION:
				return selection != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS:
				return !getAbstractTypedElements().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES:
				return !getInvokingSequenceMessages().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGE_SPECIFICATIONS:
				return exchangeSpecifications != null && !exchangeSpecifications.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_FUNCTIONAL_CHAINS:
				return !getInvolvingFunctionalChains().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__EXCHANGED_ITEMS:
				return exchangedItems != null && !exchangedItems.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__ALLOCATING_COMPONENT_EXCHANGES:
				return !getAllocatingComponentExchanges().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return !getIncomingComponentExchangeFunctionalExchangeRealizations().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__INCOMING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return !getIncomingFunctionalExchangeRealizations().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__OUTGOING_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return !getOutgoingFunctionalExchangeRealizations().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__OWNED_FUNCTIONAL_EXCHANGE_REALIZATIONS:
				return ownedFunctionalExchangeRealizations != null && !ownedFunctionalExchangeRealizations.isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE_FUNCTION_OUTPUT_PORT:
				return basicGetSourceFunctionOutputPort() != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__TARGET_FUNCTION_INPUT_PORT:
				return basicGetTargetFunctionInputPort() != null;
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FUNCTIONAL_EXCHANGES:
				return !getRealizedFunctionalExchanges().isEmpty();
			case FaPackage.FUNCTIONAL_EXCHANGE__REALIZING_FUNCTIONAL_EXCHANGES:
				return !getRealizingFunctionalExchanges().isEmpty();
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
		if (baseClass == AbstractRelationship.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW: return ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == ActivityEdge.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE: return ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE;
				case FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION: return ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION;
				case FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION: return ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION;
				case FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE: return ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE;
				case FaPackage.FUNCTIONAL_EXCHANGE__RATE: return ActivityPackage.ACTIVITY_EDGE__RATE;
				case FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY: return ActivityPackage.ACTIVITY_EDGE__PROBABILITY;
				case FaPackage.FUNCTIONAL_EXCHANGE__TARGET: return ActivityPackage.ACTIVITY_EDGE__TARGET;
				case FaPackage.FUNCTIONAL_EXCHANGE__SOURCE: return ActivityPackage.ACTIVITY_EDGE__SOURCE;
				case FaPackage.FUNCTIONAL_EXCHANGE__GUARD: return ActivityPackage.ACTIVITY_EDGE__GUARD;
				case FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT: return ActivityPackage.ACTIVITY_EDGE__WEIGHT;
				case FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS: return ActivityPackage.ACTIVITY_EDGE__INTERRUPTS;
				default: return -1;
			}
		}
		if (baseClass == ObjectFlow.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST: return ActivityPackage.OBJECT_FLOW__IS_MULTICAST;
				case FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE: return ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE;
				case FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION: return ActivityPackage.OBJECT_FLOW__TRANSFORMATION;
				case FaPackage.FUNCTIONAL_EXCHANGE__SELECTION: return ActivityPackage.OBJECT_FLOW__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS: return ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS;
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
				case FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES: return InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES;
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
		if (baseClass == AbstractRelationship.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_RELATIONSHIP__REALIZED_FLOW: return FaPackage.FUNCTIONAL_EXCHANGE__REALIZED_FLOW;
				default: return -1;
			}
		}
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return FaPackage.FUNCTIONAL_EXCHANGE__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == ActivityEdge.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE: return FaPackage.FUNCTIONAL_EXCHANGE__KIND_OF_RATE;
				case ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION: return FaPackage.FUNCTIONAL_EXCHANGE__IN_ACTIVITY_PARTITION;
				case ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION: return FaPackage.FUNCTIONAL_EXCHANGE__IN_INTERRUPTIBLE_REGION;
				case ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE: return FaPackage.FUNCTIONAL_EXCHANGE__IN_STRUCTURED_NODE;
				case ActivityPackage.ACTIVITY_EDGE__RATE: return FaPackage.FUNCTIONAL_EXCHANGE__RATE;
				case ActivityPackage.ACTIVITY_EDGE__PROBABILITY: return FaPackage.FUNCTIONAL_EXCHANGE__PROBABILITY;
				case ActivityPackage.ACTIVITY_EDGE__TARGET: return FaPackage.FUNCTIONAL_EXCHANGE__TARGET;
				case ActivityPackage.ACTIVITY_EDGE__SOURCE: return FaPackage.FUNCTIONAL_EXCHANGE__SOURCE;
				case ActivityPackage.ACTIVITY_EDGE__GUARD: return FaPackage.FUNCTIONAL_EXCHANGE__GUARD;
				case ActivityPackage.ACTIVITY_EDGE__WEIGHT: return FaPackage.FUNCTIONAL_EXCHANGE__WEIGHT;
				case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS: return FaPackage.FUNCTIONAL_EXCHANGE__INTERRUPTS;
				default: return -1;
			}
		}
		if (baseClass == ObjectFlow.class) {
			switch (baseFeatureID) {
				case ActivityPackage.OBJECT_FLOW__IS_MULTICAST: return FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTICAST;
				case ActivityPackage.OBJECT_FLOW__IS_MULTIRECEIVE: return FaPackage.FUNCTIONAL_EXCHANGE__IS_MULTIRECEIVE;
				case ActivityPackage.OBJECT_FLOW__TRANSFORMATION: return FaPackage.FUNCTIONAL_EXCHANGE__TRANSFORMATION;
				case ActivityPackage.OBJECT_FLOW__SELECTION: return FaPackage.FUNCTIONAL_EXCHANGE__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == AbstractType.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPE__ABSTRACT_TYPED_ELEMENTS: return FaPackage.FUNCTIONAL_EXCHANGE__ABSTRACT_TYPED_ELEMENTS;
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
				case InformationPackage.ABSTRACT_EVENT_OPERATION__INVOKING_SEQUENCE_MESSAGES: return FaPackage.FUNCTIONAL_EXCHANGE__INVOKING_SEQUENCE_MESSAGES;
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
		result.append(" (kindOfRate: ");
		result.append(kindOfRate);
		result.append(", isMulticast: ");
		result.append(isMulticast);
		result.append(", isMultireceive: ");
		result.append(isMultireceive);
		result.append(')');
		return result.toString();
	}

} //FunctionalExchangeImpl
