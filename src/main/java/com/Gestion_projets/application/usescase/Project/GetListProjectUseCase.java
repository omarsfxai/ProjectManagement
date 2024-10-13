package com.Gestion_projets.application.usescase.Project;

import java.util.List;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.domain.repository.ProjectRepository;

public class GetListProjectUseCase {


	private final ProjectRepository projectRepository;

	public GetListProjectUseCase(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
	
	public List<Project>execute(){
		
		return projectRepository.findAllProject();
	}
	
}
