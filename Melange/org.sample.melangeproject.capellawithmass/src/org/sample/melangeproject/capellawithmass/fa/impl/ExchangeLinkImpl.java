/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.NamingRule;

import org.sample.melangeproject.capellawithmass.capellacore.impl.RelationshipImpl;

import org.sample.melangeproject.capellawithmass.fa.ExchangeContainment;
import org.sample.melangeproject.capellawithmass.fa.ExchangeLink;
import org.sample.melangeproject.capellawithmass.fa.ExchangeSpecification;
import org.sample.melangeproject.capellawithmass.fa.FaPackage;
import org.sample.melangeproject.capellawithmass.fa.FunctionSpecification;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exchange Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getNamingRules <em>Naming Rules</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getExchanges <em>Exchanges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getExchangeContainmentLinks <em>Exchange Containment Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getOwnedExchangeContainments <em>Owned Exchange Containments</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.impl.ExchangeLinkImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeLinkImpl extends RelationshipImpl implements ExchangeLink {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getExchangeContainmentLinks() <em>Exchange Containment Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeContainmentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeContainment> exchangeContainmentLinks;

	/**
	 * The cached value of the '{@link #getOwnedExchangeContainments() <em>Owned Exchange Containments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExchangeContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<ExchangeContainment> ownedExchangeContainments;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionSpecification> sources;

	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionSpecification> destinations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FaPackage.Literals.EXCHANGE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FaPackage.EXCHANGE_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamingRule> getNamingRules() {
		if (namingRules == null) {
			namingRules = new EObjectContainmentEList<NamingRule>(NamingRule.class, this, FaPackage.EXCHANGE_LINK__NAMING_RULES);
		}
		return namingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeSpecification> getExchanges() {
		// TODO: implement this method to return the 'Exchanges' reference list
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
	public EList<ExchangeContainment> getExchangeContainmentLinks() {
		if (exchangeContainmentLinks == null) {
			exchangeContainmentLinks = new EObjectWithInverseResolvingEList<ExchangeContainment>(ExchangeContainment.class, this, FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS, FaPackage.EXCHANGE_CONTAINMENT__LINK);
		}
		return exchangeContainmentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExchangeContainment> getOwnedExchangeContainments() {
		if (ownedExchangeContainments == null) {
			ownedExchangeContainments = new EObjectContainmentEList<ExchangeContainment>(ExchangeContainment.class, this, FaPackage.EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS);
		}
		return ownedExchangeContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionSpecification> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<FunctionSpecification>(FunctionSpecification.class, this, FaPackage.EXCHANGE_LINK__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionSpecification> getDestinations() {
		if (destinations == null) {
			destinations = new EObjectResolvingEList<FunctionSpecification>(FunctionSpecification.class, this, FaPackage.EXCHANGE_LINK__DESTINATIONS);
		}
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExchangeContainmentLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FaPackage.EXCHANGE_LINK__NAMING_RULES:
				return ((InternalEList<?>)getNamingRules()).basicRemove(otherEnd, msgs);
			case FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS:
				return ((InternalEList<?>)getExchangeContainmentLinks()).basicRemove(otherEnd, msgs);
			case FaPackage.EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS:
				return ((InternalEList<?>)getOwnedExchangeContainments()).basicRemove(otherEnd, msgs);
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
			case FaPackage.EXCHANGE_LINK__NAME:
				return getName();
			case FaPackage.EXCHANGE_LINK__NAMING_RULES:
				return getNamingRules();
			case FaPackage.EXCHANGE_LINK__EXCHANGES:
				return getExchanges();
			case FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS:
				return getExchangeContainmentLinks();
			case FaPackage.EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS:
				return getOwnedExchangeContainments();
			case FaPackage.EXCHANGE_LINK__SOURCES:
				return getSources();
			case FaPackage.EXCHANGE_LINK__DESTINATIONS:
				return getDestinations();
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
			case FaPackage.EXCHANGE_LINK__NAME:
				setName((String)newValue);
				return;
			case FaPackage.EXCHANGE_LINK__NAMING_RULES:
				getNamingRules().clear();
				getNamingRules().addAll((Collection<? extends NamingRule>)newValue);
				return;
			case FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS:
				getExchangeContainmentLinks().clear();
				getExchangeContainmentLinks().addAll((Collection<? extends ExchangeContainment>)newValue);
				return;
			case FaPackage.EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS:
				getOwnedExchangeContainments().clear();
				getOwnedExchangeContainments().addAll((Collection<? extends ExchangeContainment>)newValue);
				return;
			case FaPackage.EXCHANGE_LINK__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends FunctionSpecification>)newValue);
				return;
			case FaPackage.EXCHANGE_LINK__DESTINATIONS:
				getDestinations().clear();
				getDestinations().addAll((Collection<? extends FunctionSpecification>)newValue);
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
			case FaPackage.EXCHANGE_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FaPackage.EXCHANGE_LINK__NAMING_RULES:
				getNamingRules().clear();
				return;
			case FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS:
				getExchangeContainmentLinks().clear();
				return;
			case FaPackage.EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS:
				getOwnedExchangeContainments().clear();
				return;
			case FaPackage.EXCHANGE_LINK__SOURCES:
				getSources().clear();
				return;
			case FaPackage.EXCHANGE_LINK__DESTINATIONS:
				getDestinations().clear();
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
			case FaPackage.EXCHANGE_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FaPackage.EXCHANGE_LINK__NAMING_RULES:
				return namingRules != null && !namingRules.isEmpty();
			case FaPackage.EXCHANGE_LINK__EXCHANGES:
				return !getExchanges().isEmpty();
			case FaPackage.EXCHANGE_LINK__EXCHANGE_CONTAINMENT_LINKS:
				return exchangeContainmentLinks != null && !exchangeContainmentLinks.isEmpty();
			case FaPackage.EXCHANGE_LINK__OWNED_EXCHANGE_CONTAINMENTS:
				return ownedExchangeContainments != null && !ownedExchangeContainments.isEmpty();
			case FaPackage.EXCHANGE_LINK__SOURCES:
				return sources != null && !sources.isEmpty();
			case FaPackage.EXCHANGE_LINK__DESTINATIONS:
				return destinations != null && !destinations.isEmpty();
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
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case FaPackage.EXCHANGE_LINK__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
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
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return FaPackage.EXCHANGE_LINK__NAME;
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ExchangeLinkImpl
