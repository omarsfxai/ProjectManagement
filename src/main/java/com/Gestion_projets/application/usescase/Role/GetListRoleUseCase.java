package com.Gestion_projets.application.usescase.Role;

import java.util.List;

import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.domain.repository.RoleRepository;

public class GetListRoleUseCase {

	private final RoleRepository roleRepository;

	public GetListRoleUseCase(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	public List<Role>execute(){
		
		return roleRepository.findAllRole();
	}
	
	
}
