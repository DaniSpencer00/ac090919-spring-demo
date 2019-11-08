package it.nextre.academy.nxtlearn.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@MappedSuperclass
@EqualsAndHashCode
@ToString
@Getter
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_creazione",updatable = false)
    Date dataCreazione;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_modifica",insertable = false)
    Date dataModifica;

    @PrePersist
    void doCreate(){
        this.dataCreazione=new Timestamp(new Date().getTime());
    }
    @PreUpdate
    void doUpdate(){
        this.dataModifica=new Timestamp(new Date().getTime());
    }

    public void setId(Integer id){
        this.id=id;
    }
}//end class
