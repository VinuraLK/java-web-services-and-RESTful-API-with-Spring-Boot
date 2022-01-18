package com.in28minutes.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {
	
	//field1,Field2
	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		SomeBean someBean = new SomeBean("value1","value 2","value 3");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFIlter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters);
		
		return  someBean;
		}
	
	//field2,field3
	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBeans() {
		return Arrays.asList(new SomeBean("values1","value 2","value 3"),
				new SomeBean("value12","value22","value32"));
}
}