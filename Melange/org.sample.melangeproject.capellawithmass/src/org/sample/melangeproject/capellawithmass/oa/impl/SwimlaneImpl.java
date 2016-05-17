/**
 */
package org.sample.melangeproject.capellawithmass.oa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sample.melangeproject.capellawithmass.activity.ActivityEdge;
import org.sample.melangeproject.capellawithmass.activity.ActivityGroup;
import org.sample.melangeproject.capellawithmass.activity.ActivityNode;
import org.sample.melangeproject.capellawithmass.activity.ActivityPackage;
import org.sample.melangeproject.capellawithmass.activity.ActivityPartition;

import org.sample.melangeproject.capellawithmass.capellacore.impl.NamedElementImpl;

import org.sample.melangeproject.capellawithmass.modellingcore.AbstractType;

import org.sample.melangeproject.capellawithmass.oa.Entity;
import org.sample.melangeproject.capellawithmass.oa.OaPackage;
import org.sample.melangeproject.capellawithmass.oa.Swimlane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swimlane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getOwnedNodes <em>Owned Nodes</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getOwnedEdges <em>Owned Edges</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#isIsDimension <em>Is Dimension</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getRepresentedElement <em>Represented Element</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getSuperPartition <em>Super Partition</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getSubPartitions <em>Sub Partitions</em>}</li>
 *   <li>{@link org.sample.melangeproject.capellawithmass.oa.impl.SwimlaneImpl#getRepresentedEntity <em>Represented Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwimlaneImpl extends NamedElementImpl implements Swimlane {
	/**
	 * The cached value of the '{@link #getSubGroups() <em>Sub Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> subGroups;

	/**
	 * The cached value of the '{@link #getOwnedNodes() <em>Owned Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> ownedNodes;

	/**
	 * The cached value of the '{@link #getOwnedEdges() <em>Owned Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> ownedEdges;

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
	protected SwimlaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OaPackage.Literals.SWIMLANE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getSuperGroup() {
		if (eContainerFeatureID() != OaPackage.SWIMLANE__SUPER_GROUP) return null;
		return (ActivityGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperGroup(ActivityGroup newSuperGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperGroup, OaPackage.SWIMLANE__SUPER_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGroup(ActivityGroup newSuperGroup) {
		if (newSuperGroup != eInternalContainer() || (eContainerFeatureID() != OaPackage.SWIMLANE__SUPER_GROUP && newSuperGroup != null)) {
			if (EcoreUtil.isAncestor(this, newSuperGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperGroup != null)
				msgs = ((InternalEObject)newSuperGroup).eInverseAdd(this, ActivityPackage.ACTIVITY_GROUP__SUB_GROUPS, ActivityGroup.class, msgs);
			msgs = basicSetSuperGroup(newSuperGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.SWIMLANE__SUPER_GROUP, newSuperGroup, newSuperGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubGroups() {
		if (subGroups == null) {
			subGroups = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, OaPackage.SWIMLANE__SUB_GROUPS, ActivityPackage.ACTIVITY_GROUP__SUPER_GROUP);
		}
		return subGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getOwnedNodes() {
		if (ownedNodes == null) {
			ownedNodes = new EObjectContainmentEList<ActivityNode>(ActivityNode.class, this, OaPackage.SWIMLANE__OWNED_NODES);
		}
		return ownedNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getOwnedEdges() {
		if (ownedEdges == null) {
			ownedEdges = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, OaPackage.SWIMLANE__OWNED_EDGES);
		}
		return ownedEdges;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.SWIMLANE__IS_DIMENSION, oldIsDimension, isDimension));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.SWIMLANE__IS_EXTERNAL, oldIsExternal, isExternal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OaPackage.SWIMLANE__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OaPackage.SWIMLANE__REPRESENTED_ELEMENT, oldRepresentedElement, representedElement));
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
	public Entity getRepresentedEntity() {
		Entity representedEntity = basicGetRepresentedEntity();
		return representedEntity != null && representedEntity.eIsProxy() ? (Entity)eResolveProxy((InternalEObject)representedEntity) : representedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetRepresentedEntity() {
		// TODO: implement this method to return the 'Represented Entity' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.SWIMLANE__SUPER_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperGroup((ActivityGroup)otherEnd, msgs);
			case OaPackage.SWIMLANE__SUB_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubGroups()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OaPackage.SWIMLANE__SUPER_GROUP:
				return basicSetSuperGroup(null, msgs);
			case OaPackage.SWIMLANE__SUB_GROUPS:
				return ((InternalEList<?>)getSubGroups()).basicRemove(otherEnd, msgs);
			case OaPackage.SWIMLANE__OWNED_NODES:
				return ((InternalEList<?>)getOwnedNodes()).basicRemove(otherEnd, msgs);
			case OaPackage.SWIMLANE__OWNED_EDGES:
				return ((InternalEList<?>)getOwnedEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OaPackage.SWIMLANE__SUPER_GROUP:
				return eInternalContainer().eInverseRemove(this, ActivityPackage.ACTIVITY_GROUP__SUB_GROUPS, ActivityGroup.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OaPackage.SWIMLANE__SUPER_GROUP:
				return getSuperGroup();
			case OaPackage.SWIMLANE__SUB_GROUPS:
				return getSubGroups();
			case OaPackage.SWIMLANE__OWNED_NODES:
				return getOwnedNodes();
			case OaPackage.SWIMLANE__OWNED_EDGES:
				return getOwnedEdges();
			case OaPackage.SWIMLANE__IS_DIMENSION:
				return isIsDimension();
			case OaPackage.SWIMLANE__IS_EXTERNAL:
				return isIsExternal();
			case OaPackage.SWIMLANE__REPRESENTED_ELEMENT:
				if (resolve) return getRepresentedElement();
				return basicGetRepresentedElement();
			case OaPackage.SWIMLANE__SUPER_PARTITION:
				if (resolve) return getSuperPartition();
				return basicGetSuperPartition();
			case OaPackage.SWIMLANE__SUB_PARTITIONS:
				return getSubPartitions();
			case OaPackage.SWIMLANE__REPRESENTED_ENTITY:
				if (resolve) return getRepresentedEntity();
				return basicGetRepresentedEntity();
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
			case OaPackage.SWIMLANE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)newValue);
				return;
			case OaPackage.SWIMLANE__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case OaPackage.SWIMLANE__OWNED_NODES:
				getOwnedNodes().clear();
				getOwnedNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case OaPackage.SWIMLANE__OWNED_EDGES:
				getOwnedEdges().clear();
				getOwnedEdges().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case OaPackage.SWIMLANE__IS_DIMENSION:
				setIsDimension((Boolean)newValue);
				return;
			case OaPackage.SWIMLANE__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case OaPackage.SWIMLANE__REPRESENTED_ELEMENT:
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
			case OaPackage.SWIMLANE__SUPER_GROUP:
				setSuperGroup((ActivityGroup)null);
				return;
			case OaPackage.SWIMLANE__SUB_GROUPS:
				getSubGroups().clear();
				return;
			case OaPackage.SWIMLANE__OWNED_NODES:
				getOwnedNodes().clear();
				return;
			case OaPackage.SWIMLANE__OWNED_EDGES:
				getOwnedEdges().clear();
				return;
			case OaPackage.SWIMLANE__IS_DIMENSION:
				setIsDimension(IS_DIMENSION_EDEFAULT);
				return;
			case OaPackage.SWIMLANE__IS_EXTERNAL:
				setIsExternal(IS_EXTERNAL_EDEFAULT);
				return;
			case OaPackage.SWIMLANE__REPRESENTED_ELEMENT:
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
			case OaPackage.SWIMLANE__SUPER_GROUP:
				return getSuperGroup() != null;
			case OaPackage.SWIMLANE__SUB_GROUPS:
				return subGroups != null && !subGroups.isEmpty();
			case OaPackage.SWIMLANE__OWNED_NODES:
				return ownedNodes != null && !ownedNodes.isEmpty();
			case OaPackage.SWIMLANE__OWNED_EDGES:
				return ownedEdges != null && !ownedEdges.isEmpty();
			case OaPackage.SWIMLANE__IS_DIMENSION:
				return isDimension != IS_DIMENSION_EDEFAULT;
			case OaPackage.SWIMLANE__IS_EXTERNAL:
				return isExternal != IS_EXTERNAL_EDEFAULT;
			case OaPackage.SWIMLANE__REPRESENTED_ELEMENT:
				return representedElement != null;
			case OaPackage.SWIMLANE__SUPER_PARTITION:
				return basicGetSuperPartition() != null;
			case OaPackage.SWIMLANE__SUB_PARTITIONS:
				return !getSubPartitions().isEmpty();
			case OaPackage.SWIMLANE__REPRESENTED_ENTITY:
				return basicGetRepresentedEntity() != null;
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
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case OaPackage.SWIMLANE__SUPER_GROUP: return ActivityPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case OaPackage.SWIMLANE__SUB_GROUPS: return ActivityPackage.ACTIVITY_GROUP__SUB_GROUPS;
				case OaPackage.SWIMLANE__OWNED_NODES: return ActivityPackage.ACTIVITY_GROUP__OWNED_NODES;
				case OaPackage.SWIMLANE__OWNED_EDGES: return ActivityPackage.ACTIVITY_GROUP__OWNED_EDGES;
				default: return -1;
			}
		}
		if (baseClass == ActivityPartition.class) {
			switch (derivedFeatureID) {
				case OaPackage.SWIMLANE__IS_DIMENSION: return ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION;
				case OaPackage.SWIMLANE__IS_EXTERNAL: return ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL;
				case OaPackage.SWIMLANE__REPRESENTED_ELEMENT: return ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT;
				case OaPackage.SWIMLANE__SUPER_PARTITION: return ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION;
				case OaPackage.SWIMLANE__SUB_PARTITIONS: return ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS;
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
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_GROUP__SUPER_GROUP: return OaPackage.SWIMLANE__SUPER_GROUP;
				case ActivityPackage.ACTIVITY_GROUP__SUB_GROUPS: return OaPackage.SWIMLANE__SUB_GROUPS;
				case ActivityPackage.ACTIVITY_GROUP__OWNED_NODES: return OaPackage.SWIMLANE__OWNED_NODES;
				case ActivityPackage.ACTIVITY_GROUP__OWNED_EDGES: return OaPackage.SWIMLANE__OWNED_EDGES;
				default: return -1;
			}
		}
		if (baseClass == ActivityPartition.class) {
			switch (baseFeatureID) {
				case ActivityPackage.ACTIVITY_PARTITION__IS_DIMENSION: return OaPackage.SWIMLANE__IS_DIMENSION;
				case ActivityPackage.ACTIVITY_PARTITION__IS_EXTERNAL: return OaPackage.SWIMLANE__IS_EXTERNAL;
				case ActivityPackage.ACTIVITY_PARTITION__REPRESENTED_ELEMENT: return OaPackage.SWIMLANE__REPRESENTED_ELEMENT;
				case ActivityPackage.ACTIVITY_PARTITION__SUPER_PARTITION: return OaPackage.SWIMLANE__SUPER_PARTITION;
				case ActivityPackage.ACTIVITY_PARTITION__SUB_PARTITIONS: return OaPackage.SWIMLANE__SUB_PARTITIONS;
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
		result.append(" (isDimension: ");
		result.append(isDimension);
		result.append(", isExternal: ");
		result.append(isExternal);
		result.append(')');
		return result.toString();
	}

} //SwimlaneImpl
