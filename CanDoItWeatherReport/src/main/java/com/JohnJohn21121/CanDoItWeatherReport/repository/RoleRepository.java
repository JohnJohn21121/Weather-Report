package com.JohnJohn21121.CanDoItWeatherReport.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.JohnJohn21121.CanDoItWeatherReport.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer > {

    Role findByRoleName (String roleName);
}
