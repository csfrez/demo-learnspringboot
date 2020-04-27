package com.csfrez.demo;

import com.csfrez.demo.init.ApplicationContextInitializerDemo;
import com.csfrez.demo.listen.DemoSpringApplicationRunListener;
import com.csfrez.demo.service.DemoService;
import com.csfrez.demo.service.TransactionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoLearnspringbootApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DemoLearnspringbootApplication.class, args);

//		SpringApplication springApplication = new SpringApplication(DemoLearnspringbootApplication.class);
//		springApplication.setWebApplicationType(WebApplicationType.SERVLET); //强制使用WebMvc环境
//		springApplication.setBannerMode(Banner.Mode.OFF); //不打印Banner
//		springApplication.run(args);

//		SpringApplication springApplication = new SpringApplication(DemoLearnspringbootApplication.class);
//		springApplication.addInitializers(new ApplicationContextInitializerDemo());
//		springApplication.run(args);

		ConfigurableApplicationContext ctx = SpringApplication.run(DemoLearnspringbootApplication.class, args);
		TransactionService transactionService = ctx.getBean(TransactionService.class);
//		transactionService.test1();
		transactionService.test2();
	}

}
