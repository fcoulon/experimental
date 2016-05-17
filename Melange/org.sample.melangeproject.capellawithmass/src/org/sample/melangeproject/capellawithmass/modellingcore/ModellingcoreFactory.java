/**
 */
package org.sample.melangeproject.capellawithmass.modellingcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage
 * @generated
 */
public interface ModellingcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModellingcoreFactory eINSTANCE = org.sample.melangeproject.capellawithmass.modellingcore.impl.ModellingcoreFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModellingcorePackage getModellingcorePackage();

} //ModellingcoreFactory
