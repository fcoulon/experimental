/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.oa.CommunityOfInterestComposition;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OrganisationalUnit;
import org.sample.melangeproject.capellawithmass.oa.OrganisationalUnitComposition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organisational Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OrganisationalUnitImpl#getOrganisationalUnitCompositions <em>Organisational Unit Compositions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OrganisationalUnitImpl#getCommunityOfInterestMemberships <em>Community Of Interest Memberships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganisationalUnitImpl extends NamedElementImpl implements OrganisationalUnit {
	/**
	 * The cached value of the '{@link #getOrganisationalUnitCompositions() <em>Organisational Unit Compositions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationalUnitCompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<OrganisationalUnitComposition> organisationalUnitCompositions;

	/**
	 * The cached value of the '{@link #getCommunityOfInterestMemberships() <em>Community Of Interest Memberships</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunityOfInterestMemberships()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunityOfInterestComposition> communityOfInterestMemberships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganisationalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.ORGANISATIONAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrganisationalUnitComposition> getOrganisationalUnitCompositions() {
		if (organisationalUnitCompositions == null) {
			organisationalUnitCompositions = new EObjectContainmentEList<OrganisationalUnitComposition>(OrganisationalUnitComposition.class, this, OaPackage.ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS);
		}
		return organisationalUnitCompositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunityOfInterestComposition> getCommunityOfInterestMemberships() {
		if (communityOfInterestMemberships == null) {
			communityOfInterestMemberships = new EObjectResolvingEList<CommunityOfInterestComposition>(CommunityOfInterestComposition.class, this, OaPackage.ORGANISATIONAL_UNIT__COMMUNITY_OF_INTEREST_MEMBERSHIPS);
		}
		return communityOfInterestMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS:
				return ((InternalEList<?>)getOrganisationalUnitCompositions()).basicRemove(otherEnd, msgs);
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
			case OaPackage.ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS:
				return getOrganisationalUnitCompositions();
			case OaPackage.ORGANISATIONAL_UNIT__COMMUNITY_OF_INTEREST_MEMBERSHIPS:
				return getCommunityOfInterestMemberships();
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
			case OaPackage.ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS:
				getOrganisationalUnitCompositions().clear();
				getOrganisationalUnitCompositions().addAll((Collection<? extends OrganisationalUnitComposition>)newValue);
				return;
			case OaPackage.ORGANISATIONAL_UNIT__COMMUNITY_OF_INTEREST_MEMBERSHIPS:
				getCommunityOfInterestMemberships().clear();
				getCommunityOfInterestMemberships().addAll((Collection<? extends CommunityOfInterestComposition>)newValue);
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
			case OaPackage.ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS:
				getOrganisationalUnitCompositions().clear();
				return;
			case OaPackage.ORGANISATIONAL_UNIT__COMMUNITY_OF_INTEREST_MEMBERSHIPS:
				getCommunityOfInterestMemberships().clear();
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
			case OaPackage.ORGANISATIONAL_UNIT__ORGANISATIONAL_UNIT_COMPOSITIONS:
				return organisationalUnitCompositions != null && !organisationalUnitCompositions.isEmpty();
			case OaPackage.ORGANISATIONAL_UNIT__COMMUNITY_OF_INTEREST_MEMBERSHIPS:
				return communityOfInterestMemberships != null && !communityOfInterestMemberships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganisationalUnitImpl
