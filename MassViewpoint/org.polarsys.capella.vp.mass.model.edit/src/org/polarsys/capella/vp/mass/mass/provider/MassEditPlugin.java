/*******************************************************************************
 * Copyright (c) 2006, 2015 Thales Global Services
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 ******************************************************************************/
package org.polarsys.capella.vp.mass.mass.provider;

import java.util.MissingResourceException;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.provider.EcoreEditPlugin;
import org.polarsys.capella.common.data.activity.provider.ActivityEditPlugin;

import org.polarsys.capella.common.data.behavior.provider.BehaviorEditPlugin;

import org.polarsys.capella.common.data.modellingcore.provider.ModellingCoreEditPlugin;

import org.polarsys.capella.core.data.capellamodeller.provider.CapellaModellerEditPlugin;

import org.polarsys.kitalpha.emde.model.edit.provider.EmdeEditPlugin;

/**
 * This is the central singleton for the Mass edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class MassEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final MassEditPlugin INSTANCE = new MassEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassEditPlugin() {
		super(new ResourceLocator[] { ActivityEditPlugin.INSTANCE, CapellaModellerEditPlugin.INSTANCE,
				ModellingCoreEditPlugin.INSTANCE, BehaviorEditPlugin.INSTANCE, EmdeEditPlugin.INSTANCE,
				EcoreEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

	/**
	 * @generated
	 */
	@Override
	public Object getImage(String key) {
		Object image = super.getImage(key);
		if (image == null)
			return delegatedGetImage(key);
		return image;
	}

	/**
	 * @generated
	 */
	@Override
	protected Object delegatedGetImage(String key) throws MissingResourceException {
		for (int i = 0; i < delegateResourceLocators.length; ++i) {
			try {
				Object image = delegateResourceLocators[i].getImage(key);
				if (image != null)
					return image;
			} catch (MissingResourceException exception) {
			}
		}
		return null;
	}

}
