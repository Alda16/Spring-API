package com.joelmoreno.first_api.service;

import com.joelmoreno.first_api.model.Empresa;
import com.joelmoreno.first_api.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    //Inyeccion de dependecias
    public EmpresaService (EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    //Guardar
    public Empresa crearEmpresa(Empresa nuevaEmpresa) {
        nuevaEmpresa.setActivo(true);
        return empresaRepository.save(nuevaEmpresa);
    }

    //Consultar
    public List<Empresa> obtenerTodos() {
        return empresaRepository.findAll();
    }

}
