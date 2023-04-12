package me.dio.academia.digital.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity
//@Table(name = "tb_alunos")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Aluno {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

//    @Column(unique = true)
    private String cpf;

    private String bairro;

    private LocalDate dataDeNascimento;

//    @OneToMany(mappedBy = "aluno", cascade = CascadeType.REMOVE , fetch = FetchType.LAZY)
//    @JsonIgnore
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

}