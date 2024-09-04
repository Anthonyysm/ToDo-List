package br.com.anthonymartins.treinando_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.anthonymartins.treinando_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
