package com.Gestion_projets.infrastructure.presistence.mapper;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.infrastructure.presistence.entity.NotificationEntity;
import com.Gestion_projets.infrastructure.presistence.entity.ProjectEntity;

import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Objects.requireNonNull;

public class NotificationMapper {
    public static Notification toDomain(NotificationEntity notificationEntity) {
        requireNonNull(notificationEntity, "Notification Entity could not be null!");

        Set<Project> projects = notificationEntity.getProjects().stream()
                .map(ProjectMapper::toDomain)
                .collect(Collectors.toSet());

        return Notification.builder()
                .id(notificationEntity.getId())
                .notificationType(notificationEntity.getNotificationType())
                .message(notificationEntity.getMessage())
                .dateNotification(notificationEntity.getDateNotification())
                .projects(projects)
                .build();
    }

    public static NotificationEntity toEntity(Notification notification) {
        requireNonNull(notification, "Notification Model could not be null!");

        Set<ProjectEntity> projects = notification.getProjects().stream()
                .map(ProjectMapper::toEntity)
                .collect(Collectors.toSet());

        return NotificationEntity.builder()
                .id(notification.getId())
                .notificationType(notification.getNotificationType())
                .message(notification.getMessage())
                .dateNotification(notification.getDateNotification())
                .projects(projects)
                .build();
    }
}