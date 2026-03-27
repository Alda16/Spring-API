package com.joelmoreno.first_api.controller;

import com.joelmoreno.first_api.model.Empresa;
import com.joelmoreno.first_api.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    //ENDPOINT
    @PostMapping("/crear")
    public Empresa crear(@RequestBody Empresa nuevaEmpresa) {
        return empresaService.crearEmpresa(nuevaEmpresa);
    }

    @GetMapping("/lista")
        public List<Empresa> listarTodo(){
            return empresaService.obtenerTodos();
        }
}
