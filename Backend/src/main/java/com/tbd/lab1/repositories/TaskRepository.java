package com.tbd.lab1.repositories;

import com.tbd.lab1.models.Task;
import java.util.List;

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
