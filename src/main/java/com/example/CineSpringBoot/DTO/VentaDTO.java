package com.example.CineSpringBoot.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VentaDTO {
    // Campos para crear la venta
    private String nombre;
    private String correo;
    private String tipo;
    private Long funcionId;
    private Double monto; // si lo necesitas

    // Campos para mostrar información (puedes dejarlos si los usas en respuestas)
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
}
