package SES.SES_Araquari.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipe;
    @Column(nullable = false)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "id_esporte", referencedColumnName = "idEsporte")
    private Esporte esporte;
    private LocalDate anoFundacao;
    @Column(columnDefinition = "tinyint(1) default 1")
    private boolean status;

    public Equipe() {}

    public Equipe(String nome, Esporte esporte, LocalDate anoFundacao, boolean status) {
        this.nome = nome;
        this.esporte = esporte;
        this.anoFundacao = anoFundacao;
        this.status = status;
    }

    public Long getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Esporte getEsporte() {
        return esporte;
    }

    public void setEsporte(Esporte esporte) {
        this.esporte = esporte;
    }

    public LocalDate getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(LocalDate anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
