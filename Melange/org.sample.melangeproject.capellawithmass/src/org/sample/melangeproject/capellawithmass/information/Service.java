/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.information.communication.Message;
import org.sample.melangeproject.capellawithmass.information.communication.MessageReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Service#getSynchronismKind <em>Synchronism Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Service#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Service#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Service#getMessageReferences <em>Message References</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getService()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Service'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Operation' stereotype='eng.Service'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specification of an action to be performed by a class, to fulfill a predefined need.\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='system,logical,physical,epbs' usage\040examples='../img/usage_examples/operation_parameters.png' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Operation' explanation='none' constraints='none'"
 * @generated
 */
public interface Service extends Operation {
	/**
	 * Returns the value of the '<em><b>Synchronism Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.SynchronismKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronism Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronism Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.SynchronismKind
	 * @see #setSynchronismKind(SynchronismKind)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getService_SynchronismKind()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='synchronismKind' fromStereotype='true' featureOwner='eng.Service'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the synchronicity of the service call\r\n[source: Capella study]' constraints='none' type='see SynchronismKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='_todo_ Study the link with CallOperationAction::isSynchronous or Message::messageSort' constraints='none'"
	 * @generated
	 */
	SynchronismKind getSynchronismKind();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Service#getSynchronismKind <em>Synchronism Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronism Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.SynchronismKind
	 * @see #getSynchronismKind()
	 * @generated
	 */
	void setSynchronismKind(SynchronismKind value);

	/**
	 * Returns the value of the '<em><b>Thrown Exceptions</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.communication.Exception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thrown Exceptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thrown Exceptions</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getService_ThrownExceptions()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='raisedException' featureOwner='BehavioralFeature'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='thrownExceptions'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of exceptions that can be raised by this service\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Operation::raisedException' explanation='Exception should extend uml::Type' constraints='Order must be computed'"
	 * @generated
	 */
	EList<org.sample.melangeproject.capellawithmass.information.communication.Exception> getThrownExceptions();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.communication.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getService_Messages()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='messages'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(automatically computed) the Messages involving this Service\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Message> getMessages();

	/**
	 * Returns the value of the '<em><b>Message References</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.communication.MessageReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message References</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getService_MessageReferences()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='messageReferences'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the reference objects to the Messages involving this Service\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::clientDependency' explanation='none' constraints='uml::NamedElement::clientDependency elements on which MessageReference stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<MessageReference> getMessageReferences();

} // Service
