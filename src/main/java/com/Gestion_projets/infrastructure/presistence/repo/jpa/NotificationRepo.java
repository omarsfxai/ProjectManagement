package com.Gestion_projets.infrastructure.presistence.repo.jpa;

import com.Gestion_projets.infrastructure.presistence.entity.NotificationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<NotificationEntity, Long> {
}
