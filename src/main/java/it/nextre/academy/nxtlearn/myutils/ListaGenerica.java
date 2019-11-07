package it.nextre.academy.myutils;

import java.util.ArrayList;
import java.util.Random;

public class ListaGenerica<T> {
    private  ArrayList lista;
    Random r=new Random();
    public ListaGenerica(){
        this.lista=new ArrayList<T>();
    }
    private void rimuoviCasuale(){
        if(!lista.isEmpty())
            lista.remove(lista.get(r.nextInt(lista.size())));
    }

    public void add(T param){
        if(lista.contains(param)){
            System.out.println("Elemento già presente o lista vuota");
        }else {
            lista.add(param);
            System.out.println("Elemento inserito correttamente");
        }
    }

    @Override
    public String toString() {
        return "ListaGenerica{" +
                "lista=" + lista +
                '}';
    }
}//end class
