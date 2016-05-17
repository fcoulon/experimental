/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.capellacore.impl.ClassifierImpl;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Partition;
import org.sample.melangeproject.capellawithmass.information.PartitionableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partitionable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.PartitionableElementImpl#getOwnedPartitions <em>Owned Partitions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.PartitionableElementImpl#getRepresentingPartitions <em>Representing Partitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PartitionableElementImpl extends ClassifierImpl implements PartitionableElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.PARTITIONABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partition> getOwnedPartitions() {
		// TODO: implement this method to return the 'Owned Partitions' reference list
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
	public EList<Partition> getRepresentingPartitions() {
		// TODO: implement this method to return the 'Representing Partitions' reference list
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
	public boolean isDecomposed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
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
			case InformationPackage.PARTITIONABLE_ELEMENT__OWNED_PARTITIONS:
				return getOwnedPartitions();
			case InformationPackage.PARTITIONABLE_ELEMENT__REPRESENTING_PARTITIONS:
				return getRepresentingPartitions();
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
			case InformationPackage.PARTITIONABLE_ELEMENT__OWNED_PARTITIONS:
				return !getOwnedPartitions().isEmpty();
			case InformationPackage.PARTITIONABLE_ELEMENT__REPRESENTING_PARTITIONS:
				return !getRepresentingPartitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PartitionableElementImpl
