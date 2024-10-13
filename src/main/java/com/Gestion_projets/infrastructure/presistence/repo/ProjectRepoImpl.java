package com.Gestion_projets.infrastructure.presistence.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.domain.repository.ProjectRepository;
import com.Gestion_projets.infrastructure.presistence.mapper.ProjectMapper;
import com.Gestion_projets.infrastructure.presistence.repo.jpa.ProjectRepo;


@Repository
public class ProjectRepoImpl implements ProjectRepository{

	
	private final ProjectRepo projectRepo;
	
	
	public ProjectRepoImpl(@Lazy ProjectRepo projectRepo) {
		this.projectRepo = projectRepo;
	}

	@Override
	public Project save(Project project) {
        return 	ProjectMapper.toDomain(projectRepo.save(ProjectMapper.toEntity(project)));

	}

	@Override
	public List<Project> findAllProject() {
	      return projectRepo.findAll()
	                .stream()
	                .map(ProjectMapper::toDomain)
	                .toList();
	}

	@Override
	public Optional<Project> findProjectById(Long id) {
		   return projectRepo.findById(id)
	                .map(ProjectMapper::toDomain);
	}

	@Override
	public Project updateProjectById(Project project, Long id) {
	      if(projectRepo.existsById(id)){
	            return ProjectMapper.toDomain(projectRepo.save(ProjectMapper.toEntity(project)));
	        }
	        return null;
	}

	@Override
	public void deleteProjectById(Long id) {
		projectRepo.deleteById(id);
		
	}

}
