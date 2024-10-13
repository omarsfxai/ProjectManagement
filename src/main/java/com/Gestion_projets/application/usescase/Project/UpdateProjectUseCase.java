package com.Gestion_projets.application.usescase.Project;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.domain.repository.ProjectRepository;

public class UpdateProjectUseCase {

	

	private final ProjectRepository projectRepository;

	public UpdateProjectUseCase(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	   public Project execute(Long id,Project project) {
	    	return projectRepository.updateProjectById(project, id);
	    }
}
