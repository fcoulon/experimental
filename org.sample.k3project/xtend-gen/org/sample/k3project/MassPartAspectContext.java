package org.sample.k3project;

import java.util.Map;
import org.polarsys.capella.core.data.cs.Part;
import org.sample.k3project.MassPartAspectProperties;

@SuppressWarnings("all")
public class MassPartAspectContext {
  public final static MassPartAspectContext INSTANCE = new MassPartAspectContext();
  
  public static MassPartAspectProperties getSelf(final Part _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.sample.k3project.MassPartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Part, MassPartAspectProperties> map = new java.util.WeakHashMap<org.polarsys.capella.core.data.cs.Part, org.sample.k3project.MassPartAspectProperties>();
  
  public Map<Part, MassPartAspectProperties> getMap() {
    return map;
  }
}
