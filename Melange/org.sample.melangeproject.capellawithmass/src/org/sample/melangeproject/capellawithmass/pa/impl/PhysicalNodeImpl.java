/**
 */
package org.sample.melangeproject.capellawithmass.pa.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.pa.PaPackage;
import org.sample.melangeproject.capellawithmass.pa.PhysicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.impl.PhysicalNodeImpl#getSubPhysicalNodes <em>Sub Physical Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalNodeImpl extends PhysicalComponentImpl implements PhysicalNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaPackage.Literals.PHYSICAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalNode> getSubPhysicalNodes() {
		// TODO: implement this method to return the 'Sub Physical Nodes' reference list
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
			case PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES:
				return getSubPhysicalNodes();
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
			case PaPackage.PHYSICAL_NODE__SUB_PHYSICAL_NODES:
				return !getSubPhysicalNodes().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PhysicalNodeImpl
