/**
 */
package org.sample.melangeproject.capellawithmass.interaction;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.CombinedFragment#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.CombinedFragment#getReferencedOperands <em>Referenced Operands</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.CombinedFragment#getExpressionGates <em>Expression Gates</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getCombinedFragment()
 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A Combined Fragment.\r\n\r\nThe concept is closed to the UML Combined Fragment.\r\n' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 * @generated
 */
public interface CombinedFragment extends AbstractFragment {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"UNSET"</code>.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.interaction.InteractionOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionOperatorKind
	 * @see #setOperator(InteractionOperatorKind)
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getCombinedFragment_Operator()
	 * @model default="UNSET"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	InteractionOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.interaction.CombinedFragment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(InteractionOperatorKind value);

	/**
	 * Returns the value of the '<em><b>Referenced Operands</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.interaction.InteractionOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Operands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Operands</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getCombinedFragment_ReferencedOperands()
	 * @model annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	EList<InteractionOperand> getReferencedOperands();

	/**
	 * Returns the value of the '<em><b>Expression Gates</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.interaction.Gate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression Gates</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression Gates</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.interaction.InteractionPackage#getCombinedFragment_ExpressionGates()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='n/a' usage\040guideline='n/a' used\040in\040levels='operational, system, logical, physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
	 * @generated
	 */
	EList<Gate> getExpressionGates();

} // CombinedFragment
