package com.Gestion_projets.domain.model;


import com.Gestion_projets.infrastructure.presistence.entity.RoleEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder

public class Collaborator {
    private Long id;
    private String firstname;
    private String lastname;
    private String mobile;
    private String email;
    private String password;


    @ManyToOne
    @JoinColumn(name = "role_id")  // Crée une colonne "role_id" dans la table CollaboratorEntity
    private RoleEntity role;
}
