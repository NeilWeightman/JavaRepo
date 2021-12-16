package com.sparta.hibernatedemo.repositories;

import com.sparta.hibernatedemo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    Optional<Actor> findByFirstName(String firstName);
}