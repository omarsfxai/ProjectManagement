package com.Gestion_projets.domain.repository;

import java.util.List;
import java.util.Optional;

import com.Gestion_projets.domain.model.Project;

public interface ProjectRepository {

	
	Project save (Project project);
	List <Project>findAllProject();
	Optional<Project>findProjectById(Long id);
	Project updateProjectById(Project project,Long id);
	void deleteProjectById(Long id);
	
}
