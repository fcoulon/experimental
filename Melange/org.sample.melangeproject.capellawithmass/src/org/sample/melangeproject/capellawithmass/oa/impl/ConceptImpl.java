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

import org.sample.melangeproject.capellawithmass.oa.Concept;
import org.sample.melangeproject.capellawithmass.oa.ConceptCompliance;
import org.sample.melangeproject.capellawithmass.oa.ItemInConcept;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptImpl#getCompliances <em>Compliances</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.ConceptImpl#getCompositeLinks <em>Composite Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptImpl extends NamedElementImpl implements Concept {
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
	 * The cached value of the '{@link #getCompositeLinks() <em>Composite Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemInConcept> compositeLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptCompliance> getCompliances() {
		if (compliances == null) {
			compliances = new EObjectResolvingEList<ConceptCompliance>(ConceptCompliance.class, this, OaPackage.CONCEPT__COMPLIANCES);
		}
		return compliances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemInConcept> getCompositeLinks() {
		if (compositeLinks == null) {
			compositeLinks = new EObjectContainmentEList<ItemInConcept>(ItemInConcept.class, this, OaPackage.CONCEPT__COMPOSITE_LINKS);
		}
		return compositeLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.CONCEPT__COMPOSITE_LINKS:
				return ((InternalEList<?>)getCompositeLinks()).basicRemove(otherEnd, msgs);
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
			case OaPackage.CONCEPT__COMPLIANCES:
				return getCompliances();
			case OaPackage.CONCEPT__COMPOSITE_LINKS:
				return getCompositeLinks();
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
			case OaPackage.CONCEPT__COMPLIANCES:
				getCompliances().clear();
				getCompliances().addAll((Collection<? extends ConceptCompliance>)newValue);
				return;
			case OaPackage.CONCEPT__COMPOSITE_LINKS:
				getCompositeLinks().clear();
				getCompositeLinks().addAll((Collection<? extends ItemInConcept>)newValue);
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
			case OaPackage.CONCEPT__COMPLIANCES:
				getCompliances().clear();
				return;
			case OaPackage.CONCEPT__COMPOSITE_LINKS:
				getCompositeLinks().clear();
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
			case OaPackage.CONCEPT__COMPLIANCES:
				return compliances != null && !compliances.isEmpty();
			case OaPackage.CONCEPT__COMPOSITE_LINKS:
				return compositeLinks != null && !compositeLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptImpl
