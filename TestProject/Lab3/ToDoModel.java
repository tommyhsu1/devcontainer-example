package Lab3.Java;
import java.util.ArrayList;
import java.util.List;

public class ToDoModel {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
