package com.Gestion_projets.application.usescase.Collab;

import com.Gestion_projets.domain.model.Collaborator;
import com.Gestion_projets.domain.repository.CollabRepository;

public class UpdateCollabUseCase {
    private final CollabRepository collabRepository;

    public UpdateCollabUseCase(CollabRepository collabRepository) {
        this.collabRepository = collabRepository;
    }

    public Collaborator execute(Long id, Collaborator collab){
        return collabRepository.updateCollabById(collab, id);
    }
}
