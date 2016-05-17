package org.sample.k3project

import org.polarsys.capella.core.data.cs.Part
import fr.inria.diverse.k3.al.annotationprocessor.Aspect

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
		val subParts = _self.eAllContents.filter(Part)
		val subPartWeight = subParts.map[computeMass].reduce[w1, w2| w1+w2]
		
		return subPartWeight + _self.value
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