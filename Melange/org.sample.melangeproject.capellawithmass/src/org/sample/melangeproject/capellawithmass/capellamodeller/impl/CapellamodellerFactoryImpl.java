/**
 */
package org.sample.melangeproject.capellawithmass.capellamodeller.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.capellamodeller.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CapellamodellerFactoryImpl extends EFactoryImpl implements CapellamodellerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CapellamodellerFactory init() {
		try {
			CapellamodellerFactory theCapellamodellerFactory = (CapellamodellerFactory)EPackage.Registry.INSTANCE.getEFactory(CapellamodellerPackage.eNS_URI);
			if (theCapellamodellerFactory != null) {
				return theCapellamodellerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CapellamodellerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellamodellerFactoryImpl() {
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
			case CapellamodellerPackage.PROJECT: return createProject();
			case CapellamodellerPackage.FOLDER: return createFolder();
			case CapellamodellerPackage.SYSTEM_ENGINEERING: return createSystemEngineering();
			case CapellamodellerPackage.SYSTEM_ENGINEERING_PKG: return createSystemEngineeringPkg();
			case CapellamodellerPackage.LIBRARY: return createLibrary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Folder createFolder() {
		FolderImpl folder = new FolderImpl();
		return folder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEngineering createSystemEngineering() {
		SystemEngineeringImpl systemEngineering = new SystemEngineeringImpl();
		return systemEngineering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemEngineeringPkg createSystemEngineeringPkg() {
		SystemEngineeringPkgImpl systemEngineeringPkg = new SystemEngineeringPkgImpl();
		return systemEngineeringPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapellamodellerPackage getCapellamodellerPackage() {
		return (CapellamodellerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CapellamodellerPackage getPackage() {
		return CapellamodellerPackage.eINSTANCE;
	}

} //CapellamodellerFactoryImpl
