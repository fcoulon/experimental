package org.sample.melangeproject.capellawithmass.aspects;

import java.util.Map;
import org.sample.melangeproject.capellawithmass.cs.Part;
import org.sample.melangeproject.capellawithmass.aspects.MassPartAspectProperties;

@SuppressWarnings("all")
public class MassPartAspectContext {
  public final static MassPartAspectContext INSTANCE = new MassPartAspectContext();
  
  public static MassPartAspectProperties getSelf(final Part _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.sample.melangeproject.capellawithmass.aspects.MassPartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Part, MassPartAspectProperties> map = new java.util.WeakHashMap<org.sample.melangeproject.capellawithmass.cs.Part, org.sample.melangeproject.capellawithmass.aspects.MassPartAspectProperties>();
  
  public Map<Part, MassPartAspectProperties> getMap() {
    return map;
  }
}
