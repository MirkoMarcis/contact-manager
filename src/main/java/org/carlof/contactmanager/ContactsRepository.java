package org.carlof.contactmanager;

import org.springframework.data.repository.CrudRepository;


public interface ContactsRepository extends CrudRepository<Contact, Long>{

}
