package io.github.opeterfreitas.todo.services;

import io.github.opeterfreitas.todo.domain.Todo;
import io.github.opeterfreitas.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public Todo findById(Integer id){
        Optional<Todo> obj = repository.findById(id);
        return obj.orElse(null);


    }
}
