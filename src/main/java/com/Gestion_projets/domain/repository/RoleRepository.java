package com.Gestion_projets.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Gestion_projets.domain.model.Role;

public interface RoleRepository {

	
	Role save (Role role);
	List <Role>findAllRole();
	Optional<Role>findRoleById(Long id);
	Role updateRoleById(Role role,Long id);
	void deleteRoleById(Long id);
	
}
