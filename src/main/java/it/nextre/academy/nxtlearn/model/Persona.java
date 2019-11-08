package it.nextre.academy.nxtlearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
public class Persona implements Cloneable {
    @Min(value = 1, message = "Id non valido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    @NotBlank(message = "Nome non valido")
    @Size(min = 2, max = 128, message = "Almeno 2 caratteri")
    @Column(nullable = false)
    private String nome;
    @NotBlank(message = "Cognome non valido")
    @Size(min = 1, max = 128, message = "Cognome compreso tra 1 e 16 lettere")
    @Column(nullable = false, length = 128)//length ignoata se usata @size
    private String cognome;
    @ManyToMany
    @JoinTable(name = "rel_persone_guide",
            joinColumns = @JoinColumn(
                    //nome colonna DB
                    name = "persona_id"
            ),
            //nome proprieta'
            inverseJoinColumns = @JoinColumn(
                    name = "guida_id"
            )
    )
    private List<Persona> guide;

    @Override
    public Persona clone() {
        return new Persona(this.id, this.nome, this.cognome, this.guide);
    }

    public void setNome(String nome) {
        this.nome = nome.strip();
    }

    public void setCognome(String cognome) {
        this.cognome = cognome.strip();
    }
}//end class