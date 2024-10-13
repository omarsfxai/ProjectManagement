package com.Gestion_projets.infrastructure.presistence.repo;

import com.Gestion_projets.domain.model.Collaborator;
import com.Gestion_projets.domain.repository.CollabRepository;
import com.Gestion_projets.infrastructure.presistence.mapper.CollaboratorMapper;
import com.Gestion_projets.infrastructure.presistence.repo.jpa.CollabRepo;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CollabRepoImpl implements CollabRepository {
    private final CollabRepo collabRepo;

    public CollabRepoImpl(@Lazy CollabRepo collabRepo) {
        this.collabRepo = collabRepo;
    }

    @Override
    public Collaborator save(Collaborator collab) {
        return CollaboratorMapper.toDomain(collabRepo.save(CollaboratorMapper.toEntity(collab)));
    }

    @Override
    public Optional<Collaborator> findCollabById(Long id) {
        return collabRepo.findById(id)
                .map(CollaboratorMapper::toDomain);
    }

    @Override
    public List<Collaborator> findAllCollab() {
        return collabRepo.findAll()
                .stream()
                .map(CollaboratorMapper::toDomain)
                .toList();
    }

    @Override
    public Collaborator updateCollabById(Collaborator collab, Long id) {
        if(collabRepo.existsById(id)){
            return CollaboratorMapper.toDomain(collabRepo.save(CollaboratorMapper.toEntity(collab)));
        }
        return null;
    }

    @Override
    public void deleteCollabById(Long id) {
        collabRepo.deleteById(id);
    }
}
