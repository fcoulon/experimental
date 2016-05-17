package mass.vp;

import org.eclipse.emf.common.util.EList;
import org.polarsys.capella.core.data.cs.Part;
import org.polarsys.capella.vp.mass.mass.PartMass;
import org.polarsys.kitalpha.emde.model.ElementExtension;

public class Printer {
	
	public void print(Part part){
		
		PartMass massExt = getMassExtension(part);
		
		System.out.println(
				  "name: "        + part.getName() + "\n"
				+ "min value: "   + massExt.getMinValue() + "\n"
				+ "max value: "   + massExt.getMaxValue() + "\n"
				+ "currentMass: " + massExt.getCurrentMass()
			);
	}
	
	private PartMass getMassExtension(Part part) {
		
		EList<ElementExtension> extensions = part.getOwnedExtensions();
		
		for (ElementExtension elementExtension : extensions) {
			if (elementExtension instanceof PartMass)
				return (PartMass)elementExtension;
		}
		
		return null;
	}
}
