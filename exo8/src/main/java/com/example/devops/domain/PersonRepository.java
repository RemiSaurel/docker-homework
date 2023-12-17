package com.example.devops.domain;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Remi Venant <remi.venant@gmail.com>
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
    
}
