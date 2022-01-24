package com.example.sorabi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sorabi.models.Users;

@Repository
public interface UsersRepositories extends JpaRepository<Users, Long> {
    Users findUsersById (int id);
}
