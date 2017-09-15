package org.carlof.contactmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

	@Autowired
	ContactsService service;

	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getAll() {
		
		List<Contact> findAll = service.retrieveAll();
		
		return ResponseEntity.ok(findAll);
	}

	@GetMapping("/contacts/{id}")
	public ResponseEntity<Contact> get(@PathVariable("id") Long id) {
		
		Contact contact = service.retrieve(id);
		
		return ResponseEntity.ok(contact);
	}

	@PutMapping("/contacts/{id}")
	public ResponseEntity<Contact> put(@PathVariable("id") Long id, @RequestBody Contact contact) {
		
		service.update(id, contact);
		
		return ResponseEntity.ok(contact);
	}

	@DeleteMapping("/contacts/{id}")
	public ResponseEntity<Object> remove(@PathVariable("id") Long id) {

		service.remove(id);

		return ResponseEntity.noContent().build();
	}

	@PostMapping("/contacts")
	public ResponseEntity<Object> post(@RequestBody Contact contact) {

		service.store(contact);

		return ResponseEntity.status(HttpStatus.CREATED).body(contact);
	}
}
