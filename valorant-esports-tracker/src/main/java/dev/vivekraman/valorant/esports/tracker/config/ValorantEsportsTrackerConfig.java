package dev.vivekraman.valorant.esports.tracker.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValorantEsportsTrackerConfig {
  @Bean
  public GroupedOpenApi valorantEsportsTrackerApiGroup() {
    return GroupedOpenApi.builder()
        .group(Constants.MODULE_NAME)
        .packagesToScan("dev.vivekraman.valorant.esports.tracker.controller")
        .build();
  }
}
