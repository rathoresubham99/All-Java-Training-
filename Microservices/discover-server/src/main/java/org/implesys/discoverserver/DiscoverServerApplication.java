package org.implesys.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class DiscoverServerApplication {

	public static void main(String[] args) {
		log.info("Starting service Discovery server");
		SpringApplication.run(DiscoverServerApplication.class, args);
		System.out.println("In Main Class");

	}

}
