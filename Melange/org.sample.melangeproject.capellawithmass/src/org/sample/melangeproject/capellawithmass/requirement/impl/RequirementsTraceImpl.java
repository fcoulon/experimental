/**
 */
package org.sample.melangeproject.capellawithmass.requirement.impl;

import org.eclipse.emf.ecore.EClass;

import org.sample.melangeproject.capellawithmass.capellacore.impl.TraceImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;

import org.sample.melangeproject.capellawithmass.requirement.RequirementPackage;
import org.sample.melangeproject.capellawithmass.requirement.RequirementsTrace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.requirement.impl.RequirementsTraceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.requirement.impl.RequirementsTraceImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsTraceImpl extends TraceImpl implements RequirementsTrace {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected TraceableElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TraceableElement target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequirementPackage.Literals.REQUIREMENTS_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceableElement getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequirementPackage.REQUIREMENTS_TRACE__SOURCE:
				return getSource();
			case RequirementPackage.REQUIREMENTS_TRACE__TARGET:
				return getTarget();
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
			case RequirementPackage.REQUIREMENTS_TRACE__SOURCE:
				return source != null;
			case RequirementPackage.REQUIREMENTS_TRACE__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementsTraceImpl
