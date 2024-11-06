package com.teco.simple_crud.repository;

import com.teco.simple_crud.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {

    Optional<Todo> findByTittle(String tittle);
}
