/**
 */
package org.sample.melangeproject.capellawithmass.information.communication;

import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;

import org.sample.melangeproject.capellawithmass.information.ExchangeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink#getExchangeItem <em>Exchange Item</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getCommunicationLink()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='describes a link of communication using exchange items' constraints='none' comment/notes='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface CommunicationLink extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkKind
	 * @see #setKind(CommunicationLinkKind)
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getCommunicationLink_Kind()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='refer to CommunicationLinkKind description' constraints='none' type='refer to CommunicationLinkKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	CommunicationLinkKind getKind();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CommunicationLinkKind value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol
	 * @see #setProtocol(CommunicationLinkProtocol)
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getCommunicationLink_Protocol()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='refer to CommunicationLinkProtocol description' constraints='none' type='refer to CommunicationLinkProtocol definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	CommunicationLinkProtocol getProtocol();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationLinkProtocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(CommunicationLinkProtocol value);

	/**
	 * Returns the value of the '<em><b>Exchange Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Item</em>' reference.
	 * @see #setExchangeItem(ExchangeItem)
	 * @see org.sample.melangeproject.capellawithmass.information.communication.CommunicationPackage#getCommunicationLink_ExchangeItem()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='describes the exchange item related to the link' constraints='none' type='refer to CommunicationLinkProtocol definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	ExchangeItem getExchangeItem();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.communication.CommunicationLink#getExchangeItem <em>Exchange Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Item</em>' reference.
	 * @see #getExchangeItem()
	 * @generated
	 */
	void setExchangeItem(ExchangeItem value);

} // CommunicationLink
