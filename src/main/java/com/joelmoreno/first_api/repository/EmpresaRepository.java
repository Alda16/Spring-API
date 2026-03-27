package com.joelmoreno.first_api.repository;

import com.joelmoreno.first_api.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository  extends JpaRepository<Empresa, Long> {
}
