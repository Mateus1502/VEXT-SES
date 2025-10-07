package SES.SES_Araquari.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Esporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEsporte;
    @Column(nullable = false)
    private String nomeEsporte;
    @Column(nullable = false)
    private String tipo;
    @Column(columnDefinition = "tinyint(1) default 1")
    private boolean status;
    private LocalDate dataCadastro;

    public Esporte() {}

    public Esporte(String nomeEsporte, String tipo, boolean status, LocalDate dataCadastro) {
        this.nomeEsporte = nomeEsporte;
        this.tipo = tipo;
        this.status = status;
        this.dataCadastro = dataCadastro;
    }

    public Long getIdEsporte() {
        return idEsporte;
    }

    public void setIdEsporte(Long idEsporte) {
        this.idEsporte = idEsporte;
    }

    public String getNomeEsporte() {
        return nomeEsporte;
    }

    public void setNomeEsporte(String nomeEsporte) {
        this.nomeEsporte = nomeEsporte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
}
