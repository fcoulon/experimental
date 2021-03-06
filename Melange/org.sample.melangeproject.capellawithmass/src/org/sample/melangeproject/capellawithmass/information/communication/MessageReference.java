/**
 */
package org.sample.melangeproject.capellawithmass.information.communication;

import org.sample.melangeproject.capellawithmass.capellacore.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.MessageReference#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getMessageReference()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='MessageReference'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Dependency' stereotype='eng.MessageReference'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Implementation class supporting the referencing of a Message element\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Dependency' explanation='none' constraints='none'"
 * @generated
 */
public interface MessageReference extends Relationship {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getMessageReference_Message()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='supplier' featureOwner='Dependency'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='message'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The message being referenced\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Dependency::supplier' explanation='none' constraints='Multiplicity must be [1..1]'"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.communication.MessageReference#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // MessageReference
