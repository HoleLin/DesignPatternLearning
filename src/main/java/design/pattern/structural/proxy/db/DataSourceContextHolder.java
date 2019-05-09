package design.pattern.structural.proxy.db;

/**
 * ClassName: DataSourceContextHolder
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class DataSourceContextHolder {
	private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<>();

	public static void setDBType(String dbType) {
		CONTEXT_HOLDER.set(dbType);
	}

	public static String getDBType() {
		return (String) CONTEXT_HOLDER.get();
	}

	public static void removeDBType() {
		CONTEXT_HOLDER.remove();
	}
}
