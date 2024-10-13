package com.Gestion_projets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Gestion_projets.application.service.RoleService;
import com.Gestion_projets.application.usescase.Role.*;
import com.Gestion_projets.domain.repository.RoleRepository;

@Configuration
public class RoleConfig {
	
	   @Bean
	    public RoleService roleService(GetRoleUseCase getRoleUseCase,
	                                   GetListRoleUseCase getListRoleUseCase,
	                                   SaveRoleUseCase saveRoleUseCase,
	                                   UpdateRoleUseCase updateRoleUseCase,
	                                   DeleteRoleUseCase deleteRoleUseCase){
	        return new RoleService(getRoleUseCase, getListRoleUseCase, saveRoleUseCase, updateRoleUseCase, deleteRoleUseCase);
	    }

	   
	   @Bean 
	   public GetRoleUseCase getRoleUseCase(RoleRepository roleRepository) {
		   
		   return new GetRoleUseCase(roleRepository);
	   }
	   
	   @Bean
	    public GetListRoleUseCase getListRoleUseCase(RoleRepository roleRepository){
	        return new GetListRoleUseCase(roleRepository);
	    }
	   
	    @Bean
	    public SaveRoleUseCase saveRoleUseCase(RoleRepository roleRepository){
	        return new SaveRoleUseCase(roleRepository);
	    }
	    

	    @Bean
	    public UpdateRoleUseCase updateRoleUseCase(RoleRepository roleRepository){
	        return new UpdateRoleUseCase(roleRepository);
	    }

	    @Bean
	    public DeleteRoleUseCase deleteRoleUseCase(RoleRepository roleRepository){
	        return new DeleteRoleUseCase(roleRepository);
	    }
}
