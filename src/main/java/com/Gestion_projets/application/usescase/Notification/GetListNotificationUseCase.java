package com.Gestion_projets.application.usescase.Notification;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.domain.repository.NotificationRepository;

import java.util.List;

public class GetListNotificationUseCase {
    private final NotificationRepository notificationRepository;

    public GetListNotificationUseCase(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> execute() {
        return notificationRepository.findAllNotifications();
    }
}
