/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.util.Map;

import javax.sql.DataSource;

public interface DataSourceChangeListener {
	public void onDataSourceChanged(Map<String, DataSource> dataSources);
}