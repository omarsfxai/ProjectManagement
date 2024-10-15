// src/main/java/com/Gestion_projets/application/usescase/Project/NotifProject.java
package com.Gestion_projets.application.usescase.Project;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.domain.model.Project;
import com.Gestion_projets.domain.repository.NotificationRepository;
import com.Gestion_projets.domain.repository.ProjectRepository;

import java.time.LocalDateTime;
import java.util.Set;

public class NotifProject {

    private final ProjectRepository projectRepository;
    private final NotificationRepository notificationRepository;

    public NotifProject(ProjectRepository projectRepository, NotificationRepository notificationRepository) {
        this.projectRepository = projectRepository;
        this.notificationRepository = notificationRepository;
    }

    public void updateProject(Project updatedProject) {
        Project existingProject = projectRepository.findProjectById(updatedProject.getId())
                .orElseThrow(() -> new IllegalArgumentException("Project not found"));

        if (existingProject.isUpdated(updatedProject)) {
            projectRepository.save(updatedProject);

            Notification notification = Notification.builder()
                    .message("Project has been updated")
                    .dateNotification(LocalDateTime.now())
                    .projects(Set.of(updatedProject))
                    .build();
            notificationRepository.save(notification);
        }
    }
}