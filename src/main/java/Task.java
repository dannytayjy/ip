/**
 * An abstract class that represents a task.
 */
public abstract class Task {
    private final TaskType type;
    private final String description;
    private boolean isDone;

    /**
     * Constructor to initialize an instance of Task class with task
     * type and description.
     *
     * @param type Type of task
     * @param description Description of the task
     */
    public Task(TaskType type, String description) {
        // By default, the task is not done
        this(type, description, false);
    }

    /**
     * Constructor to initialize an instance of Task class with task
     * type, description and isDone flag.
     *
     * @param type Type of task
     * @param description Description of the task
     * @param isDone Flag to indicate if the task is done
     */
    public Task(TaskType type, String description, boolean isDone) {
        this.type = type;
        this.description = description;
        this.isDone = isDone;
    }

    /**
     * Returns the status icon based on whether the task is done.
     *
     * @return ✔ if the task is done, empty otherwise
     */
    public String getStatusIcon() {
        return (isDone ? "[✔]" : "[ ]"); // mark done task with ✔
    }

    /**
     * Sets the isDone flag to true if the task is done.
     */
    public void setDone() {
        this.isDone = true;
    }

    /**
     * Sets the isDone flag to false if the task is done.
     */
    public void setNotDone() {
        this.isDone = false;
    }

    /**
     * Returns the string representation of the task.
     *
     * @return The string representation of the task
     */
    @Override
    public String toString() {
        return "[" + type.getAbbreviation() + "] " + getStatusIcon() + " " + description;
    }
}
