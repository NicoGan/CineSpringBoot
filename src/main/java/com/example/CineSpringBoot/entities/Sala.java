package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.List;

@Entity
@Table(name = "sala")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Sala extends Base {
    @Column(name = "numero")
    private int numero;

    @Column(name = "capacidad")
    private int capacidad;

    @OneToMany(mappedBy = "sala", cascade = CascadeType.REFRESH)
    private List<Funcion> funciones;
}
