package io.github.opeterfreitas.todo.services;

import io.github.opeterfreitas.todo.domain.Todo;
import io.github.opeterfreitas.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private TodoRepository todoRepository;

    public void instanciaBaseDeDados() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        Todo t1 = new Todo(null, "Estudar", "Estudar Spring e Angular", LocalDateTime.parse("25/03/2022 10:40", formatter), false);

        todoRepository.saveAll(Arrays.asList(t1));
    }

}
