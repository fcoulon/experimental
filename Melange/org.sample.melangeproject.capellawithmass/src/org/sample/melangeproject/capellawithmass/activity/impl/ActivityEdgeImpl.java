/**
 */
package org.sample.melangeproject.capellawithmass.activity.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;
import org.sample.melangeproject.capellawithmass.activity.InterruptibleActivityRegion;
import org.sample.melangeproject.capellawithmass.activity.StructuredActivityNode;

import org.sample.melangeproject.capellawithmass.modellingcore.RateKind;
import org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.AbstractRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getKindOfRate <em>Kind Of Rate</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityEdgeImpl#getInterrupts <em>Interrupts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityEdgeImpl extends AbstractRelationshipImpl implements ActivityEdge {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_EDGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE, oldKindOfRate, kindOfRate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__RATE, oldRate, newRate);
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
				msgs = ((InternalEObject)rate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__RATE, null, msgs);
			if (newRate != null)
				msgs = ((InternalEObject)newRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__RATE, null, msgs);
			msgs = basicSetRate(newRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__RATE, newRate, newRate));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__PROBABILITY, oldProbability, newProbability);
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
				msgs = ((InternalEObject)probability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__PROBABILITY, null, msgs);
			if (newProbability != null)
				msgs = ((InternalEObject)newProbability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__PROBABILITY, null, msgs);
			msgs = basicSetProbability(newProbability, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__PROBABILITY, newProbability, newProbability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__TARGET, oldTarget, target));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__SOURCE, oldSource, source));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__GUARD, oldGuard, newGuard);
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
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__GUARD, newGuard, newGuard));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__WEIGHT, oldWeight, newWeight);
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
				msgs = ((InternalEObject)weight).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__WEIGHT, null, msgs);
			if (newWeight != null)
				msgs = ((InternalEObject)newWeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.ACTIVITY_EDGE__WEIGHT, null, msgs);
			msgs = basicSetWeight(newWeight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__WEIGHT, newWeight, newWeight));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts, interrupts));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__INTERRUPTS, oldInterrupts, newInterrupts);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_EDGE__INTERRUPTS, newInterrupts, newInterrupts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
				if (interrupts != null)
					msgs = ((InternalEObject)interrupts).eInverseRemove(this, ActivityPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES, InterruptibleActivityRegion.class, msgs);
				return basicSetInterrupts((InterruptibleActivityRegion)otherEnd, msgs);
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
			case ActivityPackage.ACTIVITY_EDGE__RATE:
				return basicSetRate(null, msgs);
			case ActivityPackage.ACTIVITY_EDGE__PROBABILITY:
				return basicSetProbability(null, msgs);
			case ActivityPackage.ACTIVITY_EDGE__GUARD:
				return basicSetGuard(null, msgs);
			case ActivityPackage.ACTIVITY_EDGE__WEIGHT:
				return basicSetWeight(null, msgs);
			case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
				return basicSetInterrupts(null, msgs);
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
			case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE:
				return getKindOfRate();
			case ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case ActivityPackage.ACTIVITY_EDGE__RATE:
				return getRate();
			case ActivityPackage.ACTIVITY_EDGE__PROBABILITY:
				return getProbability();
			case ActivityPackage.ACTIVITY_EDGE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ActivityPackage.ACTIVITY_EDGE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ActivityPackage.ACTIVITY_EDGE__GUARD:
				return getGuard();
			case ActivityPackage.ACTIVITY_EDGE__WEIGHT:
				return getWeight();
			case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
				if (resolve) return getInterrupts();
				return basicGetInterrupts();
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
			case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE:
				setKindOfRate((RateKind)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__RATE:
				setRate((ValueSpecification)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__PROBABILITY:
				setProbability((ValueSpecification)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__WEIGHT:
				setWeight((ValueSpecification)newValue);
				return;
			case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)newValue);
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
			case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE:
				setKindOfRate(KIND_OF_RATE_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_EDGE__RATE:
				setRate((ValueSpecification)null);
				return;
			case ActivityPackage.ACTIVITY_EDGE__PROBABILITY:
				setProbability((ValueSpecification)null);
				return;
			case ActivityPackage.ACTIVITY_EDGE__TARGET:
				setTarget((ActivityNode)null);
				return;
			case ActivityPackage.ACTIVITY_EDGE__SOURCE:
				setSource((ActivityNode)null);
				return;
			case ActivityPackage.ACTIVITY_EDGE__GUARD:
				setGuard((ValueSpecification)null);
				return;
			case ActivityPackage.ACTIVITY_EDGE__WEIGHT:
				setWeight((ValueSpecification)null);
				return;
			case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
				setInterrupts((InterruptibleActivityRegion)null);
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
			case ActivityPackage.ACTIVITY_EDGE__KIND_OF_RATE:
				return kindOfRate != KIND_OF_RATE_EDEFAULT;
			case ActivityPackage.ACTIVITY_EDGE__IN_ACTIVITY_PARTITION:
				return basicGetInActivityPartition() != null;
			case ActivityPackage.ACTIVITY_EDGE__IN_INTERRUPTIBLE_REGION:
				return basicGetInInterruptibleRegion() != null;
			case ActivityPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE:
				return basicGetInStructuredNode() != null;
			case ActivityPackage.ACTIVITY_EDGE__RATE:
				return rate != null;
			case ActivityPackage.ACTIVITY_EDGE__PROBABILITY:
				return probability != null;
			case ActivityPackage.ACTIVITY_EDGE__TARGET:
				return target != null;
			case ActivityPackage.ACTIVITY_EDGE__SOURCE:
				return source != null;
			case ActivityPackage.ACTIVITY_EDGE__GUARD:
				return guard != null;
			case ActivityPackage.ACTIVITY_EDGE__WEIGHT:
				return weight != null;
			case ActivityPackage.ACTIVITY_EDGE__INTERRUPTS:
				return interrupts != null;
		}
		return super.eIsSet(featureID);
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
		result.append(')');
		return result.toString();
	}

} //ActivityEdgeImpl
