package com.masterhr.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterhr.user.message.MasterHrUserResponseType;
import com.masterhr.user.model.Users;
import com.masterhr.user.repository.UsersRepository;
import com.masterhr.user.vo.Employee;
import com.masterhr.user.vo.MasterHrUserResponse;

@RestController
public class EmployeeController {
	
	@Autowired
	private UsersRepository UsersRepository;
	
	@GetMapping("/getData")
	public String getData() {
		System.out.println("samples");
		return "hello";
		
	}
	@GetMapping("/getEmployee")
	public MasterHrUserResponse getEmployee() {
		List<Users> user=UsersRepository.findByName("prasad");
		System.out.println(user);
		Employee employee=new Employee();
		employee.setEmail("sai@gmail.com");
		employee.setId(123);
		employee.setfName("Sai");
		employee.setlName("Ram");
		return new MasterHrUserResponse(MasterHrUserResponseType.Success,employee);
		
	}

}
