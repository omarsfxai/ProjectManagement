package com.Gestion_projets.application.usescase.Role;

import com.Gestion_projets.domain.repository.RoleRepository;

public class DeleteRoleUseCase {
	
private final RoleRepository roleRepository;

public DeleteRoleUseCase(RoleRepository roleRepository) {
	this.roleRepository = roleRepository;
}
	public void execute(Long id) {

		roleRepository.deleteRoleById(id);	}
}
