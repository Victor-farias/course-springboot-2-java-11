package com.victorfarias.course.repositories;

import com.victorfarias.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}