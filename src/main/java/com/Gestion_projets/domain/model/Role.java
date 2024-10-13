package com.Gestion_projets.domain.model;

import java.util.List;

import com.Gestion_projets.infrastructure.presistence.entity.CollaboratorEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class Role {


	private Long id;
	private String name;
	private String privileges;

	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<CollaboratorEntity> collaborators;

}
