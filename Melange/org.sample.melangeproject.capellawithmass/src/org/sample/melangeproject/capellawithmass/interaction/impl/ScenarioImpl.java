/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

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

import org.sample.melangeproject.capellawithmass.behavior.AbstractBehavior;
import org.sample.melangeproject.capellawithmass.behavior.BehaviorPackage;

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.Constraint;
import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.cs.Part;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

import org.sample.melangeproject.capellawithmass.interaction.ConstraintDuration;
import org.sample.melangeproject.capellawithmass.interaction.Event;
import org.sample.melangeproject.capellawithmass.interaction.Gate;
import org.sample.melangeproject.capellawithmass.interaction.InstanceRole;
import org.sample.melangeproject.capellawithmass.interaction.InteractionFragment;
import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;
import org.sample.melangeproject.capellawithmass.interaction.Scenario;
import org.sample.melangeproject.capellawithmass.interaction.ScenarioKind;
import org.sample.melangeproject.capellawithmass.interaction.ScenarioRealization;
import org.sample.melangeproject.capellawithmass.interaction.SequenceMessage;
import org.sample.melangeproject.capellawithmass.interaction.TimeLapse;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractParameter;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractParameterSet;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#isIsControlOperator <em>Is Control Operator</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#isMerged <em>Merged</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getPostCondition <em>Post Condition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedInstanceRoles <em>Owned Instance Roles</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedMessages <em>Owned Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedInteractionFragments <em>Owned Interaction Fragments</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedTimeLapses <em>Owned Time Lapses</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedFormalGates <em>Owned Formal Gates</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedScenarioRealization <em>Owned Scenario Realization</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getOwnedConstraintDurations <em>Owned Constraint Durations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getContainedFunctions <em>Contained Functions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getContainedParts <em>Contained Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getReferencedScenarios <em>Referenced Scenarios</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getRealizedScenarios <em>Realized Scenarios</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.ScenarioImpl#getRealizingScenarios <em>Realizing Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends NamedElementImpl implements Scenario {
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
	 * The default value of the '{@link #isIsControlOperator() <em>Is Control Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlOperator()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_OPERATOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlOperator() <em>Is Control Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlOperator()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlOperator = IS_CONTROL_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameterSet() <em>Owned Parameter Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractParameterSet> ownedParameterSet;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractParameter> ownedParameter;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ScenarioKind KIND_EDEFAULT = ScenarioKind.UNSET;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ScenarioKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerged()
	 * @generated
	 * @ordered
	 */
	protected boolean merged = MERGED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreCondition() <em>Pre Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint preCondition;

	/**
	 * The cached value of the '{@link #getPostCondition() <em>Post Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint postCondition;

	/**
	 * The cached value of the '{@link #getOwnedInstanceRoles() <em>Owned Instance Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInstanceRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceRole> ownedInstanceRoles;

	/**
	 * The cached value of the '{@link #getOwnedMessages() <em>Owned Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<SequenceMessage> ownedMessages;

	/**
	 * The cached value of the '{@link #getOwnedInteractionFragments() <em>Owned Interaction Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInteractionFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> ownedInteractionFragments;

	/**
	 * The cached value of the '{@link #getOwnedTimeLapses() <em>Owned Time Lapses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTimeLapses()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeLapse> ownedTimeLapses;

	/**
	 * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> ownedEvents;

	/**
	 * The cached value of the '{@link #getOwnedFormalGates() <em>Owned Formal Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFormalGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> ownedFormalGates;

	/**
	 * The cached value of the '{@link #getOwnedScenarioRealization() <em>Owned Scenario Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedScenarioRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioRealization> ownedScenarioRealization;

	/**
	 * The cached value of the '{@link #getOwnedConstraintDurations() <em>Owned Constraint Durations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraintDurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintDuration> ownedConstraintDurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, InteractionPackage.SCENARIO__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, InteractionPackage.SCENARIO__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControlOperator() {
		return isControlOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlOperator(boolean newIsControlOperator) {
		boolean oldIsControlOperator = isControlOperator;
		isControlOperator = newIsControlOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR, oldIsControlOperator, isControlOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractParameterSet> getOwnedParameterSet() {
		if (ownedParameterSet == null) {
			ownedParameterSet = new EObjectResolvingEList<AbstractParameterSet>(AbstractParameterSet.class, this, InteractionPackage.SCENARIO__OWNED_PARAMETER_SET);
		}
		return ownedParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractParameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectResolvingEList<AbstractParameter>(AbstractParameter.class, this, InteractionPackage.SCENARIO__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ScenarioKind newKind) {
		ScenarioKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMerged() {
		return merged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerged(boolean newMerged) {
		boolean oldMerged = merged;
		merged = newMerged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__MERGED, oldMerged, merged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPreCondition() {
		if (preCondition != null && preCondition.eIsProxy()) {
			InternalEObject oldPreCondition = (InternalEObject)preCondition;
			preCondition = (Constraint)eResolveProxy(oldPreCondition);
			if (preCondition != oldPreCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SCENARIO__PRE_CONDITION, oldPreCondition, preCondition));
			}
		}
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPreCondition() {
		return preCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreCondition(Constraint newPreCondition) {
		Constraint oldPreCondition = preCondition;
		preCondition = newPreCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__PRE_CONDITION, oldPreCondition, preCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getPostCondition() {
		if (postCondition != null && postCondition.eIsProxy()) {
			InternalEObject oldPostCondition = (InternalEObject)postCondition;
			postCondition = (Constraint)eResolveProxy(oldPostCondition);
			if (postCondition != oldPostCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionPackage.SCENARIO__POST_CONDITION, oldPostCondition, postCondition));
			}
		}
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetPostCondition() {
		return postCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostCondition(Constraint newPostCondition) {
		Constraint oldPostCondition = postCondition;
		postCondition = newPostCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionPackage.SCENARIO__POST_CONDITION, oldPostCondition, postCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceRole> getOwnedInstanceRoles() {
		if (ownedInstanceRoles == null) {
			ownedInstanceRoles = new EObjectContainmentEList<InstanceRole>(InstanceRole.class, this, InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES);
		}
		return ownedInstanceRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SequenceMessage> getOwnedMessages() {
		if (ownedMessages == null) {
			ownedMessages = new EObjectContainmentEList<SequenceMessage>(SequenceMessage.class, this, InteractionPackage.SCENARIO__OWNED_MESSAGES);
		}
		return ownedMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getOwnedInteractionFragments() {
		if (ownedInteractionFragments == null) {
			ownedInteractionFragments = new EObjectContainmentEList<InteractionFragment>(InteractionFragment.class, this, InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS);
		}
		return ownedInteractionFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeLapse> getOwnedTimeLapses() {
		if (ownedTimeLapses == null) {
			ownedTimeLapses = new EObjectContainmentEList<TimeLapse>(TimeLapse.class, this, InteractionPackage.SCENARIO__OWNED_TIME_LAPSES);
		}
		return ownedTimeLapses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getOwnedEvents() {
		if (ownedEvents == null) {
			ownedEvents = new EObjectContainmentEList<Event>(Event.class, this, InteractionPackage.SCENARIO__OWNED_EVENTS);
		}
		return ownedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gate> getOwnedFormalGates() {
		if (ownedFormalGates == null) {
			ownedFormalGates = new EObjectContainmentEList<Gate>(Gate.class, this, InteractionPackage.SCENARIO__OWNED_FORMAL_GATES);
		}
		return ownedFormalGates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioRealization> getOwnedScenarioRealization() {
		if (ownedScenarioRealization == null) {
			ownedScenarioRealization = new EObjectContainmentEList<ScenarioRealization>(ScenarioRealization.class, this, InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION);
		}
		return ownedScenarioRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintDuration> getOwnedConstraintDurations() {
		if (ownedConstraintDurations == null) {
			ownedConstraintDurations = new EObjectContainmentEList<ConstraintDuration>(ConstraintDuration.class, this, InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS);
		}
		return ownedConstraintDurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractFunction> getContainedFunctions() {
		// TODO: implement this method to return the 'Contained Functions' reference list
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
	public EList<Part> getContainedParts() {
		// TODO: implement this method to return the 'Contained Parts' reference list
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
	public EList<Scenario> getReferencedScenarios() {
		// TODO: implement this method to return the 'Referenced Scenarios' reference list
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
	public EList<Scenario> getRealizedScenarios() {
		// TODO: implement this method to return the 'Realized Scenarios' reference list
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
	public EList<Scenario> getRealizingScenarios() {
		// TODO: implement this method to return the 'Realizing Scenarios' reference list
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
			case InteractionPackage.SCENARIO__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
				return ((InternalEList<?>)getOwnedInstanceRoles()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				return ((InternalEList<?>)getOwnedMessages()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
				return ((InternalEList<?>)getOwnedInteractionFragments()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
				return ((InternalEList<?>)getOwnedTimeLapses()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_EVENTS:
				return ((InternalEList<?>)getOwnedEvents()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
				return ((InternalEList<?>)getOwnedFormalGates()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
				return ((InternalEList<?>)getOwnedScenarioRealization()).basicRemove(otherEnd, msgs);
			case InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
				return ((InternalEList<?>)getOwnedConstraintDurations()).basicRemove(otherEnd, msgs);
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
			case InteractionPackage.SCENARIO__OWNED_TRACES:
				return getOwnedTraces();
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case InteractionPackage.SCENARIO__NAMING_RULES:
				return getNamingRules();
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				return isIsControlOperator();
			case InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
			case InteractionPackage.SCENARIO__OWNED_PARAMETER:
				return getOwnedParameter();
			case InteractionPackage.SCENARIO__KIND:
				return getKind();
			case InteractionPackage.SCENARIO__MERGED:
				return isMerged();
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				if (resolve) return getPreCondition();
				return basicGetPreCondition();
			case InteractionPackage.SCENARIO__POST_CONDITION:
				if (resolve) return getPostCondition();
				return basicGetPostCondition();
			case InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
				return getOwnedInstanceRoles();
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				return getOwnedMessages();
			case InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
				return getOwnedInteractionFragments();
			case InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
				return getOwnedTimeLapses();
			case InteractionPackage.SCENARIO__OWNED_EVENTS:
				return getOwnedEvents();
			case InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
				return getOwnedFormalGates();
			case InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
				return getOwnedScenarioRealization();
			case InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
				return getOwnedConstraintDurations();
			case InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
				return getContainedFunctions();
			case InteractionPackage.SCENARIO__CONTAINED_PARTS:
				return getContainedParts();
			case InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
				return getReferencedScenarios();
			case InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
				return getRealizedScenarios();
			case InteractionPackage.SCENARIO__REALIZING_SCENARIOS:
				return getRealizingScenarios();
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
			case InteractionPackage.SCENARIO__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case InteractionPackage.SCENARIO__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				setIsControlOperator((Boolean)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends AbstractParameterSet>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends AbstractParameter>)newValue);
				return;
			case InteractionPackage.SCENARIO__KIND:
				setKind((ScenarioKind)newValue);
				return;
			case InteractionPackage.SCENARIO__MERGED:
				setMerged((Boolean)newValue);
				return;
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				setPreCondition((Constraint)newValue);
				return;
			case InteractionPackage.SCENARIO__POST_CONDITION:
				setPostCondition((Constraint)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
				getOwnedInstanceRoles().clear();
				getOwnedInstanceRoles().addAll((Collection<? extends InstanceRole>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				getOwnedMessages().clear();
				getOwnedMessages().addAll((Collection<? extends SequenceMessage>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
				getOwnedInteractionFragments().clear();
				getOwnedInteractionFragments().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
				getOwnedTimeLapses().clear();
				getOwnedTimeLapses().addAll((Collection<? extends TimeLapse>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_EVENTS:
				getOwnedEvents().clear();
				getOwnedEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
				getOwnedFormalGates().clear();
				getOwnedFormalGates().addAll((Collection<? extends Gate>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
				getOwnedScenarioRealization().clear();
				getOwnedScenarioRealization().addAll((Collection<? extends ScenarioRealization>)newValue);
				return;
			case InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
				getOwnedConstraintDurations().clear();
				getOwnedConstraintDurations().addAll((Collection<? extends ConstraintDuration>)newValue);
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
			case InteractionPackage.SCENARIO__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case InteractionPackage.SCENARIO__NAMING_RULES:
				getNamingRules().clear();
				return;
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				setIsControlOperator(IS_CONTROL_OPERATOR_EDEFAULT);
				return;
			case InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case InteractionPackage.SCENARIO__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case InteractionPackage.SCENARIO__MERGED:
				setMerged(MERGED_EDEFAULT);
				return;
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				setPreCondition((Constraint)null);
				return;
			case InteractionPackage.SCENARIO__POST_CONDITION:
				setPostCondition((Constraint)null);
				return;
			case InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
				getOwnedInstanceRoles().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				getOwnedMessages().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
				getOwnedInteractionFragments().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
				getOwnedTimeLapses().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_EVENTS:
				getOwnedEvents().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
				getOwnedFormalGates().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
				getOwnedScenarioRealization().clear();
				return;
			case InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
				getOwnedConstraintDurations().clear();
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
			case InteractionPackage.SCENARIO__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case InteractionPackage.SCENARIO__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR:
				return isControlOperator != IS_CONTROL_OPERATOR_EDEFAULT;
			case InteractionPackage.SCENARIO__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case InteractionPackage.SCENARIO__KIND:
				return kind != KIND_EDEFAULT;
			case InteractionPackage.SCENARIO__MERGED:
				return merged != MERGED_EDEFAULT;
			case InteractionPackage.SCENARIO__PRE_CONDITION:
				return preCondition != null;
			case InteractionPackage.SCENARIO__POST_CONDITION:
				return postCondition != null;
			case InteractionPackage.SCENARIO__OWNED_INSTANCE_ROLES:
				return ownedInstanceRoles != null && !ownedInstanceRoles.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_MESSAGES:
				return ownedMessages != null && !ownedMessages.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_INTERACTION_FRAGMENTS:
				return ownedInteractionFragments != null && !ownedInteractionFragments.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_TIME_LAPSES:
				return ownedTimeLapses != null && !ownedTimeLapses.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_EVENTS:
				return ownedEvents != null && !ownedEvents.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_FORMAL_GATES:
				return ownedFormalGates != null && !ownedFormalGates.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_SCENARIO_REALIZATION:
				return ownedScenarioRealization != null && !ownedScenarioRealization.isEmpty();
			case InteractionPackage.SCENARIO__OWNED_CONSTRAINT_DURATIONS:
				return ownedConstraintDurations != null && !ownedConstraintDurations.isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_FUNCTIONS:
				return !getContainedFunctions().isEmpty();
			case InteractionPackage.SCENARIO__CONTAINED_PARTS:
				return !getContainedParts().isEmpty();
			case InteractionPackage.SCENARIO__REFERENCED_SCENARIOS:
				return !getReferencedScenarios().isEmpty();
			case InteractionPackage.SCENARIO__REALIZED_SCENARIOS:
				return !getRealizedScenarios().isEmpty();
			case InteractionPackage.SCENARIO__REALIZING_SCENARIOS:
				return !getRealizingScenarios().isEmpty();
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
		if (baseClass == AbstractBehavior.class) {
			switch (derivedFeatureID) {
				case InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR: return BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR;
				case InteractionPackage.SCENARIO__OWNED_PARAMETER_SET: return BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET;
				case InteractionPackage.SCENARIO__OWNED_PARAMETER: return BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER;
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
		if (baseClass == AbstractBehavior.class) {
			switch (baseFeatureID) {
				case BehaviorPackage.ABSTRACT_BEHAVIOR__IS_CONTROL_OPERATOR: return InteractionPackage.SCENARIO__IS_CONTROL_OPERATOR;
				case BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER_SET: return InteractionPackage.SCENARIO__OWNED_PARAMETER_SET;
				case BehaviorPackage.ABSTRACT_BEHAVIOR__OWNED_PARAMETER: return InteractionPackage.SCENARIO__OWNED_PARAMETER;
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
		result.append(" (isControlOperator: ");
		result.append(isControlOperator);
		result.append(", kind: ");
		result.append(kind);
		result.append(", merged: ");
		result.append(merged);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
