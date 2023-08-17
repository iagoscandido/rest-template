package com.iagoscandido.demoresttemplate.repository;

import com.iagoscandido.demoresttemplate.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {


    Optional<Address> findByCep(String cep);

}
