package com.Gestion_projets.infrastructure.presistence.repo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gestion_projets.infrastructure.presistence.entity.ProjectEntity;

public interface ProjectRepo extends JpaRepository<ProjectEntity,Long>{

}
