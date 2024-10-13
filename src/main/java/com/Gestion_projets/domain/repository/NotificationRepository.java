package com.Gestion_projets.domain.repository;


import com.Gestion_projets.domain.model.Notification;

import java.util.List;
import java.util.Optional;

public interface NotificationRepository {
    List<Notification> findAllNotifications();

    Optional<Notification> findNotificationById(Long id);

    void deleteNotificationById(Long id);

    Notification save(Notification notification);

}
