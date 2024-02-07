package com.example.KanbanAndCalendar.repositories.kanban;

import com.example.KanbanAndCalendar.models.kanban.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
