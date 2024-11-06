package com.teco.simple_crud.controller;

import com.teco.simple_crud.domain.Todo;
import com.teco.simple_crud.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private final TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Todo>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodo(@PathVariable Long id) {
        return ResponseEntity.ok(service.getTodo(id));
    }

    @PostMapping("")
    public ResponseEntity<Void> save(@RequestBody Todo todo){
        service.save(todo);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
