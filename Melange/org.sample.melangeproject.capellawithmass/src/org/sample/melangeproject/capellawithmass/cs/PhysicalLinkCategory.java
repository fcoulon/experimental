/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Link Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLinkCategory#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLinkCategory()
 * @model
 * @generated
 */
public interface PhysicalLinkCategory extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getPhysicalLinkCategory_Links()
	 * @see org.sample.melangeproject.capellawithmass.cs.PhysicalLink#getCategories
	 * @model opposite="categories"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 * @generated
	 */
	EList<PhysicalLink> getLinks();

} // PhysicalLinkCategory
