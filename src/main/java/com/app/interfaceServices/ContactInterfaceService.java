package com.app.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.app.model.Contact;

public interface ContactInterfaceService {
	public List<Contact>listing();
	public Optional<Contact>listingId(int id);
	public int save(Contact c);
	public void delete(int id);
}
