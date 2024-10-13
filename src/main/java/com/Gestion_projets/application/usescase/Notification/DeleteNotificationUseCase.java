package com.Gestion_projets.application.usescase.Notification;

import com.Gestion_projets.domain.repository.NotificationRepository;

public class DeleteNotificationUseCase {
    private final NotificationRepository notificationRepository;

    public DeleteNotificationUseCase(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void execute(Long id) {
        notificationRepository.deleteNotificationById(id);
    }
}
