package dev.vivekraman.valorant.esports.tracker.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "dev.vivekraman.*")
public class BackendModuleValorantEsportsTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendModuleTemplateApplication.class, args);
	}
}
