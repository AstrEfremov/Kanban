package com.example.KanbanAndCalendar.repositories.calendar;

import com.example.KanbanAndCalendar.models.calendar.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CalendarRepository extends JpaRepository<Calendar, UUID> {
}
