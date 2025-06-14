package com.example.CineSpringBoot.controllers;

import com.example.CineSpringBoot.ServicesImpl.PeliculaServiceImpl;
import com.example.CineSpringBoot.entities.Pelicula;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/peliculas")
public class PeliculaController extends BaseControllerImpl<Pelicula, PeliculaServiceImpl> {
}
