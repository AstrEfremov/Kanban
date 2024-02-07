package com.example.KanbanAndCalendar.controllers.dto.kanban;

import lombok.Data;

import java.util.List;

public record KanColumnDTO (
        Integer position,
        String name,
        String description,
        Integer maxTask){
}
