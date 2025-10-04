package Entity;

import jakarta.persistence.*;


import java.time.LocalDate;


@Entity
public class EquipeTreinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTreinador;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "idEquipe", referencedColumnName = "idEquipe")
    private Equipe equipe;
    private String nome;
    private String sobrenome;
    @Column(nullable = false, unique = true)
    private String cpf;
    private LocalDate dataNascimento;
    private String funcao;
    private String telefone;
    private String sexo;
    private LocalDate dataCadastro;

    public EquipeTreinador(){}


    public EquipeTreinador(LocalDate dataCadastro, String sexo, String telefone, LocalDate dataNascimento, String funcao, String cpf, String sobrenome, String nome, Equipe equipe) {
        this.dataCadastro = dataCadastro;
        this.sexo = sexo;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.funcao = funcao;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.equipe = equipe;
    }

    public Long getIdTreinador() {
        return idTreinador;
    }

    public void setIdTreinador(Long idTreinador) {
        this.idTreinador = idTreinador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
