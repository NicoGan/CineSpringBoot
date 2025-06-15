package com.example.CineSpringBoot.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    private List<Funcion> funcion = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cliente_id") 
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name = "pago_id")
    private Pago pago;

    public void addFuncion(Funcion funcion) {
        if (this.funcion == null) this.funcion = new ArrayList<>();
        this.funcion.add(funcion);
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
