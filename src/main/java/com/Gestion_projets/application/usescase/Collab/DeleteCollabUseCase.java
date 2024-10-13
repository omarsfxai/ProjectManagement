package com.Gestion_projets.application.usescase.Collab;

import com.Gestion_projets.domain.repository.CollabRepository;

public class DeleteCollabUseCase {

    private final CollabRepository collabRepository;

    public DeleteCollabUseCase(CollabRepository collabRepository) {
        this.collabRepository = collabRepository;
    }
    public void execute(Long id) {

        collabRepository.deleteCollabById(id);	}
}
