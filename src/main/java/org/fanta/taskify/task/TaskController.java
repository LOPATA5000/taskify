package org.fanta.taskify.task;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @PostMapping()
    public Task create(@Valid @RequestBody TaskRequest request) {
        return service.create(request);
    }

    @GetMapping("/{id}")
    public Task getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Task> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task task) {
        return service.update(id, task);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
