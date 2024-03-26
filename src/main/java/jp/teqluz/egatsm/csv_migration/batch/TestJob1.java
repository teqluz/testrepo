package jp.teqluz.egatsm.csv_migration.batch;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestJob1 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.info("- ApplicationRunner -");
        List<String> argsList = args.getNonOptionArgs();
        for(int i=0; i<argsList.size(); i++) {
            logger.info("%s:%s".formatted(i, argsList.get(i)));
        }
        logger.info("処理が実行されました。");
    }

}
