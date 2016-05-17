/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.information.AggregationKind;
import org.sample.melangeproject.capellawithmass.information.Association;
import org.sample.melangeproject.capellawithmass.information.Collection;
import org.sample.melangeproject.capellawithmass.information.CollectionKind;
import org.sample.melangeproject.capellawithmass.information.CollectionValue;
import org.sample.melangeproject.capellawithmass.information.CollectionValueReference;
import org.sample.melangeproject.capellawithmass.information.DataPkg;
import org.sample.melangeproject.capellawithmass.information.DomainElement;
import org.sample.melangeproject.capellawithmass.information.ElementKind;
import org.sample.melangeproject.capellawithmass.information.ExchangeItem;
import org.sample.melangeproject.capellawithmass.information.ExchangeItemElement;
import org.sample.melangeproject.capellawithmass.information.ExchangeItemInstance;
import org.sample.melangeproject.capellawithmass.information.ExchangeItemRealization;
import org.sample.melangeproject.capellawithmass.information.ExchangeMechanism;
import org.sample.melangeproject.capellawithmass.information.InformationFactory;
import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.InformationRealization;
import org.sample.melangeproject.capellawithmass.information.KeyPart;
import org.sample.melangeproject.capellawithmass.information.OperationAllocation;
import org.sample.melangeproject.capellawithmass.information.Parameter;
import org.sample.melangeproject.capellawithmass.information.ParameterDirection;
import org.sample.melangeproject.capellawithmass.information.PassingMode;
import org.sample.melangeproject.capellawithmass.information.PortAllocation;
import org.sample.melangeproject.capellawithmass.information.PortRealization;
import org.sample.melangeproject.capellawithmass.information.Property;
import org.sample.melangeproject.capellawithmass.information.Service;
import org.sample.melangeproject.capellawithmass.information.SynchronismKind;
import org.sample.melangeproject.capellawithmass.information.Union;
import org.sample.melangeproject.capellawithmass.information.UnionKind;
import org.sample.melangeproject.capellawithmass.information.UnionProperty;
import org.sample.melangeproject.capellawithmass.information.Unit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationFactoryImpl extends EFactoryImpl implements InformationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InformationFactory init() {
		try {
			InformationFactory theInformationFactory = (InformationFactory)EPackage.Registry.INSTANCE.getEFactory(InformationPackage.eNS_URI);
			if (theInformationFactory != null) {
				return theInformationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InformationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFactoryImpl() {
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
			case InformationPackage.ASSOCIATION: return createAssociation();
			case InformationPackage.CLASS: return createClass();
			case InformationPackage.COLLECTION: return createCollection();
			case InformationPackage.COLLECTION_VALUE: return createCollectionValue();
			case InformationPackage.COLLECTION_VALUE_REFERENCE: return createCollectionValueReference();
			case InformationPackage.DATA_PKG: return createDataPkg();
			case InformationPackage.DOMAIN_ELEMENT: return createDomainElement();
			case InformationPackage.KEY_PART: return createKeyPart();
			case InformationPackage.OPERATION_ALLOCATION: return createOperationAllocation();
			case InformationPackage.PARAMETER: return createParameter();
			case InformationPackage.PROPERTY: return createProperty();
			case InformationPackage.SERVICE: return createService();
			case InformationPackage.UNION: return createUnion();
			case InformationPackage.UNION_PROPERTY: return createUnionProperty();
			case InformationPackage.UNIT: return createUnit();
			case InformationPackage.PORT_REALIZATION: return createPortRealization();
			case InformationPackage.PORT_ALLOCATION: return createPortAllocation();
			case InformationPackage.EXCHANGE_ITEM: return createExchangeItem();
			case InformationPackage.EXCHANGE_ITEM_ELEMENT: return createExchangeItemElement();
			case InformationPackage.EXCHANGE_ITEM_INSTANCE: return createExchangeItemInstance();
			case InformationPackage.INFORMATION_REALIZATION: return createInformationRealization();
			case InformationPackage.EXCHANGE_ITEM_REALIZATION: return createExchangeItemRealization();
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
			case InformationPackage.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			case InformationPackage.PARAMETER_DIRECTION:
				return createParameterDirectionFromString(eDataType, initialValue);
			case InformationPackage.PASSING_MODE:
				return createPassingModeFromString(eDataType, initialValue);
			case InformationPackage.SYNCHRONISM_KIND:
				return createSynchronismKindFromString(eDataType, initialValue);
			case InformationPackage.UNION_KIND:
				return createUnionKindFromString(eDataType, initialValue);
			case InformationPackage.EXCHANGE_MECHANISM:
				return createExchangeMechanismFromString(eDataType, initialValue);
			case InformationPackage.ELEMENT_KIND:
				return createElementKindFromString(eDataType, initialValue);
			case InformationPackage.COLLECTION_KIND:
				return createCollectionKindFromString(eDataType, initialValue);
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
			case InformationPackage.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			case InformationPackage.PARAMETER_DIRECTION:
				return convertParameterDirectionToString(eDataType, instanceValue);
			case InformationPackage.PASSING_MODE:
				return convertPassingModeToString(eDataType, instanceValue);
			case InformationPackage.SYNCHRONISM_KIND:
				return convertSynchronismKindToString(eDataType, instanceValue);
			case InformationPackage.UNION_KIND:
				return convertUnionKindToString(eDataType, instanceValue);
			case InformationPackage.EXCHANGE_MECHANISM:
				return convertExchangeMechanismToString(eDataType, instanceValue);
			case InformationPackage.ELEMENT_KIND:
				return convertElementKindToString(eDataType, instanceValue);
			case InformationPackage.COLLECTION_KIND:
				return convertCollectionKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.sample.melangeproject.capellawithmass.information.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection() {
		CollectionImpl collection = new CollectionImpl();
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionValue createCollectionValue() {
		CollectionValueImpl collectionValue = new CollectionValueImpl();
		return collectionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionValueReference createCollectionValueReference() {
		CollectionValueReferenceImpl collectionValueReference = new CollectionValueReferenceImpl();
		return collectionValueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPkg createDataPkg() {
		DataPkgImpl dataPkg = new DataPkgImpl();
		return dataPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainElement createDomainElement() {
		DomainElementImpl domainElement = new DomainElementImpl();
		return domainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPart createKeyPart() {
		KeyPartImpl keyPart = new KeyPartImpl();
		return keyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationAllocation createOperationAllocation() {
		OperationAllocationImpl operationAllocation = new OperationAllocationImpl();
		return operationAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Union createUnion() {
		UnionImpl union = new UnionImpl();
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionProperty createUnionProperty() {
		UnionPropertyImpl unionProperty = new UnionPropertyImpl();
		return unionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unit createUnit() {
		UnitImpl unit = new UnitImpl();
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRealization createPortRealization() {
		PortRealizationImpl portRealization = new PortRealizationImpl();
		return portRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortAllocation createPortAllocation() {
		PortAllocationImpl portAllocation = new PortAllocationImpl();
		return portAllocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItem createExchangeItem() {
		ExchangeItemImpl exchangeItem = new ExchangeItemImpl();
		return exchangeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItemElement createExchangeItemElement() {
		ExchangeItemElementImpl exchangeItemElement = new ExchangeItemElementImpl();
		return exchangeItemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItemInstance createExchangeItemInstance() {
		ExchangeItemInstanceImpl exchangeItemInstance = new ExchangeItemInstanceImpl();
		return exchangeItemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRealization createInformationRealization() {
		InformationRealizationImpl informationRealization = new InformationRealizationImpl();
		return informationRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeItemRealization createExchangeItemRealization() {
		ExchangeItemRealizationImpl exchangeItemRealization = new ExchangeItemRealizationImpl();
		return exchangeItemRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue) {
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirection createParameterDirectionFromString(EDataType eDataType, String initialValue) {
		ParameterDirection result = ParameterDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassingMode createPassingModeFromString(EDataType eDataType, String initialValue) {
		PassingMode result = PassingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPassingModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronismKind createSynchronismKindFromString(EDataType eDataType, String initialValue) {
		SynchronismKind result = SynchronismKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSynchronismKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionKind createUnionKindFromString(EDataType eDataType, String initialValue) {
		UnionKind result = UnionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeMechanism createExchangeMechanismFromString(EDataType eDataType, String initialValue) {
		ExchangeMechanism result = ExchangeMechanism.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExchangeMechanismToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementKind createElementKindFromString(EDataType eDataType, String initialValue) {
		ElementKind result = ElementKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionKind createCollectionKindFromString(EDataType eDataType, String initialValue) {
		CollectionKind result = CollectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationPackage getInformationPackage() {
		return (InformationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InformationPackage getPackage() {
		return InformationPackage.eINSTANCE;
	}

} //InformationFactoryImpl
