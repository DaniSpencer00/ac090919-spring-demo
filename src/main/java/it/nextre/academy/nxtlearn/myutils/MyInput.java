package it.nextre.academy.myutils;

import java.util.Scanner;


public class MyInput {
    public static String leggiRiga(){
        Scanner s = new Scanner(System.in);
        return s.nextLine();
    }
//-----------------------------------------------------
    public static int leggiInteroPositivo() {
        Scanner s = new Scanner(System.in);
        String tmp="";
            tmp = s.nextLine().trim();
        String numeri="0123456789";
        for(int i=0;i<tmp.length();i++ ){
            if(numeri.indexOf(tmp.charAt(i)) <0  ){
                if (i==0 && tmp.charAt(i)=='+' ) {}else {
                    //trovato carattere non valido
                    System.out.println("Input non valido, riprova");
                    return leggiInteroPositivo();
                }
            }
        }
        //se arrivo qui tmp è una sequenza di numeri positiva
        try{
            return Integer.parseInt(tmp);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Input non valido, riprova");
            return leggiInteroPositivo();
        }

    }
    public static int leggiIntero2(){
        Scanner s = new Scanner(System.in);
        String tmp="";
        tmp = s.nextLine().trim();
        try {
            return Integer.parseInt(tmp);
        }catch(NumberFormatException e){
            System.out.println("Valore non valido");
            return leggiIntero2();
        }
    }

//-----------------------------------------------
    public static int leggiIntero() {
        Scanner s = new Scanner(System.in);
        String tmp = s.nextLine().trim();
        String numeri = "0123456789";
        for (int i = 0; i < tmp.length(); i++) {
            if (numeri.indexOf(tmp.charAt(i)) < 0) {
                if (i == 0 && (tmp.charAt(i) == '+' || tmp.charAt(i) == '-')) {
                } else {
                    //trovato carattere non valido
                    System.out.println("Input non valido, riprova");
                    return leggiIntero();
                }
            }
        }
        //se arrivo qui tmp è una sequenza di numeri positiva
        try{
            return Integer.parseInt(tmp);
        }catch(NumberFormatException e){
            System.out.println(e);
            System.out.println("Input non valido, riprova");
            return leggiIntero();
        }
    }
    //---------------------------------------------
    public static String leggiSioNo(){
        Scanner s = new Scanner(System.in);
        boolean flag=false;
        String tmp="";
        while(!flag) {
            tmp = s.nextLine().toLowerCase();
            if (tmp.equals("si") || tmp.equals("no") || tmp.equals("sì")) {
                flag = true;
            }else{
                System.out.println("Errore nella scrittura della decisione");
            }
        }
        return tmp;
    }
    //--------------------------------------------



}//end class
