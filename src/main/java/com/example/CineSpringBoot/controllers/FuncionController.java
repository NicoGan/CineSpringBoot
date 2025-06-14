package com.example.CineSpringBoot.controllers;

import com.example.CineSpringBoot.entities.Funcion;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CineSpringBoot.ServicesImpl.FuncionServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/funciones")
public class FuncionController extends BaseControllerImpl<Funcion, FuncionServiceImpl> {
}
