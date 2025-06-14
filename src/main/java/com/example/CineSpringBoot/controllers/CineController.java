package com.example.CineSpringBoot.controllers;

import com.example.CineSpringBoot.entities.Cine;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/cine")
public class CineController extends BaseControllerImpl<Cine, Cin>{
}
