package com.example.KanbanAndCalendar.controllers.dto.calendar;

import com.example.KanbanAndCalendar.models.calendar.Event;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

public record CalendarDTO(String uuid, String name, String description) {

}
