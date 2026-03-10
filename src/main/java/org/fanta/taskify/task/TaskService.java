package org.fanta.taskify.task;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TaskService {

    private final TaskRepository repo;

    public Task create(Task task) {
        return repo.save(task);
    }

    public Task getById(Long id){
       return repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Task not found: " + id));
    }

    public List<Task> getAll() {
        return repo.findAll();
    }

    public Task update(Long id, Task updated) {
        Task existing = getById(id);

        existing.setTitle(updated.getTitle());
        existing.setDescription(updated.getDescription());
        existing.setStatus(updated.getStatus());

        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }


}