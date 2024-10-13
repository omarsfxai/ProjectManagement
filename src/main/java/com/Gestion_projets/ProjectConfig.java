package com.Gestion_projets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Gestion_projets.application.service.ProjectService;

import com.Gestion_projets.application.usescase.Project.*;
import com.Gestion_projets.domain.repository.ProjectRepository;

@Configuration

public class ProjectConfig {

	   @Bean
	
	public ProjectService projectService(GetProjectUseCase getProjectUseCase, GetListProjectUseCase getListProjectUseCase,
			SaveProjectUseCase saveProjectUseCase, UpdateProjectUseCase updateProjectUseCase,
			DeleteProjectUsesCase deleteProjectUseCase) {
		
	        return new ProjectService(getProjectUseCase, getListProjectUseCase, saveProjectUseCase, updateProjectUseCase, deleteProjectUseCase);

	}
	   
	   
	   @Bean 
	   public GetProjectUseCase getProjectUseCase(ProjectRepository projectRepository) {
		   
		   return new GetProjectUseCase(projectRepository);
	   }
	   
	   @Bean
	    public GetListProjectUseCase getListProjectUseCase(ProjectRepository projectRepository){
	        return new GetListProjectUseCase (projectRepository);
	    }
	   
	    @Bean
	    public SaveProjectUseCase saveProjectUseCase(ProjectRepository projectRepository){
	        return new SaveProjectUseCase (projectRepository);
	    }
	    

	    @Bean
	    public UpdateProjectUseCase updateProjectUseCase(ProjectRepository projectRepository){
	        return new UpdateProjectUseCase (projectRepository);
	    }

	    @Bean
	    public DeleteProjectUsesCase deleteProjectUseCase(ProjectRepository projectRepository){
	        return new DeleteProjectUsesCase (projectRepository);
	    }
}

