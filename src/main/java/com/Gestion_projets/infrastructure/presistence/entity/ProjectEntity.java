// src/main/java/com/Gestion_projets/infrastructure/presistence/entity/ProjectEntity.java
package com.Gestion_projets.infrastructure.presistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "project")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String progress;
    private Double cost;
    private Double budget;

    @ManyToMany(mappedBy = "projects")
    private Set<NotificationEntity> notifications = new HashSet<>();
}