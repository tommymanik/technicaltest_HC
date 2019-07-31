package com.tommy.manik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;


@Entity
@Table(name="role_modules")
@NamedQueries({
	@NamedQuery(
			name="getAllRoleModules", 
			//query="SELECT * FROM PROMISE_T1_U_MENU WHERE PROMISE_T1_U_MENU.MENU_PK NOT IN ( SELECT ROLE_MENU_MENU_FK FROM PROMISE_T2_U_ROLE_MENU WHERE ROLE_MENU_ROLE_FK = :roleMenuRoleFk)",
			query="select a from RoleModulesEntity a"
			),
	@NamedQuery(
			name="GetRoleModuleByUserRole", 
			//query="SELECT m.* FROM PROMISE_T1_U_MENU INNER JOIN PROMISE_T2_U_ROLE_MENU rm ON m.MENU_PK = rm.ROLE_MENU_MENU_FK WHERE rm.ROLE_MENU_ROLE_FK = :roleMenuRoleFk",
			query="select a.module from RoleModulesEntity a where a.role.roleId = :roleId"
			)/*,
	@NamedQuery(
			name="getMenuListByRole",
			//query="SELECT m.* FROM PROMISE_T1_U_MENU INNER JOIN PROMISE_T2_U_ROLE_MENU rm ON m.MENU_PK = rm.ROLE_MENU_MENU_FK WHERE rm.ROLE_MENU_ROLE_FK = :roleMenuRoleFk",
			query="SELECT m FROM Menu m, RoleMenu rm WHERE m.menuPk = rm.roleMenuMenuFk AND rm.roleMenuRoleFk = :roleMenuRoleFk and rm.roleMenuDihapus = :roleMenuDihapus ORDER BY m.menuPk ASC"
			)*/
})
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})                                                                                   
public class RoleModulesEntity {

	
	private String rmId;
	private ModulesEntity module;
	private UserRole role;
	
	
	@Id
	@Column(name="rm_id")
	public String getRmId() {
		return rmId;
	}
	public void setRmId(String rmId) {
		this.rmId = rmId;
	}
	
	@ManyToOne
	@JoinColumn(name="module_id")
	public ModulesEntity getModule() {
		return module;
	}
	public void setModule(ModulesEntity module) {
		this.module = module;
	}
	
	@ManyToOne
	@JoinColumn(name="role_id")
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	
	
	
	
	
	

}
