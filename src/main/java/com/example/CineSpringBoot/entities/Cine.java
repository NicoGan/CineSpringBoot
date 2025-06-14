package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;

@Entity
@Table(name = "cine")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Cine extends Base {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;

    @Column(name = "empleados")
    @ManyToMany(mappedBy = "cines")
    private ArrayList<Empleado> empleados;
    @Column(name = "peliculas")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private ArrayList<Pelicula> peliculas;
    @Column(name = "venta")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private ArrayList<Venta> ventas;
    @Column(name = "sala")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private ArrayList<Sala> salas;
}
