package com.Gestion_projets.application.service;

import com.Gestion_projets.application.usescase.Collab.*;
import com.Gestion_projets.domain.model.Collaborator;

import java.util.List;

public class CollabService {

    private final GetCollabUseCase getCollabUseCase;
    private final GetListCollabUseCase getListCollabUseCase;
    private final SaveCollabUseCase saveCollabUseCase;
    private final UpdateCollabUseCase updateCollabUseCase;
    private final DeleteCollabUseCase deleteCollabUseCase;




    public CollabService(SaveCollabUseCase saveCollabUseCase,
                         GetCollabUseCase getCollabUseCase,
                         GetListCollabUseCase getListCollabUseCase,
                         UpdateCollabUseCase updateCollabUseCase,
                         DeleteCollabUseCase deleteCollabUseCase) {
        this.saveCollabUseCase = saveCollabUseCase;
        this.getCollabUseCase = getCollabUseCase;
        this.getListCollabUseCase = getListCollabUseCase;
        this.updateCollabUseCase = updateCollabUseCase;
        this.deleteCollabUseCase = deleteCollabUseCase;
    }

    public Collaborator saveCollab(Collaborator collab){ return saveCollabUseCase.execute(collab); }
    public Collaborator getCollabById(Long id){ return getCollabUseCase.execute(id); }
    public List<Collaborator> getListCollab(){ return getListCollabUseCase.execute(); }
    public Collaborator updateCollab(Collaborator collab, Long id){ return updateCollabUseCase.execute(id, collab); }
    public void deleteCollabById(Long id){ deleteCollabUseCase.execute(id); }
}
