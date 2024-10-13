package com.Gestion_projets.domain.repository;




import com.Gestion_projets.domain.model.Collaborator;

import java.util.List;
import java.util.Optional;

public interface CollabRepository {


    Collaborator save (Collaborator Collab);
    List<Collaborator> findAllCollab();
    Optional<Collaborator> findCollabById(Long id);
    Collaborator updateCollabById(Collaborator Collab,Long id);
    void deleteCollabById(Long id);

}
