package jp.teqluz.egatsm.csv_migration.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllianceCsvLoadService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public AllianceCsvLoadService() {
        logger.info("############### AllianceCsvLoadService インスタンス生成開始 ###############");
        logger.info("############### AllianceCsvLoadService インスタンス生成終了 ###############");
    }

    public void loadCsvData() {
        logger.info("############### loadCsvData 開始 ###############");
    }
}
