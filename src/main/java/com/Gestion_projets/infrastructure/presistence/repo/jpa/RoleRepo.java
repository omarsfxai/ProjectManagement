package com.Gestion_projets.infrastructure.presistence.repo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Gestion_projets.infrastructure.presistence.entity.RoleEntity;

public interface RoleRepo extends JpaRepository<RoleEntity,Long>{

}
