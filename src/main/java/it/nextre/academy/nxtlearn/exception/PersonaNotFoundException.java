package it.nextre.academy.nxtlearn.exception;

public class PersonaNotFoundException extends NotFoundException {
    public PersonaNotFoundException(){
        this("NOT FOUND");
    }
    public PersonaNotFoundException(String msg){
        super(msg);
    }
}//end class
