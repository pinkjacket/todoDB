package dao;

import models.Task;

import java.util.List;

/**
 * Created by Guest on 1/16/18.
 */
public interface TaskDao {

    void add (Task task);

    List<Task> getAll();

    Task findById(int id);

      void update(int id, String content);

    void deleteById(int id);

    void clearAllTasks();

}
