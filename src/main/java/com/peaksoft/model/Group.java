package com.peaksoft.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String groupName;
    private Date dateOfStart;
    private Date dateOfFinish;
    @ManyToMany(mappedBy = "group")
    private List<Course> course;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    private List<Student> student;

    public Group(String groupName, Date dateOfStart, Date dateOfFinish, List<Course> course, List<Student> student) {
        this.groupName = groupName;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
        this.course = course;
        this.student = student;
    }
}
