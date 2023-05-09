package com.claudiathalita.apiksi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claudiathalita.apiksi.entity.Cliente;
import com.claudiathalita.apiksi.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository repo;
	
	@GetMapping({"/clientes","/","/list"})
	public ModelAndView showClientes() {
		ModelAndView mav = new ModelAndView("list-clientes");
		List<Cliente> list = repo.findAll();
		mav.addObject("cliente", list);
		return mav;
	}
	
	@GetMapping("/addClienteForm")
	public ModelAndView addClienteForm() {
		ModelAndView mav = new ModelAndView("add-cliente-form");
		Cliente newCliente = new Cliente();
		mav.addObject("cliente", newCliente);
		return mav;
	}
}
