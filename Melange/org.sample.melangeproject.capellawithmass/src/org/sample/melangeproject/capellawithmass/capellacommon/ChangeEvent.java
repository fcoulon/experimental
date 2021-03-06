/**
 */
package org.sample.melangeproject.capellawithmass.capellacommon;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.capellacommon.ChangeEvent#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getChangeEvent()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A change event occurs when a Boolean-valued expression becomes true. For example, as a result of a change in the value\r\nheld in a slot corresponding to an attribute, or a change in the value referenced by a link corresponding to an association.\r\nA change event is raised implicitly and is not the result of an explicit action\r\n[source: UML superstructure v2.4]' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::ChangeEvent' explanation='none' constraints='none'"
 * @generated
 */
public interface ChangeEvent extends StateEvent {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.capellacommon.ChangeEventKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.ChangeEventKind
	 * @see #setKind(ChangeEventKind)
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.CapellacommonPackage#getChangeEvent_Kind()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the type of the state ChangeEvent (see ChangeEventKind)\r\n[source: Capella study]' constraints='none' type='refer to ChangeEventKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	ChangeEventKind getKind();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.capellacommon.ChangeEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.capellacommon.ChangeEventKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ChangeEventKind value);

} // ChangeEvent
