package dev.kamui.taskmaster.service;

import dev.kamui.taskmaster.dto.task.TaskCreationRequest;
import dev.kamui.taskmaster.dto.task.TaskResponse;
import dev.kamui.taskmaster.dto.task.TaskUpdateRequest;
import dev.kamui.taskmaster.model.Task;

import java.util.Optional;

public interface TaskService {
    TaskResponse createTask(TaskCreationRequest todo);

    TaskResponse updateTaskData(TaskUpdateRequest user);

    void deleteTask(long id);

    Optional<Task> findTaskById(long id);
}
