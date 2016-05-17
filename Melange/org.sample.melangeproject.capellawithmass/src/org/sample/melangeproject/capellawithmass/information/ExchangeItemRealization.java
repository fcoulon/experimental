/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.sample.melangeproject.capellawithmass.capellacore.Allocation;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Item Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItemRealization#getRealizedItem <em>Realized Item</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItemRealization#getRealizingOperation <em>Realizing Operation</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItemRealization()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Allocation link between exchange items and operation(s) of an interface that support them\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='operational,system,logical,physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Realization' explanation='none' constraints='none'"
 * @generated
 */
public interface ExchangeItemRealization extends Allocation {
	/**
	 * Returns the value of the '<em><b>Realized Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Item</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItemRealization_RealizedItem()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the exchange item that is being realized by the operation\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	AbstractExchangeItem getRealizedItem();

	/**
	 * Returns the value of the '<em><b>Realizing Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Operation</em>' reference.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItemRealization_RealizingOperation()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the interface\'s operation that realizes the given exchange item\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	Operation getRealizingOperation();

} // ExchangeItemRealization
