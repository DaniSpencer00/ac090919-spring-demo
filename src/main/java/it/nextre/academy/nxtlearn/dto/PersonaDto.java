package it.nextre.academy.nxtlearn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor @NoArgsConstructor
public class PersonaDto {
    private Integer id;
    private String nome;
    private String cognome;
    private Set guide= new HashSet();
}//end class
