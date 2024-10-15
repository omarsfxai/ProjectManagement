// src/main/java/com/Gestion_projets/infrastructure/presistence/mapper/ProjectMapper.java
package com.Gestion_projets.infrastructure.presistence.mapper;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.infrastructure.presistence.entity.ProjectEntity;

import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class ProjectMapper {

	public static Project toDomain(ProjectEntity projectEntity) {
		requireNonNull(projectEntity, "Project Entity could not be null!");
		return Project.builder()
				.id(projectEntity.getId())
				.name(projectEntity.getName())
				.description(projectEntity.getDescription())
				.status(projectEntity.getStatus())
				.priority(projectEntity.getPriority())
				.progress(projectEntity.getProgress())
				.cost(String.valueOf(projectEntity.getCost()))
				.budget(String.valueOf(projectEntity.getBudget()))
				.build();
	}

	public static ProjectEntity toEntity(Project project) {
		requireNonNull(project, "Project could not be null!");
		return ProjectEntity.builder()
				.id(project.getId())
				.name(project.getName())
				.description(project.getDescription())
				.status(project.getStatus())
				.priority(project.getPriority())
				.progress(project.getProgress())
				.cost(Double.valueOf(project.getCost()))
				.budget(Double.valueOf(project.getBudget()))
				.build();
	}
}