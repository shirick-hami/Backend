package com.example.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String auth_level;

    @Column
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<BlogPost> posts = new ArrayList<>();
}
