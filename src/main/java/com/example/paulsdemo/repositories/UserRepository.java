package com.example.paulsdemo.repositories;
import com.example.paulsdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
