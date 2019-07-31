package com.tommy.manik.service;

import java.util.List;

import com.tommy.manik.entity.ModulesEntity;
import com.tommy.manik.entity.RoleModulesEntity;
import com.tommy.manik.entity.User;

public interface UserService {
	public void createUser(User user);
	public List<User> getUser();
	public User findById(int id);
	public User update(User user, int id);
	public void deleteUserById(int id);
	public User updatePartially(User user, int id);
	public List<RoleModulesEntity> getModulesByUser(int id);
}
