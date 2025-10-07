    package SES.SES_Araquari.Entity;
    import jakarta.persistence.*;

    import java.time.LocalDate;

    @Entity
    public class Inscricao {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idInscricao;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "idEquipe", referencedColumnName = "idEquipe")
        private Equipe equipe;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "idEsporte",referencedColumnName = "idEsporte")
        private Esporte esporte;
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "idAtleta", referencedColumnName = "idAtleta")
        private Atleta atleta;
        @ManyToOne
        @JoinColumn(name = "idTreinador", referencedColumnName = "idTreinador")
        private EquipeTreinador equipeTreinador;
        @Column(nullable = false)
        private  String nomeCompeticao;
        @Column(nullable = false)
        private LocalDate dataInscriao;
        @Column(nullable = false)
        private LocalDate dataCompeticao;
        @Column(columnDefinition = "tinyint(1) default 1")
        private boolean status;

        public Inscricao(){}

        public Inscricao(Equipe equipe, Esporte esporte, Atleta atleta, EquipeTreinador equipeTreinador, String nomeCompeticao, LocalDate dataInscriao, LocalDate dataCompeticao, boolean status) {
            this.equipe = equipe;
            this.esporte = esporte;
            this.atleta = atleta;
            this.equipeTreinador = equipeTreinador;
            this.nomeCompeticao = nomeCompeticao;
            this.dataInscriao = dataInscriao;
            this.dataCompeticao = dataCompeticao;
            this.status = status;
        }

        public Equipe getEquipe() {
            return equipe;
        }

        public void setEquipe(Equipe equipe) {
            this.equipe = equipe;
        }

        public Long getIdInscricao() {
            return idInscricao;
        }

        public void setIdInscricao(Long idInscricao) {
            this.idInscricao = idInscricao;
        }

        public Esporte getEsporte() {
            return esporte;
        }

        public void setEsporte(Esporte esporte) {
            this.esporte = esporte;
        }

        public Atleta getAtleta() {
            return atleta;
        }

        public void setAtleta(Atleta atleta) {
            this.atleta = atleta;
        }

        public String getNomeCompeticao() {
            return nomeCompeticao;
        }

        public void setNomeCompeticao(String nomeCompeticao) {
            this.nomeCompeticao = nomeCompeticao;
        }

        public EquipeTreinador getEquipeTreinador() {
            return equipeTreinador;
        }

        public void setEquipeTreinador(EquipeTreinador equipeTreinador) {
            this.equipeTreinador = equipeTreinador;
        }

        public LocalDate getDataInscriao() {
            return dataInscriao;
        }

        public void setDataInscriao(LocalDate dataInscriao) {
            this.dataInscriao = dataInscriao;
        }

        public LocalDate getDataCompeticao() {
            return dataCompeticao;
        }

        public void setDataCompeticao(LocalDate dataCompeticao) {
            this.dataCompeticao = dataCompeticao;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }
    }
