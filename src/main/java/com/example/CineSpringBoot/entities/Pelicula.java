package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "pelicula")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Pelicula extends Base{
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private Genero genero;
}
