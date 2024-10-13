package com.Gestion_projets.application.usescase.Project;

import com.Gestion_projets.domain.repository.ProjectRepository;

public class DeleteProjectUsesCase {

	private final ProjectRepository projectRepository;

	public DeleteProjectUsesCase(ProjectRepository projectRepository) {
		this.projectRepository = projectRepository;
	}
		public void execute(Long id) {

			projectRepository.deleteProjectById(id);	}
}
