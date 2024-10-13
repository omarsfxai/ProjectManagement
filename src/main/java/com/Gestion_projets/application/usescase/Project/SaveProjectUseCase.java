package com.Gestion_projets.application.usescase.Project;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.domain.repository.ProjectRepository;

public class SaveProjectUseCase {


	private final ProjectRepository projectRepository;

	public SaveProjectUseCase(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	   public Project execute(Project project) {
	    	return projectRepository.save(project);
	    }
}
