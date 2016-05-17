/**
 */
package org.sample.melangeproject.capellawithmass.activity;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractInformationFlow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.ActivityExchange#getRealizingActivityFlows <em>Realizing Activity Flows</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getActivityExchange()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Interactions between Ports to support Functions, (e.g. Exchanges can be composed of system data, events, analogic signals...).\r\nExchanges are a refinement of the interfaces requirements identified through behavioral modeling, and expressed through Functions.\r\nHence any Function may identify a series of  Exchanges to fully transfer the required element ' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface ActivityExchange extends AbstractInformationFlow {
	/**
	 * Returns the value of the '<em><b>Realizing Activity Flows</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.activity.ActivityEdge}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Activity Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Activity Flows</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.activity.ActivityPackage#getActivityExchange_RealizingActivityFlows()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Determines which ActivityEdges will realize the specified flow.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ActivityEdge> getRealizingActivityFlows();

} // ActivityExchange
