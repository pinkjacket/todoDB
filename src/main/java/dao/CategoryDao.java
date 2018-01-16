package dao;
import models.Category;
import java.util.List;
import models.Task;

/**
 * Created by Guest on 1/16/18.
 */
public interface CategoryDao {
    //create
    void add (Category category);

    //read
    List<Category> getAll();
    List<Task> getAllTasksByCategory(int categoryId);

    Category findById(int id);

    //update
    void update(int id, String name);

    //delete
    void deleteById(int id);
    void clearAllCategories();
}
