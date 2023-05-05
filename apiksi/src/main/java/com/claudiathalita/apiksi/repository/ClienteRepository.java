package com.claudiathalita.apiksi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claudiathalita.apiksi.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
