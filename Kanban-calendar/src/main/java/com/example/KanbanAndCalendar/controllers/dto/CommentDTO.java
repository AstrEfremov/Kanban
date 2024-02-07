package com.example.KanbanAndCalendar.controllers.dto;

import lombok.Data;

import java.time.LocalDateTime;

public record CommentDTO (
    String uuid,
    String massage,
    String username,
    String create){
}
