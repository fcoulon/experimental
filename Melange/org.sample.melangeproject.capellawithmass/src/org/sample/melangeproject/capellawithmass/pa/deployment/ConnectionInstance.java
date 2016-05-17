/**
 */
package org.sample.melangeproject.capellawithmass.pa.deployment;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.ConnectionInstance#getConnectionEnds <em>Connection Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.pa.deployment.ConnectionInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage#getConnectionInstance()
 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface ConnectionInstance extends AbstractPhysicalInstance {
	/**
	 * Returns the value of the '<em><b>Connection Ends</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.pa.deployment.PortInstance}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.pa.deployment.PortInstance#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Ends</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage#getConnectionInstance_ConnectionEnds()
	 * @see org.sample.melangeproject.capellawithmass.pa.deployment.PortInstance#getConnections
	 * @model opposite="connections"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<PortInstance> getConnectionEnds();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(ComponentExchange)
	 * @see org.sample.melangeproject.capellawithmass.pa.deployment.DeploymentPackage#getConnectionInstance_Type()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	ComponentExchange getType();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.pa.deployment.ConnectionInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentExchange value);

} // ConnectionInstance
