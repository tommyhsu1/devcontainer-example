package Lab3.Java;
import java.util.List;
public class ToDoView {
    public void printToDoList(List<String> tasks) {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}

