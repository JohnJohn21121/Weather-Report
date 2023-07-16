package com.JohnJohn21121.CanDoItWeatherReport.repository;

import com.JohnJohn21121.CanDoItWeatherReport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    @Override
    void delete(User user);
}
