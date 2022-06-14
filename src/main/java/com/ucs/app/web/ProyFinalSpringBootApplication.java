package com.ucs.app.web;

import com.ucs.app.web.model.Cliente;
import com.ucs.app.web.repository.ClienteRepository;
import com.ucs.app.web.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyFinalSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyFinalSpringBootApplication.class, args);
	}
        
        @Autowired
        private ClienteRepository repository;
        
        
        //private ProductoRepository productorepository;

    @Override
    public void run(String... args) throws Exception {
//        Cliente cliente1 = new Cliente("Ricardo", "Quine", "159", "987654321", "rq@gmail.com");
//        repository.save(cliente1);
//        
//        Cliente cliente2 = new Cliente("Jorge", "Rodriguez", "874", "987", "jr@gmail.com");
//        repository.save(cliente2);
//        
//        Cliente cliente3 = new Cliente("Josue", "Alcalde", "4512", "654", "ja@gmail.com");
//        repository.save(cliente3);
    }
            

}
