package com.app.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Contact;

@Repository
public interface ContactInterface extends CrudRepository<Contact, Integer>{
	
}
