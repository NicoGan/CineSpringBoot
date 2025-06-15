package com.example.CineSpringBoot.controllers;

import com.example.CineSpringBoot.ServicesImpl.SalaServiceImpl;
import com.example.CineSpringBoot.entities.Sala;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/salas")
public class SalaController extends BaseControllerImpl<Sala, SalaServiceImpl>{
}
