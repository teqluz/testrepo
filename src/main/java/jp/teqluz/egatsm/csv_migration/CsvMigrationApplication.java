package jp.teqluz.egatsm.csv_migration;

import jp.teqluz.egatsm.csv_migration.domain.service.SfImportFileService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CsvMigrationApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext context =
					 SpringApplication.run(CsvMigrationApplication.class, args)) {
			SfImportFileService service = context.getBean(SfImportFileService.class);
			service.importCollectingData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
