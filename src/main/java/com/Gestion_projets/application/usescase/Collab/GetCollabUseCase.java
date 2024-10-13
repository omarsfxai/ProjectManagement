package com.Gestion_projets.application.usescase.Collab;

import com.Gestion_projets.domain.repository.CollabRepository;
import com.Gestion_projets.domain.model.Collaborator;

public class GetCollabUseCase {
    private final CollabRepository collabRepository;

    public GetCollabUseCase(CollabRepository collabRepository) {
        this.collabRepository = collabRepository;
    }
    public Collaborator execute(Long id) {
        return collabRepository.findCollabById(id).get();
    }

}
