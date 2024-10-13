package com.Gestion_projets.infrastructure.presistence.repo.jpa;


import com.Gestion_projets.infrastructure.presistence.entity.CollaboratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollabRepo extends JpaRepository<CollaboratorEntity, Long> {

}
