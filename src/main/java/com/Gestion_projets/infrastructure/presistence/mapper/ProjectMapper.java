package com.Gestion_projets.infrastructure.presistence.mapper;

import static java.util.Objects.requireNonNull;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.infrastructure.presistence.entity.ProjectEntity;

import java.util.stream.Collectors;

public class ProjectMapper {

	 public static Project toDomain(ProjectEntity projectEntity){
	        requireNonNull(projectEntity,"project Entity could not be null!");
	        return Project.builder()
	                .id(projectEntity.getId())
	                .name(projectEntity.getName())
	                .description(projectEntity.getDescription())
	                .status(projectEntity.getStatus())
	                .priority(projectEntity.getPriority())
	                .progress(projectEntity.getProgress())
					.cost(projectEntity.getCost())
					.budget(projectEntity.getBudget())
					.build();

	    }
	 
	    public static ProjectEntity toEntity( Project project){
	        requireNonNull(project);
	        return ProjectEntity.builder()
	        	    .id(project.getId())
	                .name(project.getName())
	                .description(project.getDescription())
	                .status(project.getStatus())
	                .priority(project.getPriority())
	                .progress(project.getProgress())
	                .cost(project.getCost())
	                .budget(project.getBudget())
	                .build();
	    }
}
