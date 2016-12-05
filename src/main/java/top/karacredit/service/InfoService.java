package top.karacredit.service;

import java.util.List;

import top.karacredit.model.dao.Info;

public interface InfoService {
	public int insertInfo(Info info);

	public int batchInsertInfo(List<Info> infoList);
}
