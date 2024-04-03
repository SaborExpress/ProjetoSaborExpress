package com.saborexpress.saborexpress.model;


import com.saborexpress.saborexpress.domain.ClienteEnum;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Cliente")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O Atributo Nome é Obrigatório!")
    private String nome;

    @Column(length = 100)
    private String email;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ClienteEnum documento;



}
