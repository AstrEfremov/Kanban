package com.example.KanbanAndCalendar.controllers.dto.kanban;

import lombok.Data;

import java.time.LocalDateTime;

public record TaskDTO (
    String name,
    String description,
    String createData,
    String completeData){
}
