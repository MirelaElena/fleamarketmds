package com.unibuc.mds.controllers;

import com.unibuc.mds.repository.PersonRepository;
import com.unibuc.mds.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PersonRepository personRepository;


}
