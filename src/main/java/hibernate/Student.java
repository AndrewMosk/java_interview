package hibernate;

import lombok.Data;

import javax.persistence.*;

@Table
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mark")
    private Integer mark;
}
