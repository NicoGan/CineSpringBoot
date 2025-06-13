package com.example.CineSpringBoot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.io.Serializable;

@Entity
@Table(name = "empleado")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Empleado extends Base implements Serializable {
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "dni")
    private String dni;
    @Column(name = "cine")
    private Cine cine;
}
