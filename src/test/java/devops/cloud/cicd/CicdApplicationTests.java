package devops.cloud.cicd;

import devops.cloud.cicd.dto.HealthResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CicdApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        // Validamos que la aplicación arranque sin problemas
    }

    @Test
    void healthCheckShouldReturnOk() {
        // Hacemos una petición al endpoint de health check
        String url = "http://localhost:" + port + "/health";
        HealthResponse response = this.restTemplate.getForObject(url, HealthResponse.class);

        // Validamos que la respuesta sea correcta
        assertThat(response).isNotNull();
        assertThat(response.getStatus()).isEqualTo("ok");
        assertThat(response.getServiceName()).endsWith("-service");
    }
}
