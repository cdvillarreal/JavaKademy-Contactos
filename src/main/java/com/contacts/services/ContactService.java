package com.contacts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contacts.interfaceServices.ContactInterfaceService;
import com.contacts.interfaces.ContactInterface;
import com.contacts.models.ContactModel;

@Service
public class ContactService implements ContactInterfaceService{

	@Autowired
	private ContactInterface data;
	
	@Override
	public List<ContactModel> listing() {
		return (List<ContactModel>)data.findAll();
	}

	@Override
	public Optional<ContactModel> listingId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(ContactModel c) {
		int res = 0;
		ContactModel contact = data.save(c);
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
