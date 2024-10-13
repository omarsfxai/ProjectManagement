package com.Gestion_projets.application.usescase.Collab;

import com.Gestion_projets.domain.model.Collaborator;
import com.Gestion_projets.domain.repository.CollabRepository;

public class SaveCollabUseCase {
    private final CollabRepository collabRepository;

    public SaveCollabUseCase(CollabRepository collabRepository) {
        this.collabRepository = collabRepository;
    }

    public Collaborator execute(Collaborator collab){
        return collabRepository.save(collab);
    }
}
