/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapabilityRealizationInvolvement;
import org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage;

import org.sample.melangeproject.capellawithmass.capellacore.CapellacorePackage;
import org.sample.melangeproject.capellawithmass.capellacore.InvolvedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Involvement;

import org.sample.melangeproject.capellawithmass.cs.AbstractActor;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.AbstractActorImpl#getInvolvingInvolvements <em>Involving Involvements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.AbstractActorImpl#getInvolvingCapabilityRealizationInvolvements <em>Involving Capability Realization Involvements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractActorImpl extends ComponentImpl implements AbstractActor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.ABSTRACT_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Involvement> getInvolvingInvolvements() {
		// TODO: implement this method to return the 'Involving Involvements' reference list
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
	public EList<CapabilityRealizationInvolvement> getInvolvingCapabilityRealizationInvolvements() {
		// TODO: implement this method to return the 'Involving Capability Realization Involvements' reference list
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
			case CsPackage.ABSTRACT_ACTOR__INVOLVING_INVOLVEMENTS:
				return getInvolvingInvolvements();
			case CsPackage.ABSTRACT_ACTOR__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return getInvolvingCapabilityRealizationInvolvements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsPackage.ABSTRACT_ACTOR__INVOLVING_INVOLVEMENTS:
				return !getInvolvingInvolvements().isEmpty();
			case CsPackage.ABSTRACT_ACTOR__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS:
				return !getInvolvingCapabilityRealizationInvolvements().isEmpty();
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
		if (baseClass == InvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.ABSTRACT_ACTOR__INVOLVING_INVOLVEMENTS: return CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (derivedFeatureID) {
				case CsPackage.ABSTRACT_ACTOR__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS: return CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS;
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
		if (baseClass == InvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacorePackage.INVOLVED_ELEMENT__INVOLVING_INVOLVEMENTS: return CsPackage.ABSTRACT_ACTOR__INVOLVING_INVOLVEMENTS;
				default: return -1;
			}
		}
		if (baseClass == CapabilityRealizationInvolvedElement.class) {
			switch (baseFeatureID) {
				case CapellacommonPackage.CAPABILITY_REALIZATION_INVOLVED_ELEMENT__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS: return CsPackage.ABSTRACT_ACTOR__INVOLVING_CAPABILITY_REALIZATION_INVOLVEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AbstractActorImpl
