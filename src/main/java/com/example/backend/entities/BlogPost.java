package com.example.backend.entities;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "blog-posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(length = 10000, nullable = false)
    private String content;

    @ManyToOne()
    private User createdBy;

    @ManyToOne()
    private User reviewedBy;

    @Column
    private Date createdOn;

    @Column
    private Date updatedOn;

    @ManyToOne()
    @JoinColumn(name = "tagId")
    private Tag tag;

    @Column
    @OneToMany(mappedBy = "users",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Change> changeHistory = new ArrayList<>();

}
