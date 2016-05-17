/**
 */
package org.sample.melangeproject.capellawithmass.epbs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.epbs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EpbsFactoryImpl extends EFactoryImpl implements EpbsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EpbsFactory init() {
		try {
			EpbsFactory theEpbsFactory = (EpbsFactory)EPackage.Registry.INSTANCE.getEFactory(EpbsPackage.eNS_URI);
			if (theEpbsFactory != null) {
				return theEpbsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EpbsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpbsFactoryImpl() {
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
			case EpbsPackage.EPBS_ARCHITECTURE_PKG: return createEPBSArchitecturePkg();
			case EpbsPackage.EPBS_ARCHITECTURE: return createEPBSArchitecture();
			case EpbsPackage.EPBS_CONTEXT: return createEPBSContext();
			case EpbsPackage.CONFIGURATION_ITEM_PKG: return createConfigurationItemPkg();
			case EpbsPackage.CONFIGURATION_ITEM: return createConfigurationItem();
			case EpbsPackage.PHYSICAL_ARCHITECTURE_REALIZATION: return createPhysicalArchitectureRealization();
			case EpbsPackage.PHYSICAL_ARTIFACT_REALIZATION: return createPhysicalArtifactRealization();
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
			case EpbsPackage.CONFIGURATION_ITEM_KIND:
				return createConfigurationItemKindFromString(eDataType, initialValue);
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
			case EpbsPackage.CONFIGURATION_ITEM_KIND:
				return convertConfigurationItemKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPBSArchitecturePkg createEPBSArchitecturePkg() {
		EPBSArchitecturePkgImpl epbsArchitecturePkg = new EPBSArchitecturePkgImpl();
		return epbsArchitecturePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPBSArchitecture createEPBSArchitecture() {
		EPBSArchitectureImpl epbsArchitecture = new EPBSArchitectureImpl();
		return epbsArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPBSContext createEPBSContext() {
		EPBSContextImpl epbsContext = new EPBSContextImpl();
		return epbsContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemPkg createConfigurationItemPkg() {
		ConfigurationItemPkgImpl configurationItemPkg = new ConfigurationItemPkgImpl();
		return configurationItemPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItem createConfigurationItem() {
		ConfigurationItemImpl configurationItem = new ConfigurationItemImpl();
		return configurationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalArchitectureRealization createPhysicalArchitectureRealization() {
		PhysicalArchitectureRealizationImpl physicalArchitectureRealization = new PhysicalArchitectureRealizationImpl();
		return physicalArchitectureRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalArtifactRealization createPhysicalArtifactRealization() {
		PhysicalArtifactRealizationImpl physicalArtifactRealization = new PhysicalArtifactRealizationImpl();
		return physicalArtifactRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationItemKind createConfigurationItemKindFromString(EDataType eDataType, String initialValue) {
		ConfigurationItemKind result = ConfigurationItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConfigurationItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpbsPackage getEpbsPackage() {
		return (EpbsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EpbsPackage getPackage() {
		return EpbsPackage.eINSTANCE;
	}

} //EpbsFactoryImpl
