package com.courses.capacitacionesflypass.sesion1.f.solid.LiskovSubstitution.casoDos.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
