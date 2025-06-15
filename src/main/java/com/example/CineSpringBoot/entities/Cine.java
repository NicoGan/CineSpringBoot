package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

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

    @OneToMany(mappedBy = "cine", cascade = CascadeType.ALL)
    private List<Empleado> empleados;

    @OneToMany
    @JoinColumn(name = "cine_id")
    private List<Pelicula> peliculas;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cine_id")
    private List<Venta> ventas;

    @OneToMany
    @JoinColumn(name = "cine_id")
    private List<Sala> salas;
}
