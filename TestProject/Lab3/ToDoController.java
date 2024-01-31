package Lab3.Java;

import java.util.List;

public class ToDoController {
    private ToDoModel model;
    private ToDoView view;

    public ToDoController(ToDoModel model, ToDoView view) {
        this.model = model;
        this.view = view;
    }

    public void addTask(String task) {
        model.addTask(task);
    }

    public void displayToDoList() {
        List<String> tasks = model.getTasks();
        view.printToDoList(tasks);
    }
}

