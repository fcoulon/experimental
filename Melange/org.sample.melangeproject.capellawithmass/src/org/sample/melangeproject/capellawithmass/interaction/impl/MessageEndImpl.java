/**
 */
package org.sample.melangeproject.capellawithmass.interaction.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.sample.melangeproject.capellawithmass.interaction.InteractionPackage;
import org.sample.melangeproject.capellawithmass.interaction.MessageEnd;
import org.sample.melangeproject.capellawithmass.interaction.SequenceMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.interaction.impl.MessageEndImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageEndImpl extends AbstractEndImpl implements MessageEnd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionPackage.Literals.MESSAGE_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceMessage getMessage() {
		SequenceMessage message = basicGetMessage();
		return message != null && message.eIsProxy() ? (SequenceMessage)eResolveProxy((InternalEObject)message) : message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceMessage basicGetMessage() {
		// TODO: implement this method to return the 'Message' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteractionPackage.MESSAGE_END__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InteractionPackage.MESSAGE_END__MESSAGE:
				return basicGetMessage() != null;
		}
		return super.eIsSet(featureID);
	}

} //MessageEndImpl
