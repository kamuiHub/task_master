package dev.kamui.taskmaster.service;

import dev.kamui.taskmaster.dto.todo.TodoCreationRequest;
import dev.kamui.taskmaster.dto.todo.TodoResponse;
import dev.kamui.taskmaster.dto.todo.TodoUpdateRequest;
import dev.kamui.taskmaster.model.Todo;
import dev.kamui.taskmaster.model.User;

import java.util.Optional;

public interface TodoService {
    TodoResponse createTodo(TodoCreationRequest todo);

    TodoResponse updateTodoData(TodoUpdateRequest user);

    void deleteTodo(long id);

    Optional<Todo> findTodoById(long id);
}
