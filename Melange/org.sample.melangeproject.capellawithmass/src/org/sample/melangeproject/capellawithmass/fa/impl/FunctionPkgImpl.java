/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

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

import org.sample.melangeproject.capellawithmass.fa.ExchangeCategory;
import org.sample.melangeproject.capellawithmass.fa.ExchangeLink;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecificationRealization;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionPkg;
import org.sample.melangeproject.capellawithmass.fa.FunctionSpecification;
import org.sample.melangeproject.capellawithmass.fa.FunctionalExchangeSpecification;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedFunctionalLinks <em>Owned Functional Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedExchanges <em>Owned Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedExchangeSpecificationRealizations <em>Owned Exchange Specification Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedCategories <em>Owned Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.FunctionPkgImpl#getOwnedFunctionSpecifications <em>Owned Function Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionPkgImpl extends NamedElementImpl implements FunctionPkg {
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
	 * The cached value of the '{@link #getOwnedFunctionalLinks() <em>Owned Functional Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeLink> ownedFunctionalLinks;

	/**
	 * The cached value of the '{@link #getOwnedExchanges() <em>Owned Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalExchangeSpecification> ownedExchanges;

	/**
	 * The cached value of the '{@link #getOwnedExchangeSpecificationRealizations() <em>Owned Exchange Specification Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeSpecificationRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeSpecificationRealization> ownedExchangeSpecificationRealizations;

	/**
	 * The cached value of the '{@link #getOwnedCategories() <em>Owned Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeCategory> ownedCategories;

	/**
	 * The cached value of the '{@link #getOwnedFunctionSpecifications() <em>Owned Function Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionSpecification> ownedFunctionSpecifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.FUNCTION_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, FaPackage.FUNCTION_PKG__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, FaPackage.FUNCTION_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeLink> getOwnedFunctionalLinks() {
		if (ownedFunctionalLinks == null) {
			ownedFunctionalLinks = new EObjectContainmentEList<ExchangeLink>(ExchangeLink.class, this, FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS);
		}
		return ownedFunctionalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalExchangeSpecification> getOwnedExchanges() {
		if (ownedExchanges == null) {
			ownedExchanges = new EObjectContainmentEList<FunctionalExchangeSpecification>(FunctionalExchangeSpecification.class, this, FaPackage.FUNCTION_PKG__OWNED_EXCHANGES);
		}
		return ownedExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeSpecificationRealization> getOwnedExchangeSpecificationRealizations() {
		if (ownedExchangeSpecificationRealizations == null) {
			ownedExchangeSpecificationRealizations = new EObjectContainmentEList<ExchangeSpecificationRealization>(ExchangeSpecificationRealization.class, this, FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS);
		}
		return ownedExchangeSpecificationRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeCategory> getOwnedCategories() {
		if (ownedCategories == null) {
			ownedCategories = new EObjectContainmentEList<ExchangeCategory>(ExchangeCategory.class, this, FaPackage.FUNCTION_PKG__OWNED_CATEGORIES);
		}
		return ownedCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionSpecification> getOwnedFunctionSpecifications() {
		if (ownedFunctionSpecifications == null) {
			ownedFunctionSpecifications = new EObjectContainmentEList<FunctionSpecification>(FunctionSpecification.class, this, FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS);
		}
		return ownedFunctionSpecifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.FUNCTION_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
				return ((InternalEList<?>)getOwnedFunctionalLinks()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
				return ((InternalEList<?>)getOwnedExchanges()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ((InternalEList<?>)getOwnedExchangeSpecificationRealizations()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				return ((InternalEList<?>)getOwnedCategories()).basicRemove(otherEnd, msgs);
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
				return ((InternalEList<?>)getOwnedFunctionSpecifications()).basicRemove(otherEnd, msgs);
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
			case FaPackage.FUNCTION_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case FaPackage.FUNCTION_PKG__NAMING_RULES:
				return getNamingRules();
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
				return getOwnedFunctionalLinks();
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
				return getOwnedExchanges();
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return getOwnedExchangeSpecificationRealizations();
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				return getOwnedCategories();
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
				return getOwnedFunctionSpecifications();
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
			case FaPackage.FUNCTION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
				getOwnedFunctionalLinks().clear();
				getOwnedFunctionalLinks().addAll((Collection<? extends ExchangeLink>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
				getOwnedExchanges().clear();
				getOwnedExchanges().addAll((Collection<? extends FunctionalExchangeSpecification>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
				getOwnedExchangeSpecificationRealizations().clear();
				getOwnedExchangeSpecificationRealizations().addAll((Collection<? extends ExchangeSpecificationRealization>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				getOwnedCategories().clear();
				getOwnedCategories().addAll((Collection<? extends ExchangeCategory>)newValue);
				return;
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
				getOwnedFunctionSpecifications().clear();
				getOwnedFunctionSpecifications().addAll((Collection<? extends FunctionSpecification>)newValue);
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
			case FaPackage.FUNCTION_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case FaPackage.FUNCTION_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
				getOwnedFunctionalLinks().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
				getOwnedExchanges().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
				getOwnedExchangeSpecificationRealizations().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				getOwnedCategories().clear();
				return;
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
				getOwnedFunctionSpecifications().clear();
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
			case FaPackage.FUNCTION_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case FaPackage.FUNCTION_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case FaPackage.FUNCTION_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case FaPackage.FUNCTION_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTIONAL_LINKS:
				return ownedFunctionalLinks != null && !ownedFunctionalLinks.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGES:
				return ownedExchanges != null && !ownedExchanges.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_EXCHANGE_SPECIFICATION_REALIZATIONS:
				return ownedExchangeSpecificationRealizations != null && !ownedExchangeSpecificationRealizations.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_CATEGORIES:
				return ownedCategories != null && !ownedCategories.isEmpty();
			case FaPackage.FUNCTION_PKG__OWNED_FUNCTION_SPECIFICATIONS:
				return ownedFunctionSpecifications != null && !ownedFunctionSpecifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionPkgImpl
