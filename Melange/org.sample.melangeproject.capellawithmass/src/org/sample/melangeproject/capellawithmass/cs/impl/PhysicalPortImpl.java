/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.StateMachine;

import org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalArtifact;
import org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalLinkEnd;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.Interface;
import org.sample.melangeproject.capellawithmass.cs.PhysicalLink;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPort;
import org.sample.melangeproject.capellawithmass.cs.PhysicalPortRealization;

import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem;

import org.sample.melangeproject.capellawithmass.fa.ComponentPort;
import org.sample.melangeproject.capellawithmass.fa.ComponentPortAllocation;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Port;
import org.sample.melangeproject.capellawithmass.information.PortAllocation;
import org.sample.melangeproject.capellawithmass.information.PortRealization;

import org.sample.melangeproject.capellawithmass.information.impl.AbstractInstanceImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;
import org.sample.melangeproject.capellawithmass.modellingcore.InformationsExchanger;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getIncomingPortRealizations <em>Incoming Port Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOutgoingPortRealizations <em>Outgoing Port Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOwnedProtocols <em>Owned Protocols</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getIncomingPortAllocations <em>Incoming Port Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOutgoingPortAllocations <em>Outgoing Port Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOwnedPortRealizations <em>Owned Port Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOwnedPortAllocations <em>Owned Port Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getAllocatorConfigurationItems <em>Allocator Configuration Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getIncomingInformationFlows <em>Incoming Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOutgoingInformationFlows <em>Outgoing Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getInformationFlows <em>Information Flows</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getInvolvedLinks <em>Involved Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOwnedComponentPortAllocations <em>Owned Component Port Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getOwnedPhysicalPortRealizations <em>Owned Physical Port Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getAllocatedComponentPorts <em>Allocated Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getRealizedPhysicalPorts <em>Realized Physical Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.PhysicalPortImpl#getRealizingPhysicalPorts <em>Realizing Physical Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalPortImpl extends AbstractInstanceImpl implements PhysicalPort {
	/**
	 * The cached value of the '{@link #getOwnedProtocols() <em>Owned Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> ownedProtocols;

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
	 * The cached value of the '{@link #getOwnedPortRealizations() <em>Owned Port Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortRealization> ownedPortRealizations;

	/**
	 * The cached value of the '{@link #getOwnedPortAllocations() <em>Owned Port Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortAllocation> ownedPortAllocations;

	/**
	 * The cached value of the '{@link #getInvolvedLinks() <em>Involved Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalLink> involvedLinks;

	/**
	 * The cached value of the '{@link #getOwnedComponentPortAllocations() <em>Owned Component Port Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentPortAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPortAllocation> ownedComponentPortAllocations;

	/**
	 * The cached value of the '{@link #getOwnedPhysicalPortRealizations() <em>Owned Physical Port Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPhysicalPortRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPortRealization> ownedPhysicalPortRealizations;

	/**
	 * The cached value of the '{@link #getRealizedPhysicalPorts() <em>Realized Physical Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPhysicalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPort> realizedPhysicalPorts;

	/**
	 * The cached value of the '{@link #getRealizingPhysicalPorts() <em>Realizing Physical Ports</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingPhysicalPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalPort> realizingPhysicalPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.PHYSICAL_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRealization> getIncomingPortRealizations() {
		// TODO: implement this method to return the 'Incoming Port Realizations' reference list
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
	public EList<PortRealization> getOutgoingPortRealizations() {
		// TODO: implement this method to return the 'Outgoing Port Realizations' reference list
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
	public EList<StateMachine> getOwnedProtocols() {
		if (ownedProtocols == null) {
			ownedProtocols = new EObjectContainmentEList<StateMachine>(StateMachine.class, this, CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS);
		}
		return ownedProtocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortAllocation> getIncomingPortAllocations() {
		// TODO: implement this method to return the 'Incoming Port Allocations' reference list
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
	public EList<PortAllocation> getOutgoingPortAllocations() {
		// TODO: implement this method to return the 'Outgoing Port Allocations' reference list
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
			providedInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES);
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
			requiredInterfaces = new EObjectResolvingEList<Interface>(Interface.class, this, CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRealization> getOwnedPortRealizations() {
		if (ownedPortRealizations == null) {
			ownedPortRealizations = new EObjectContainmentEList<PortRealization>(PortRealization.class, this, CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS);
		}
		return ownedPortRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortAllocation> getOwnedPortAllocations() {
		if (ownedPortAllocations == null) {
			ownedPortAllocations = new EObjectContainmentEList<PortAllocation>(PortAllocation.class, this, CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS);
		}
		return ownedPortAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationItem> getAllocatorConfigurationItems() {
		// TODO: implement this method to return the 'Allocator Configuration Items' reference list
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
	public EList<PhysicalLink> getInvolvedLinks() {
		if (involvedLinks == null) {
			involvedLinks = new EObjectResolvingEList<PhysicalLink>(PhysicalLink.class, this, CsPackage.PHYSICAL_PORT__INVOLVED_LINKS);
		}
		return involvedLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPortAllocation> getOwnedComponentPortAllocations() {
		if (ownedComponentPortAllocations == null) {
			ownedComponentPortAllocations = new EObjectContainmentEList<ComponentPortAllocation>(ComponentPortAllocation.class, this, CsPackage.PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS);
		}
		return ownedComponentPortAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPortRealization> getOwnedPhysicalPortRealizations() {
		if (ownedPhysicalPortRealizations == null) {
			ownedPhysicalPortRealizations = new EObjectContainmentEList<PhysicalPortRealization>(PhysicalPortRealization.class, this, CsPackage.PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS);
		}
		return ownedPhysicalPortRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPort> getAllocatedComponentPorts() {
		// TODO: implement this method to return the 'Allocated Component Ports' reference list
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
	public EList<PhysicalPort> getRealizedPhysicalPorts() {
		if (realizedPhysicalPorts == null) {
			realizedPhysicalPorts = new EObjectResolvingEList<PhysicalPort>(PhysicalPort.class, this, CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS);
		}
		return realizedPhysicalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalPort> getRealizingPhysicalPorts() {
		if (realizingPhysicalPorts == null) {
			realizingPhysicalPorts = new EObjectResolvingEList<PhysicalPort>(PhysicalPort.class, this, CsPackage.PHYSICAL_PORT__REALIZING_PHYSICAL_PORTS);
		}
		return realizingPhysicalPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				return ((InternalEList<?>)getOwnedProtocols()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPortRealizations()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedPortAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedComponentPortAllocations()).basicRemove(otherEnd, msgs);
			case CsPackage.PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS:
				return ((InternalEList<?>)getOwnedPhysicalPortRealizations()).basicRemove(otherEnd, msgs);
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
			case CsPackage.PHYSICAL_PORT__INCOMING_PORT_REALIZATIONS:
				return getIncomingPortRealizations();
			case CsPackage.PHYSICAL_PORT__OUTGOING_PORT_REALIZATIONS:
				return getOutgoingPortRealizations();
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				return getOwnedProtocols();
			case CsPackage.PHYSICAL_PORT__INCOMING_PORT_ALLOCATIONS:
				return getIncomingPortAllocations();
			case CsPackage.PHYSICAL_PORT__OUTGOING_PORT_ALLOCATIONS:
				return getOutgoingPortAllocations();
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS:
				return getOwnedPortRealizations();
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS:
				return getOwnedPortAllocations();
			case CsPackage.PHYSICAL_PORT__ALLOCATOR_CONFIGURATION_ITEMS:
				return getAllocatorConfigurationItems();
			case CsPackage.PHYSICAL_PORT__INCOMING_INFORMATION_FLOWS:
				return getIncomingInformationFlows();
			case CsPackage.PHYSICAL_PORT__OUTGOING_INFORMATION_FLOWS:
				return getOutgoingInformationFlows();
			case CsPackage.PHYSICAL_PORT__INFORMATION_FLOWS:
				return getInformationFlows();
			case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS:
				return getInvolvedLinks();
			case CsPackage.PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS:
				return getOwnedComponentPortAllocations();
			case CsPackage.PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS:
				return getOwnedPhysicalPortRealizations();
			case CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS:
				return getAllocatedComponentPorts();
			case CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS:
				return getRealizedPhysicalPorts();
			case CsPackage.PHYSICAL_PORT__REALIZING_PHYSICAL_PORTS:
				return getRealizingPhysicalPorts();
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
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				getOwnedProtocols().clear();
				getOwnedProtocols().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends Interface>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS:
				getOwnedPortRealizations().clear();
				getOwnedPortRealizations().addAll((Collection<? extends PortRealization>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS:
				getOwnedPortAllocations().clear();
				getOwnedPortAllocations().addAll((Collection<? extends PortAllocation>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS:
				getOwnedComponentPortAllocations().clear();
				getOwnedComponentPortAllocations().addAll((Collection<? extends ComponentPortAllocation>)newValue);
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS:
				getOwnedPhysicalPortRealizations().clear();
				getOwnedPhysicalPortRealizations().addAll((Collection<? extends PhysicalPortRealization>)newValue);
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
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				getOwnedProtocols().clear();
				return;
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS:
				getOwnedPortRealizations().clear();
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS:
				getOwnedPortAllocations().clear();
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS:
				getOwnedComponentPortAllocations().clear();
				return;
			case CsPackage.PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS:
				getOwnedPhysicalPortRealizations().clear();
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
			case CsPackage.PHYSICAL_PORT__INCOMING_PORT_REALIZATIONS:
				return !getIncomingPortRealizations().isEmpty();
			case CsPackage.PHYSICAL_PORT__OUTGOING_PORT_REALIZATIONS:
				return !getOutgoingPortRealizations().isEmpty();
			case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS:
				return ownedProtocols != null && !ownedProtocols.isEmpty();
			case CsPackage.PHYSICAL_PORT__INCOMING_PORT_ALLOCATIONS:
				return !getIncomingPortAllocations().isEmpty();
			case CsPackage.PHYSICAL_PORT__OUTGOING_PORT_ALLOCATIONS:
				return !getOutgoingPortAllocations().isEmpty();
			case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS:
				return ownedPortRealizations != null && !ownedPortRealizations.isEmpty();
			case CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS:
				return ownedPortAllocations != null && !ownedPortAllocations.isEmpty();
			case CsPackage.PHYSICAL_PORT__ALLOCATOR_CONFIGURATION_ITEMS:
				return !getAllocatorConfigurationItems().isEmpty();
			case CsPackage.PHYSICAL_PORT__INCOMING_INFORMATION_FLOWS:
				return !getIncomingInformationFlows().isEmpty();
			case CsPackage.PHYSICAL_PORT__OUTGOING_INFORMATION_FLOWS:
				return !getOutgoingInformationFlows().isEmpty();
			case CsPackage.PHYSICAL_PORT__INFORMATION_FLOWS:
				return !getInformationFlows().isEmpty();
			case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS:
				return involvedLinks != null && !involvedLinks.isEmpty();
			case CsPackage.PHYSICAL_PORT__OWNED_COMPONENT_PORT_ALLOCATIONS:
				return ownedComponentPortAllocations != null && !ownedComponentPortAllocations.isEmpty();
			case CsPackage.PHYSICAL_PORT__OWNED_PHYSICAL_PORT_REALIZATIONS:
				return ownedPhysicalPortRealizations != null && !ownedPhysicalPortRealizations.isEmpty();
			case CsPackage.PHYSICAL_PORT__ALLOCATED_COMPONENT_PORTS:
				return !getAllocatedComponentPorts().isEmpty();
			case CsPackage.PHYSICAL_PORT__REALIZED_PHYSICAL_PORTS:
				return realizedPhysicalPorts != null && !realizedPhysicalPorts.isEmpty();
			case CsPackage.PHYSICAL_PORT__REALIZING_PHYSICAL_PORTS:
				return realizingPhysicalPorts != null && !realizingPhysicalPorts.isEmpty();
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
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PORT__INCOMING_PORT_REALIZATIONS: return InformationPackage.PORT__INCOMING_PORT_REALIZATIONS;
				case CsPackage.PHYSICAL_PORT__OUTGOING_PORT_REALIZATIONS: return InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS;
				case CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS: return InformationPackage.PORT__OWNED_PROTOCOLS;
				case CsPackage.PHYSICAL_PORT__INCOMING_PORT_ALLOCATIONS: return InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS;
				case CsPackage.PHYSICAL_PORT__OUTGOING_PORT_ALLOCATIONS: return InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS;
				case CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES: return InformationPackage.PORT__PROVIDED_INTERFACES;
				case CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES: return InformationPackage.PORT__REQUIRED_INTERFACES;
				case CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS: return InformationPackage.PORT__OWNED_PORT_REALIZATIONS;
				case CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS: return InformationPackage.PORT__OWNED_PORT_ALLOCATIONS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PORT__ALLOCATOR_CONFIGURATION_ITEMS: return CsPackage.ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS;
				default: return -1;
			}
		}
		if (baseClass == InformationsExchanger.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PORT__INCOMING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS;
				case CsPackage.PHYSICAL_PORT__OUTGOING_INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS;
				case CsPackage.PHYSICAL_PORT__INFORMATION_FLOWS: return ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalLinkEnd.class) {
			switch (derivedFeatureID) {
				case CsPackage.PHYSICAL_PORT__INVOLVED_LINKS: return CsPackage.ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS;
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
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case InformationPackage.PORT__INCOMING_PORT_REALIZATIONS: return CsPackage.PHYSICAL_PORT__INCOMING_PORT_REALIZATIONS;
				case InformationPackage.PORT__OUTGOING_PORT_REALIZATIONS: return CsPackage.PHYSICAL_PORT__OUTGOING_PORT_REALIZATIONS;
				case InformationPackage.PORT__OWNED_PROTOCOLS: return CsPackage.PHYSICAL_PORT__OWNED_PROTOCOLS;
				case InformationPackage.PORT__INCOMING_PORT_ALLOCATIONS: return CsPackage.PHYSICAL_PORT__INCOMING_PORT_ALLOCATIONS;
				case InformationPackage.PORT__OUTGOING_PORT_ALLOCATIONS: return CsPackage.PHYSICAL_PORT__OUTGOING_PORT_ALLOCATIONS;
				case InformationPackage.PORT__PROVIDED_INTERFACES: return CsPackage.PHYSICAL_PORT__PROVIDED_INTERFACES;
				case InformationPackage.PORT__REQUIRED_INTERFACES: return CsPackage.PHYSICAL_PORT__REQUIRED_INTERFACES;
				case InformationPackage.PORT__OWNED_PORT_REALIZATIONS: return CsPackage.PHYSICAL_PORT__OWNED_PORT_REALIZATIONS;
				case InformationPackage.PORT__OWNED_PORT_ALLOCATIONS: return CsPackage.PHYSICAL_PORT__OWNED_PORT_ALLOCATIONS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalArtifact.class) {
			switch (baseFeatureID) {
				case CsPackage.ABSTRACT_PHYSICAL_ARTIFACT__ALLOCATOR_CONFIGURATION_ITEMS: return CsPackage.PHYSICAL_PORT__ALLOCATOR_CONFIGURATION_ITEMS;
				default: return -1;
			}
		}
		if (baseClass == InformationsExchanger.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INCOMING_INFORMATION_FLOWS: return CsPackage.PHYSICAL_PORT__INCOMING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__OUTGOING_INFORMATION_FLOWS: return CsPackage.PHYSICAL_PORT__OUTGOING_INFORMATION_FLOWS;
				case ModellingcorePackage.INFORMATIONS_EXCHANGER__INFORMATION_FLOWS: return CsPackage.PHYSICAL_PORT__INFORMATION_FLOWS;
				default: return -1;
			}
		}
		if (baseClass == AbstractPhysicalLinkEnd.class) {
			switch (baseFeatureID) {
				case CsPackage.ABSTRACT_PHYSICAL_LINK_END__INVOLVED_LINKS: return CsPackage.PHYSICAL_PORT__INVOLVED_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PhysicalPortImpl
