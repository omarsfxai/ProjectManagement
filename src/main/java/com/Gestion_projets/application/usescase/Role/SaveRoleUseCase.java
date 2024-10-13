package com.Gestion_projets.application.usescase.Role;

import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.domain.repository.RoleRepository;

public class SaveRoleUseCase {

    private final RoleRepository roleRepository;

    public SaveRoleUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    
    public Role execute(Role role) {
    	return roleRepository.save(role);
    }
}
