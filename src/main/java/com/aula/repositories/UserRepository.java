package com.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.entities.User;

	//Camada de acesso a dados;
public interface UserRepository extends JpaRepository<User, Long> {

}
