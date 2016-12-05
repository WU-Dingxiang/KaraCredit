package top.karacredit.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import top.karacredit.model.dao.Info;
import top.karacredit.service.InfoService;

@Service("infoService")
public class InfoServiceImpl implements InfoService {
	private static Logger logger = Logger.getLogger(AuthServiceImpl.class);

	@Override
	public int insertInfo(Info info) {
		logger.info("insertInfo invoke");
		return 0;
	}

	@Override
	public int batchInsertInfo(List<Info> infoList) {
		logger.info("batchInsertInfo invoke");
		return 0;
	}
}
