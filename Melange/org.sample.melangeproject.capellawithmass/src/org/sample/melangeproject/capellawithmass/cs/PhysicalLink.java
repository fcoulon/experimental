/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getLinkEnds <em>Link Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getOwnedComponentExchangeFunctionalExchangeAllocations <em>Owned Component Exchange Functional Exchange Allocations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getOwnedPhysicalLinkEnds <em>Owned Physical Link Ends</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getOwnedPhysicalLinkRealizations <em>Owned Physical Link Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getSourcePhysicalPort <em>Source Physical Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getTargetPhysicalPort <em>Target Physical Port</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getRealizedPhysicalLinks <em>Realized Physical Links</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getRealizingPhysicalLinks <em>Realizing Physical Links</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the representation of the physical medium connecting two physical interfaces\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Connector' explanation='none' constraints='none'"
 * @generated
 */
public interface PhysicalLink extends AbstractPhysicalPathLink, AbstractPhysicalArtifact, AbstractPathInvolvedElement {
	/**
	 * Returns the value of the '<em><b>Link Ends</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalLinkEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Ends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Ends</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_LinkEnds()
	 * @model lower="2" upper="2"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the source(s) and destination(s) of this physical link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::specific' explanation='first need to create ConnectorEnds pointing to the Ports, and then reference them in uml::Connector::end' constraints='cardinality must be [2..2]'"
	 * @generated
	 */
	EList<AbstractPhysicalLinkEnd> getLinkEnds();

	/**
	 * Returns the value of the '<em><b>Owned Component Exchange Functional Exchange Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ComponentExchangeFunctionalExchangeAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component Exchange Functional Exchange Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component Exchange Functional Exchange Allocations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_OwnedComponentExchangeFunctionalExchangeAllocations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the allocations between component exchanges and functional exchanges, that are owned by this physical link\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='Elements are contained in the nearest possible parent container.' constraints='some elements on which ComponentFunctionalExchangeAllocation stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<ComponentExchangeFunctionalExchangeAllocation> getOwnedComponentExchangeFunctionalExchangeAllocations();

	/**
	 * Returns the value of the '<em><b>Owned Physical Link Ends</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.PhysicalLinkEnd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Link Ends</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Link Ends</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_OwnedPhysicalLinkEnds()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the physical link endpoints involved in this link\r\n\r\nA connector consists of at least two connector ends, each representing the participation of instances of the classifiers\r\ntyping the connectable elements attached to this end. The set of connector ends is ordered.\r\n[source: UML superstructure v2.2]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Connector::end' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<PhysicalLinkEnd> getOwnedPhysicalLinkEnds();

	/**
	 * Returns the value of the '<em><b>Owned Physical Link Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.PhysicalLinkRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Physical Link Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Physical Link Realizations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_OwnedPhysicalLinkRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='none' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<PhysicalLinkRealization> getOwnedPhysicalLinkRealizations();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.PhysicalLinkCategory}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLinkCategory#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_Categories()
	 * @see org.sample.melangeproject.capellawithmass.cs.PhysicalLinkCategory#getLinks
	 * @model opposite="links"
	 * @generated
	 */
	EList<PhysicalLinkCategory> getCategories();

	/**
	 * Returns the value of the '<em><b>Source Physical Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Physical Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Physical Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_SourcePhysicalPort()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	PhysicalPort getSourcePhysicalPort();

	/**
	 * Returns the value of the '<em><b>Target Physical Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Physical Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Physical Port</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_TargetPhysicalPort()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	PhysicalPort getTargetPhysicalPort();

	/**
	 * Returns the value of the '<em><b>Realized Physical Links</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Physical Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Physical Links</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_RealizedPhysicalLinks()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 * @generated
	 */
	EList<PhysicalLink> getRealizedPhysicalLinks();

	/**
	 * Returns the value of the '<em><b>Realizing Physical Links</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Physical Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Physical Links</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLink_RealizingPhysicalLinks()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<PhysicalLink> getRealizingPhysicalLinks();

} // PhysicalLink
