package it.nextre.academy.nxtlearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Entity
@Table(name = "livelli")
@Data
@AllArgsConstructor @NoArgsConstructor
public class Livello extends BaseEntity{
    @NotBlank
    @NotEmpty//todo testare carattere d'invio se viene trimmato oppure no
    private String descrizione;
    @Min(value=1,message = "Descrizione valore minimo 1")
    @Max(value=3,message = "Descrizione valore massimo 3")
    private Integer difficolta;
}//end class
