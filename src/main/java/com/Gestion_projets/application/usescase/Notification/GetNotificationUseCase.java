package com.Gestion_projets.application.usescase.Notification;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.domain.repository.NotificationRepository;

public class GetNotificationUseCase {
    private final NotificationRepository notificationRepository;

    public GetNotificationUseCase(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification execute(Long id) {
        return notificationRepository.findNotificationById(id).orElse(null);
    }
}
