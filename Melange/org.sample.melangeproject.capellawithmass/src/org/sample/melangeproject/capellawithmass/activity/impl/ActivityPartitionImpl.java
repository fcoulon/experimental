/**
 */
package org.sample.melangeproject.capellawithmass.activity.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractNamedElement;
import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;
import org.sample.melangeproject.capellawithmass.modellingcore.ModellingcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityPartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityPartitionImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityPartitionImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityPartitionImpl#getRepresentedElement <em>Represented Element</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityPartitionImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.activity.impl.ActivityPartitionImpl#getSubPartitions <em>Sub Partitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActivityPartitionImpl extends ActivityGroupImpl implements ActivityPartition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIMENSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDimension() <em>Is Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDimension()
	 * @generated
	 * @ordered
	 */
	protected boolean isDimension = IS_DIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepresentedElement() <em>Represented Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentedElement()
	 * @generated
	 * @ordered
	 */
	protected AbstractType representedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityPartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityPackage.Literals.ACTIVITY_PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDimension() {
		return isDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDimension(boolean newIsDimension) {
		boolean oldIsDimension = isDimension;
		isDimension = newIsDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION, oldIsDimension, isDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL, oldIsExternal, isExternal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getRepresentedElement() {
		if (representedElement != null && representedElement.eIsProxy()) {
			InternalEObject oldRepresentedElement = (InternalEObject)representedElement;
			representedElement = (AbstractType)eResolveProxy(oldRepresentedElement);
			if (representedElement != oldRepresentedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
			}
		}
		return representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType basicGetRepresentedElement() {
		return representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentedElement(AbstractType newRepresentedElement) {
		AbstractType oldRepresentedElement = representedElement;
		representedElement = newRepresentedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getSuperPartition() {
		ActivityPartition superPartition = basicGetSuperPartition();
		return superPartition != null && superPartition.eIsProxy() ? (ActivityPartition)eResolveProxy((InternalEObject)superPartition) : superPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetSuperPartition() {
		// TODO: implement this method to return the 'Super Partition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getSubPartitions() {
		// TODO: implement this method to return the 'Sub Partitions' reference list
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				return getName();
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isIsDimension();
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isIsExternal();
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				if (resolve) return getRepresentedElement();
				return basicGetRepresentedElement();
			case ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				if (resolve) return getSuperPartition();
				return basicGetSuperPartition();
			case ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS:
				return getSubPartitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				setName((String)newValue);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension((Boolean)newValue);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				setRepresentedElement((AbstractType)newValue);
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
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				setRepresentedElement((AbstractType)null);
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
			case ActivityPackage.ACTIVITY_PARTITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION:
				return isDimension != IS_DIMENSION_EDEFAULT;
			case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT:
				return representedElement != null;
			case ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION:
				return basicGetSuperPartition() != null;
			case ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS:
				return !getSubPartitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNamedElement.class) {
			switch (derivedFeatureID) {
				case ActivityPackage.ACTIVITY_PARTITION__NAME: return ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractNamedElement.class) {
			switch (baseFeatureID) {
				case ModellingcorePackage.ABSTRACT_NAMED_ELEMENT__NAME: return ActivityPackage.ACTIVITY_PARTITION__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isDimension: ");
		result.append(isDimension);
		result.append(", isExternal: ");
		result.append(isExternal);
		result.append(')');
		return result.toString();
	}

} //ActivityPartitionImpl
