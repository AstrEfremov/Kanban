package com.example.KanbanAndCalendar.repositories.kanban;

import com.example.KanbanAndCalendar.models.kanban.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
}
