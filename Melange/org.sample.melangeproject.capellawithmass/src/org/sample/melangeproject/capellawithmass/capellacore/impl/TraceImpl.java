/**
 */
package org.sample.melangeproject.capellawithmass.capellacore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTrace;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;
import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.TraceImpl#getTargetElement <em>Target Element</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.TraceImpl#getSourceElement <em>Source Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TraceImpl extends RelationshipImpl implements Trace {
	/**
	 * The cached value of the '{@link #getTargetElement() <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElement()
	 * @generated
	 * @ordered
	 */
	protected TraceableElement targetElement;

	/**
	 * The cached value of the '{@link #getSourceElement() <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElement()
	 * @generated
	 * @ordered
	 */
	protected TraceableElement sourceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement getTargetElement() {
		if (targetElement != null && targetElement.eIsProxy()) {
			InternalEObject oldTargetElement = (InternalEObject)targetElement;
			targetElement = (TraceableElement)eResolveProxy(oldTargetElement);
			if (targetElement != oldTargetElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacorePackage.TRACE__TARGET_ELEMENT, oldTargetElement, targetElement));
			}
		}
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement basicGetTargetElement() {
		return targetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetElement(TraceableElement newTargetElement) {
		TraceableElement oldTargetElement = targetElement;
		targetElement = newTargetElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TRACE__TARGET_ELEMENT, oldTargetElement, targetElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement getSourceElement() {
		if (sourceElement != null && sourceElement.eIsProxy()) {
			InternalEObject oldSourceElement = (InternalEObject)sourceElement;
			sourceElement = (TraceableElement)eResolveProxy(oldSourceElement);
			if (sourceElement != oldSourceElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapellacorePackage.TRACE__SOURCE_ELEMENT, oldSourceElement, sourceElement));
			}
		}
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement basicGetSourceElement() {
		return sourceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceElement(TraceableElement newSourceElement) {
		TraceableElement oldSourceElement = sourceElement;
		sourceElement = newSourceElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.TRACE__SOURCE_ELEMENT, oldSourceElement, sourceElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CapellacorePackage.TRACE__TARGET_ELEMENT:
				if (resolve) return getTargetElement();
				return basicGetTargetElement();
			case CapellacorePackage.TRACE__SOURCE_ELEMENT:
				if (resolve) return getSourceElement();
				return basicGetSourceElement();
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
			case CapellacorePackage.TRACE__TARGET_ELEMENT:
				setTargetElement((TraceableElement)newValue);
				return;
			case CapellacorePackage.TRACE__SOURCE_ELEMENT:
				setSourceElement((TraceableElement)newValue);
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
			case CapellacorePackage.TRACE__TARGET_ELEMENT:
				setTargetElement((TraceableElement)null);
				return;
			case CapellacorePackage.TRACE__SOURCE_ELEMENT:
				setSourceElement((TraceableElement)null);
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
			case CapellacorePackage.TRACE__TARGET_ELEMENT:
				return targetElement != null;
			case CapellacorePackage.TRACE__SOURCE_ELEMENT:
				return sourceElement != null;
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
		if (baseClass == AbstractTrace.class) {
			switch (derivedFeatureID) {
				case CapellacorePackage.TRACE__TARGET_ELEMENT: return ModellingcorePackage.ABSTRACT_TRACE__TARGET_ELEMENT;
				case CapellacorePackage.TRACE__SOURCE_ELEMENT: return ModellingcorePackage.ABSTRACT_TRACE__SOURCE_ELEMENT;
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
		if (baseClass == AbstractTrace.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_TRACE__TARGET_ELEMENT: return CapellacorePackage.TRACE__TARGET_ELEMENT;
				case ModellingcorePackage.ABSTRACT_TRACE__SOURCE_ELEMENT: return CapellacorePackage.TRACE__SOURCE_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TraceImpl
