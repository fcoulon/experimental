/**
 */
package org.sample.melangeproject.capellawithmass.fa;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Exchange Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchangeCategory#getExchanges <em>Exchanges</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentExchangeCategory()
 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='defines a family of exchanges, all associated to a common applicative criteria\r\n[source: Capella study]' usage\040guideline='could for example be used to declare a grouping of all physical exchanges sharing the same communication medium\r\n[source: Capella study]' used\040in\040levels='operational,system,logical,physical,epbs' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::Package' explanation='none' constraints='none'"
 * @generated
 */
public interface ComponentExchangeCategory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Exchanges</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.fa.ComponentExchange}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchanges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchanges</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.fa.FaPackage#getComponentExchangeCategory_Exchanges()
	 * @see org.sample.melangeproject.capellawithmass.fa.ComponentExchange#getCategories
	 * @model opposite="categories"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the list of functional exchanges that are part of this exchange category\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints=''"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<ComponentExchange> getExchanges();

} // ComponentExchangeCategory
