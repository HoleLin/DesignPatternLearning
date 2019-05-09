package design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.activation.DataContentHandler;

/**
 * ClassName: DynamicDataSource
 *
 * @author HoleLin
 * @version 1.0
 * @date 2019/5/9
 */

public class DynamicDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getDBType();
	}
}
