package com.Gestion_projets.infrastructure.presistence.entity;

import java.util.Set;

import com.Gestion_projets.domain.model.Collaborator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table (name="Project")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String status;
    private String priority;
    private String progress;
    private String cost;
    private String budget;


	}
