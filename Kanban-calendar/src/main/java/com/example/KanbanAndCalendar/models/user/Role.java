package com.example.KanbanAndCalendar.models.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="Id")
    private Integer id;

    @Column(name ="name")
    private String name;
}