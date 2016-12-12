package top.karacredit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import top.karacredit.model.dao.SourceData;
import top.karacredit.model.dao.SourceDataItem;
import top.karacredit.service.InitModelService;

@Service("initModelService")
public class InitModelServiceImpl implements InitModelService {

	@Override
	public SourceData completeAndCheckIndex(SourceData applicantData, SourceData validData) {
		if (applicantData == null || applicantData == null)
			return null;
		List<SourceDataItem> applicantDataItems = applicantData.getItems();
		List<SourceDataItem> validDataItems = validData.getItems();
		if (applicantDataItems.size() != validDataItems.size())
			return null;
		List<SourceDataItem> newItems = new ArrayList<>();
		for (int i = 0, size = applicantDataItems.size(); i < size; i++) {
			SourceDataItem appItem = applicantDataItems.get(i);
			SourceDataItem valItem = validDataItems.get(i);
			if (appItem != null || valItem != null) {
				if (appItem == null) {
					newItems.add(valItem);
				} else if (valItem == null) {
					newItems.add(appItem);
				} else {
					newItems.add(checkItems(valItem, appItem));
				}
			}
		}
		return new SourceData(newItems);
	}

	private SourceDataItem checkItems(SourceDataItem valItem, SourceDataItem appItem) {
		return null;
	}
}
