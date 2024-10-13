package com.Gestion_projets;

import com.Gestion_projets.application.service.CollabService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Gestion_projets.application.usescase.Collab.*;


import com.Gestion_projets.domain.repository.CollabRepository;

@Configuration

public class CollabConfig {

    @Bean

    public CollabService collabService(GetCollabUseCase getCollabUseCase,
                                       GetListCollabUseCase getListCollabUseCase,
                                       SaveCollabUseCase saveCollabUseCase,
                                       UpdateCollabUseCase updateCollabUseCase,
                                       DeleteCollabUseCase deleteCollabUseCase){
        return new CollabService(saveCollabUseCase, getCollabUseCase, getListCollabUseCase, updateCollabUseCase, deleteCollabUseCase);
    }


    @Bean
    public GetCollabUseCase getCollabUseCase(CollabRepository CollabRepository) {

        return new GetCollabUseCase(CollabRepository);
    }

    @Bean
    public GetListCollabUseCase getListCollabUseCase(CollabRepository collabRepository){
        return new GetListCollabUseCase(collabRepository);
    }

    @Bean
    SaveCollabUseCase saveCollabUseCase(CollabRepository collabRepository){
        return new SaveCollabUseCase(collabRepository);
    }

    @Bean
    public UpdateCollabUseCase updateCollabUseCase(CollabRepository collabRepository){
        return new UpdateCollabUseCase(collabRepository);
    }

    @Bean
    public DeleteCollabUseCase deleteCollabUseCase(CollabRepository collabRepository){
        return new DeleteCollabUseCase(collabRepository);
    }
}

