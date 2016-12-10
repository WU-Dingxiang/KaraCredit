package top.karacredit.service.impl;

import org.springframework.stereotype.Service;

import top.karacredit.model.dao.FinalScoreModel;
import top.karacredit.model.dao.IndexScoreModel;
import top.karacredit.model.dao.WeightModel;
import top.karacredit.service.SumModelService;

@Service("sumModelService")
public class SumModelServiceImpl implements SumModelService {

	@Override
	public FinalScoreModel getFinalScore(WeightModel weightModel, //
			IndexScoreModel indexScoreModel) {
		// 将权重数据包与指标得分数据包相结合
		int finalScore = combineModels(weightModel, indexScoreModel);
		// 生成新的数据包
		FinalScoreModel finalScoreModel = new FinalScoreModel(finalScore);
		// 写明储存位置，格式
		logFinalScoreModel(finalScoreModel);
		// 返回结果
		return finalScoreModel;
	}

	private void logFinalScoreModel(FinalScoreModel finalScoreModel) {
	}

	private int combineModels(WeightModel weightModel, IndexScoreModel indexScoreModel) {
		return 0;
	}
}
