package com.contacts.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.contacts.models.ContactModel;

@Repository
public interface ContactInterface extends CrudRepository<ContactModel, Integer>{
	
}
