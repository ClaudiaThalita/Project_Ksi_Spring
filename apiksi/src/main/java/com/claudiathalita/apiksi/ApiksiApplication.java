package com.claudiathalita.apiksi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.claudiathalita.apiksi.entity.Cliente;
import com.claudiathalita.apiksi.repository.ClienteRepository;

@SpringBootApplication
public class ApiksiApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiksiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Cliente cli1 = new Cliente(null, "Claudia","claudia@emailcom",12345678910L);
		
		clienteRepository.saveAll(Arrays.asList(cli1));
	}

}
