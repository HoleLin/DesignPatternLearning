package design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: ContainerSingleton
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/5
 */

public class ContainerSingleton {
	private static Map<String, Object> singletonMap = new HashMap<>();

	private ContainerSingleton(){

	}
	public static void register(String key, Object instance) {
		if (StringUtils.isNotBlank(key) && instance != null) {
			if (!singletonMap.containsKey(key)) {
				singletonMap.put(key, instance);
			}
		}
	}

	public static Object getInstance(String key) {
		return singletonMap.get(key);
	}

	public static void unregister(String key) {
		if (StringUtils.isNotBlank(key)) {
			singletonMap.remove(key);
		}
	}
}
