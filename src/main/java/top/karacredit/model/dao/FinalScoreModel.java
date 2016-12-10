package top.karacredit.model.dao;

import java.util.List;

public class FinalScoreModel {

	public final int N = 0;
	public int n;
	public int o;
	public int u;
	public int ex;
	public int e;
	public int deltaM;

	public FinalScoreModel(int finalScore) {
		// TODO Auto-generated constructor stub
	}

	public boolean hasMissingItems() {
		// TODO Auto-generated method stub
		return false;
	}

	public void deleteMissingItems() {
		// TODO Auto-generated method stub
		
	}

	public boolean hasFormatInvalidItems() {
		// TODO Auto-generated method stub
		return false;
	}

	public void standardizeDataFormat() {
		// TODO Auto-generated method stub
		
	}

	public boolean hasRepeatingItems() {
		// TODO Auto-generated method stub
		return false;
	}

	public void logRepeatingCount() {
		// TODO Auto-generated method stub
		
	}

	public double getAverage(SourceDataItem item) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getStandardDeviation(SourceDataItem item) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void layerAnalyze() {
		// TODO Auto-generated method stub
		
	}

	public void setM0(int m0) {
		// TODO Auto-generated method stub
		
	}

	public List<SourceDataItem> getItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public FinalScoreModel combineItems() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addItem(SourceDataItem item) {
		// TODO Auto-generated method stub
		
	}

	public SourceDataItem createNewItem(SourceDataItem item, double average) {
		// TODO Auto-generated method stub
		return null;
	}

	public void logIgnorableItem(SourceDataItem item) {
		// TODO Auto-generated method stub
		
	}
}
