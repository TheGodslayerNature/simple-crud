package com.teco.simple_crud.service;

import com.teco.simple_crud.domain.Todo;
import com.teco.simple_crud.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> listAll() {
        return repository.findAll();
    }

    public Todo getTodo(Long id) {
        return repository.findById(id).
                orElseThrow( () -> new RuntimeException("Não foi possivel encontrar todo"));
    }

    public void save(Todo todo) {
        repository.save(todo);
    }

    public Todo update(Todo todo){
        return repository.save(todo);
    }
    public void delete(Long id){
        Todo todo = getTodo(id);
        repository.delete(todo);
    }
}
