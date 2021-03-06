/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.behavior.AbstractEvent;
import org.sample.melangeproject.capellawithmass.behavior.AbstractSignal;

import org.sample.melangeproject.capellawithmass.capellacore.GeneralizableElement;

import org.sample.melangeproject.capellawithmass.cs.Interface;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractExchangeItem;
import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exchange Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getExchangeMechanism <em>Exchange Mechanism</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getOwnedElements <em>Owned Elements</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getOwnedInformationRealizations <em>Owned Information Realizations</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getOwnedExchangeItemInstances <em>Owned Exchange Item Instances</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getAllocatorInterfaces <em>Allocator Interfaces</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizedExchangeItems <em>Realized Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizingExchangeItems <em>Realizing Exchange Items</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizingOperations <em>Realizing Operations</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Defined by functional characteristics that exist at a common boundary with co-functioning items and allow systems equipment to be compatible. \r\nAn exchange item describes a required or produced data.\r\nAn exchange item has an exchange mechanism\r\n[source:ARCADIA encyclopedia v0.8.0]' usage\040guideline='an exchange item should be created whenever there is a need to group data type elements that are bound by an applicative meaning, and should be treated as a whole' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Operation' explanation='none' constraints='none'"
 * @generated
 */
public interface ExchangeItem extends AbstractExchangeItem, AbstractEvent, AbstractSignal, FinalizableElement, GeneralizableElement {
	/**
	 * Returns the value of the '<em><b>Exchange Mechanism</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.ExchangeMechanism}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Mechanism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Mechanism</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.ExchangeMechanism
	 * @see #setExchangeMechanism(ExchangeMechanism)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_ExchangeMechanism()
	 * @model required="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Communication principle associated to this exchange item\r\n[source:ARCADIA encyclopedia v0.8.0]' constraints='none' type='refer to ExchangeMechanism definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	ExchangeMechanism getExchangeMechanism();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getExchangeMechanism <em>Exchange Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Mechanism</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.ExchangeMechanism
	 * @see #getExchangeMechanism()
	 * @generated
	 */
	void setExchangeMechanism(ExchangeMechanism value);

	/**
	 * Returns the value of the '<em><b>Owned Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.ExchangeItemElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Elements</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_OwnedElements()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Set of exchange item elements that form the structure of the structured exchange item\r\n[source:Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::Operation::ownedParameter' explanation='none' constraints='uml::Operation::ownedParameter elements on which ExchangeItemElement stereotype or any stereotype that inherits from it is applied'"
	 * @generated
	 */
	EList<ExchangeItemElement> getOwnedElements();

	/**
	 * Returns the value of the '<em><b>Owned Information Realizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.InformationRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Information Realizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Information Realizations</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_OwnedInformationRealizations()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<InformationRealization> getOwnedInformationRealizations();

	/**
	 * Returns the value of the '<em><b>Owned Exchange Item Instances</b></em>' containment reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.ExchangeItemInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Exchange Item Instances</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Exchange Item Instances</em>' containment reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_OwnedExchangeItemInstances()
	 * @model containment="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<ExchangeItemInstance> getOwnedExchangeItemInstances();

	/**
	 * Returns the value of the '<em><b>Allocator Interfaces</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.Interface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Interfaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Interfaces</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_AllocatorInterfaces()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<Interface> getAllocatorInterfaces();

	/**
	 * Returns the value of the '<em><b>Realized Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.ExchangeItem}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizingExchangeItems <em>Realizing Exchange Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized Exchange Items</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_RealizedExchangeItems()
	 * @see org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizingExchangeItems
	 * @model opposite="realizingExchangeItems" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='class(es) realized by this class' constraints='none' comment/notes='none'"
	 * @generated
	 */
	EList<ExchangeItem> getRealizedExchangeItems();

	/**
	 * Returns the value of the '<em><b>Realizing Exchange Items</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.ExchangeItem}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizedExchangeItems <em>Realized Exchange Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Exchange Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Exchange Items</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_RealizingExchangeItems()
	 * @see org.sample.melangeproject.capellawithmass.information.ExchangeItem#getRealizedExchangeItems
	 * @model opposite="realizedExchangeItems" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='class(es) realizing this class' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<ExchangeItem> getRealizingExchangeItems();

	/**
	 * Returns the value of the '<em><b>Realizing Operations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.Operation}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.information.Operation#getRealizedExchangeItems <em>Realized Exchange Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizing Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizing Operations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getExchangeItem_RealizingOperations()
	 * @see org.sample.melangeproject.capellawithmass.information.Operation#getRealizedExchangeItems
	 * @model opposite="realizedExchangeItems" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='class(es) realizing this class' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<Operation> getRealizingOperations();

} // ExchangeItem
