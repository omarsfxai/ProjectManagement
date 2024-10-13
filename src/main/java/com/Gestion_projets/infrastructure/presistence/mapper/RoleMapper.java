package com.Gestion_projets.infrastructure.presistence.mapper;

import static java.util.Objects.requireNonNull;

import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.infrastructure.presistence.entity.RoleEntity;

public class RoleMapper {

	// Convertir une entité RoleEntity en modèle Role
	public static Role toDomain(RoleEntity roleEntity) {
		requireNonNull(roleEntity, "Role Entity could not be null");

		return Role.builder()
				.id(roleEntity.getId())
				.name(roleEntity.getName())
				.privileges(roleEntity.getPrivileges())
				.build();
	}

	// Convertir un modèle Role en entité RoleEntity
	public static RoleEntity toEntity(Role role) {
		requireNonNull(role, "Role Model could not be null");

		return RoleEntity.builder()
				.id(role.getId())
				.name(role.getName())
				.privileges(role.getPrivileges())
				.build();
	}
}
