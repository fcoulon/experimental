/**
 */
package org.sample.melangeproject.capellawithmass.interaction;

import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;

import org.sample.melangeproject.capellawithmass.information.ExchangeItemElement;

import org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Message Valuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessageValuation#getExchangeItemElement <em>Exchange Item Element</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessageValuation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessageValuation()
 * @model
 * @generated
 */
public interface SequenceMessageValuation extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Exchange Item Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Item Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Item Element</em>' reference.
	 * @see #setExchangeItemElement(ExchangeItemElement)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessageValuation_ExchangeItemElement()
	 * @model
	 * @generated
	 */
	ExchangeItemElement getExchangeItemElement();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessageValuation#getExchangeItemElement <em>Exchange Item Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Item Element</em>' reference.
	 * @see #getExchangeItemElement()
	 * @generated
	 */
	void setExchangeItemElement(ExchangeItemElement value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ValueSpecification)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getSequenceMessageValuation_Value()
	 * @model
	 * @generated
	 */
	ValueSpecification getValue();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.SequenceMessageValuation#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueSpecification value);

} // SequenceMessageValuation
