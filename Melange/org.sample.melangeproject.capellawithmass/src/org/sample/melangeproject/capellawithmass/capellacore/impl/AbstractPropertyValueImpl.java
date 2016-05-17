/**
 */
package org.sample.melangeproject.capellawithmass.capellacore.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.AbstractPropertyValue;
import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;
import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Property Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.AbstractPropertyValueImpl#getInvolvedElements <em>Involved Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.AbstractPropertyValueImpl#getValuedElements <em>Valued Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPropertyValueImpl extends NamedElementImpl implements AbstractPropertyValue {
	/**
	 * The cached value of the '{@link #getInvolvedElements() <em>Involved Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolvedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CapellaElement> involvedElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPropertyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.ABSTRACT_PROPERTY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapellaElement> getInvolvedElements() {
		if (involvedElements == null) {
			involvedElements = new EObjectResolvingEList<CapellaElement>(CapellaElement.class, this, CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS);
		}
		return involvedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapellaElement> getValuedElements() {
		// TODO: implement this method to return the 'Valued Elements' reference list
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				return getInvolvedElements();
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__VALUED_ELEMENTS:
				return getValuedElements();
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				getInvolvedElements().clear();
				getInvolvedElements().addAll((Collection<? extends CapellaElement>)newValue);
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				getInvolvedElements().clear();
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
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__INVOLVED_ELEMENTS:
				return involvedElements != null && !involvedElements.isEmpty();
			case CapellacorePackage.ABSTRACT_PROPERTY_VALUE__VALUED_ELEMENTS:
				return !getValuedElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractPropertyValueImpl
