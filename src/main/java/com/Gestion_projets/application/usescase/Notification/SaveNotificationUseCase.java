package com.Gestion_projets.application.usescase.Notification;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.domain.repository.NotificationRepository;

public class SaveNotificationUseCase {
    private final NotificationRepository notificationRepository;

    public SaveNotificationUseCase(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification execute(Notification notification) {
        return notificationRepository.save(notification);
    }
}
