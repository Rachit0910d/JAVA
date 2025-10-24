package StringLearning;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class ToDoApp {
    // Task class to represent individual to-do items
    static class Task {
        private static int nextId = 1;
        private final int id;
        private String title;
        private String description;
        private boolean completed;
        private String priority;
        private final LocalDateTime createdAt;
        private LocalDateTime completedAt;

        public Task(String title, String description, String priority) {
            this.id = nextId++;
            this.title = title;
            this.description = description;
            this.priority = priority;
            this.completed = false;
            this.createdAt = LocalDateTime.now();
        }

        // Getters
        public int getId() { return id; }
        public String getTitle() { return title; }
        public String getDescription() { return description; }
        public boolean isCompleted() { return completed; }
        public String getPriority() { return priority; }

        // Setters
        public void setTitle(String title) { this.title = title; }
        public void setDescription(String description) { this.description = description; }
        public void setPriority(String priority) { this.priority = priority; }

        public void markCompleted() {
            this.completed = true;
            this.completedAt = LocalDateTime.now();
        }

        public void markIncomplete() {
            this.completed = false;
            this.completedAt = null;
        }

        @Override
        public String toString() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String status = completed ? "✓" : "○";
            String completedInfo = completed ? " (Completed: " + completedAt.format(formatter) + ")" : "";

            return String.format("[%s] %d. %s - %s [%s]%s\n    Description: %s\n    Created: %s",
                    status, id, title, priority,
                    priority.toUpperCase(), completedInfo, description, createdAt.format(formatter));
        }
    }

    // TodoList class to manage the collection of tasks
    static class TodoList {
        private final List<Task> tasks;

        public TodoList() {
            this.tasks = new ArrayList<>();
        }

        public void addTask(String title, String description, String priority) {
            Task task = new Task(title, description, priority);
            tasks.add(task);
            System.out.println("Task added successfully! ID: " + task.getId());
        }

        public void displayAllTasks() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks found!");
                return;
            }

            System.out.println("\n=== ALL TASKS ===");
            for (Task task : tasks) {
                System.out.println(task);
                System.out.println();
            }
        }

        public void displayPendingTasks() {
            List<Task> pendingTasks = tasks.stream()
                    .filter(task -> !task.isCompleted())
                    .toList();

            if (pendingTasks.isEmpty()) {
                System.out.println("No pending tasks!");
                return;
            }

            System.out.println("\n=== PENDING TASKS ===");
            for (Task task : pendingTasks) {
                System.out.println(task);
                System.out.println();
            }
        }

        public void displayCompletedTasks() {
            List<Task> completedTasks = tasks.stream()
                    .filter(Task::isCompleted)
                    .toList();
            if (completedTasks.isEmpty()) {
                System.out.println("No completed tasks!");
                return;
            }

            System.out.println("\n=== COMPLETED TASKS ===");
            for (Task task : completedTasks) {
                System.out.println(task);
                System.out.println();
            }
        }

        public void markTaskCompleted(int id) {
            Task task = findTaskById(id);
            if (task != null) {
                task.markCompleted();
                System.out.println("Task marked as completed!");
            } else {
                System.out.println("Task with ID " + id + " not found!");
            }
        }

        public void markTaskIncomplete(int id) {
            Task task = findTaskById(id);
            if (task != null) {
                task.markIncomplete();
                System.out.println("Task marked as incomplete!");
            } else {
                System.out.println("Task with ID " + id + " not found!");
            }
        }

        public void updateTask(int id, String newTitle, String newDescription, String newPriority) {
            Task task = findTaskById(id);
            if (task != null) {
                if (!newTitle.isEmpty()) task.setTitle(newTitle);
                if (!newDescription.isEmpty()) task.setDescription(newDescription);
                if (!newPriority.isEmpty()) task.setPriority(newPriority);
                System.out.println("Task updated successfully!");
            } else {
                System.out.println("Task with ID " + id + " not found!");
            }
        }

        public void deleteTask(int id) {
            Task task = findTaskById(id);
            if (task != null) {
                tasks.remove(task);
                System.out.println("Task deleted successfully!");
            } else {
                System.out.println("Task with ID " + id + " not found!");
            }
        }

        public void searchTasks(String keyword) {
            List<Task> matchingTasks = tasks.stream()
                    .filter(task -> task.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                            task.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                    .toList();

            if (matchingTasks.isEmpty()) {
                System.out.println("No tasks found matching: " + keyword);
                return;
            }

            System.out.println("\n=== SEARCH RESULTS FOR: " + keyword + " ===");
            for (Task task : matchingTasks) {
                System.out.println(task);
                System.out.println();
            }
        }

        public void displayTasksByPriority(String priority) {
            List<Task> priorityTasks = tasks.stream()
                    .filter(task -> task.getPriority().equalsIgnoreCase(priority))
                    .toList();

            if (priorityTasks.isEmpty()) {
                System.out.println("No tasks found with priority: " + priority);
                return;
            }

            System.out.println("\n=== " + priority.toUpperCase() + " PRIORITY TASKS ===");
            for (Task task : priorityTasks) {
                System.out.println(task);
                System.out.println();
            }
        }

        private Task findTaskById(int id) {
            return tasks.stream()
                    .filter(task -> task.getId() == id)
                    .findFirst()
                    .orElse(null);
        }

        public void displayStatistics() {
            int total = tasks.size();
            int completed = (int) tasks.stream().filter(Task::isCompleted).count();
            int pending = total - completed;

            System.out.println("\n=== STATISTICS ===");
            System.out.println("Total Tasks: " + total);
            System.out.println("Completed Tasks: " + completed);
            System.out.println("Pending Tasks: " + pending);
            if (total > 0) {
                System.out.printf("Completion Rate: %.1f%%\n", (completed * 100.0) / total);
            }
        }
    }

    // Main application class
    public static class TodoApp {
        private static final TodoList todoList = new TodoList();
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Welcome to Java To-Do List Application!");

            // Add some sample tasks for demonstration
            todoList.addTask("Complete Java project", "Finish the to-do list application", "high");
            todoList.addTask("Buy groceries", "Milk, eggs, bread, and fruits", "medium");
            todoList.addTask("Read a book", "Finish reading 'Clean Code' by Robert Martin", "low");

            boolean running = true;

            while (running) {
                displayMenu();
                int choice = getChoice();

                switch (choice) {
                    case 1 -> addNewTask();
                    case 2 -> todoList.displayAllTasks();
                    case 3 -> todoList.displayPendingTasks();
                    case 4 -> todoList.displayCompletedTasks();
                    case 5 -> markTaskCompleted();
                    case 6 -> markTaskIncomplete();
                    case 7 -> updateTask();
                    case 8 -> deleteTask();
                    case 9 -> searchTasks();
                    case 10 -> displayTasksByPriority();
                    case 11 -> todoList.displayStatistics();
                    case 0 -> {
                        System.out.println("Thank you for using Java To-Do List Application!");
                        running = false;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }

                if (running) {
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                }
            }

            scanner.close();
        }

        private static void displayMenu() {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("           JAVA TO-DO LIST APPLICATION");
            System.out.println("=".repeat(50));
            System.out.println("1.  Add New Task");
            System.out.println("2.  Display All Tasks");
            System.out.println("3.  Display Pending Tasks");
            System.out.println("4.  Display Completed Tasks");
            System.out.println("5.  Mark Task as Completed");
            System.out.println("6.  Mark Task as Incomplete");
            System.out.println("7.  Update Task");
            System.out.println("8.  Delete Task");
            System.out.println("9.  Search Tasks");
            System.out.println("10. Filter by Priority");
            System.out.println("11. Show Statistics");
            System.out.println("0.  Exit");
            System.out.println("=".repeat(50));
            System.out.print("Enter your choice: ");
        }

        private static int getChoice() {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                return -1;
            }
        }

        private static void addNewTask() {
            System.out.println("\n=== ADD NEW TASK ===");
            System.out.print("Enter task title: ");
            String title = scanner.nextLine();

            System.out.print("Enter task description: ");
            String description = scanner.nextLine();

            System.out.print("Enter priority (high/medium/low): ");
            String priority = scanner.nextLine();

            if (priority.isEmpty()) priority = "medium";

            todoList.addTask(title, description, priority);
        }

        private static void markTaskCompleted() {
            System.out.print("Enter task ID to mark as completed: ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                todoList.markTaskCompleted(id);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format!");
            }
        }

        private static void markTaskIncomplete() {
            System.out.print("Enter task ID to mark as incomplete: ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                todoList.markTaskIncomplete(id);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format!");
            }
        }

        private static void updateTask() {
            System.out.println("\n=== UPDATE TASK ===");
            System.out.print("Enter task ID to update: ");
            try {
                int id = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter new title (leave empty to keep current): ");
                String newTitle = scanner.nextLine();

                System.out.print("Enter new description (leave empty to keep current): ");
                String newDescription = scanner.nextLine();

                System.out.print("Enter new priority (leave empty to keep current): ");
                String newPriority = scanner.nextLine();

                todoList.updateTask(id, newTitle, newDescription, newPriority);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format!");
            }
        }

        private static void deleteTask() {
            System.out.print("Enter task ID to delete: ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                todoList.deleteTask(id);
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format!");
            }
        }

        private static void searchTasks() {
            System.out.print("Enter keyword to search: ");
            String keyword = scanner.nextLine();
            todoList.searchTasks(keyword);
        }

        private static void displayTasksByPriority() {
            System.out.print("Enter priority to filter (high/medium/low): ");
            String priority = scanner.nextLine();
            todoList.displayTasksByPriority(priority);
        }
    }
}
