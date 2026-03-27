package com.joelmoreno.first_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //Conversion de clase a tabla
@Table (name = "Empresas") //Nombrar la tabla
public class Empresa {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrementable ID
    private Long id; //Variable ID

    private String claveEmpresa; //Clave publica
    private Boolean activo; //Status
}
