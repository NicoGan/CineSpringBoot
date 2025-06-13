package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "venta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Venta extends Base {
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "funcion")
    @ManyToMany
    private ArrayList<Funcion> funcion;
    @Column(name = "clientes")
    @ManyToMany
    private ArrayList<Cliente> cliente;
    @Column(name = "pago")
    private Pago pago;
}
