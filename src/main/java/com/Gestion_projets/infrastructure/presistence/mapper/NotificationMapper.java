package com.Gestion_projets.infrastructure.presistence.mapper;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.infrastructure.presistence.entity.NotificationEntity;

import static java.util.Objects.requireNonNull;

public class NotificationMapper {
    public static Notification toDomain(NotificationEntity notificationEntity) {
        requireNonNull(notificationEntity, "Notification Entity could not be null!");
        return Notification.builder()
                .id(notificationEntity.getId())
                .notificationType(notificationEntity.getNotificationType()) // Match field names
                .message(notificationEntity.getMessage())
                .dateNotification(notificationEntity.getDateNotification())
                .build();
    }


    public static NotificationEntity toEntity(Notification notification) {
        requireNonNull(notification, "Notification Model could not be null!");
        return NotificationEntity.builder()
                .id(notification.getId())
                .notificationType(notification.getNotificationType()) // Match field names
                .message(notification.getMessage())
                .dateNotification(notification.getDateNotification())
                .build();
    }
}
