package top.karacredit.service;

import top.karacredit.model.dao.SourceData;
import top.karacredit.model.dao.SourceDataItem;

public interface DataProcessService {
	SourceData cleanData(SourceData data);
	boolean gtm(SourceData data, SourceDataItem item);
	SourceData gatherProperty(SourceData data);
	SourceData progressiveSample(SourceData data);
	SourceData collectData(SourceData data);
}
