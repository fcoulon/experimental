/**
 */
package org.sample.melangeproject.capellawithmass.information;

import org.eclipse.emf.common.util.EList;

import org.sample.melangeproject.capellawithmass.capellacore.Classifier;
import org.sample.melangeproject.capellawithmass.capellacore.Type;
import org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind;

import org.sample.melangeproject.capellawithmass.information.datatype.DataType;

import org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer;

import org.sample.melangeproject.capellawithmass.modellingcore.FinalizableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#isIsPrimitive <em>Is Primitive</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#getKind <em>Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#getAggregationKind <em>Aggregation Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#getType <em>Type</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#getIndex <em>Index</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.Collection#getContainedOperations <em>Contained Operations</em>}</li>
 * </ul>
 *
 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection()
 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='Collection'"
 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping metaclass='Component' stereotype='eng.Collection'"
 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='A set of items of a given type.\r\n[source: Capella study]' usage\040guideline='n/a' used\040in\040levels='n/a' usage\040examples='n/a' constraints='none' comment/notes='none' reference\040documentation='none'"
 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' base\040metaclass\040in\040UML/SysML\040profile\040='uml::DataType' explanation='DataType chosen because it has a containment reference to Operations, which is required to simplify the transformation of Collection::operations derived reference' constraints='none'"
 * @generated
 */
public interface Collection extends Classifier, MultiplicityElement, DataValueContainer, FinalizableElement {
	/**
	 * Returns the value of the '<em><b>Is Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Primitive</em>' attribute.
	 * @see #setIsPrimitive(boolean)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_IsPrimitive()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='indicates whether this collection is a first level assembly using native types, or if it is using previously defined Collections \r\n[source: Capella study]' constraints='none' type='true if the Collection is not assembling other Collections' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	boolean isIsPrimitive();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Collection#isIsPrimitive <em>Is Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primitive</em>' attribute.
	 * @see #isIsPrimitive()
	 * @generated
	 */
	void setIsPrimitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_Visibility()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the visibility status for this collection\r\n[source: Capella study]' constraints='none' type='Refer to VisibilityKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::NamedElement::visibility' explanation='none' constraints='none'"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Collection#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.CollectionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.CollectionKind
	 * @see #setKind(CollectionKind)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_Kind()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='specifies the kind status for this collection' constraints='none' type='Refer to CollectionKind definition' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	CollectionKind getKind();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Collection#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.CollectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CollectionKind value);

	/**
	 * Returns the value of the '<em><b>Aggregation Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sample.melangeproject.capellawithmass.information.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.AggregationKind
	 * @see #setAggregationKind(AggregationKind)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_AggregationKind()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='Specifies the kind of aggregation that applies to the Collection' constraints='none' type='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	AggregationKind getAggregationKind();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Collection#getAggregationKind <em>Aggregation Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Kind</em>' attribute.
	 * @see org.sample.melangeproject.capellawithmass.information.AggregationKind
	 * @see #getAggregationKind()
	 * @generated
	 */
	void setAggregationKind(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_Type()
	 * @model annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='type'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='the type of the elements being collected\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.sample.melangeproject.capellawithmass.information.Collection#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.datatype.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_Index()
	 * @model annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='index pointing to a specific part of this collection \r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='' explanation='none' constraints='none'"
	 * @generated
	 */
	EList<DataType> getIndex();

	/**
	 * Returns the value of the '<em><b>Contained Operations</b></em>' reference list.
	 * The list contents are of type {@link org.sample.melangeproject.capellawithmass.information.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Operations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Operations</em>' reference list.
	 * @see org.sample.melangeproject.capellawithmass.information.InformationPackage#getCollection_ContainedOperations()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.polarsys.org/capella/2007/UML2Mapping featureName='ownedOperation' featureOwner='Class'"
	 *        annotation="http://www.polarsys.org/capella/2007/BusinessInformation Label='operations'"
	 *        annotation="http://www.polarsys.org/kitalpha/ecore/documentation description='The operations associated to this collection\r\n[source: Capella study]' constraints='none' comment/notes='none'"
	 *        annotation="http://www.polarsys.org/capella/MNoE/CapellaLike/Mapping UML/SysML\040semantic\040equivalences='uml::DataType::ownedOperation' explanation='none' constraints='none'"
	 *        annotation="http://www.polarsys.org/capella/semantic feature='ownedFeatures'"
	 * @generated
	 */
	EList<Operation> getContainedOperations();

} // Collection
