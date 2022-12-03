package com.rain.library.repository;

import com.rain.library.model.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {

    Optional<Type> findTypeByTypeIgnoreCase(String type);
}
