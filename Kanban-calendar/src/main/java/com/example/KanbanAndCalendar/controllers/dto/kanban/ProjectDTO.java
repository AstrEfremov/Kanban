package com.example.KanbanAndCalendar.controllers.dto.kanban;

import lombok.Data;

public record ProjectDTO(
    String uuid,
    String name,
    String description){
}
