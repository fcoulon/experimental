/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacommon.GenericTrace;

import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;
import org.sample.melangeproject.capellawithmass.capellacore.PropertyValuePkg;
import org.sample.melangeproject.capellawithmass.capellacore.Trace;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.oa.Concept;
import org.sample.melangeproject.capellawithmass.oa.ConceptPkg;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getOwnedConceptPkgs <em>Owned Concept Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptPkgImpl#getOwnedConcepts <em>Owned Concepts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptPkgImpl extends NamedElementImpl implements ConceptPkg {
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
	 * The cached value of the '{@link #getOwnedConceptPkgs() <em>Owned Concept Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConceptPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptPkg> ownedConceptPkgs;

	/**
	 * The cached value of the '{@link #getOwnedConcepts() <em>Owned Concepts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Concept> ownedConcepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.CONCEPT_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, OaPackage.CONCEPT_PKG__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, OaPackage.CONCEPT_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, OaPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptPkg> getOwnedConceptPkgs() {
		if (ownedConceptPkgs == null) {
			ownedConceptPkgs = new EObjectContainmentEList<ConceptPkg>(ConceptPkg.class, this, OaPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS);
		}
		return ownedConceptPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Concept> getOwnedConcepts() {
		if (ownedConcepts == null) {
			ownedConcepts = new EObjectContainmentEList<Concept>(Concept.class, this, OaPackage.CONCEPT_PKG__OWNED_CONCEPTS);
		}
		return ownedConcepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.CONCEPT_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case OaPackage.CONCEPT_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case OaPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
				return ((InternalEList<?>)getOwnedConceptPkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPTS:
				return ((InternalEList<?>)getOwnedConcepts()).basicRemove(otherEnd, msgs);
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
			case OaPackage.CONCEPT_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case OaPackage.CONCEPT_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case OaPackage.CONCEPT_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case OaPackage.CONCEPT_PKG__NAMING_RULES:
				return getNamingRules();
			case OaPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
				return getOwnedConceptPkgs();
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPTS:
				return getOwnedConcepts();
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
			case OaPackage.CONCEPT_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case OaPackage.CONCEPT_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case OaPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
				getOwnedConceptPkgs().clear();
				getOwnedConceptPkgs().addAll((Collection<? extends ConceptPkg>)newValue);
				return;
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPTS:
				getOwnedConcepts().clear();
				getOwnedConcepts().addAll((Collection<? extends Concept>)newValue);
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
			case OaPackage.CONCEPT_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case OaPackage.CONCEPT_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case OaPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
				getOwnedConceptPkgs().clear();
				return;
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPTS:
				getOwnedConcepts().clear();
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
			case OaPackage.CONCEPT_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case OaPackage.CONCEPT_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case OaPackage.CONCEPT_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case OaPackage.CONCEPT_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case OaPackage.CONCEPT_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPT_PKGS:
				return ownedConceptPkgs != null && !ownedConceptPkgs.isEmpty();
			case OaPackage.CONCEPT_PKG__OWNED_CONCEPTS:
				return ownedConcepts != null && !ownedConcepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptPkgImpl
