package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.interfaceServices.ContactInterfaceService;
import com.app.interfaces.ContactInterface;
import com.app.model.Contact;

@Service
public class ContactService implements ContactInterfaceService{

	@Autowired
	private ContactInterface data;
	
	@Override
	public List<Contact> listing() {
		return (List<Contact>)data.findAll();
	}

	@Override
	public Optional<Contact> listingId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Contact c) {
		int res = 0;
		Contact contact = data.save(c);
		if(!contact.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
