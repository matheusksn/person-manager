package com.matheusksn.personmanager.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Data
@Generated
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @CPF
    @NotNull
    @NotNull
    private String cpf;

    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String phone;

    @NotNull
    @NotEmpty
    private String birthDate;

}
