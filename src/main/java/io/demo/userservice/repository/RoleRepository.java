package io.demo.userservice.repository;

import io.demo.userservice.model.AppRole;
import io.demo.userservice.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByName(String name);
}
