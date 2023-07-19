package com.JohnJohn21121.CanDoItWeatherReport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false, length = 20)
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Role(String name){
        this.name = name;
    }
}
