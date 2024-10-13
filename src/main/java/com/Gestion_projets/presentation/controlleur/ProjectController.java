package com.Project_management.presentation.controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gestion_projets.application.service.ProjectService;
import com.Gestion_projets.domain.model.Project;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class ProjectController {

	
    private final ProjectService projectService;

  
    
    public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

    
	@GetMapping("/all")
    public List<Project>getListProject(){
    	return projectService.getListProject();
    }
    
    @GetMapping("/project/{id}")
    public Project getProjectById(@PathVariable Long id) {
    	return projectService.getProjectById(id);
    }
    
    @PostMapping("/addProject")
    public Project saveProject(@RequestBody Project project ) {
    	
    	return projectService.saveProject(project);
    }
    
    @PutMapping("/updateProject/{id}")
    public Project updateProject(@RequestBody Project project,@PathVariable Long id) {
    	return projectService.updateProject(project, id);
    }
    
    
    @DeleteMapping("/deleteProject/{id}")
    public void deleteProject(@PathVariable Long id) {
    	projectService.deleteProjectById(id);
    }
}
