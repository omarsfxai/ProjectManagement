package com.Gestion_projets.infrastructure.presistence.mapper;

import static java.util.Objects.requireNonNull;

import com.Gestion_projets.domain.model.Collaborator;
import com.Gestion_projets.domain.model.Role;
import com.Gestion_projets.infrastructure.presistence.entity.CollaboratorEntity;
import com.Gestion_projets.infrastructure.presistence.entity.RoleEntity;

public class CollaboratorMapper {

    // Convertir une entité CollaboratorEntity en modèle Collaborator (incluant le rôle)
    public static Collaborator toDomain(CollaboratorEntity collaboratorEntity) {
        requireNonNull(collaboratorEntity, "Collaborator Entity could not be null");

        return Collaborator.builder()
                .id(collaboratorEntity.getId())
                .firstname(collaboratorEntity.getFirstname())
                .lastname(collaboratorEntity.getLastname())
                .mobile(collaboratorEntity.getMobile())
                .email(collaboratorEntity.getEmail())
                .password(collaboratorEntity.getPassword())
                .build();
    }

    // Convertir un modèle Collaborator en entité CollaboratorEntity (incluant le rôle)
    public static CollaboratorEntity toEntity(Collaborator collaborator) {
        requireNonNull(collaborator, "Collaborator Model could not be null");

        return CollaboratorEntity.builder()
                .id(collaborator.getId())
                .firstname(collaborator.getFirstname())
                .lastname(collaborator.getLastname())
                .mobile(collaborator.getMobile())
                .email(collaborator.getEmail())
                .password(collaborator.getPassword())
                .build();
    }

    // Méthodes supplémentaires pour mapper RoleEntity à Role
    public static Role toDomain(RoleEntity roleEntity) {
        if (roleEntity == null) {
            return null;
        }
        return Role.builder()
                .id(roleEntity.getId())
                .name(roleEntity.getName())
                .privileges(roleEntity.getPrivileges())
                .build();
    }

    public static RoleEntity toEntity(Role role) {
        if (role == null) {
            return null;
        }
        return RoleEntity.builder()
                .id(role.getId())
                .name(role.getName())
                .privileges(role.getPrivileges())
                .build();
    }
}
