/**
 */
package org.sample.melangeproject.capellawithmass.fa.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.fa.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FaFactoryImpl extends EFactoryImpl implements FaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FaFactory init() {
		try {
			FaFactory theFaFactory = (FaFactory)EPackage.Registry.INSTANCE.getEFactory(FaPackage.eNS_URI);
			if (theFaFactory != null) {
				return theFaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FaPackage.FUNCTION_SPECIFICATION: return createFunctionSpecification();
			case FaPackage.EXCHANGE_CATEGORY: return createExchangeCategory();
			case FaPackage.EXCHANGE_LINK: return createExchangeLink();
			case FaPackage.EXCHANGE_CONTAINMENT: return createExchangeContainment();
			case FaPackage.FUNCTIONAL_EXCHANGE_SPECIFICATION: return createFunctionalExchangeSpecification();
			case FaPackage.FUNCTIONAL_CHAIN: return createFunctionalChain();
			case FaPackage.FUNCTIONAL_CHAIN_INVOLVEMENT: return createFunctionalChainInvolvement();
			case FaPackage.FUNCTIONAL_CHAIN_REFERENCE: return createFunctionalChainReference();
			case FaPackage.FUNCTION_INPUT_PORT: return createFunctionInputPort();
			case FaPackage.FUNCTION_OUTPUT_PORT: return createFunctionOutputPort();
			case FaPackage.COMPONENT_FUNCTIONAL_ALLOCATION: return createComponentFunctionalAllocation();
			case FaPackage.FUNCTIONAL_CHAIN_REALIZATION: return createFunctionalChainRealization();
			case FaPackage.FUNCTIONAL_EXCHANGE_REALIZATION: return createFunctionalExchangeRealization();
			case FaPackage.FUNCTION_REALIZATION: return createFunctionRealization();
			case FaPackage.FUNCTIONAL_EXCHANGE: return createFunctionalExchange();
			case FaPackage.COMPONENT_EXCHANGE: return createComponentExchange();
			case FaPackage.COMPONENT_EXCHANGE_ALLOCATION: return createComponentExchangeAllocation();
			case FaPackage.COMPONENT_EXCHANGE_CATEGORY: return createComponentExchangeCategory();
			case FaPackage.COMPONENT_EXCHANGE_END: return createComponentExchangeEnd();
			case FaPackage.COMPONENT_EXCHANGE_FUNCTIONAL_EXCHANGE_ALLOCATION: return createComponentExchangeFunctionalExchangeAllocation();
			case FaPackage.COMPONENT_EXCHANGE_REALIZATION: return createComponentExchangeRealization();
			case FaPackage.COMPONENT_PORT: return createComponentPort();
			case FaPackage.COMPONENT_PORT_ALLOCATION: return createComponentPortAllocation();
			case FaPackage.COMPONENT_PORT_ALLOCATION_END: return createComponentPortAllocationEnd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FaPackage.FUNCTIONAL_CHAIN_KIND:
				return createFunctionalChainKindFromString(eDataType, initialValue);
			case FaPackage.FUNCTION_KIND:
				return createFunctionKindFromString(eDataType, initialValue);
			case FaPackage.COMPONENT_EXCHANGE_KIND:
				return createComponentExchangeKindFromString(eDataType, initialValue);
			case FaPackage.COMPONENT_PORT_KIND:
				return createComponentPortKindFromString(eDataType, initialValue);
			case FaPackage.ORIENTATION_PORT_KIND:
				return createOrientationPortKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FaPackage.FUNCTIONAL_CHAIN_KIND:
				return convertFunctionalChainKindToString(eDataType, instanceValue);
			case FaPackage.FUNCTION_KIND:
				return convertFunctionKindToString(eDataType, instanceValue);
			case FaPackage.COMPONENT_EXCHANGE_KIND:
				return convertComponentExchangeKindToString(eDataType, instanceValue);
			case FaPackage.COMPONENT_PORT_KIND:
				return convertComponentPortKindToString(eDataType, instanceValue);
			case FaPackage.ORIENTATION_PORT_KIND:
				return convertOrientationPortKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionSpecification createFunctionSpecification() {
		FunctionSpecificationImpl functionSpecification = new FunctionSpecificationImpl();
		return functionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeCategory createExchangeCategory() {
		ExchangeCategoryImpl exchangeCategory = new ExchangeCategoryImpl();
		return exchangeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeLink createExchangeLink() {
		ExchangeLinkImpl exchangeLink = new ExchangeLinkImpl();
		return exchangeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeContainment createExchangeContainment() {
		ExchangeContainmentImpl exchangeContainment = new ExchangeContainmentImpl();
		return exchangeContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchangeSpecification createFunctionalExchangeSpecification() {
		FunctionalExchangeSpecificationImpl functionalExchangeSpecification = new FunctionalExchangeSpecificationImpl();
		return functionalExchangeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChain createFunctionalChain() {
		FunctionalChainImpl functionalChain = new FunctionalChainImpl();
		return functionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChainInvolvement createFunctionalChainInvolvement() {
		FunctionalChainInvolvementImpl functionalChainInvolvement = new FunctionalChainInvolvementImpl();
		return functionalChainInvolvement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChainReference createFunctionalChainReference() {
		FunctionalChainReferenceImpl functionalChainReference = new FunctionalChainReferenceImpl();
		return functionalChainReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionInputPort createFunctionInputPort() {
		FunctionInputPortImpl functionInputPort = new FunctionInputPortImpl();
		return functionInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionOutputPort createFunctionOutputPort() {
		FunctionOutputPortImpl functionOutputPort = new FunctionOutputPortImpl();
		return functionOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentFunctionalAllocation createComponentFunctionalAllocation() {
		ComponentFunctionalAllocationImpl componentFunctionalAllocation = new ComponentFunctionalAllocationImpl();
		return componentFunctionalAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChainRealization createFunctionalChainRealization() {
		FunctionalChainRealizationImpl functionalChainRealization = new FunctionalChainRealizationImpl();
		return functionalChainRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchangeRealization createFunctionalExchangeRealization() {
		FunctionalExchangeRealizationImpl functionalExchangeRealization = new FunctionalExchangeRealizationImpl();
		return functionalExchangeRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRealization createFunctionRealization() {
		FunctionRealizationImpl functionRealization = new FunctionRealizationImpl();
		return functionRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalExchange createFunctionalExchange() {
		FunctionalExchangeImpl functionalExchange = new FunctionalExchangeImpl();
		return functionalExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchange createComponentExchange() {
		ComponentExchangeImpl componentExchange = new ComponentExchangeImpl();
		return componentExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeAllocation createComponentExchangeAllocation() {
		ComponentExchangeAllocationImpl componentExchangeAllocation = new ComponentExchangeAllocationImpl();
		return componentExchangeAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeCategory createComponentExchangeCategory() {
		ComponentExchangeCategoryImpl componentExchangeCategory = new ComponentExchangeCategoryImpl();
		return componentExchangeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeEnd createComponentExchangeEnd() {
		ComponentExchangeEndImpl componentExchangeEnd = new ComponentExchangeEndImpl();
		return componentExchangeEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeFunctionalExchangeAllocation createComponentExchangeFunctionalExchangeAllocation() {
		ComponentExchangeFunctionalExchangeAllocationImpl componentExchangeFunctionalExchangeAllocation = new ComponentExchangeFunctionalExchangeAllocationImpl();
		return componentExchangeFunctionalExchangeAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeRealization createComponentExchangeRealization() {
		ComponentExchangeRealizationImpl componentExchangeRealization = new ComponentExchangeRealizationImpl();
		return componentExchangeRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPort createComponentPort() {
		ComponentPortImpl componentPort = new ComponentPortImpl();
		return componentPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortAllocation createComponentPortAllocation() {
		ComponentPortAllocationImpl componentPortAllocation = new ComponentPortAllocationImpl();
		return componentPortAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortAllocationEnd createComponentPortAllocationEnd() {
		ComponentPortAllocationEndImpl componentPortAllocationEnd = new ComponentPortAllocationEndImpl();
		return componentPortAllocationEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalChainKind createFunctionalChainKindFromString(EDataType eDataType, String initialValue) {
		FunctionalChainKind result = FunctionalChainKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionalChainKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionKind createFunctionKindFromString(EDataType eDataType, String initialValue) {
		FunctionKind result = FunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentExchangeKind createComponentExchangeKindFromString(EDataType eDataType, String initialValue) {
		ComponentExchangeKind result = ComponentExchangeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentExchangeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPortKind createComponentPortKindFromString(EDataType eDataType, String initialValue) {
		ComponentPortKind result = ComponentPortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationPortKind createOrientationPortKindFromString(EDataType eDataType, String initialValue) {
		OrientationPortKind result = OrientationPortKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationPortKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaPackage getFaPackage() {
		return (FaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FaPackage getPackage() {
		return FaPackage.eINSTANCE;
	}

} //FaFactoryImpl
