package org.carlof.contactmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsService {
	
	@Autowired
	ContactsRepository repository;
	
	@Autowired
	UserRepository userRepository;
	
	public void store(Contact contact) {
		repository.save(contact);
	}

	public void remove(Long id) {
		repository.delete(id);		
	}
	
	public List<Contact> retrieveAll() {
		return (List<Contact>) repository.findAll();
	}

	public void update(Long id, Contact contact) {
		repository.save(contact);
	}

	public Contact retrieve(Long id) {
		Contact contact = repository.findOne(id);
		return contact;
	}
}
