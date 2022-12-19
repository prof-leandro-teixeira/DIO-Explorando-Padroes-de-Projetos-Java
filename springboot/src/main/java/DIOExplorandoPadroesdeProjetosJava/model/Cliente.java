package DIOExplorandoPadroesdeProjetosJava.model;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Lond id;
    private String nome;
    @ManyToOne
    private Endereco endereco;

    public Lond getId() {
        return id;
    }

    public void setId(Lond id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
