package com.Gestion_projets.domain.model;

import com.Gestion_projets.domain.model.Enum.NotificationEnum;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Builder
@Getter
@Setter
public class Notification{
    private Long id;
    private NotificationEnum notificationType;
    private String message;
    private LocalDateTime dateNotification;
    private Set<Project> projects;
}