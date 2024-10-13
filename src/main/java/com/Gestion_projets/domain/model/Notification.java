package com.Gestion_projets.domain.model;

import com.Gestion_projets.domain.model.Enum.NotificationEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class Notification{
    private Long id;
    private NotificationEnum notificationType;
    private String message;
    private LocalDateTime dateNotification;


}