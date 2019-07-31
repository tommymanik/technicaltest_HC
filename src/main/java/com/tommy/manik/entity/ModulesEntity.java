package com.tommy.manik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;


@Entity
@Table(name="modules")
@NamedQueries({
	@NamedQuery(
			name="getAllmodules", 
			//query="SELECT * FROM PROMISE_T1_U_MENU WHERE PROMISE_T1_U_MENU.MENU_PK NOT IN ( SELECT ROLE_MENU_MENU_FK FROM PROMISE_T2_U_ROLE_MENU WHERE ROLE_MENU_ROLE_FK = :roleMenuRoleFk)",
			query="select a from ModulesEntity a"
			),
	@NamedQuery(
			name="GetModulseByUserRole", 
			//query="SELECT m.* FROM PROMISE_T1_U_MENU INNER JOIN PROMISE_T2_U_ROLE_MENU rm ON m.MENU_PK = rm.ROLE_MENU_MENU_FK WHERE rm.ROLE_MENU_ROLE_FK = :roleMenuRoleFk",
			query="select a from ModulesEntity a where a.moduleId = :moduleId"
			)/*,
	@NamedQuery(
			name="getMenuListByRole",
			//query="SELECT m.* FROM PROMISE_T1_U_MENU INNER JOIN PROMISE_T2_U_ROLE_MENU rm ON m.MENU_PK = rm.ROLE_MENU_MENU_FK WHERE rm.ROLE_MENU_ROLE_FK = :roleMenuRoleFk",
			query="SELECT m FROM Menu m, RoleMenu rm WHERE m.menuPk = rm.roleMenuMenuFk AND rm.roleMenuRoleFk = :roleMenuRoleFk and rm.roleMenuDihapus = :roleMenuDihapus ORDER BY m.menuPk ASC"
			)*/
})

@NamedNativeQueries({ @NamedNativeQuery(name = "getRoleModules", 
query = "SELECT d.module_name, d.module_order FROM userinfo a JOIN userrole b ON a.role_id = b.role_id JOIN role_modules c ON c.role_id = b.role_id JOIN modules d ON d.module_id = c.module_id WHERE a.id = :userId") })
 
public class ModulesEntity {

	
	private String moduleId;
	private String moduleName;
	private String moduleOrder;
	
	
	@Id
	@Column(name="module_id")
	@JsonIgnore
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
	@Column(name="module_name")
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	@Column(name="module_order")
	public String getModuleOrder() {
		return moduleOrder;
	}
	public void setModuleOrder(String moduleOrder) {
		this.moduleOrder = moduleOrder;
	}

	
	

}
