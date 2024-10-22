package com.desafio.junior.repository;

import com.desafio.junior.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {



}
