package devops.cloud.cicd.controller;

import devops.cloud.cicd.dto.VersionResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${custom.base-path}")
public class VersionController {

    @GetMapping("/version")
    public VersionResponse hello() {
        return new VersionResponse("¡Hola Mundo v1.0.1 desde Spring Boot!");
    }
}
