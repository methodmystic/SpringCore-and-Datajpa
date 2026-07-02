package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.telusko.repo.RepoLayer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {

		ApplicationContext Context = SpringApplication.run(Springboot1Application.class, args);
		RepoLayer repolayer1 = Context.getBean(RepoLayer.class);
		RepoLayer repolayer2 = Context.getBean(RepoLayer.class);

		System.out.println(repolayer1);
		System.out.println(repolayer2);



	}

}
