package com.JohnJohn21121.CanDoItWeatherReport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    private String id;
    private String name;
}
