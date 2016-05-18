/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.cs.AbstractDeploymentLink;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.DeploymentTarget;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.DeploymentTargetImpl#getDeploymentLinks <em>Deployment Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeploymentTargetImpl extends NamedElementImpl implements DeploymentTarget {
	/**
	 * The cached value of the '{@link #getDeploymentLinks() <em>Deployment Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deploymentLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.DEPLOYMENT_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getDeploymentLinks() {
		if (deploymentLinks == null) {
			deploymentLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS);
		}
		return deploymentLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS:
				return getDeploymentLinks();
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
			case CsPackage.DEPLOYMENT_TARGET__DEPLOYMENT_LINKS:
				return deploymentLinks != null && !deploymentLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentTargetImpl
