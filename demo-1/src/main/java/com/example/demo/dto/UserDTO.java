package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDTO {
	private int id;
	private String email;
	private String password;
	private String role;
	private String username;

}


