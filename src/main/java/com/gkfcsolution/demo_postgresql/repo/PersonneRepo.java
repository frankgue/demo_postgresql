package com.gkfcsolution.demo_postgresql.repo;

import com.gkfcsolution.demo_postgresql.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonneRepo extends JpaRepository<Person, Long> {
}
