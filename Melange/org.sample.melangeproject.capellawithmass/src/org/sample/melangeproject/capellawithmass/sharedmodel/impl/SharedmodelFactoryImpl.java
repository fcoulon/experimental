/**
 */
package org.sample.melangeproject.capellawithmass.sharedmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sample.melangeproject.capellawithmass.sharedmodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedmodelFactoryImpl extends EFactoryImpl implements SharedmodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SharedmodelFactory init() {
		try {
			SharedmodelFactory theSharedmodelFactory = (SharedmodelFactory)EPackage.Registry.INSTANCE.getEFactory(SharedmodelPackage.eNS_URI);
			if (theSharedmodelFactory != null) {
				return theSharedmodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SharedmodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedmodelFactoryImpl() {
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
			case SharedmodelPackage.SHARED_PKG: return createSharedPkg();
			case SharedmodelPackage.GENERIC_PKG: return createGenericPkg();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedPkg createSharedPkg() {
		SharedPkgImpl sharedPkg = new SharedPkgImpl();
		return sharedPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericPkg createGenericPkg() {
		GenericPkgImpl genericPkg = new GenericPkgImpl();
		return genericPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedmodelPackage getSharedmodelPackage() {
		return (SharedmodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SharedmodelPackage getPackage() {
		return SharedmodelPackage.eINSTANCE;
	}

} //SharedmodelFactoryImpl
