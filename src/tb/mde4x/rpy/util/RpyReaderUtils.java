package tb.mde4x.rpy.util;

import java.util.Map;

import com.telelogic.rhapsody.core.IRPModelElement;

import tb.mde4x.rpy.ModelElement;

public class RpyReaderUtils {

	public static String getUniqueId(IRPModelElement rpObject) {
		try {
			return getHashCodeFor(rpObject.getGUID());
		} catch (Exception e) {
			return getHashCodeFor(String.valueOf(rpObject.getMetaClass()) + ":" + rpObject.getFullPathName());
		} 
	}

	public static Object find(IRPModelElement rpObject, Class waitedType, String uniqueId, Map objects) {
		ModelElement object = (ModelElement)objects.get(uniqueId);
		if (object != null && !waitedType.isInstance(object)) {
			return null;
		} 
		return object;
	}

	public static Object find(Object rpObject, Class waitedType, Map objects) {
		if (rpObject instanceof IRPModelElement)
			return find((IRPModelElement)rpObject, waitedType, getUniqueId((IRPModelElement)rpObject), objects); 
		return null;
	}

	public static String getHashCodeFor(String s) {
		long h = 0L;
		int off = 0;
		char[] val = s.toCharArray();
		int len = s.length();
		for (int i = len; i > 0; i--)
			h = h * 37L + val[off++]; 
		return Long.toString(h);
	}

	public static void register(ModelElement rhpObject, String s, Map<String, ModelElement> objects) {
		objects.put(s, rhpObject);
	}

	public static void register(Object comObject, Object rhpObject, Map objects) {
		if (comObject instanceof IRPModelElement)
			register((ModelElement)rhpObject, getUniqueId((IRPModelElement)comObject), objects); 
	}
}
