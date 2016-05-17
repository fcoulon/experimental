/**
 */
package org.sample.melangeproject.capellawithmass.information.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.sample.melangeproject.capellawithmass.information.InformationPackage;
import org.sample.melangeproject.capellawithmass.information.Service;
import org.sample.melangeproject.capellawithmass.information.SynchronismKind;

import org.sample.melangeproject.capellawithmass.information.communication.Message;
import org.sample.melangeproject.capellawithmass.information.communication.MessageReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ServiceImpl#getSynchronismKind <em>Synchronism Kind</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ServiceImpl#getThrownExceptions <em>Thrown Exceptions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ServiceImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.information.impl.ServiceImpl#getMessageReferences <em>Message References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends OperationImpl implements Service {
	/**
	 * The default value of the '{@link #getSynchronismKind() <em>Synchronism Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronismKind()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronismKind SYNCHRONISM_KIND_EDEFAULT = SynchronismKind.UNSET;

	/**
	 * The cached value of the '{@link #getSynchronismKind() <em>Synchronism Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronismKind()
	 * @generated
	 * @ordered
	 */
	protected SynchronismKind synchronismKind = SYNCHRONISM_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThrownExceptions() <em>Thrown Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<org.sample.melangeproject.capellawithmass.information.communication.Exception> thrownExceptions;

	/**
	 * The cached value of the '{@link #getMessageReferences() <em>Message References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageReference> messageReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronismKind getSynchronismKind() {
		return synchronismKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronismKind(SynchronismKind newSynchronismKind) {
		SynchronismKind oldSynchronismKind = synchronismKind;
		synchronismKind = newSynchronismKind == null ? SYNCHRONISM_KIND_EDEFAULT : newSynchronismKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InformationPackage.SERVICE__SYNCHRONISM_KIND, oldSynchronismKind, synchronismKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.sample.melangeproject.capellawithmass.information.communication.Exception> getThrownExceptions() {
		if (thrownExceptions == null) {
			thrownExceptions = new EObjectResolvingEList<org.sample.melangeproject.capellawithmass.information.communication.Exception>(org.sample.melangeproject.capellawithmass.information.communication.Exception.class, this, InformationPackage.SERVICE__THROWN_EXCEPTIONS);
		}
		return thrownExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		// TODO: implement this method to return the 'Messages' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageReference> getMessageReferences() {
		if (messageReferences == null) {
			messageReferences = new EObjectResolvingEList<MessageReference>(MessageReference.class, this, InformationPackage.SERVICE__MESSAGE_REFERENCES);
		}
		return messageReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationPackage.SERVICE__SYNCHRONISM_KIND:
				return getSynchronismKind();
			case InformationPackage.SERVICE__THROWN_EXCEPTIONS:
				return getThrownExceptions();
			case InformationPackage.SERVICE__MESSAGES:
				return getMessages();
			case InformationPackage.SERVICE__MESSAGE_REFERENCES:
				return getMessageReferences();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InformationPackage.SERVICE__SYNCHRONISM_KIND:
				setSynchronismKind((SynchronismKind)newValue);
				return;
			case InformationPackage.SERVICE__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				getThrownExceptions().addAll((Collection<? extends org.sample.melangeproject.capellawithmass.information.communication.Exception>)newValue);
				return;
			case InformationPackage.SERVICE__MESSAGE_REFERENCES:
				getMessageReferences().clear();
				getMessageReferences().addAll((Collection<? extends MessageReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InformationPackage.SERVICE__SYNCHRONISM_KIND:
				setSynchronismKind(SYNCHRONISM_KIND_EDEFAULT);
				return;
			case InformationPackage.SERVICE__THROWN_EXCEPTIONS:
				getThrownExceptions().clear();
				return;
			case InformationPackage.SERVICE__MESSAGE_REFERENCES:
				getMessageReferences().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InformationPackage.SERVICE__SYNCHRONISM_KIND:
				return synchronismKind != SYNCHRONISM_KIND_EDEFAULT;
			case InformationPackage.SERVICE__THROWN_EXCEPTIONS:
				return thrownExceptions != null && !thrownExceptions.isEmpty();
			case InformationPackage.SERVICE__MESSAGES:
				return !getMessages().isEmpty();
			case InformationPackage.SERVICE__MESSAGE_REFERENCES:
				return messageReferences != null && !messageReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (synchronismKind: ");
		result.append(synchronismKind);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
