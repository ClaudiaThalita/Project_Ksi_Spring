package com.claudiathalita.apiksi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.claudiathalita.apiksi.entity.Cliente;
import com.claudiathalita.apiksi.entity.Json;
import com.claudiathalita.apiksi.repository.ClienteRepository;
import com.claudiathalita.apiksi.repository.JsonRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository repo;
	
	@Autowired
	private JsonRepository repojson;
	
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
	@PostMapping("/saveCliente")
	public String saveEmployee(@ModelAttribute Cliente cliente) {
		repo.save(cliente);
		return "redirect:/list";
	}
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long clienteId) {
		ModelAndView mav = new ModelAndView("add-cliente-form");
		Cliente cliente = repo.findById(clienteId).get();
		mav.addObject("cliente", cliente);
		return mav;
	}
	@GetMapping("/deleteCliente")
	public String deleteCliente(@RequestParam Long clienteId) {
		repo.deleteById(clienteId);
		return "redirect:/list";
	}
	@GetMapping("/jsonClient")
	@ResponseBody
	public Json jsonClient() {
	    Json json = new Json();
	    json.setAccepted_devices(new String[] { "Google Pixel 2XL (8.1.0)" });
	    json.setRejected_devices(new String[0]); 
	    return json;
	}

	
	@GetMapping("/jsonCliente")
	@ResponseBody
	public ModelAndView jsonClientes() {
		ModelAndView mav = new ModelAndView("list-clientes");
		List<Json> json = repojson.findAll();
		mav.addObject("json", json);
	    return mav;
	}


}


