package com.tommy.manik.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="UserRole")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserRole {

	
	private String roleId;
	private String roleName;

	@Id
	@Column(name="role_id")
	public String getRoleId() {return roleId;}
	public void setRoleId(String roleId) {this.roleId = roleId;}

	@Column(name="role_name")
	public String getRoleName() {return roleName;}
	public void setRoleName(String roleName) {this.roleName = roleName;}

}
