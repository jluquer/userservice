package io.demo.userservice.service;

import io.demo.userservice.model.AppRole;
import io.demo.userservice.model.AppUser;

import java.util.List;

public interface UserServiceInterface {
    AppUser saveUser(AppUser user);
    AppRole saveRole(AppRole role);
    void addRoleToUser(String email, String roleName);
    AppUser getUser(String email);
    List<AppUser> getUsers();
}
