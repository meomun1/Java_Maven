package com.itbulls.learnit.onlinestore.persistence.dto.converter;

import com.itbulls.learnit.onlinestore.persistence.dto.RoleDto;

public class RoleDtoToRoleConverter {

	public RoleDto convertRoleNameToRoleDtoWithOnlyRoleName(String roleName) {
		RoleDto roleDto = new RoleDto();
		roleDto.setRoleName(roleName);
		return roleDto;
	}

}