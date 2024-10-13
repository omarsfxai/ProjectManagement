package com.Gestion_projets.domain.model;


import java.time.LocalDate;
import java.util.Set;

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

}
