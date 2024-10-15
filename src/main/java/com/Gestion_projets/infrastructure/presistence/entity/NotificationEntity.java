// src/main/java/com/Gestion_projets/infrastructure/presistence/entity/NotificationEntity.java
package com.Gestion_projets.infrastructure.presistence.entity;

import com.Gestion_projets.domain.model.Enum.NotificationEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "notification")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class NotificationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private NotificationEnum notificationType;
    private String message;
    private LocalDateTime dateNotification;

    @ManyToMany
    @JoinTable(
            name = "project_notification",
            joinColumns = @JoinColumn(name = "notification_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<ProjectEntity> projects = new HashSet<>();
}