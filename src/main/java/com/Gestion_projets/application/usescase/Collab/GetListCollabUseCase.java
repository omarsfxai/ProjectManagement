package com.Gestion_projets.application.usescase.Collab;

import com.Gestion_projets.domain.model.Collaborator;
import com.Gestion_projets.domain.repository.CollabRepository;

import java.util.List;


public class GetListCollabUseCase {
    private final CollabRepository collabRepository;

    public GetListCollabUseCase(CollabRepository collabRepository) {
        this.collabRepository = collabRepository;
    }

    public List<Collaborator> execute(){
        return collabRepository.findAllCollab();
    }
}
