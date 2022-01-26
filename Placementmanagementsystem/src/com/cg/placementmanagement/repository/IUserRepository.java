package com.cg.placementmanagement.repository;

import com.cg.placementmanagement.entities.User;

public interface IUserRepository {
public User addUser(User user);
public User updateUser(User user);
public User deleteUser(long id);

}
