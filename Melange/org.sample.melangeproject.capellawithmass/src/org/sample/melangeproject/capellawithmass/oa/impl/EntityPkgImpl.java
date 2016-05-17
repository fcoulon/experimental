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

import org.sample.melangeproject.capellawithmass.fa.AbstractFunctionalStructure;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeCategory;
import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeRealization;
import org.sample.melangeproject.capellawithmass.fa.ComponentFunctionalAllocation;
import org.sample.melangeproject.capellawithmass.fa.ExchangeLink;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;

import org.sample.melangeproject.capellawithmass.oa.CommunicationMean;
import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.EntityPkg;
import org.sample.melangeproject.capellawithmass.oa.Location;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;

import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Pkg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedTraces <em>Owned Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getContainedGenericTraces <em>Contained Generic Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getContainedRequirementsTraces <em>Contained Requirements Traces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedPropertyValuePkgs <em>Owned Property Value Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedComponentExchanges <em>Owned Component Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedComponentExchangeCategories <em>Owned Component Exchange Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedFunctionalLinks <em>Owned Functional Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedFunctionalAllocations <em>Owned Functional Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedComponentExchangeRealizations <em>Owned Component Exchange Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedEntityPkgs <em>Owned Entity Pkgs</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedEntities <em>Owned Entities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedLocations <em>Owned Locations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.EntityPkgImpl#getOwnedCommunicationMeans <em>Owned Communication Means</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityPkgImpl extends NamedElementImpl implements EntityPkg {
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
	 * The cached value of the '{@link #getOwnedComponentExchanges() <em>Owned Component Exchanges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchange> ownedComponentExchanges;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeCategories() <em>Owned Component Exchange Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeCategory> ownedComponentExchangeCategories;

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
	 * The cached value of the '{@link #getOwnedFunctionalAllocations() <em>Owned Functional Allocations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFunctionalAllocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFunctionalAllocation> ownedFunctionalAllocations;

	/**
	 * The cached value of the '{@link #getOwnedComponentExchangeRealizations() <em>Owned Component Exchange Realizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponentExchangeRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentExchangeRealization> ownedComponentExchangeRealizations;

	/**
	 * The cached value of the '{@link #getOwnedEntityPkgs() <em>Owned Entity Pkgs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityPkgs()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityPkg> ownedEntityPkgs;

	/**
	 * The cached value of the '{@link #getOwnedEntities() <em>Owned Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> ownedEntities;

	/**
	 * The cached value of the '{@link #getOwnedLocations() <em>Owned Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> ownedLocations;

	/**
	 * The cached value of the '{@link #getOwnedCommunicationMeans() <em>Owned Communication Means</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCommunicationMeans()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationMean> ownedCommunicationMeans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityPkgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ENTITY_PKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trace> getOwnedTraces() {
		if (ownedTraces == null) {
			ownedTraces = new EObjectContainmentEList<Trace>(Trace.class, this, OaPackage.ENTITY_PKG__OWNED_TRACES);
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
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, OaPackage.ENTITY_PKG__NAMING_RULES);
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
			ownedPropertyValuePkgs = new EObjectContainmentEList<PropertyValuePkg>(PropertyValuePkg.class, this, OaPackage.ENTITY_PKG__OWNED_PROPERTY_VALUE_PKGS);
		}
		return ownedPropertyValuePkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchange> getOwnedComponentExchanges() {
		if (ownedComponentExchanges == null) {
			ownedComponentExchanges = new EObjectContainmentEList<ComponentExchange>(ComponentExchange.class, this, OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES);
		}
		return ownedComponentExchanges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeCategory> getOwnedComponentExchangeCategories() {
		if (ownedComponentExchangeCategories == null) {
			ownedComponentExchangeCategories = new EObjectContainmentEList<ComponentExchangeCategory>(ComponentExchangeCategory.class, this, OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES);
		}
		return ownedComponentExchangeCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeLink> getOwnedFunctionalLinks() {
		if (ownedFunctionalLinks == null) {
			ownedFunctionalLinks = new EObjectContainmentEList<ExchangeLink>(ExchangeLink.class, this, OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS);
		}
		return ownedFunctionalLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentFunctionalAllocation> getOwnedFunctionalAllocations() {
		if (ownedFunctionalAllocations == null) {
			ownedFunctionalAllocations = new EObjectContainmentEList<ComponentFunctionalAllocation>(ComponentFunctionalAllocation.class, this, OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS);
		}
		return ownedFunctionalAllocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentExchangeRealization> getOwnedComponentExchangeRealizations() {
		if (ownedComponentExchangeRealizations == null) {
			ownedComponentExchangeRealizations = new EObjectContainmentEList<ComponentExchangeRealization>(ComponentExchangeRealization.class, this, OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS);
		}
		return ownedComponentExchangeRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityPkg> getOwnedEntityPkgs() {
		if (ownedEntityPkgs == null) {
			ownedEntityPkgs = new EObjectContainmentEList<EntityPkg>(EntityPkg.class, this, OaPackage.ENTITY_PKG__OWNED_ENTITY_PKGS);
		}
		return ownedEntityPkgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getOwnedEntities() {
		if (ownedEntities == null) {
			ownedEntities = new EObjectContainmentEList<Entity>(Entity.class, this, OaPackage.ENTITY_PKG__OWNED_ENTITIES);
		}
		return ownedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getOwnedLocations() {
		if (ownedLocations == null) {
			ownedLocations = new EObjectContainmentEList<Location>(Location.class, this, OaPackage.ENTITY_PKG__OWNED_LOCATIONS);
		}
		return ownedLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationMean> getOwnedCommunicationMeans() {
		if (ownedCommunicationMeans == null) {
			ownedCommunicationMeans = new EObjectContainmentEList<CommunicationMean>(CommunicationMean.class, this, OaPackage.ENTITY_PKG__OWNED_COMMUNICATION_MEANS);
		}
		return ownedCommunicationMeans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.ENTITY_PKG__OWNED_TRACES:
				return ((InternalEList<?>)getOwnedTraces()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ((InternalEList<?>)getOwnedPropertyValuePkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES:
				return ((InternalEList<?>)getOwnedComponentExchanges()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ((InternalEList<?>)getOwnedComponentExchangeCategories()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS:
				return ((InternalEList<?>)getOwnedFunctionalLinks()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS:
				return ((InternalEList<?>)getOwnedFunctionalAllocations()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ((InternalEList<?>)getOwnedComponentExchangeRealizations()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_ENTITY_PKGS:
				return ((InternalEList<?>)getOwnedEntityPkgs()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_ENTITIES:
				return ((InternalEList<?>)getOwnedEntities()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_LOCATIONS:
				return ((InternalEList<?>)getOwnedLocations()).basicRemove(otherEnd, msgs);
			case OaPackage.ENTITY_PKG__OWNED_COMMUNICATION_MEANS:
				return ((InternalEList<?>)getOwnedCommunicationMeans()).basicRemove(otherEnd, msgs);
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
			case OaPackage.ENTITY_PKG__OWNED_TRACES:
				return getOwnedTraces();
			case OaPackage.ENTITY_PKG__CONTAINED_GENERIC_TRACES:
				return getContainedGenericTraces();
			case OaPackage.ENTITY_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return getContainedRequirementsTraces();
			case OaPackage.ENTITY_PKG__NAMING_RULES:
				return getNamingRules();
			case OaPackage.ENTITY_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return getOwnedPropertyValuePkgs();
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES:
				return getOwnedComponentExchanges();
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return getOwnedComponentExchangeCategories();
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS:
				return getOwnedFunctionalLinks();
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS:
				return getOwnedFunctionalAllocations();
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return getOwnedComponentExchangeRealizations();
			case OaPackage.ENTITY_PKG__OWNED_ENTITY_PKGS:
				return getOwnedEntityPkgs();
			case OaPackage.ENTITY_PKG__OWNED_ENTITIES:
				return getOwnedEntities();
			case OaPackage.ENTITY_PKG__OWNED_LOCATIONS:
				return getOwnedLocations();
			case OaPackage.ENTITY_PKG__OWNED_COMMUNICATION_MEANS:
				return getOwnedCommunicationMeans();
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
			case OaPackage.ENTITY_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				getOwnedTraces().addAll((Collection<? extends Trace>)newValue);
				return;
			case OaPackage.ENTITY_PKG__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				getOwnedPropertyValuePkgs().addAll((Collection<? extends PropertyValuePkg>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				getOwnedComponentExchanges().addAll((Collection<? extends ComponentExchange>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				getOwnedComponentExchangeCategories().addAll((Collection<? extends ComponentExchangeCategory>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS:
				getOwnedFunctionalLinks().clear();
				getOwnedFunctionalLinks().addAll((Collection<? extends ExchangeLink>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS:
				getOwnedFunctionalAllocations().clear();
				getOwnedFunctionalAllocations().addAll((Collection<? extends ComponentFunctionalAllocation>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				getOwnedComponentExchangeRealizations().addAll((Collection<? extends ComponentExchangeRealization>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_ENTITY_PKGS:
				getOwnedEntityPkgs().clear();
				getOwnedEntityPkgs().addAll((Collection<? extends EntityPkg>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_ENTITIES:
				getOwnedEntities().clear();
				getOwnedEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_LOCATIONS:
				getOwnedLocations().clear();
				getOwnedLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMMUNICATION_MEANS:
				getOwnedCommunicationMeans().clear();
				getOwnedCommunicationMeans().addAll((Collection<? extends CommunicationMean>)newValue);
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
			case OaPackage.ENTITY_PKG__OWNED_TRACES:
				getOwnedTraces().clear();
				return;
			case OaPackage.ENTITY_PKG__NAMING_RULES:
				getNamingRules().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_PROPERTY_VALUE_PKGS:
				getOwnedPropertyValuePkgs().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES:
				getOwnedComponentExchanges().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				getOwnedComponentExchangeCategories().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS:
				getOwnedFunctionalLinks().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS:
				getOwnedFunctionalAllocations().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				getOwnedComponentExchangeRealizations().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_ENTITY_PKGS:
				getOwnedEntityPkgs().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_ENTITIES:
				getOwnedEntities().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_LOCATIONS:
				getOwnedLocations().clear();
				return;
			case OaPackage.ENTITY_PKG__OWNED_COMMUNICATION_MEANS:
				getOwnedCommunicationMeans().clear();
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
			case OaPackage.ENTITY_PKG__OWNED_TRACES:
				return ownedTraces != null && !ownedTraces.isEmpty();
			case OaPackage.ENTITY_PKG__CONTAINED_GENERIC_TRACES:
				return !getContainedGenericTraces().isEmpty();
			case OaPackage.ENTITY_PKG__CONTAINED_REQUIREMENTS_TRACES:
				return !getContainedRequirementsTraces().isEmpty();
			case OaPackage.ENTITY_PKG__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_PROPERTY_VALUE_PKGS:
				return ownedPropertyValuePkgs != null && !ownedPropertyValuePkgs.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES:
				return ownedComponentExchanges != null && !ownedComponentExchanges.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES:
				return ownedComponentExchangeCategories != null && !ownedComponentExchangeCategories.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS:
				return ownedFunctionalLinks != null && !ownedFunctionalLinks.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS:
				return ownedFunctionalAllocations != null && !ownedFunctionalAllocations.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS:
				return ownedComponentExchangeRealizations != null && !ownedComponentExchangeRealizations.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_ENTITY_PKGS:
				return ownedEntityPkgs != null && !ownedEntityPkgs.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_ENTITIES:
				return ownedEntities != null && !ownedEntities.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_LOCATIONS:
				return ownedLocations != null && !ownedLocations.isEmpty();
			case OaPackage.ENTITY_PKG__OWNED_COMMUNICATION_MEANS:
				return ownedCommunicationMeans != null && !ownedCommunicationMeans.isEmpty();
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
		if (baseClass == AbstractFunctionalStructure.class) {
			switch (derivedFeatureID) {
				case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES: return FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES;
				case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES: return FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES;
				case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS: return FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_FUNCTIONAL_LINKS;
				case OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS: return FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_FUNCTIONAL_ALLOCATIONS;
				case OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS: return FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS;
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
		if (baseClass == AbstractFunctionalStructure.class) {
			switch (baseFeatureID) {
				case FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGES: return OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGES;
				case FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_CATEGORIES: return OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_CATEGORIES;
				case FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_FUNCTIONAL_LINKS: return OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_LINKS;
				case FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_FUNCTIONAL_ALLOCATIONS: return OaPackage.ENTITY_PKG__OWNED_FUNCTIONAL_ALLOCATIONS;
				case FaPackage.ABSTRACT_FUNCTIONAL_STRUCTURE__OWNED_COMPONENT_EXCHANGE_REALIZATIONS: return OaPackage.ENTITY_PKG__OWNED_COMPONENT_EXCHANGE_REALIZATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityPkgImpl
