package com.frank.eurekaservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.eurekaservice.controller.dto.Person;

@RestController
@RequestMapping("/")
public class MyController {

	@RequestMapping("/my")
	public Person myPerson() {
		Person p = new Person();
		p.setName("Frank");
		p.setAge("18");
		return p;
	}
}
