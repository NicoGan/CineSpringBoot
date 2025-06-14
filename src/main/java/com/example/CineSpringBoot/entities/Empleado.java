package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "empleado")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Empleado extends Base {
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dni")
    private String dni;

    @ManyToOne
    @JoinColumn(name = "cine_id")
    private Cine cine;
}
