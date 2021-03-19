package com.rm.devop.apiarmz.repository;

import com.rm.devop.apiarmz.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {



}
