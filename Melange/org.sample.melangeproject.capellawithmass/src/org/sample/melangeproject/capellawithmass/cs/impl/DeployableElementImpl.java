/**
 */
package org.sample.melangeproject.capellawithmass.cs.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.cs.AbstractDeploymentLink;
import org.sample.melangeproject.capellawithmass.cs.CsPackage;
import org.sample.melangeproject.capellawithmass.cs.DeployableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.impl.DeployableElementImpl#getDeployingLinks <em>Deploying Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DeployableElementImpl extends NamedElementImpl implements DeployableElement {
	/**
	 * The cached value of the '{@link #getDeployingLinks() <em>Deploying Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractDeploymentLink> deployingLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeployableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsPackage.Literals.DEPLOYABLE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractDeploymentLink> getDeployingLinks() {
		if (deployingLinks == null) {
			deployingLinks = new EObjectResolvingEList<AbstractDeploymentLink>(AbstractDeploymentLink.class, this, CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS);
		}
		return deployingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS:
				return getDeployingLinks();
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
			case CsPackage.DEPLOYABLE_ELEMENT__DEPLOYING_LINKS:
				return deployingLinks != null && !deployingLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeployableElementImpl
