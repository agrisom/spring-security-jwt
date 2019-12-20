package com.griso.springsecurityjwt.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class UserDto {

	private String id;
	private String username;
	private String password;
	private boolean active;
	private String roles;
	private String permissions;

	public UserDto() {
	}

	public List<String> getRoleList() {
		List<String> roleList = new ArrayList<>();
		if(!roles.trim().isEmpty()) {
			roleList.addAll(Arrays.asList(roles.split(";")));
		}

		return roleList;
	}

	public List<String> getPermissionList() {
		List<String> permissionList = new ArrayList<>();
		if(!permissions.trim().isEmpty()) {
			permissionList.addAll(Arrays.asList(permissions.split(";")));
		}

		return permissionList;
	}

	public boolean isAdmin() {
		return getRoleList().contains("ADMIN");
	}

}