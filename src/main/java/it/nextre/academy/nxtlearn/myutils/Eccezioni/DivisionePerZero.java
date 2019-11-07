package it.nextre.academy.myutils.Eccezioni;

public class DivisionePerZero extends RuntimeException{
    public DivisionePerZero(String msg){
        super(msg);
    }
    public DivisionePerZero(){
        this("");
    }
}//end class
