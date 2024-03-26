package com.saborexpress.saborexpress.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.saborexpress.saborexpress.domain.ClienteEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {


    @NotBlank(message = "nome nao pode estar vazia")
    private String nome;

    @NotBlank(message = "email nao pode estar vazia")
    @Size(min = 5)
    private String email;



    @NotNull
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private ClienteEnum documento;

}