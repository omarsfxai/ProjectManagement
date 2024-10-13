package com.Gestion_projets.application.service;

import java.util.List;

import com.Gestion_projets.application.usescase.Project.*;
import com.Gestion_projets.domain.model.Project;

public class ProjectService {

	 private final GetProjectUseCase getProjectUseCase;
	    private final GetListProjectUseCase getListProjectUseCase;
	    private final SaveProjectUseCase saveProjectUseCase;
	    private final UpdateProjectUseCase updateProjectUseCase;
	    private final DeleteProjectUsesCase deleteProjectUseCase;
	    
	    
	    
	    
		public ProjectService(GetProjectUseCase getProjectUseCase, GetListProjectUseCase getListProjectUseCase,
				SaveProjectUseCase saveProjectUseCase, UpdateProjectUseCase updateProjectUseCase,
				DeleteProjectUsesCase deleteProjectUseCase) {
			this.getProjectUseCase = getProjectUseCase;
			this.getListProjectUseCase = getListProjectUseCase;
			this.saveProjectUseCase = saveProjectUseCase;
			this.updateProjectUseCase = updateProjectUseCase;
			this.deleteProjectUseCase = deleteProjectUseCase;
		}

		public Project saveProject(Project project) {
			return saveProjectUseCase.execute(project);
		}
		
		public List<Project>getListProject(){
			return getListProjectUseCase.execute();
		}

		public Project getProjectById(Long id) {
			return  getProjectUseCase.execute(id);
		}
		
		
		public Project updateProject(Project project,Long id) {
			return updateProjectUseCase.execute(id, project);
		}
		
		public void deleteProjectById(Long id) {
			deleteProjectUseCase.execute(id);
		}
		
}
