package devops.cloud.cicd.controller;

import devops.cloud.cicd.dto.HealthResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/health")
    public HealthResponse healthCheck() {
        return new HealthResponse("ok", applicationName + "-service");
    }
}
