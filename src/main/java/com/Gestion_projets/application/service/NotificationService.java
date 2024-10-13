package com.Gestion_projets.application.service;

import com.Gestion_projets.application.usescase.Notification.*;
import com.Gestion_projets.domain.model.Notification;

import java.util.List;

public class NotificationService {
    private final GetNotificationUseCase getNotificationUseCase;
    private final GetListNotificationUseCase getListNotificationUseCase;
    private final SaveNotificationUseCase saveNotificationUseCase;
    private final DeleteNotificationUseCase deleteNotificationUseCase;

    public NotificationService(GetNotificationUseCase getNotificationUseCase,
                               GetListNotificationUseCase getListNotificationUseCase,
                               SaveNotificationUseCase saveNotificationUseCase,
                               DeleteNotificationUseCase deleteNotificationUseCase
                               ) {

        this.getNotificationUseCase = getNotificationUseCase;
        this.getListNotificationUseCase = getListNotificationUseCase;
        this.saveNotificationUseCase = saveNotificationUseCase;
        this.deleteNotificationUseCase = deleteNotificationUseCase;
    }

    public Notification saveNotification(Notification notification) {
        return saveNotificationUseCase.execute(notification);
    }

    public List<Notification> getListNotification() {
        return getListNotificationUseCase.execute();
    }

    public Notification getNotificationById(Long id) {
        return getNotificationUseCase.execute(id);
    }

    public void deleteNotificationById(Long id) {
        deleteNotificationUseCase.execute(id);
    }

}


