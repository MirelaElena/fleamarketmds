package ro.unibuc.fmi.fleamarket.fleamarket.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.unibuc.fmi.fleamarket.fleamarket.repository.PersonRepository;
import ro.unibuc.fmi.fleamarket.fleamarket.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PersonRepository personRepository;


}
