package com.Gestion_projets.application.usescase.Project;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.domain.repository.ProjectRepository;

public class GetProjectUseCase {
	
	private final ProjectRepository projectRepository;

	public GetProjectUseCase(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
    public Project execute(Long id) {
    	return projectRepository.findProjectById(id).get();
    }
}
