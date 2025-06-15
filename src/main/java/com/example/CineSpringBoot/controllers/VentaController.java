package com.example.CineSpringBoot.controllers;

import com.example.CineSpringBoot.ServicesImpl.VentaServiceImpl;
import com.example.CineSpringBoot.ServicesImpl.ClienteServiceImpl;
import com.example.CineSpringBoot.ServicesImpl.FuncionServiceImpl;
import com.example.CineSpringBoot.ServicesImpl.PagoServiceImpl;
import com.example.CineSpringBoot.DTO.VentaDTO;
import com.example.CineSpringBoot.entities.Cliente;
import com.example.CineSpringBoot.entities.Funcion;
import com.example.CineSpringBoot.entities.Pago;
import com.example.CineSpringBoot.entities.Venta;
import com.example.CineSpringBoot.entities.TipoPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/ventas")
public class VentaController extends BaseControllerImpl<Venta, VentaServiceImpl> {

    @Autowired
    private ClienteServiceImpl clienteService;
    @Autowired
    private PagoServiceImpl pagoService;
    @Autowired
    private FuncionServiceImpl funcionService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearVenta(@RequestBody VentaDTO dto) {
        try {
            Cliente cliente = clienteService.findByEmail(dto.getCorreo());
            if (cliente == null) {
                cliente = new Cliente();
                cliente.setNombre(dto.getNombre());
                cliente.setEmail(dto.getCorreo());
                cliente = clienteService.save(cliente);
            }

            Pago pago = new Pago();
            pago.setTipo(TipoPago.valueOf(dto.getTipo()));
            pago.setMonto(dto.getMonto());
            pago = pagoService.save(pago);

            
            Funcion funcion = funcionService.findById(Long.valueOf(dto.getFuncionId()));
            if (funcion == null) {
                return ResponseEntity.badRequest().body("Función no encontrada");
            }

           
            Venta venta = new Venta();
            venta.setFecha(new Date());
            venta.setPago(pago);
            venta.setCliente(cliente);
            venta.addFuncion(funcion);

            
            servicio.save(venta);

            return ResponseEntity.ok("Venta creada correctamente");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error al crear la venta: " + e.getMessage());
        }
    }
}
