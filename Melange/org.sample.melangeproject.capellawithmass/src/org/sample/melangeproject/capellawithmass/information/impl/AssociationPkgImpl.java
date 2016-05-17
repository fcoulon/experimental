/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValuePkg;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.information.Association;
import org.sample.melangeproject.capellawithmass.information.AssociationPkg;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.AssociationPkgImpl#getOwnedAssociations <em>Owned Associations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AssociationPkgImpl extends NamedElementImpl implements AssociationPkg {
	/**
	 * The cached value of the '{@link #getOwnedTraces() <em>Owned Traces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTraces()
	 * @generated
	 * @ordered
	 */
	protected EList<Trace> ownedTraces;

	/**
	 * The cached value of the '{@link #getNamingRules() <em>Naming Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<NamingRule> namingRules;

	/**
	 * The cached value of the '{@link #getOwnedPropertyValuePkgs() <em>Owned Property Value Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyValuePkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyValuePkg> ownedPropertyValuePkgs;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.UNSET;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedAssociations() <em>Owned Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> ownedAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.ASSOCIATION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, InformationPackage.ASSOCIATION_PKG__OWNED_TRACES);
		}
		return ownedTraces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericTrace> getContainedGenericTraces() {
		// TODO: implement this method to return the 'Contained Generic Traces' reference list
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
	public EList<RequirementsTrace> getContainedRequirementsTraces() {
		// TODO: implement this method to return the 'Contained Requirements Traces' reference list
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
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, InformationPackage.ASSOCIATION_PKG__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyValuePkg> getOwnedPropertyValuePkgs() {
		if (ownedPropertyValuePkgs == null) {
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, InformationPackage.ASSOCIATION_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.ASSOCIATION_PKG__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getOwnedAssociations() {
		if (ownedAssociations == null) {
			ownedAssociations = new EObjectContainmentEList<Association>(Association.class, this, InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS);
		}
		return ownedAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InformationPackage.ASSOCIATION_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case InformationPackage.ASSOCIATION_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case InformationPackage.ASSOCIATION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS:
				return ((InternalEList<?>)getOwnedAssociations()).basicRemove(otherEnd, msgs);
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
			case InformationPackage.ASSOCIATION_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case InformationPackage.ASSOCIATION_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case InformationPackage.ASSOCIATION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case InformationPackage.ASSOCIATION_PKG__NAMING_RULES:
				return getNamingRules();
			case InformationPackage.ASSOCIATION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case InformationPackage.ASSOCIATION_PKG__VISIBILITY:
				return getVisibility();
			case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS:
				return getOwnedAssociations();
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
			case InformationPackage.ASSOCIATION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case InformationPackage.ASSOCIATION_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case InformationPackage.ASSOCIATION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case InformationPackage.ASSOCIATION_PKG__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS:
				getOwnedAssociations().clear();
				getOwnedAssociations().addAll((Collection<? extends Association>)newValue);
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
			case InformationPackage.ASSOCIATION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case InformationPackage.ASSOCIATION_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case InformationPackage.ASSOCIATION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case InformationPackage.ASSOCIATION_PKG__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS:
				getOwnedAssociations().clear();
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
			case InformationPackage.ASSOCIATION_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case InformationPackage.ASSOCIATION_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case InformationPackage.ASSOCIATION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case InformationPackage.ASSOCIATION_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case InformationPackage.ASSOCIATION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case InformationPackage.ASSOCIATION_PKG__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case InformationPackage.ASSOCIATION_PKG__OWNED_ASSOCIATIONS:
				return ownedAssociations != null && !ownedAssociations.isEmpty();
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //AssociationPkgImpl
