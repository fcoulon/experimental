/**
 */
package org.sample.melangeproject.capellawithmass.cs;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;

import org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Physical Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.cs.AbstractPhysicalArtifact#getAllocatorConfigurationItems <em>Allocator Configuration Items</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getAbstractPhysicalArtifact()
 * @model abstract="true"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A physical artifact is any physical element in the physical architecture (component, port, link,...).\r\nThese artifacts will be part allocated to configuration items in the EPBS.' usage\040guideline='n/a' used\040in\040levels='physical' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='' explanation='none' constraints='none'"
 * @generated
 */
public interface AbstractPhysicalArtifact extends CapellaElement {
	/**
	 * Returns the value of the '<em><b>Allocator Configuration Items</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem}.
	 * It is bidirectional and its opposite is '{@link org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem#getAllocatedPhysicalArtifacts <em>Allocated Physical Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocator Configuration Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocator Configuration Items</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.cs.CsPackage#getAbstractPhysicalArtifact_AllocatorConfigurationItems()
	 * @see org.sample.melangeproject.capellawithmass.epbs.ConfigurationItem#getAllocatedPhysicalArtifacts
	 * @model opposite="allocatedPhysicalArtifacts" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.polarsys.org/capella/semantic excludefrom='xmlpivot'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='keyword::none' explanation='Derived and transient' constraints='none'"
	 * @generated
	 */
	EList<ConfigurationItem> getAllocatorConfigurationItems();

} // AbstractPhysicalArtifact
