package SES.SES_Araquari.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Responsavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResponsavel;
    private String nome;
    private String sobrenome;
    @Column(nullable = false, unique = true)
    private String cpf;
    private String email;
    private String telefone;
    private String grauDeParentesco;
    private String endereco;
    private String bairro;
    private int numero;
    private String complemento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAtleta", referencedColumnName = "idAtleta")
    private Atleta atleta;
    private LocalDate dataNascimento;

    public Responsavel() {}

    public Responsavel(String sobrenome, String nome, String cpf, String email, String telefone, String grauDeParentesco, String endereco, String bairro, String complemento, int numero, Atleta atleta, LocalDate dataNascimento) {
        this.sobrenome = sobrenome;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.grauDeParentesco = grauDeParentesco;
        this.endereco= endereco;
        this.bairro = bairro;
        this.complemento = complemento;
        this.numero = numero;
        this.atleta = atleta;
        this.dataNascimento = dataNascimento;
    }

    public Long getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(Long idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGrauDeParentesco() {
        return grauDeParentesco;
    }

    public void setGrauDeParentesco(String grauDeParentesco) {
        this.grauDeParentesco = grauDeParentesco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
