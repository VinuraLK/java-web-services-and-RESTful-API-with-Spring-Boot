package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("values1","value 2","value 3");
		}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBeans() {
		return Arrays.aslist (new SomeBean("values1","value 2","value 3"),
				new Somebean("value12","value22","value33");
}
