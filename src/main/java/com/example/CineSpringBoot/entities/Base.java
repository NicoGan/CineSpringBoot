package com.example.CineSpringBoot.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {return id;}
    public void setId(long id) {this.id = id;}
}
