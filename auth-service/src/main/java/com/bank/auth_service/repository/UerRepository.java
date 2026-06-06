package com.bank.auth_service.repository;

import com.bank.auth_service.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UerRepository extends JpaRepository<User, UUID> {

    Optional<User> findByUserName(String userName);
    Optional<User> findByEmail(String email);
    boolean existsByUserName(String username);
    boolean existsByEmail(String email);
}
