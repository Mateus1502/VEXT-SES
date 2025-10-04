package Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAtleta;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String sobrenome;
    private String posicao;
    @Column(nullable = false)
    private Integer idade;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(nullable = false,unique = true)
    private String cpf;
    private double altura;
    private double peso;
    private String enderecoRua;
    private String enderecoBairro;
    private int enderecoNumero;
    @Column(columnDefinition = "tinyint(1) default 1")
    private boolean status;
    private LocalDate dataCadastro;
    @ManyToOne
    @JoinColumn(name = "id_esporte", referencedColumnName = "idEsporte")
    private Esporte esporte;
    @ManyToOne
    @JoinColumn(name = "id_equipe", referencedColumnName = "idEquipe")
    private Equipe equipe;
    @OneToMany(mappedBy = "atleta")
    private List<Responsavel> responsaveis = new ArrayList<>();
    private String categoria;
    private String genero;

    public Atleta() {}

    public Atleta(List <Responsavel> responsaveis ,String nome, String sobrenome, String posicao, LocalDate dataNascimento, Integer idade, String cpf, double altura, double peso, String enderecoRua, String enderecoBairro, int enderecoNumero, boolean status, LocalDate dataCadastro, Esporte esporte, Equipe equipe, String genero, String categoria) {
        this.responsaveis = (responsaveis != null) ? new ArrayList<>(responsaveis) : new ArrayList<>();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
        this.enderecoRua = enderecoRua;
        this.enderecoBairro = enderecoBairro;
        this.enderecoNumero = enderecoNumero;
        this.status = status;
        this.dataCadastro = dataCadastro;
        this.esporte = esporte;
        this.equipe = equipe;
        this.genero = genero;
        this.categoria = categoria;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public int getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(int enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(Long idAtleta) {
        this.idAtleta = idAtleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public void setEsporte(Esporte esporte) {
        this.esporte = esporte;
    }

    public List<Responsavel> getResponsaveis() {
        return responsaveis;
    }

    public void setResponsaveis(List<Responsavel> responsaveis) {
        this.responsaveis = responsaveis;
    }
}
