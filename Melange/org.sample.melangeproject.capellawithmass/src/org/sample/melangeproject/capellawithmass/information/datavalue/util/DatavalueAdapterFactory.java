/**
 */
package org.sample.melangeproject.capellawithmass.information.datavalue.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sample.melangeproject.capellawithmass.capellacore.CapellaElement;
import org.sample.melangeproject.capellawithmass.capellacore.NamedElement;
import org.sample.melangeproject.capellawithmass.capellacore.Namespace;
import org.sample.melangeproject.capellawithmass.capellacore.Structure;

import org.sample.melangeproject.capellawithmass.emde.Element;
import org.sample.melangeproject.capellawithmass.emde.ExtensibleElement;

import org.sample.melangeproject.capellawithmass.information.datavalue.*;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ModelElement;
import org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement;
import org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DatavaluePackage
 * @generated
 */
public class DatavalueAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DatavaluePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatavalueAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DatavaluePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatavalueSwitch<Adapter> modelSwitch =
		new DatavalueSwitch<Adapter>() {
			@Override
			public Adapter caseDataValue(DataValue object) {
				return createDataValueAdapter();
			}
			@Override
			public Adapter caseDataValueContainer(DataValueContainer object) {
				return createDataValueContainerAdapter();
			}
			@Override
			public Adapter caseAbstractBooleanValue(AbstractBooleanValue object) {
				return createAbstractBooleanValueAdapter();
			}
			@Override
			public Adapter caseLiteralBooleanValue(LiteralBooleanValue object) {
				return createLiteralBooleanValueAdapter();
			}
			@Override
			public Adapter caseBooleanReference(BooleanReference object) {
				return createBooleanReferenceAdapter();
			}
			@Override
			public Adapter caseAbstractEnumerationValue(AbstractEnumerationValue object) {
				return createAbstractEnumerationValueAdapter();
			}
			@Override
			public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
				return createEnumerationLiteralAdapter();
			}
			@Override
			public Adapter caseEnumerationReference(EnumerationReference object) {
				return createEnumerationReferenceAdapter();
			}
			@Override
			public Adapter caseAbstractStringValue(AbstractStringValue object) {
				return createAbstractStringValueAdapter();
			}
			@Override
			public Adapter caseLiteralStringValue(LiteralStringValue object) {
				return createLiteralStringValueAdapter();
			}
			@Override
			public Adapter caseStringReference(StringReference object) {
				return createStringReferenceAdapter();
			}
			@Override
			public Adapter caseNumericValue(NumericValue object) {
				return createNumericValueAdapter();
			}
			@Override
			public Adapter caseLiteralNumericValue(LiteralNumericValue object) {
				return createLiteralNumericValueAdapter();
			}
			@Override
			public Adapter caseNumericReference(NumericReference object) {
				return createNumericReferenceAdapter();
			}
			@Override
			public Adapter caseAbstractComplexValue(AbstractComplexValue object) {
				return createAbstractComplexValueAdapter();
			}
			@Override
			public Adapter caseComplexValue(ComplexValue object) {
				return createComplexValueAdapter();
			}
			@Override
			public Adapter caseComplexValueReference(ComplexValueReference object) {
				return createComplexValueReferenceAdapter();
			}
			@Override
			public Adapter caseValuePart(ValuePart object) {
				return createValuePartAdapter();
			}
			@Override
			public Adapter caseAbstractExpressionValue(AbstractExpressionValue object) {
				return createAbstractExpressionValueAdapter();
			}
			@Override
			public Adapter caseBinaryExpression(BinaryExpression object) {
				return createBinaryExpressionAdapter();
			}
			@Override
			public Adapter caseUnaryExpression(UnaryExpression object) {
				return createUnaryExpressionAdapter();
			}
			@Override
			public Adapter caseOpaqueExpression(OpaqueExpression object) {
				return createOpaqueExpressionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseExtensibleElement(ExtensibleElement object) {
				return createExtensibleElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseAbstractNamedElement(AbstractNamedElement object) {
				return createAbstractNamedElementAdapter();
			}
			@Override
			public Adapter caseTraceableElement(TraceableElement object) {
				return createTraceableElementAdapter();
			}
			@Override
			public Adapter casePublishableElement(PublishableElement object) {
				return createPublishableElementAdapter();
			}
			@Override
			public Adapter caseCapellaElement(CapellaElement object) {
				return createCapellaElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAbstractTypedElement(AbstractTypedElement object) {
				return createAbstractTypedElementAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.DataValue <em>Data Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DataValue
	 * @generated
	 */
	public Adapter createDataValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer <em>Data Value Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.DataValueContainer
	 * @generated
	 */
	public Adapter createDataValueContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.AbstractBooleanValue <em>Abstract Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.AbstractBooleanValue
	 * @generated
	 */
	public Adapter createAbstractBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.LiteralBooleanValue <em>Literal Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.LiteralBooleanValue
	 * @generated
	 */
	public Adapter createLiteralBooleanValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.BooleanReference <em>Boolean Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.BooleanReference
	 * @generated
	 */
	public Adapter createBooleanReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.AbstractEnumerationValue <em>Abstract Enumeration Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.AbstractEnumerationValue
	 * @generated
	 */
	public Adapter createAbstractEnumerationValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationLiteral
	 * @generated
	 */
	public Adapter createEnumerationLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationReference <em>Enumeration Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.EnumerationReference
	 * @generated
	 */
	public Adapter createEnumerationReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.AbstractStringValue <em>Abstract String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.AbstractStringValue
	 * @generated
	 */
	public Adapter createAbstractStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.LiteralStringValue <em>Literal String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.LiteralStringValue
	 * @generated
	 */
	public Adapter createLiteralStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.StringReference <em>String Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.StringReference
	 * @generated
	 */
	public Adapter createStringReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.NumericValue
	 * @generated
	 */
	public Adapter createNumericValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.LiteralNumericValue <em>Literal Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.LiteralNumericValue
	 * @generated
	 */
	public Adapter createLiteralNumericValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.NumericReference <em>Numeric Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.NumericReference
	 * @generated
	 */
	public Adapter createNumericReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.AbstractComplexValue <em>Abstract Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.AbstractComplexValue
	 * @generated
	 */
	public Adapter createAbstractComplexValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValue
	 * @generated
	 */
	public Adapter createComplexValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValueReference <em>Complex Value Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.ComplexValueReference
	 * @generated
	 */
	public Adapter createComplexValueReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.ValuePart <em>Value Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.ValuePart
	 * @generated
	 */
	public Adapter createValuePartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.AbstractExpressionValue <em>Abstract Expression Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.AbstractExpressionValue
	 * @generated
	 */
	public Adapter createAbstractExpressionValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.BinaryExpression
	 * @generated
	 */
	public Adapter createBinaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.UnaryExpression
	 * @generated
	 */
	public Adapter createUnaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.information.datavalue.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.information.datavalue.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.emde.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.emde.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.emde.ExtensibleElement <em>Extensible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.emde.ExtensibleElement
	 * @generated
	 */
	public Adapter createExtensibleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement <em>Abstract Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement
	 * @generated
	 */
	public Adapter createAbstractNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement <em>Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.TraceableElement
	 * @generated
	 */
	public Adapter createTraceableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement <em>Publishable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.PublishableElement
	 * @generated
	 */
	public Adapter createPublishableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.CapellaElement <em>Capella Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.CapellaElement
	 * @generated
	 */
	public Adapter createCapellaElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement <em>Abstract Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.AbstractTypedElement
	 * @generated
	 */
	public Adapter createAbstractTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.modellingcore.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sample.melangeproject.capellawithmass.capellacore.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sample.melangeproject.capellawithmass.capellacore.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DatavalueAdapterFactory
