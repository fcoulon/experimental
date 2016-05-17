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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.activity.AbstractActivity;
import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityGroup;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.StructuredActivityNode;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractParameter;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractParameterSet;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

import org.sample.melangeproject.capellawithmass.modellingcore.impl.AbstractNamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#isIsControlOperator <em>Is Control Operator</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOwnedParameterSet <em>Owned Parameter Set</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getIncomingTraces <em>Incoming Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOutgoingTraces <em>Outgoing Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOwnedEdges <em>Owned Edges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOwnedGroups <em>Owned Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.AbstractActivityImpl#getOwnedStructuredNodes <em>Owned Structured Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractActivityImpl extends AbstractNamedElementImpl implements AbstractActivity {
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
	 * The default value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedNodes() <em>Owned Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedNodes;

	/**
	 * The cached value of the '{@link #getOwnedEdges() <em>Owned Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> ownedEdges;

	/**
	 * The cached value of the '{@link #getOwnedGroups() <em>Owned Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> ownedGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ABSTRACT_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR, oldIsControlOperator, isControlOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractParameterSet> getOwnedParameterSet() {
		if (ownedParameterSet == null) {
			ownedParameterSet = new EObjectResolvingEList<AbstractParameterSet>(AbstractParameterSet.class, this, ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET);
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
			ownedParameter = new EObjectResolvingEList<AbstractParameter>(AbstractParameter.class, this, ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER);
		}
		return ownedParameter;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getOwnedNodes() {
		if (ownedNodes == null) {
			ownedNodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES);
		}
		return ownedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOwnedEdges() {
		if (ownedEdges == null) {
			ownedEdges = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES);
		}
		return ownedEdges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getOwnedGroups() {
		if (ownedGroups == null) {
			ownedGroups = new EObjectContainmentEList<ActivityGroup>(ActivityGroup.class, this, ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS);
		}
		return ownedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredActivityNode> getOwnedStructuredNodes() {
		// TODO: implement this method to return the 'Owned Structured Nodes' reference list
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
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
				return ((InternalEList<?>)getOwnedNodes()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
				return ((InternalEList<?>)getOwnedEdges()).basicRemove(otherEnd, msgs);
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
				return ((InternalEList<?>)getOwnedGroups()).basicRemove(otherEnd, msgs);
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
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
				return isIsControlOperator();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
				return getOwnedParameterSet();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
				return getOwnedParameter();
			case ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES:
				return getIncomingTraces();
			case ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES:
				return getOutgoingTraces();
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
				return isIsReadOnly();
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
				return isIsSingleExecution();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
				return getOwnedNodes();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
				return getOwnedEdges();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
				return getOwnedGroups();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES:
				return getOwnedStructuredNodes();
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
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
				setIsControlOperator((Boolean)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				getOwnedParameterSet().addAll((Collection<? extends AbstractParameterSet>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends AbstractParameter>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution((Boolean)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
				getOwnedNodes().clear();
				getOwnedNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
				getOwnedEdges().clear();
				getOwnedEdges().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
				getOwnedGroups().clear();
				getOwnedGroups().addAll((Collection<? extends ActivityGroup>)newValue);
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
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
				setIsControlOperator(IS_CONTROL_OPERATOR_EDEFAULT);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
				getOwnedParameterSet().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
				getOwnedNodes().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
				getOwnedEdges().clear();
				return;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
				getOwnedGroups().clear();
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
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_CONTROL_OPERATOR:
				return isControlOperator != IS_CONTROL_OPERATOR_EDEFAULT;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER_SET:
				return ownedParameterSet != null && !ownedParameterSet.isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES:
				return !getIncomingTraces().isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES:
				return !getOutgoingTraces().isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case ActivityPackage.ABSTRACT_ACTIVITY__IS_SINGLE_EXECUTION:
				return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_NODES:
				return ownedNodes != null && !ownedNodes.isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_EDGES:
				return ownedEdges != null && !ownedEdges.isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_GROUPS:
				return ownedGroups != null && !ownedGroups.isEmpty();
			case ActivityPackage.ABSTRACT_ACTIVITY__OWNED_STRUCTURED_NODES:
				return !getOwnedStructuredNodes().isEmpty();
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
		if (baseClass == TraceableElement.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES;
				case ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES: return ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES;
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
		if (baseClass == TraceableElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.TRACEABLE_ELEMENT__INCOMING_TRACES: return ActivityPackage.ABSTRACT_ACTIVITY__INCOMING_TRACES;
				case ModellingcorePackage.TRACEABLE_ELEMENT__OUTGOING_TRACES: return ActivityPackage.ABSTRACT_ACTIVITY__OUTGOING_TRACES;
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
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(')');
		return result.toString();
	}

} //AbstractActivityImpl
