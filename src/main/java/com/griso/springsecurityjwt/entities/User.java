package com.griso.springsecurityjwt.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Document
public class User {

	@Id
	private String id;

	@NotNull@NotBlank@NotNull@NotBlank
	@NotNull@NotBlank
	@NotNull
	@NotBlank
	private String username;
	
	private String password;
	
	private boolean active;

	private String roles = "";
	
	private String permissions = "";

	public User() {
	}

	public User(@NotNull @NotBlank String username, String password, boolean active, String roles, String permissions) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
		this.roles = roles;
		this.permissions = permissions;
	}

}