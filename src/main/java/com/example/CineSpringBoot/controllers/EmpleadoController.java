package com.example.CineSpringBoot.controllers;

import com.example.CineSpringBoot.entities.Empleado;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CineSpringBoot.ServicesImpl.EmpleadoServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/empleados")
public class EmpleadoController extends BaseControllerImpl<Empleado, EmpleadoServiceImpl> {
}
