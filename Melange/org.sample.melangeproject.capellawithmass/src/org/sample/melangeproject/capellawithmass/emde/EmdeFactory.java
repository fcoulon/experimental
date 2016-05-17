/**
 */
package org.sample.melangeproject.capellawithmass.emde;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.sample.melangeproject.capellawithmass.emde.EmdePackage
 * @generated
 */
public interface EmdeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EmdeFactory eINSTANCE = org.sample.melangeproject.capellawithmass.emde.impl.EmdeFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EmdePackage getEmdePackage();

} //EmdeFactory
