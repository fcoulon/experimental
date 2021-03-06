/**
 */
package org.sample.melangeproject.capellawithmass.information.communication;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractSignal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.Signal#getSignalInstances <em>Signal Instances</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getSignal()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Signal'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Signal' stereotype='eng.Signal'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A signal is a specification of send request instances communicated between objects. The receiving object handles the\r\nreceived request instances as specified by its receptions. The data carried by a send request (which was passed to it by the\r\nsend invocation occurrence that caused that request) are represented as attributes of the signal. A signal is defined\r\nindependently of the classifiers handling the signal occurrence\r\n[source: UML superstructure v2.2]' usage\040guideline='n/a' used\040in\040levels='system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Signal' explanation='none' constraints='none'"
 * @generated
 */
public interface Signal extends CommunicationItem, AbstractSignal {
	/**
	 * Returns the value of the '<em><b>Signal Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.communication.SignalInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Instances</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getSignal_SignalInstances()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedAttribute' featureOwner='Signal'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='signalInstances'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='list of signal instances associated with this Signal\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Signal::ownedAttribute' explanation='none' constraints='uml::Signal::ownedAttribute elements on which SignalInstance stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<SignalInstance> getSignalInstances();

} // Signal
