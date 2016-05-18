/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

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

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;

import org.sample.melangeproject.capellawithmass.cs.AbstractDeploymentLink;
import org.sample.melangeproject.capellawithmass.cs.AbstractPathInvolvedElement;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.DeployableElement;
import org.sample.melangeproject.capellawithmass.cs.DeploymentTarget;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.Part;

import org.sample.melangeproject.capellawithmass.information.impl.AbstractInstanceImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.InformationsExchanger;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getDeployingLinks <em>Deploying Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getDeploymentLinks <em>Deployment Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getOwnedDeploymentLinks <em>Owned Deployment Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getDeployedParts <em>Deployed Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getDeployingParts <em>Deploying Parts</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getOwnedAbstractType <em>Owned Abstract Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PartImpl#getCurrentMass <em>Current Mass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartImpl extends AbstractInstanceImpl implements Part {
	/**
	 * The cached value of the '{@link #getDeployingLinks() <em>Deploying Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deployingLinks;

	/**
	 * The cached value of the '{@link #getDeploymentLinks() <em>Deployment Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deploymentLinks;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> requiredInterfaces;

	/**
	 * The cached value of the '{@link #getOwnedDeploymentLinks() <em>Owned Deployment Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> ownedDeploymentLinks;

	/**
	 * The cached value of the '{@link #getDeployedParts() <em>Deployed Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> deployedParts;

	/**
	 * The cached value of the '{@link #getDeployingParts() <em>Deploying Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> deployingParts;

	/**
	 * The cached value of the '{@link #getOwnedAbstractType() <em>Owned Abstract Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAbstractType()
	 * @generated
	 * @ordered
	 */
	protected AbstractType ownedAbstractType;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected int maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected int minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentMass() <em>Current Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMass()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_MASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentMass() <em>Current Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentMass()
	 * @generated
	 * @ordered
	 */
	protected int currentMass = CURRENT_MASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PART;
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
	public EList<AbstractDeploymentLink> getDeployingLinks() {
		if (deployingLinks == null) {
			deployingLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.PART__DEPLOYING_LINKS);
		}
		return deployingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getDeploymentLinks() {
		if (deploymentLinks == null) {
			deploymentLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.PART__DEPLOYMENT_LINKS);
		}
		return deploymentLinks;
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
	public EList<Interface> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PART__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PART__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getOwnedDeploymentLinks() {
		if (ownedDeploymentLinks == null) {
			ownedDeploymentLinks = new EObjectContainmentEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.PART__OWNED_DEPLOYMENT_LINKS);
		}
		return ownedDeploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getDeployedParts() {
		if (deployedParts == null) {
			deployedParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.PART__DEPLOYED_PARTS);
		}
		return deployedParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getDeployingParts() {
		if (deployingParts == null) {
			deployingParts = new EObjectResolvingEList<Part>(Part.class, this, CsPackage.PART__DEPLOYING_PARTS);
		}
		return deployingParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getOwnedAbstractType() {
		return ownedAbstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedAbstractType(AbstractType newOwnedAbstractType, NotificationChain msgs) {
		AbstractType oldOwnedAbstractType = ownedAbstractType;
		ownedAbstractType = newOwnedAbstractType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CsPackage.PART__OWNED_ABSTRACT_TYPE, oldOwnedAbstractType, newOwnedAbstractType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedAbstractType(AbstractType newOwnedAbstractType) {
		if (newOwnedAbstractType != ownedAbstractType) {
			NotificationChain msgs = null;
			if (ownedAbstractType != null)
				msgs = ((InternalEObject)ownedAbstractType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
			if (newOwnedAbstractType != null)
				msgs = ((InternalEObject)newOwnedAbstractType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CsPackage.PART__OWNED_ABSTRACT_TYPE, null, msgs);
			msgs = basicSetOwnedAbstractType(newOwnedAbstractType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__OWNED_ABSTRACT_TYPE, newOwnedAbstractType, newOwnedAbstractType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(int newMaxValue) {
		int oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(int newMinValue) {
		int oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCurrentMass() {
		return currentMass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentMass(int newCurrentMass) {
		int oldCurrentMass = currentMass;
		currentMass = newCurrentMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CsPackage.PART__CURRENT_MASS, oldCurrentMass, currentMass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverhead() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatured() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int computeMass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void print() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				return ((InternalEList<?>)getOwnedDeploymentLinks()).basicRemove(otherEnd, msgs);
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return basicSetOwnedAbstractType(null, msgs);
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
			case CsPackage.PART__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case CsPackage.PART__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case CsPackage.PART__INFORMATION_FLOWS:
				return getInformationFlows();
			case CsPackage.PART__DEPLOYING_LINKS:
				return getDeployingLinks();
			case CsPackage.PART__DEPLOYMENT_LINKS:
				return getDeploymentLinks();
			case CsPackage.PART__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.PART__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.PART__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				return getOwnedDeploymentLinks();
			case CsPackage.PART__DEPLOYED_PARTS:
				return getDeployedParts();
			case CsPackage.PART__DEPLOYING_PARTS:
				return getDeployingParts();
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return getOwnedAbstractType();
			case CsPackage.PART__VALUE:
				return getValue();
			case CsPackage.PART__MAX_VALUE:
				return getMaxValue();
			case CsPackage.PART__MIN_VALUE:
				return getMinValue();
			case CsPackage.PART__CURRENT_MASS:
				return getCurrentMass();
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
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				getOwnedDeploymentLinks().addAll((Collection<? extends AbstractDeploymentLink>)newValue);
				return;
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				setOwnedAbstractType((AbstractType)newValue);
				return;
			case CsPackage.PART__VALUE:
				setValue((Integer)newValue);
				return;
			case CsPackage.PART__MAX_VALUE:
				setMaxValue((Integer)newValue);
				return;
			case CsPackage.PART__MIN_VALUE:
				setMinValue((Integer)newValue);
				return;
			case CsPackage.PART__CURRENT_MASS:
				setCurrentMass((Integer)newValue);
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
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				getOwnedDeploymentLinks().clear();
				return;
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				setOwnedAbstractType((AbstractType)null);
				return;
			case CsPackage.PART__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CsPackage.PART__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case CsPackage.PART__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case CsPackage.PART__CURRENT_MASS:
				setCurrentMass(CURRENT_MASS_EDEFAULT);
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
			case CsPackage.PART__INCOMING_INFORMATION_FLOWS:
				return !getIncomingInformationFlows().isEmpty();
			case CsPackage.PART__OUTGOING_INFORMATION_FLOWS:
				return !getOutgoingInformationFlows().isEmpty();
			case CsPackage.PART__INFORMATION_FLOWS:
				return !getInformationFlows().isEmpty();
			case CsPackage.PART__DEPLOYING_LINKS:
				return deployingLinks != null && !deployingLinks.isEmpty();
			case CsPackage.PART__DEPLOYMENT_LINKS:
				return deploymentLinks != null && !deploymentLinks.isEmpty();
			case CsPackage.PART__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case CsPackage.PART__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.PART__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.PART__OWNED_DEPLOYMENT_LINKS:
				return ownedDeploymentLinks != null && !ownedDeploymentLinks.isEmpty();
			case CsPackage.PART__DEPLOYED_PARTS:
				return deployedParts != null && !deployedParts.isEmpty();
			case CsPackage.PART__DEPLOYING_PARTS:
				return deployingParts != null && !deployingParts.isEmpty();
			case CsPackage.PART__OWNED_ABSTRACT_TYPE:
				return ownedAbstractType != null;
			case CsPackage.PART__VALUE:
				return value != VALUE_EDEFAULT;
			case CsPackage.PART__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case CsPackage.PART__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case CsPackage.PART__CURRENT_MASS:
				return currentMass != CURRENT_MASS_EDEFAULT;
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
		if (baseClass == InformationsExchanger.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__INCOMING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS;
				case CsPackage.PART__OUTGOING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS;
				case CsPackage.PART__INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__DEPLOYING_LINKS: return CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__DEPLOYMENT_LINKS: return CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.PART__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
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
		if (baseClass == InformationsExchanger.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS: return CsPackage.PART__INCOMING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS: return CsPackage.PART__OUTGOING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS: return CsPackage.PART__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == DeployableElement.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS: return CsPackage.PART__DEPLOYING_LINKS;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS: return CsPackage.PART__DEPLOYMENT_LINKS;
				default: return -1;
			}
		}
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.PART__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPathInvolvedElement.class) {
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
		result.append(" (value: ");
		result.append(value);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", currentMass: ");
		result.append(currentMass);
		result.append(')');
		return result.toString();
	}

} //PartImpl
