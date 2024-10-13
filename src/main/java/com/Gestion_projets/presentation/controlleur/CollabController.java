package com.Gestion_projets.presentation.controlleur;

import com.Gestion_projets.application.service.CollabService;
import com.Gestion_projets.domain.model.Collaborator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class CollabController {
    private final CollabService collabService;

    public CollabController(CollabService collabService) {
        this.collabService = collabService;
    }

    @GetMapping("/collaborators")
    public List<Collaborator> getListCollab(){
        return collabService.getListCollab();
    }

    @GetMapping("/collaborator/{id}")
    public Collaborator getCollabById(@PathVariable Long id){
        return collabService.getCollabById(id);
    }

    @PostMapping("/addCollaborator")
    public Collaborator saveCollab(@RequestBody Collaborator collab){ return collabService.saveCollab(collab); }

    @PutMapping("/updateCollaborator/{id}")
    public Collaborator updateCollab(@RequestBody Collaborator collab,@PathVariable Long id){
        return collabService.updateCollab(collab, id);
    }

    @DeleteMapping("/deleteCollaborator/{id}")
    public void deleteCollab(@PathVariable Long id){
        collabService.deleteCollabById(id);
    }
}
