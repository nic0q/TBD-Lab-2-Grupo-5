package com.tbd.lab2.repositories;

import java.util.List;

import com.tbd.lab2.models.Task;

/**
 * Interface para TaskRepository.
 */
public interface TaskRepository {
    public int countTask();

    public List<Task> getAllTasks();

    public List<Task> getTaskById(int id);

    public Task createTask(Task task);

    public boolean deleteTask(int id);

    public boolean editTask(Task task);

    public int deleteAllTask();
}
