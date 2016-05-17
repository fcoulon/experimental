package org.sample.k3project;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Iterator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.polarsys.capella.core.data.cs.Part;
import org.sample.k3project.MassPartAspectProperties;

@Aspect(className = Part.class)
@SuppressWarnings("all")
public class Mass {
  public static boolean isOverhead(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isOverhead(_self_, _self);;
    return (boolean)result;
  }
  
  public static boolean isSatured(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_isSatured(_self_, _self);;
    return (boolean)result;
  }
  
  public static int computeMass(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_computeMass(_self_, _self);;
    return (int)result;
  }
  
  public static void print(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    _privk3_print(_self_, _self);;
  }
  
  public static int value(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_value(_self_, _self);;
    return (int)result;
  }
  
  public static void value(final Part _self, final int value) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    _privk3_value(_self_, _self,value);;
  }
  
  public static int maxValue(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_maxValue(_self_, _self);;
    return (int)result;
  }
  
  public static void maxValue(final Part _self, final int maxValue) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    _privk3_maxValue(_self_, _self,maxValue);;
  }
  
  public static int minValue(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_minValue(_self_, _self);;
    return (int)result;
  }
  
  public static void minValue(final Part _self, final int minValue) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    _privk3_minValue(_self_, _self,minValue);;
  }
  
  public static int currentMass(final Part _self) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentMass(_self_, _self);;
    return (int)result;
  }
  
  public static void currentMass(final Part _self, final int currentMass) {
    final org.sample.k3project.MassPartAspectProperties _self_ = org.sample.k3project.MassPartAspectContext.getSelf(_self);
    _privk3_currentMass(_self_, _self,currentMass);;
  }
  
  protected static boolean _privk3_isOverhead(final MassPartAspectProperties _self_, final Part _self) {
    final int current = Mass.computeMass(_self);
    int _maxValue = Mass.maxValue(_self);
    boolean _lessEqualsThan = (_maxValue <= 0);
    if (_lessEqualsThan) {
      return false;
    } else {
      int _maxValue_1 = Mass.maxValue(_self);
      return (current > _maxValue_1);
    }
  }
  
  protected static boolean _privk3_isSatured(final MassPartAspectProperties _self_, final Part _self) {
    final int current = Mass.computeMass(_self);
    int _maxValue = Mass.maxValue(_self);
    boolean _lessEqualsThan = (_maxValue <= 0);
    if (_lessEqualsThan) {
      return false;
    } else {
      boolean _and = false;
      if (!(current != 0)) {
        _and = false;
      } else {
        int _maxValue_1 = Mass.maxValue(_self);
        boolean _equals = (current == _maxValue_1);
        _and = _equals;
      }
      return _and;
    }
  }
  
  protected static int _privk3_computeMass(final MassPartAspectProperties _self_, final Part _self) {
    TreeIterator<EObject> _eAllContents = _self.eAllContents();
    final Iterator<Part> subParts = Iterators.<Part>filter(_eAllContents, Part.class);
    final Function1<Part, Integer> _function = (Part it) -> {
      return Integer.valueOf(Mass.computeMass(it));
    };
    Iterator<Integer> _map = IteratorExtensions.<Part, Integer>map(subParts, _function);
    final Function2<Integer, Integer, Integer> _function_1 = (Integer w1, Integer w2) -> {
      return Integer.valueOf(((w1).intValue() + (w2).intValue()));
    };
    final Integer subPartWeight = IteratorExtensions.<Integer>reduce(_map, _function_1);
    int _value = Mass.value(_self);
    return ((subPartWeight).intValue() + _value);
  }
  
  protected static void _privk3_print(final MassPartAspectProperties _self_, final Part _self) {
    String _name = _self.getName();
    String _plus = ("name: " + _name);
    String _plus_1 = (_plus + "\n");
    String _plus_2 = (_plus_1 + "min value: ");
    int _minValue = Mass.minValue(_self);
    String _plus_3 = (_plus_2 + Integer.valueOf(_minValue));
    String _plus_4 = (_plus_3 + "\n");
    String _plus_5 = (_plus_4 + "max value: ");
    int _maxValue = Mass.maxValue(_self);
    String _plus_6 = (_plus_5 + Integer.valueOf(_maxValue));
    String _plus_7 = (_plus_6 + "\n");
    String _plus_8 = (_plus_7 + "currentMass: ");
    int _currentMass = Mass.currentMass(_self);
    String _plus_9 = (_plus_8 + Integer.valueOf(_currentMass));
    InputOutput.<String>println(_plus_9);
  }
  
  protected static int _privk3_value(final MassPartAspectProperties _self_, final Part _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.value;
  }
  
  protected static void _privk3_value(final MassPartAspectProperties _self_, final Part _self, final int value) {
    _self_.value = value; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, value);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_maxValue(final MassPartAspectProperties _self_, final Part _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMaxValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.maxValue;
  }
  
  protected static void _privk3_maxValue(final MassPartAspectProperties _self_, final Part _self, final int maxValue) {
    _self_.maxValue = maxValue; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMaxValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, maxValue);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_minValue(final MassPartAspectProperties _self_, final Part _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getMinValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.minValue;
  }
  
  protected static void _privk3_minValue(final MassPartAspectProperties _self_, final Part _self, final int minValue) {
    _self_.minValue = minValue; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setMinValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, minValue);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
  
  protected static int _privk3_currentMass(final MassPartAspectProperties _self_, final Part _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentMass") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentMass;
  }
  
  protected static void _privk3_currentMass(final MassPartAspectProperties _self_, final Part _self, final int currentMass) {
    _self_.currentMass = currentMass; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentMass")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentMass);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
