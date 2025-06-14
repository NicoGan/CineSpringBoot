package com.example.CineSpringBoot.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaDTO {
    private Long id;
    private String fecha;
    private String hora;
    private String clienteNombre;
    private String clienteEmail;
    private String peliculaTitulo;
    private String peliculaGenero;
    private String horario;

    public VentaDTO() {
    }

    public VentaDTO(Long id, String fecha, String hora, String clienteNombre, String clienteEmail, String peliculaTitulo, String peliculaGenero, String horario) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.clienteNombre = clienteNombre;
        this.clienteEmail = clienteEmail;
        this.peliculaTitulo = peliculaTitulo;
        this.peliculaGenero = peliculaGenero;
        this.horario = horario;
    }
}
