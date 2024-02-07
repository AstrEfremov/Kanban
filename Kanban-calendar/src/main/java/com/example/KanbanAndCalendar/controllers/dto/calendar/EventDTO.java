package com.example.KanbanAndCalendar.controllers.dto.calendar;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

public record EventDTO(
     String uuid,
     String name,
     String description,
     String start,
     String end){
}
