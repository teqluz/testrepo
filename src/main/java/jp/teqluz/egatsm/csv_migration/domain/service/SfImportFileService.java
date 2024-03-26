package jp.teqluz.egatsm.csv_migration.domain.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SfImportFileService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final AllianceCsvLoadService allianceCsvLoadService;

    @Autowired
    public SfImportFileService(
        AllianceCsvLoadService allianceCsvLoadService
    ) {
        this.allianceCsvLoadService = allianceCsvLoadService;
    }

    public void importCollectingData() {
        logger.info("############### testrepo Sfインポートファイル作成 開始　###############");
        allianceCsvLoadService.loadCsvData();
        logger.info("############### testrepo Sfインポートファイル作成 終了 ###############");
    }
}
