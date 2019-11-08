package it.nextre.academy.nxtlearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "guide")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Guida extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull @NotBlank @Size(min = 1,max = 255,message = "Nome guida compreso tra 1 e 255 caratteri")
    private String nome;
    @Null @Size(max = 255,message = "Url guida max 255 caratteri")
    private String url;
    @Type(type = "text")
    private String descrizione;
    @Null @Size(max = 255,message = "Url immaagine max 255 caratteri")
    private String imagePath;
    @ManyToOne
    private Livello livello;
    @ManyToMany(mappedBy = "guide")
    List<Persona> persone;

}//end class
