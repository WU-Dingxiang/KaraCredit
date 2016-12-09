package top.karacredit.service.impl;

import java.util.Random;

import org.springframework.stereotype.Service;

import top.karacredit.model.dao.SourceData;
import top.karacredit.model.dao.SourceDataItem;
import top.karacredit.service.DataProcessService;

@Service("dataProcessService")
public class DataProcessServiceImpl implements DataProcessService {
	@Override
	public SourceData cleanData(SourceData data) {
		if (data.hasMissingItems()) {
			if (data.n < data.N / 2) {
				data.deleteMissingItems();
			}
		}
		if (data.hasFormatInvalidItems()) {
			data.standardizeDataFormat();
		}
		if (data.hasRepeatingItems()) {
			data.logRepeatingCount();
		}
		return data;
	}

	@Override
	public boolean gtm(SourceData data, SourceDataItem item) {
		double X1 = item.getValue();
		double u = data.getAverage(item);
		double o = data.getStandardDeviation(item);
		if (u - o * 2 < X1 && X1 < u + o * 2) {
			return true;
		}
		double X = item.getSampledDataAverage();
		double s = item.getStandardDeviation();
		double G1 = (X1 - X) / s;
		if (G1 > item.getG(0)) {
			return false;
		}
		return true;
	}

	@Override
	public SourceData gatherProperty(SourceData data) {
		SourceData newData = data.combineItems();
		for (SourceDataItem item : data.getItems()) {
			if (item.isQuantitative()) {
				double average = item.getAverage();
				SourceDataItem newItem = newData.createNewItem(item, average);
				newData.addItem(newItem);
			} else {
				if (item.isIgnorable())
					data.logIgnorableItem(item);
			}
		}
		return newData;
	}

	@Override
	public SourceData progressiveSample(SourceData data) {
		data.layerAnalyze();
		Random r = new Random();
		int M0 = r.nextInt(data.N / 2);
		data.setM0(M0);
		while (data.ex >= data.e) {
			M0 += data.deltaM;
			data.setM0(M0);
		}
		return data;
	}
}
