package com.Gestion_projets.infrastructure.presistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "Collaborator")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CollaboratorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstname;
    private String lastname;
    private String mobile;
    private String email;
    private String password;

    // Relation Many-to-One avec RoleEntity
    @ManyToOne
    @JoinColumn(name = "role_id")  // La colonne "role_id" dans la table des collaborateurs
    private RoleEntity role;
}
