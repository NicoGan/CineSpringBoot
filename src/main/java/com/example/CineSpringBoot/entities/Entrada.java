package com.example.CineSpringBoot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "entrada")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class Entrada extends Base{
    @Column(name = "precio")
    private Double precio;
    @Column(name = "asiento")
    private String asiento;
}
