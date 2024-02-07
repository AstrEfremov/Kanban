package com.example.KanbanAndCalendar.repositories;

import com.example.KanbanAndCalendar.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CommentRepository extends JpaRepository<Comment, UUID> {
}
