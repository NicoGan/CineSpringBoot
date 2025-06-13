package com.example.CineSpringBoot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
    private ArrayList<Empleado> empleados;
    @Column(name = "peliculas")
    @OneToMany
    private ArrayList<Pelicula> peliculas;
    @Column(name = "venta")
    @OneToMany
    private ArrayList<Venta> ventas;
    @Column(name = "sala")
    @OneToMany
    private ArrayList<Sala> salas;

}
