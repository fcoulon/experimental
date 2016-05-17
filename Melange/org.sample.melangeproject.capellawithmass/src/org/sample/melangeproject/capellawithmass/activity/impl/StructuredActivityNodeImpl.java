/**
 */
package org.sample.melangeproject.capellawithmass.activity.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.activity.AbstractAction;
import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;
import org.sample.melangeproject.capellawithmass.activity.ExceptionHandler;
import org.sample.melangeproject.capellawithmass.activity.ExecutableNode;
import org.sample.melangeproject.capellawithmass.activity.InputPin;
import org.sample.melangeproject.capellawithmass.activity.InterruptibleActivityRegion;
import org.sample.melangeproject.capellawithmass.activity.OutputPin;
import org.sample.melangeproject.capellawithmass.activity.StructuredActivityNode;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractConstraint;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getInActivityPartition <em>In Activity Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getInInterruptibleRegion <em>In Interruptible Region</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getInStructuredNode <em>In Structured Node</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getOwnedHandlers <em>Owned Handlers</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.StructuredActivityNodeImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuredActivityNodeImpl extends ActivityGroupImpl implements StructuredActivityNode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME, oldName, name));
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
			ownedHandlers = new EObjectContainmentWithInverseEList<ExceptionHandler>(ExceptionHandler.class, this, ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS, ActivityPackage.EXCEPTION_HANDLER__PROTECTED_NODE);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION, oldLocalPrecondition, newLocalPrecondition);
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
				msgs = ((InternalEObject)localPrecondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION, null, msgs);
			if (newLocalPrecondition != null)
				msgs = ((InternalEObject)newLocalPrecondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION, null, msgs);
			msgs = basicSetLocalPrecondition(newLocalPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION, newLocalPrecondition, newLocalPrecondition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION, oldLocalPostcondition, newLocalPostcondition);
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
				msgs = ((InternalEObject)localPostcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION, null, msgs);
			if (newLocalPostcondition != null)
				msgs = ((InternalEObject)newLocalPostcondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION, null, msgs);
			msgs = basicSetLocalPostcondition(newLocalPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION, newLocalPostcondition, newLocalPostcondition));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT, oldContext, context));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS);
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
			outputs = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS);
		}
		return outputs;
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
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
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
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
				return ((InternalEList<?>)getOwnedHandlers()).basicRemove(otherEnd, msgs);
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return basicSetLocalPrecondition(null, msgs);
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return basicSetLocalPostcondition(null, msgs);
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
				return getName();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
				if (resolve) return getInActivityPartition();
				return basicGetInActivityPartition();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				if (resolve) return getInInterruptibleRegion();
				return basicGetInInterruptibleRegion();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				if (resolve) return getInStructuredNode();
				return basicGetInStructuredNode();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return getOutgoing();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return getIncoming();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
				return getOwnedHandlers();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
				return getInputs();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
				return getOutputs();
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
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
				setName((String)newValue);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
				getOwnedHandlers().clear();
				getOwnedHandlers().addAll((Collection<? extends ExceptionHandler>)newValue);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				setLocalPrecondition((AbstractConstraint)newValue);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				setLocalPostcondition((AbstractConstraint)newValue);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				setContext((AbstractType)newValue);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends OutputPin>)newValue);
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
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
				getOwnedHandlers().clear();
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				setLocalPrecondition((AbstractConstraint)null);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				setLocalPostcondition((AbstractConstraint)null);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				setContext((AbstractType)null);
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
				getInputs().clear();
				return;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
				getOutputs().clear();
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
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION:
				return basicGetInActivityPartition() != null;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION:
				return basicGetInInterruptibleRegion() != null;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE:
				return basicGetInStructuredNode() != null;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING:
				return !getOutgoing().isEmpty();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING:
				return !getIncoming().isEmpty();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS:
				return ownedHandlers != null && !ownedHandlers.isEmpty();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION:
				return localPrecondition != null;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION:
				return localPostcondition != null;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT:
				return context != null;
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
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
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION: return ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE: return ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING: return ActivityPackage.ACTIVITY_NODE__OUTGOING;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING: return ActivityPackage.ACTIVITY_NODE__INCOMING;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS: return ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION: return ActivityPackage.ABSTRACT_ACTION__LOCAL_PRECONDITION;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION: return ActivityPackage.ABSTRACT_ACTION__LOCAL_POSTCONDITION;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT: return ActivityPackage.ABSTRACT_ACTION__CONTEXT;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS: return ActivityPackage.ABSTRACT_ACTION__INPUTS;
				case ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS: return ActivityPackage.ABSTRACT_ACTION__OUTPUTS;
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
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ActivityNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_NODE__IN_ACTIVITY_PARTITION: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY_PARTITION;
				case ActivityPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION;
				case ActivityPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__IN_STRUCTURED_NODE;
				case ActivityPackage.ACTIVITY_NODE__OUTGOING: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTGOING;
				case ActivityPackage.ACTIVITY_NODE__INCOMING: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__INCOMING;
				default: return -1;
			}
		}
		if (baseClass == ExecutableNode.class) {
			switch (baseFeatureID) {
				case ActivityPackage.EXECUTABLE_NODE__OWNED_HANDLERS: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__OWNED_HANDLERS;
				default: return -1;
			}
		}
		if (baseClass == AbstractAction.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ABSTRACT_ACTION__LOCAL_PRECONDITION: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_PRECONDITION;
				case ActivityPackage.ABSTRACT_ACTION__LOCAL_POSTCONDITION: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__LOCAL_POSTCONDITION;
				case ActivityPackage.ABSTRACT_ACTION__CONTEXT: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__CONTEXT;
				case ActivityPackage.ABSTRACT_ACTION__INPUTS: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__INPUTS;
				case ActivityPackage.ABSTRACT_ACTION__OUTPUTS: return ActivityPackage.STRUCTURED_ACTIVITY_NODE__OUTPUTS;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl
