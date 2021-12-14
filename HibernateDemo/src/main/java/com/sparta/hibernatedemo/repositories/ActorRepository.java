package com.sparta.hibernatedemo.repositories;

import com.sparta.hibernatedemo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
}