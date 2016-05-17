/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.capellacommon.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellacommonFactoryImpl extends EFactoryImpl implements CapellacommonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapellacommonFactory init() {
		try {
			CapellacommonFactory theCapellacommonFactory = (CapellacommonFactory)EPackage.Registry.INSTANCE.getEFactory(CapellacommonPackage.eNS_URI);
			if (theCapellacommonFactory != null) {
				return theCapellacommonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapellacommonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellacommonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CapellacommonPackage.GENERIC_TRACE: return createGenericTrace();
			case CapellacommonPackage.TRANSFO_LINK: return createTransfoLink();
			case CapellacommonPackage.JUSTIFICATION_LINK: return createJustificationLink();
			case CapellacommonPackage.STATE_MACHINE: return createStateMachine();
			case CapellacommonPackage.REGION: return createRegion();
			case CapellacommonPackage.STATE: return createState();
			case CapellacommonPackage.MODE: return createMode();
			case CapellacommonPackage.FINAL_STATE: return createFinalState();
			case CapellacommonPackage.STATE_TRANSITION: return createStateTransition();
			case CapellacommonPackage.INITIAL_PSEUDO_STATE: return createInitialPseudoState();
			case CapellacommonPackage.JOIN_PSEUDO_STATE: return createJoinPseudoState();
			case CapellacommonPackage.FORK_PSEUDO_STATE: return createForkPseudoState();
			case CapellacommonPackage.CHOICE_PSEUDO_STATE: return createChoicePseudoState();
			case CapellacommonPackage.TERMINATE_PSEUDO_STATE: return createTerminatePseudoState();
			case CapellacommonPackage.ABSTRACT_STATE_REALIZATION: return createAbstractStateRealization();
			case CapellacommonPackage.STATE_TRANSITION_REALIZATION: return createStateTransitionRealization();
			case CapellacommonPackage.SHALLOW_HISTORY_PSEUDO_STATE: return createShallowHistoryPseudoState();
			case CapellacommonPackage.DEEP_HISTORY_PSEUDO_STATE: return createDeepHistoryPseudoState();
			case CapellacommonPackage.ENTRY_POINT_PSEUDO_STATE: return createEntryPointPseudoState();
			case CapellacommonPackage.EXIT_POINT_PSEUDO_STATE: return createExitPointPseudoState();
			case CapellacommonPackage.STATE_EVENT_REALIZATION: return createStateEventRealization();
			case CapellacommonPackage.CHANGE_EVENT: return createChangeEvent();
			case CapellacommonPackage.TIME_EVENT: return createTimeEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CapellacommonPackage.TRANSITION_KIND:
				return createTransitionKindFromString(eDataType, initialValue);
			case CapellacommonPackage.TIME_EVENT_KIND:
				return createTimeEventKindFromString(eDataType, initialValue);
			case CapellacommonPackage.CHANGE_EVENT_KIND:
				return createChangeEventKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CapellacommonPackage.TRANSITION_KIND:
				return convertTransitionKindToString(eDataType, instanceValue);
			case CapellacommonPackage.TIME_EVENT_KIND:
				return convertTimeEventKindToString(eDataType, instanceValue);
			case CapellacommonPackage.CHANGE_EVENT_KIND:
				return convertChangeEventKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTrace createGenericTrace() {
		GenericTraceImpl genericTrace = new GenericTraceImpl();
		return genericTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransfoLink createTransfoLink() {
		TransfoLinkImpl transfoLink = new TransfoLinkImpl();
		return transfoLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustificationLink createJustificationLink() {
		JustificationLinkImpl justificationLink = new JustificationLinkImpl();
		return justificationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine createStateMachine() {
		StateMachineImpl stateMachine = new StateMachineImpl();
		return stateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState createFinalState() {
		FinalStateImpl finalState = new FinalStateImpl();
		return finalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition() {
		StateTransitionImpl stateTransition = new StateTransitionImpl();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialPseudoState createInitialPseudoState() {
		InitialPseudoStateImpl initialPseudoState = new InitialPseudoStateImpl();
		return initialPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPseudoState createJoinPseudoState() {
		JoinPseudoStateImpl joinPseudoState = new JoinPseudoStateImpl();
		return joinPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkPseudoState createForkPseudoState() {
		ForkPseudoStateImpl forkPseudoState = new ForkPseudoStateImpl();
		return forkPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoicePseudoState createChoicePseudoState() {
		ChoicePseudoStateImpl choicePseudoState = new ChoicePseudoStateImpl();
		return choicePseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminatePseudoState createTerminatePseudoState() {
		TerminatePseudoStateImpl terminatePseudoState = new TerminatePseudoStateImpl();
		return terminatePseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStateRealization createAbstractStateRealization() {
		AbstractStateRealizationImpl abstractStateRealization = new AbstractStateRealizationImpl();
		return abstractStateRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransitionRealization createStateTransitionRealization() {
		StateTransitionRealizationImpl stateTransitionRealization = new StateTransitionRealizationImpl();
		return stateTransitionRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShallowHistoryPseudoState createShallowHistoryPseudoState() {
		ShallowHistoryPseudoStateImpl shallowHistoryPseudoState = new ShallowHistoryPseudoStateImpl();
		return shallowHistoryPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeepHistoryPseudoState createDeepHistoryPseudoState() {
		DeepHistoryPseudoStateImpl deepHistoryPseudoState = new DeepHistoryPseudoStateImpl();
		return deepHistoryPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPointPseudoState createEntryPointPseudoState() {
		EntryPointPseudoStateImpl entryPointPseudoState = new EntryPointPseudoStateImpl();
		return entryPointPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitPointPseudoState createExitPointPseudoState() {
		ExitPointPseudoStateImpl exitPointPseudoState = new ExitPointPseudoStateImpl();
		return exitPointPseudoState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateEventRealization createStateEventRealization() {
		StateEventRealizationImpl stateEventRealization = new StateEventRealizationImpl();
		return stateEventRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent createChangeEvent() {
		ChangeEventImpl changeEvent = new ChangeEventImpl();
		return changeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent createTimeEvent() {
		TimeEventImpl timeEvent = new TimeEventImpl();
		return timeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue) {
		TransitionKind result = TransitionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransitionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEventKind createTimeEventKindFromString(EDataType eDataType, String initialValue) {
		TimeEventKind result = TimeEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEventKind createChangeEventKindFromString(EDataType eDataType, String initialValue) {
		ChangeEventKind result = ChangeEventKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeEventKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellacommonPackage getCapellacommonPackage() {
		return (CapellacommonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapellacommonPackage getPackage() {
		return CapellacommonPackage.eINSTANCE;
	}

} //CapellacommonFactoryImpl
