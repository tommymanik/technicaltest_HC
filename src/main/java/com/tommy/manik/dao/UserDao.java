package com.tommy.manik.dao;

import java.util.List;

import com.tommy.manik.entity.ModulesEntity;
import com.tommy.manik.entity.RoleModulesEntity;
import com.tommy.manik.entity.User;

public interface UserDao {
	public void addUser(User user);
	public List<User> getUser();
	public User findById(int id);
	public User update(User user, int id);
	public User updateCountry(User user, int id);
	public void delete(int id);
	public List<RoleModulesEntity> getModulesByUser(int id);
}
