package com.Gestion_projets.application.service;

import java.util.List;

import com.Gestion_projets.application.usescase.Role.*;
import com.Gestion_projets.domain.model.Role;

public class RoleService {

	   private final GetRoleUseCase getRoleUseCase;
	    private final GetListRoleUseCase getListRoleUseCase;
	    private final SaveRoleUseCase saveRoleUseCase;
	    private final UpdateRoleUseCase updateRoleUseCase;
	    private final DeleteRoleUseCase deleteRoleUseCase;
	    
	    
		public RoleService(GetRoleUseCase getRoleUseCase, GetListRoleUseCase getListRoleUseCase,
				SaveRoleUseCase saveRoleUseCase, UpdateRoleUseCase updateRoleUseCase,
				DeleteRoleUseCase deleteRoleUseCase) {
			this.getRoleUseCase = getRoleUseCase;
			this.getListRoleUseCase = getListRoleUseCase;
			this.saveRoleUseCase = saveRoleUseCase;
			this.updateRoleUseCase = updateRoleUseCase;
			this.deleteRoleUseCase = deleteRoleUseCase;
		}

		public Role saveRole(Role role) {
			return saveRoleUseCase.execute(role);
		}
		
		public List<Role>getListRole(){
			return getListRoleUseCase.execute();
		}

		public Role getRoleById(Long id) {
			return  getRoleUseCase.execute(id);
		}
		
		
		public Role updateRole(Role role,Long id) {
			return updateRoleUseCase.execute(id, role);
		}
		
		public void deleteRoleById(Long id) {
			deleteRoleUseCase.execute(id);
		}
		
}
