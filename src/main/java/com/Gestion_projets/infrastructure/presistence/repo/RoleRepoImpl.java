package com.Gestion_projets.infrastructure.presistence.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.domain.repository.RoleRepository;
import com.Gestion_projets.infrastructure.presistence.mapper.RoleMapper;
import com.Gestion_projets.infrastructure.presistence.repo.jpa.RoleRepo;

@Repository
public class RoleRepoImpl implements RoleRepository {

	private final RoleRepo roleRepo;

	
	
	public RoleRepoImpl(@Lazy RoleRepo  roleRepo) {
		this.roleRepo = roleRepo;
	}

	@Override
	public Role save(Role role) {
        return RoleMapper.toDomain(roleRepo.save(RoleMapper.toEntity(role)));

	}

	@Override
	public List<Role> findAllRole() {
        return roleRepo.findAll()
                .stream()
                .map(RoleMapper::toDomain)
                .toList();
	}

	@Override
	public Optional<Role> findRoleById(Long id) {
		   return roleRepo.findById(id)
	                .map(RoleMapper::toDomain);
	}

	@Override
	public Role updateRoleById(Role role, Long id) {
	       if(roleRepo.existsById(id)){
	            return RoleMapper.toDomain(roleRepo.save(RoleMapper.toEntity(role)));
	        }
	        return null;
	}

	@Override
	public void deleteRoleById(Long id) {
        roleRepo.deleteById(id);
 		
	}
}

