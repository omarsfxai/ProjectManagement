package com.Gestion_projets.presentation.controlleur;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Gestion_projets.application.service.RoleService;
import com.Gestion_projets.domain.model.Role;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class RoleController {

	
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
    
    @GetMapping("/roles")
    public List<Role>getListRole(){
    	return roleService.getListRole();
    }
    
    @GetMapping("/role/{id}")
    public Role getRoleById(@PathVariable Long id) {
    	return roleService.getRoleById(id);
    }
    
    @PostMapping("/addRole")
    public Role saveRole(@RequestBody Role role) {
    	
    	return roleService.saveRole(role);
    }
    
    @PutMapping("/updateRole/{id}")
    public Role updateRole(@RequestBody Role role,@PathVariable Long id) {
    	return roleService.updateRole(role, id);
    }
    
    
    @DeleteMapping("/deleteRole/{id}")
    public void deleteRole(@PathVariable Long id) {
    	roleService.deleteRoleById(id);
    }
}


