package top.karacredit.service;

import top.karacredit.model.dao.FinalScoreModel;
import top.karacredit.model.dao.IndexScoreModel;
import top.karacredit.model.dao.WeightModel;

public interface SumModelService {
	FinalScoreModel getFinalScore(WeightModel weightModel, IndexScoreModel indexScoreModel);
}
