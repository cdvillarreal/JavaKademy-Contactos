package com.contacts.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.contacts.model.Contact;

@Repository
public interface ContactInterface extends CrudRepository<Contact, Integer>{
	
}
