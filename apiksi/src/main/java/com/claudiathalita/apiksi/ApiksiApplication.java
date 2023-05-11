package com.claudiathalita.apiksi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.claudiathalita.apiksi.entity.Cliente;
import com.claudiathalita.apiksi.entity.Json;
import com.claudiathalita.apiksi.repository.ClienteRepository;
import com.claudiathalita.apiksi.repository.JsonRepository;

@SpringBootApplication
public class ApiksiApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private JsonRepository jsonRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApiksiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Cliente cli1 = new Cliente(null, "Claudia","claudia@emailcom",12345678910L);
		Json json = new Json();
		json.setAccepted_devices(new String[] { "Google Pixel 2XL (8.1.0)" });
		json.setRejected_devices(new String[0]);
		
		jsonRepository.saveAll(Arrays.asList(json));
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		

		
		
	}
	
 

}
