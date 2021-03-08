package nz.ac.op.cs.SB_HSQL_Prj;

import nz.ac.op.cs.SB_HSQL_Prj.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SbHsqlPrjApplication {
	@Bean
	public UserService getUserService() {
		return new UserService();

	}

	public static void main(String[] args) {
		SpringApplication.run(SbHsqlPrjApplication.class, args);
	}

}
