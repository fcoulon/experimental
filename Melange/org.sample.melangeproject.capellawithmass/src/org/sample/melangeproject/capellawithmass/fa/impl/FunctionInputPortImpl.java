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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.activity.AbstractAction;
import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;
import org.sample.melangeproject.capellawithmass.activity.InputPin;
import org.sample.melangeproject.capellawithmass.activity.InterruptibleActivityRegion;
import org.sample.melangeproject.capellawithmass.activity.ObjectNode;
import org.sample.melangeproject.capellawithmass.activity.ObjectNodeKind;
import org.sample.melangeproject.capellawithmass.activity.ObjectNodeOrderingKind;
import org.sample.melangeproject.capellawithmass.activity.Pin;

import org.sample.melangeproject.capellawithmass.behavior.AbstractBehavior;

import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionInputPort;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchange;

import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

import org.sample.melangeproject.capellawithmass.modellingcore.IState;
import org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Input Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getKindOfNode <em>Kind Of Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getInState <em>In State</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#isIsControl <em>Is Control</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getInputEvaluationAction <em>Input Evaluation Action</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getIncomingExchangeItems <em>Incoming Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionInputPortImpl#getIncomingFunctionalExchanges <em>Incoming Functional Exchanges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionInputPortImpl extends FunctionPortImpl implements FunctionInputPort {
	/**
	 * The default value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlType = IS_CONTROL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindOfNode() <em>Kind Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfNode()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeKind KIND_OF_NODE_EDEFAULT = ObjectNodeKind.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getKindOfNode() <em>Kind Of Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfNode()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeKind kindOfNode = KIND_OF_NODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperBound;

	/**
	 * The cached value of the '{@link #getInState() <em>In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState()
	 * @generated
	 * @ordered
	 */
	protected EList<IState> inState;

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
	 * The default value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControl() <em>Is Control</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControl()
	 * @generated
	 * @ordered
	 */
	protected boolean isControl = IS_CONTROL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputEvaluationAction() <em>Input Evaluation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvaluationAction()
	 * @generated
	 * @ordered
	 */
	protected AbstractAction inputEvaluationAction;

	/**
	 * The cached value of the '{@link #getIncomingExchangeItems() <em>Incoming Exchange Items</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingExchangeItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeItem> incomingExchangeItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionInputPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_INPUT_PORT;
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
	public boolean isIsControlType() {
		return isControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = isControlType;
		isControlType = newIsControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE, oldIsControlType, isControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeKind getKindOfNode() {
		return kindOfNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfNode(ObjectNodeKind newKindOfNode) {
		ObjectNodeKind oldKindOfNode = kindOfNode;
		kindOfNode = newKindOfNode == null ? KIND_OF_NODE_EDEFAULT : newKindOfNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE, oldKindOfNode, kindOfNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(ValueSpecification newUpperBound, NotificationChain msgs) {
		ValueSpecification oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(ValueSpecification newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IState> getInState() {
		if (inState == null) {
			inState = new EObjectResolvingEList<IState>(IState.class, this, FaPackage.FUNCTION_INPUT_PORT__IN_STATE);
		}
		return inState;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_INPUT_PORT__SELECTION, oldSelection, selection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControl() {
		return isControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControl(boolean newIsControl) {
		boolean oldIsControl = isControl;
		isControl = newIsControl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL, oldIsControl, isControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction getInputEvaluationAction() {
		if (inputEvaluationAction != null && inputEvaluationAction.eIsProxy()) {
			InternalEObject oldInputEvaluationAction = (InternalEObject)inputEvaluationAction;
			inputEvaluationAction = (AbstractAction)eResolveProxy(oldInputEvaluationAction);
			if (inputEvaluationAction != oldInputEvaluationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION, oldInputEvaluationAction, inputEvaluationAction));
			}
		}
		return inputEvaluationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAction basicGetInputEvaluationAction() {
		return inputEvaluationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEvaluationAction(AbstractAction newInputEvaluationAction) {
		AbstractAction oldInputEvaluationAction = inputEvaluationAction;
		inputEvaluationAction = newInputEvaluationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION, oldInputEvaluationAction, inputEvaluationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeItem> getIncomingExchangeItems() {
		if (incomingExchangeItems == null) {
			incomingExchangeItems = new EObjectResolvingEList<ExchangeItem>(ExchangeItem.class, this, FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS);
		}
		return incomingExchangeItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchange> getIncomingFunctionalExchanges() {
		// TODO: implement this method to return the 'Incoming Functional Exchanges' reference list
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
			case FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case FaPackage.FUNCTION_INPUT_PORT__OUTGOING:
				return getOutgoing();
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING:
				return getIncoming();
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
				return isIsControlType();
			case FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
				return getKindOfNode();
			case FaPackage.FUNCTION_INPUT_PORT__ORDERING:
				return getOrdering();
			case FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
				return getUpperBound();
			case FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
				return getInState();
			case FaPackage.FUNCTION_INPUT_PORT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
				return isIsControl();
			case FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
				if (resolve) return getInputEvaluationAction();
				return basicGetInputEvaluationAction();
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
				return getIncomingExchangeItems();
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING_FUNCTIONAL_EXCHANGES:
				return getIncomingFunctionalExchanges();
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
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
				setIsControlType((Boolean)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
				setKindOfNode((ObjectNodeKind)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
				getInState().clear();
				getInState().addAll((Collection<? extends IState>)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__SELECTION:
				setSelection((AbstractBehavior)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
				setIsControl((Boolean)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
				setInputEvaluationAction((AbstractAction)newValue);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
				getIncomingExchangeItems().clear();
				getIncomingExchangeItems().addAll((Collection<? extends ExchangeItem>)newValue);
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
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
				setKindOfNode(KIND_OF_NODE_EDEFAULT);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
				getInState().clear();
				return;
			case FaPackage.FUNCTION_INPUT_PORT__SELECTION:
				setSelection((AbstractBehavior)null);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
				setIsControl(IS_CONTROL_EDEFAULT);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
				setInputEvaluationAction((AbstractAction)null);
				return;
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
				getIncomingExchangeItems().clear();
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
			case FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION:
				return basicGetInActivityPartition() != null;
			case FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION:
				return basicGetInInterruptibleRegion() != null;
			case FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE:
				return basicGetInStructuredNode() != null;
			case FaPackage.FUNCTION_INPUT_PORT__OUTGOING:
				return !getOutgoing().isEmpty();
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING:
				return !getIncoming().isEmpty();
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE:
				return isControlType != IS_CONTROL_TYPE_EDEFAULT;
			case FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE:
				return kindOfNode != KIND_OF_NODE_EDEFAULT;
			case FaPackage.FUNCTION_INPUT_PORT__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND:
				return upperBound != null;
			case FaPackage.FUNCTION_INPUT_PORT__IN_STATE:
				return inState != null && !inState.isEmpty();
			case FaPackage.FUNCTION_INPUT_PORT__SELECTION:
				return selection != null;
			case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL:
				return isControl != IS_CONTROL_EDEFAULT;
			case FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION:
				return inputEvaluationAction != null;
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING_EXCHANGE_ITEMS:
				return incomingExchangeItems != null && !incomingExchangeItems.isEmpty();
			case FaPackage.FUNCTION_INPUT_PORT__INCOMING_FUNCTIONAL_EXCHANGES:
				return !getIncomingFunctionalExchanges().isEmpty();
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
		if (baseClass == ActivityNode.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION: return ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
				case FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION: return ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE: return ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
				case FaPackage.FUNCTION_INPUT_PORT__OUTGOING: return ActivityPackage.ACTIVITY_NODE__OUTGOING;
				case FaPackage.FUNCTION_INPUT_PORT__INCOMING: return ActivityPackage.ACTIVITY_NODE__INCOMING;
				default: return -1;
			}
		}
		if (baseClass == ObjectNode.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE: return ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE;
				case FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE: return ActivityPackage.OBJECT_NODE__KIND_OF_NODE;
				case FaPackage.FUNCTION_INPUT_PORT__ORDERING: return ActivityPackage.OBJECT_NODE__ORDERING;
				case FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND: return ActivityPackage.OBJECT_NODE__UPPER_BOUND;
				case FaPackage.FUNCTION_INPUT_PORT__IN_STATE: return ActivityPackage.OBJECT_NODE__IN_STATE;
				case FaPackage.FUNCTION_INPUT_PORT__SELECTION: return ActivityPackage.OBJECT_NODE__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == Pin.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL: return ActivityPackage.PIN__IS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == InputPin.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION: return ActivityPackage.INPUT_PIN__INPUT_EVALUATION_ACTION;
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
		if (baseClass == ActivityNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION: return FaPackage.FUNCTION_INPUT_PORT__IN_ACTIVITY_PARTITION;
				case ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return FaPackage.FUNCTION_INPUT_PORT__IN_INTERRUPTIBLE_REGION;
				case ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE: return FaPackage.FUNCTION_INPUT_PORT__IN_STRUCTURED_NODE;
				case ActivityPackage.ACTIVITY_NODE__OUTGOING: return FaPackage.FUNCTION_INPUT_PORT__OUTGOING;
				case ActivityPackage.ACTIVITY_NODE__INCOMING: return FaPackage.FUNCTION_INPUT_PORT__INCOMING;
				default: return -1;
			}
		}
		if (baseClass == ObjectNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.OBJECT_NODE__IS_CONTROL_TYPE: return FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL_TYPE;
				case ActivityPackage.OBJECT_NODE__KIND_OF_NODE: return FaPackage.FUNCTION_INPUT_PORT__KIND_OF_NODE;
				case ActivityPackage.OBJECT_NODE__ORDERING: return FaPackage.FUNCTION_INPUT_PORT__ORDERING;
				case ActivityPackage.OBJECT_NODE__UPPER_BOUND: return FaPackage.FUNCTION_INPUT_PORT__UPPER_BOUND;
				case ActivityPackage.OBJECT_NODE__IN_STATE: return FaPackage.FUNCTION_INPUT_PORT__IN_STATE;
				case ActivityPackage.OBJECT_NODE__SELECTION: return FaPackage.FUNCTION_INPUT_PORT__SELECTION;
				default: return -1;
			}
		}
		if (baseClass == Pin.class) {
			switch (baseFeatureID) {
				case ActivityPackage.PIN__IS_CONTROL: return FaPackage.FUNCTION_INPUT_PORT__IS_CONTROL;
				default: return -1;
			}
		}
		if (baseClass == InputPin.class) {
			switch (baseFeatureID) {
				case ActivityPackage.INPUT_PIN__INPUT_EVALUATION_ACTION: return FaPackage.FUNCTION_INPUT_PORT__INPUT_EVALUATION_ACTION;
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
		result.append(" (isControlType: ");
		result.append(isControlType);
		result.append(", kindOfNode: ");
		result.append(kindOfNode);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", isControl: ");
		result.append(isControl);
		result.append(')');
		return result.toString();
	}

} //FunctionInputPortImpl