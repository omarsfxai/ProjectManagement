package com.Gestion_projets.application.usescase.Role;

import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.domain.repository.RoleRepository;

public class GetRoleUseCase {

    private final RoleRepository roleRepository;

    public GetRoleUseCase(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    
    public Role execute(Long id) {
    	return roleRepository.findRoleById(id).get();
    }
}
