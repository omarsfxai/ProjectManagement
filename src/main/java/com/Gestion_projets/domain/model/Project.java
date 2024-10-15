package com.Gestion_projets.domain.model;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class Project {
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String progress;
    private String cost;
    private String budget;
    private Set<Notification> notifications;

    public boolean isUpdated(Project other) {
        return !this.equals(other);
    }

}
