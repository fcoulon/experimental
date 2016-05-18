package org.sample.k3project

import org.polarsys.capella.core.data.cs.Part
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import java.util.List
import org.polarsys.capella.core.data.cs.Component
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.polarsys.capella.core.data.cs.AbstractDeploymentLink
import org.polarsys.capella.core.data.capellacore.Feature
import org.polarsys.capella.core.data.pa.PhysicalComponent
import org.polarsys.capella.core.data.cs.impl.PartImpl
import org.polarsys.capella.core.data.cs.CsPackage
import org.polarsys.capella.core.data.cs.CsFactory

@Aspect(className=Part)
class Mass{
	public int value
	public int maxValue
	public int minValue
	public int currentMass
	
	def boolean isOverhead(){
		val current = _self.computeMass()
		
		if (_self.maxValue<= 0)
			return false
		else
			return current > _self.maxValue
	}
	
	def boolean isSatured(){
		val current = _self.computeMass()
		
		if (_self.maxValue<= 0)
			return false
		else
			return current != 0 && current == _self.maxValue
	}
	
	def int computeMass(){
		val subParts = _self.getSubComponentsObjects
		val subPartWeight = subParts.map[computeMass].reduce[w1, w2| w1+w2]
		
		return subPartWeight + _self.value
	}
	
	def EList<Part> getSubComponentsObjects(){
		val list = new BasicEList<Part>();

		var EObject type = null
		
		var EList<AbstractDeploymentLink> deployedLinkList = null
		
		if (_self instanceof  Part)
		{
			type = _self.getAbstractType()
			deployedLinkList = _self.getDeploymentLinks()
			
		}
		else 
		{
			if (_self instanceof Component) 
				type = _self;
		}
		
		// Traitement des composants
		if (type != null && type instanceof  Component)
		{
			val Component pc = type as Component
			for (Feature feature : pc.getOwnedPartitions()) 
			{
				if (feature instanceof Part) 
				{
					val Part part = feature;
					// Traitement des Composants fils du composant
					val EObject type2 = part.getType();
					if (type2 instanceof PhysicalComponent)
					{
						val EList<Part> deploying = part.getDeployingParts();
						if (deploying == null || deploying.size() == 0)
							list.add(part);
					}
				}
			}
		}
		
		// Traitement des Deployements
		if (deployedLinkList != null && deployedLinkList.size() > 0)
		{
			for (AbstractDeploymentLink curDeploymentLink : deployedLinkList) 
			{
				val EObject deployedComponent = curDeploymentLink.getDeployedElement();
				if (deployedComponent instanceof Part)
					list.add(deployedComponent);
			}
		}

		return list;
	}
	
	def void print(){
		println(
			  "name: "        + _self.name + "\n"
			+ "min value: "   + _self.minValue + "\n"
			+ "max value: "   + _self.maxValue + "\n"
			+ "currentMass: " + _self.currentMass
		)
	}
}
