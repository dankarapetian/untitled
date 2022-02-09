package com.company.demo;
public class ClientD {


	private Integer id;
	private String name;
	private String email;
	private String phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone =phone;
	}
}
//import com.company.SpringApplication;
//import com.company.SpringBootApplication;
//import org.springframework.boot.SpringApplication;
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
//public class DemoApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);
//	}
//
//}
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Requestmapping("/user")
//public class DemoApplication {
//
//	@PostMapping("/create")
//	public UserDto  createUser(@RequestBody UserDTO user ){
//		return "User was created";
//	}
//    @GetMapping("/get")
//	public String getUser(){
//		return "Vasyl";
//	}
//}