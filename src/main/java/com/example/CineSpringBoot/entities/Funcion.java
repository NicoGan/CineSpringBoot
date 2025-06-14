package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;

@Entity
@Table(name = "funcion")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Funcion extends Base{
    @Column(name = "horario")
    private String horario;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;
    @OneToMany
    private ArrayList<Entrada> entradas;

}
