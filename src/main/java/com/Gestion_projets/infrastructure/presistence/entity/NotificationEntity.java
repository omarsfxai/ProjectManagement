package com.Gestion_projets.infrastructure.presistence.entity;

import com.Gestion_projets.domain.model.Enum.NotificationEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

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

}
