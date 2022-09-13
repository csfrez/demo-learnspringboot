package com.csfrez.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoLearnspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoLearnspringbootApplication.class, args);

//		SpringApplication springApplication = new SpringApplication(DemoLearnspringbootApplication.class);
//		springApplication.setWebApplicationType(WebApplicationType.SERVLET); //强制使用WebMvc环境
//		springApplication.setBannerMode(Banner.Mode.OFF); //不打印Banner
//		springApplication.run(args);

//		SpringApplication springApplication = new SpringApplication(DemoLearnspringbootApplication.class);
//		springApplication.addInitializers(new ApplicationContextInitializerDemo());
//		springApplication.run(args);

//		ConfigurableApplicationContext ctx = SpringApplication.run(DemoLearnspringbootApplication.class, args);
//		TransactionService transactionService = ctx.getBean(TransactionService.class);
//		transactionService.test1();
//		transactionService.test2();
	}

}
