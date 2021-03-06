/**
 */
package org.sample.melangeproject.capellawithmass.modellingcore;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.emde.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement#getId <em>Id</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement#getSid <em>Sid</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement#getOwnedConstraints <em>Owned Constraints</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getModelElement()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='ModelElement'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Element'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='common base for all Capella elements\r\n[source: Capella study]' usage\040guideline='n/a (Abstract)' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Element' constraints=''"
 * @generated
 */
public interface ModelElement extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getModelElement_Id()
	 * @model id="true" required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the unique identifier for this element\r\n[source: Capella study]' constraints='none' type='n/a' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='' constraints=''"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setSid(String)
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getModelElement_Sid()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the unique system identifier for this element' constraints='none' type='n/a' comment/notes='none'"
	 * @generated
	 */
	String getSid();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement#getSid <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getSid()
	 * @generated
	 */
	void setSid(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getModelElement_Constraints()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of constraints applying to this element of the model\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Opposite reference of uml::Constraint::constrainedElement' constraints='Order must be computed'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<AbstractConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Constraints</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage#getModelElement_OwnedConstraints()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the constraints that are stored/owned by this element\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::nearestpackage' explanation='none' constraints='Some packaged elements of uml::Element::nearestPackage on which AbstractConstraint stereotype or any stereotype that inherits from it is applied\r\nOrder must be computed'"
	 * @generated
	 */
	EList<AbstractConstraint> getOwnedConstraints();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void destroy();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getFullLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getLabel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasUnnamedLabel();

} // ModelElement
