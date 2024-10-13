package com.Gestion_projets.application.usescase.Role;

import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.domain.repository.RoleRepository;

public class UpdateRoleUseCase {

	
	   private final RoleRepository roleRepository;

	    public UpdateRoleUseCase(RoleRepository roleRepository) {
	        this.roleRepository = roleRepository;
	    }
	    
	    public Role execute(Long id,Role role) {
	    	return roleRepository.updateRoleById(role, id);
	    }
}
