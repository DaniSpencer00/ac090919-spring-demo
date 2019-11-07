package it.nextre.academy.myutils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MyOutput {

    public static void stampaVetContrarioStringhe(String[] vet) {
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }

    //--------------------------------------------------
    public static void stampaVetContrarioNumeri(int[] vet) {
        for (int i = vet.length - 1; i >= 0; i--) {
            System.out.println(vet[i]);
        }
    }

    //-------------------------------------------------
    public static double mediaVet(double[] vet) {
        double media = 0;
        for (double i : vet) {
            media += i;
        }
        return media / vet.length;
    }

    //----------------------------------------------------
    public static void visVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print("[" + vet[i] + "]");
        }
    }

    //----------------------------------------------------
    public static String invertiStringa(String str) {
        String appo = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            appo += "" + str.charAt(i);
        }
        str = appo;
        return str;
    }

    public static String cammelloSpaziale(String str) {
        String[] vet = new String[str.length()];
        byte appoIndice = 0;
        String strAppo = "";
        for (int i = 0; i < str.length(); i++) {
            vet[i] = "" + str.charAt(i);
            if (str.charAt(i) == ' ') {
                str.trim();
                appoIndice = (byte) i;
                break;
            }
        }
        String sasso = "" + str.charAt(appoIndice - 1);
        sasso.toUpperCase();
        for (String i : vet
        ) {
            strAppo += "" + i;
        }
        for (int i = appoIndice - 1; i < str.length(); i++) {
            str += str.charAt(i);
        }
        String stringaDef = strAppo + sasso + str;
        str = stringaDef;
        return str;
    }

    public static String formattaDouble(double n) {
    NumberFormat formatter = new DecimalFormat("#0.00");
    return formatter.format(n);
}
}//end class
