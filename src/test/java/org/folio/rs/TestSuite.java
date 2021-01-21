package org.folio.rs;

import org.folio.rs.controller.ConfigurationsControllerTest;
import org.folio.rs.controller.LocationMappingsControllerTest;
import org.folio.rs.integration.KafkaIntegrationTest;
import org.folio.rs.service.SecurityManagerServiceTest;
import org.junit.jupiter.api.Nested;


public class TestSuite {

  @Nested
  class ConfigurationsControllerTestNested extends ConfigurationsControllerTest {

  }

  @Nested
  class LocationMappingsControllerTestNested extends LocationMappingsControllerTest {

  }

  @Nested
  class SecurityManagerServiceTestNested extends SecurityManagerServiceTest {

  }

  @Nested
  class KafkaIntegrationTestNested extends KafkaIntegrationTest {

  }
}
