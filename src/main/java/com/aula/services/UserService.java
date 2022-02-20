package com.aula.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.aulaDto.UserDto;
import com.aula.entities.User;
import com.aula.repositories.UserRepository;

//Camada de serviço;
@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDto findById(Long id) {
		User entity = repository.findById(id).get();
		UserDto dto = new UserDto(entity);
		return dto;
		
	}
}
