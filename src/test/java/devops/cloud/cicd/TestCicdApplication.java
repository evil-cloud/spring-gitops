package devops.cloud.cicd;

import org.springframework.boot.SpringApplication;

public class TestCicdApplication {

	public static void main(String[] args) {
		SpringApplication.from(CicdApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
