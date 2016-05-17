/**
 */
package org.sample.melangeproject.capellawithmass.interaction;

import org.sample.melangeproject.capellawithmass.capellacommon.AbstractState;

import org.sample.melangeproject.capellawithmass.fa.AbstractFunction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.StateFragment#getRelatedAbstractState <em>Related Abstract State</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.StateFragment#getRelatedAbstractFunction <em>Related Abstract Function</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getStateFragment()
 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='none' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 * @generated
 */
public interface StateFragment extends TimeLapse {
	/**
	 * Returns the value of the '<em><b>Related Abstract State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Abstract State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Abstract State</em>' reference.
	 * @see #setRelatedAbstractState(AbstractState)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getStateFragment_RelatedAbstractState()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	AbstractState getRelatedAbstractState();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.StateFragment#getRelatedAbstractState <em>Related Abstract State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Abstract State</em>' reference.
	 * @see #getRelatedAbstractState()
	 * @generated
	 */
	void setRelatedAbstractState(AbstractState value);

	/**
	 * Returns the value of the '<em><b>Related Abstract Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Abstract Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Abstract Function</em>' reference.
	 * @see #setRelatedAbstractFunction(AbstractFunction)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getStateFragment_RelatedAbstractFunction()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	AbstractFunction getRelatedAbstractFunction();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.StateFragment#getRelatedAbstractFunction <em>Related Abstract Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Abstract Function</em>' reference.
	 * @see #getRelatedAbstractFunction()
	 * @generated
	 */
	void setRelatedAbstractFunction(AbstractFunction value);

} // StateFragment
