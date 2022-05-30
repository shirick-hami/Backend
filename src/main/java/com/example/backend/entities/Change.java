package com.example.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "changes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Change {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String _id;

    @Column
    private String username;

    @Column
    private String changes;
}
