package com.Gestion_projets.infrastructure.presistence.entity;


import java.util.List;

import com.Gestion_projets.domain.model.Collaborator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table (name="role")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class RoleEntity {

	@Id
	@GeneratedValue

	private Long id;
	private String name;
    private String privileges;

	// Relation One-to-Many (Un rôle peut être attribué à plusieurs collaborateurs)
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<CollaboratorEntity> collaborators;



}
