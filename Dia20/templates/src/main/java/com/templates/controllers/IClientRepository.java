package com.templates.controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.templates.models.Client;



@Repository
public interface IClientRepository extends JpaRepository<Client, Long>{

}
