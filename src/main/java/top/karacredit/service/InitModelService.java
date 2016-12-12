package top.karacredit.service;

import top.karacredit.model.dao.SourceData;

public interface InitModelService {
	public SourceData completeAndCheckIndex(SourceData applicantData, SourceData validData) ;
}
