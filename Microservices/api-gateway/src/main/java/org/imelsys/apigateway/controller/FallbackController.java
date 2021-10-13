package org.imelsys.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	@GetMapping("/empServiceFallBack")
	public String empServiceFallBack() {
		return "Employee service is taking longer time than expected.Please retry after sometime";
	}
	@GetMapping("/deptServiceFallBack")
	public String deptServiceFallBack() {
		return "Deaprtment service is taking longer time than expected.Please retry after sometime";
		
	}
}
