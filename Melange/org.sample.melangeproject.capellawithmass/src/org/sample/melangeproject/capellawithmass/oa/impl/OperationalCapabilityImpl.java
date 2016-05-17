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

import org.sample.melangeproject.capellawithmass.ctx.Capability;

import org.sample.melangeproject.capellawithmass.interaction.impl.AbstractCapabilityImpl;

import org.sample.melangeproject.capellawithmass.oa.CapabilityConfiguration;
import org.sample.melangeproject.capellawithmass.oa.ConceptCompliance;
import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.EntityOperationalCapabilityInvolvement;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.OperationalCapability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityImpl#getOwnedEntityOperationalCapabilityInvolvements <em>Owned Entity Operational Capability Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityImpl#getRealizingCapabilities <em>Realizing Capabilities</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.OperationalCapabilityImpl#getInvolvedEntities <em>Involved Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalCapabilityImpl extends AbstractCapabilityImpl implements OperationalCapability {
	/**
	 * The cached value of the '{@link #getCompliances() <em>Compliances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompliances()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptCompliance> compliances;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<CapabilityConfiguration> configurations;

	/**
	 * The cached value of the '{@link #getOwnedEntityOperationalCapabilityInvolvements() <em>Owned Entity Operational Capability Involvements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntityOperationalCapabilityInvolvements()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityOperationalCapabilityInvolvement> ownedEntityOperationalCapabilityInvolvements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationalCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.OPERATIONAL_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptCompliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectResolvingEList<ConceptCompliance>(ConceptCompliance.class, this, OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CapabilityConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectResolvingEList<CapabilityConfiguration>(CapabilityConfiguration.class, this, OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityOperationalCapabilityInvolvement> getOwnedEntityOperationalCapabilityInvolvements() {
		if (ownedEntityOperationalCapabilityInvolvements == null) {
			ownedEntityOperationalCapabilityInvolvements = new EObjectContainmentEList<EntityOperationalCapabilityInvolvement>(EntityOperationalCapabilityInvolvement.class, this, OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS);
		}
		return ownedEntityOperationalCapabilityInvolvements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getRealizingCapabilities() {
		// TODO: implement this method to return the 'Realizing Capabilities' reference list
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
	public EList<Entity> getInvolvedEntities() {
		// TODO: implement this method to return the 'Involved Entities' reference list
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
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				return ((InternalEList<?>)getOwnedEntityOperationalCapabilityInvolvements()).basicRemove(otherEnd, msgs);
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				return getCompliances();
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				return getConfigurations();
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				return getOwnedEntityOperationalCapabilityInvolvements();
			case OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES:
				return getRealizingCapabilities();
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				return getInvolvedEntities();
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends ConceptCompliance>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends CapabilityConfiguration>)newValue);
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				getOwnedEntityOperationalCapabilityInvolvements().clear();
				getOwnedEntityOperationalCapabilityInvolvements().addAll((Collection<? extends EntityOperationalCapabilityInvolvement>)newValue);
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				getCompliances().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				getOwnedEntityOperationalCapabilityInvolvements().clear();
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
			case OaPackage.OPERATIONAL_CAPABILITY__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__OWNED_ENTITY_OPERATIONAL_CAPABILITY_INVOLVEMENTS:
				return ownedEntityOperationalCapabilityInvolvements != null && !ownedEntityOperationalCapabilityInvolvements.isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__REALIZING_CAPABILITIES:
				return !getRealizingCapabilities().isEmpty();
			case OaPackage.OPERATIONAL_CAPABILITY__INVOLVED_ENTITIES:
				return !getInvolvedEntities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationalCapabilityImpl
