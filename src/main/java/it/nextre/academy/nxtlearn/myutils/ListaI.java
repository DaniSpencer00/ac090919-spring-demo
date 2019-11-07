package it.nextre.academy.myutils;

public class ListaI {
    private int [] mem;

    public ListaI(){
        mem=new int [0];
    }

    public void add(int n){
        int [] tmp= new int [mem.length+1];
        for (int i = 0; i < mem.length; i++) {
            tmp[i]=mem[i];
        }
        tmp[tmp.length-1]=n;
        mem=tmp;
    }

    public boolean contains(int num){
        for (int i = 0; i<mem.length; i++) {
            if(mem[i]==num)
                return true;
        }
        return false;
    }
    public void visLista(){
        for (int i = 0; i<mem.length; i++) {
            System.out.print("["+mem[i]+"]");
        }
    }


    public void clear() {
        mem=new int [0];
    }
}//end class
