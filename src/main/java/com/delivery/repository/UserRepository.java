package com.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.delivery.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
