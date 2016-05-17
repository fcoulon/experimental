/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.TypedElement;

import org.sample.melangeproject.capellawithmass.fa.ComponentPort;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionPort;

import org.sample.melangeproject.capellawithmass.information.impl.PortImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPortImpl#getAbstractType <em>Abstract Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPortImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPortImpl#getRepresentedComponentPort <em>Represented Component Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPortImpl#getAllocatorComponentPorts <em>Allocator Component Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPortImpl#getRealizedFunctionPorts <em>Realized Function Ports</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPortImpl#getRealizingFunctionPorts <em>Realizing Function Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionPortImpl extends PortImpl implements FunctionPort {
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
	 * The cached value of the '{@link #getRepresentedComponentPort() <em>Represented Component Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedComponentPort()
	 * @generated
	 * @ordered
	 */
	protected ComponentPort representedComponentPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_PORT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_PORT__ABSTRACT_TYPE, oldAbstractType, abstractType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_PORT__ABSTRACT_TYPE, oldAbstractType, abstractType));
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
	public ComponentPort getRepresentedComponentPort() {
		if (representedComponentPort != null && representedComponentPort.eIsProxy()) {
			InternalEObject oldRepresentedComponentPort = (InternalEObject)representedComponentPort;
			representedComponentPort = (ComponentPort)eResolveProxy(oldRepresentedComponentPort);
			if (representedComponentPort != oldRepresentedComponentPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT, oldRepresentedComponentPort, representedComponentPort));
			}
		}
		return representedComponentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPort basicGetRepresentedComponentPort() {
		return representedComponentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedComponentPort(ComponentPort newRepresentedComponentPort) {
		ComponentPort oldRepresentedComponentPort = representedComponentPort;
		representedComponentPort = newRepresentedComponentPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT, oldRepresentedComponentPort, representedComponentPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentPort> getAllocatorComponentPorts() {
		// TODO: implement this method to return the 'Allocator Component Ports' reference list
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
	public EList<FunctionPort> getRealizedFunctionPorts() {
		// TODO: implement this method to return the 'Realized Function Ports' reference list
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
	public EList<FunctionPort> getRealizingFunctionPorts() {
		// TODO: implement this method to return the 'Realizing Function Ports' reference list
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				if (resolve) return getAbstractType();
				return basicGetAbstractType();
			case FaPackage.FUNCTION_PORT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				if (resolve) return getRepresentedComponentPort();
				return basicGetRepresentedComponentPort();
			case FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS:
				return getAllocatorComponentPorts();
			case FaPackage.FUNCTION_PORT__REALIZED_FUNCTION_PORTS:
				return getRealizedFunctionPorts();
			case FaPackage.FUNCTION_PORT__REALIZING_FUNCTION_PORTS:
				return getRealizingFunctionPorts();
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)newValue);
				return;
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				setRepresentedComponentPort((ComponentPort)newValue);
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				setAbstractType((AbstractType)null);
				return;
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				setRepresentedComponentPort((ComponentPort)null);
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
			case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE:
				return abstractType != null;
			case FaPackage.FUNCTION_PORT__TYPE:
				return basicGetType() != null;
			case FaPackage.FUNCTION_PORT__REPRESENTED_COMPONENT_PORT:
				return representedComponentPort != null;
			case FaPackage.FUNCTION_PORT__ALLOCATOR_COMPONENT_PORTS:
				return !getAllocatorComponentPorts().isEmpty();
			case FaPackage.FUNCTION_PORT__REALIZED_FUNCTION_PORTS:
				return !getRealizedFunctionPorts().isEmpty();
			case FaPackage.FUNCTION_PORT__REALIZING_FUNCTION_PORTS:
				return !getRealizingFunctionPorts().isEmpty();
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
		if (baseClass == AbstractTypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_PORT__ABSTRACT_TYPE: return ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.FUNCTION_PORT__TYPE: return CapellacorePackage.TYPED_ELEMENT__TYPE;
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
		if (baseClass == AbstractTypedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TYPED_ELEMENT__ABSTRACT_TYPE: return FaPackage.FUNCTION_PORT__ABSTRACT_TYPE;
				default: return -1;
			}
		}
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.TYPED_ELEMENT__TYPE: return FaPackage.FUNCTION_PORT__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionPortImpl
