/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.UnionProperty#getQualifier <em>Qualifier</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getUnionProperty()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='UnionProperty'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Property' stereotype='eng.UnionProperty'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(not used)' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='n/a' comment/notes='not used/implemented as of Capella' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='uml::Property' constraints='none'"
 * @generated
 */
public interface UnionProperty extends Property {
	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.datavalue.DataValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualifier</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getUnionProperty_Qualifier()
	 * @model annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='clientDependency' featureOwner='NamedElement'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='qualifier'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='(not used)' constraints='n/a' comment/notes='n/a'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='Order must be computed'"
	 * @generated
	 */
	EList<DataValue> getQualifier();

} // UnionProperty
