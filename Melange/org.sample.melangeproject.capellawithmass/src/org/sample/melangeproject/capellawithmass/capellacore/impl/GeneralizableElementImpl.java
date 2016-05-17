/**
 */
package org.sample.melangeproject.capellawithmass.capellacore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement;
import org.sample.melangeproject.capellawithmass.capellacore.Generalization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalizable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl#getOwnedGeneralizations <em>Owned Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl#getSuperGeneralizations <em>Super Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl#getSubGeneralizations <em>Sub Generalizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacore.impl.GeneralizableElementImpl#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeneralizableElementImpl extends TypeImpl implements GeneralizableElement {
	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedGeneralizations() <em>Owned Generalizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapellacorePackage.Literals.GENERALIZABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralizations() {
		if (ownedGeneralizations == null) {
			ownedGeneralizations = new EObjectContainmentEList<Generalization>(Generalization.class, this, CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS);
		}
		return ownedGeneralizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getSuperGeneralizations() {
		// TODO: implement this method to return the 'Super Generalizations' reference list
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
	public EList<Generalization> getSubGeneralizations() {
		// TODO: implement this method to return the 'Sub Generalizations' reference list
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
	public EList<GeneralizableElement> getSuper() {
		// TODO: implement this method to return the 'Super' reference list
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
	public EList<GeneralizableElement> getSub() {
		// TODO: implement this method to return the 'Sub' reference list
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
			case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS:
				return ((InternalEList<?>)getOwnedGeneralizations()).basicRemove(otherEnd, msgs);
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
			case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT:
				return isAbstract();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS:
				return getOwnedGeneralizations();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS:
				return getSuperGeneralizations();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS:
				return getSubGeneralizations();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER:
				return getSuper();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB:
				return getSub();
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
			case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
				getOwnedGeneralizations().addAll((Collection<? extends Generalization>)newValue);
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
			case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS:
				getOwnedGeneralizations().clear();
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
			case CapellacorePackage.GENERALIZABLE_ELEMENT__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case CapellacorePackage.GENERALIZABLE_ELEMENT__OWNED_GENERALIZATIONS:
				return ownedGeneralizations != null && !ownedGeneralizations.isEmpty();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER_GENERALIZATIONS:
				return !getSuperGeneralizations().isEmpty();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB_GENERALIZATIONS:
				return !getSubGeneralizations().isEmpty();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUPER:
				return !getSuper().isEmpty();
			case CapellacorePackage.GENERALIZABLE_ELEMENT__SUB:
				return !getSub().isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //GeneralizableElementImpl
