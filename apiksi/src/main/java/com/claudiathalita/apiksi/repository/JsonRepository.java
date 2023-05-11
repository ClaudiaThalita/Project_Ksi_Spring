package com.claudiathalita.apiksi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claudiathalita.apiksi.entity.Json;


@Repository
public interface JsonRepository extends JpaRepository<Json, Integer>{

}
