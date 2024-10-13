package com.Gestion_projets;

import com.Gestion_projets.application.service.NotificationService;
import com.Gestion_projets.application.usescase.Notification.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Gestion_projets.domain.repository.NotificationRepository;

@Configuration
public class NotificationConfig {
    @Bean
    public NotificationService notificationService(GetNotificationUseCase getNotificationUseCase,
                                                   GetListNotificationUseCase getListNotificationUseCase,
                                                   SaveNotificationUseCase saveNotificationUseCase,
                                                   DeleteNotificationUseCase deleteNotificationUseCase ){
        return new NotificationService(getNotificationUseCase, getListNotificationUseCase, saveNotificationUseCase, deleteNotificationUseCase);
    }
    @Bean
    public GetNotificationUseCase getNotificationUseCase(NotificationRepository notificationRepository) {
        return new GetNotificationUseCase(notificationRepository);
    }

    @Bean
    public GetListNotificationUseCase getListNotificationsUseCase(NotificationRepository notificationRepository) {
        return new GetListNotificationUseCase(notificationRepository);
    }


    @Bean
    public DeleteNotificationUseCase deleteNotificationUseCase(NotificationRepository notificationRepository) {
        return new DeleteNotificationUseCase(notificationRepository);
    }

    @Bean
    public SaveNotificationUseCase saveNotificationUseCase(NotificationRepository notificationRepository){
        return new SaveNotificationUseCase ( notificationRepository);
    }

}
