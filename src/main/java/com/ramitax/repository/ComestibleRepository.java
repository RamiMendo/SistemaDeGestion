package com.ramitax.repository;

import com.ramitax.model.Comestible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComestibleRepository extends JpaRepository<Comestible, Integer> {
}
