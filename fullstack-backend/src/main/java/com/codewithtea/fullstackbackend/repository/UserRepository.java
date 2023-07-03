package com.codewithtea.fullstackbackend.repository;

import com.codewithtea.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
