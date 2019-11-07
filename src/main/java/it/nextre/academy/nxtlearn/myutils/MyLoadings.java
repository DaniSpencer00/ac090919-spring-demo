package it.nextre.academy.myutils;
import java.util.Random;
public class MyLoadings {

    public static void caricaVetIntCas(int [] vet, int min, int max){
        Random r= new Random();
        for(int i=0;i<vet.length;i++){
            vet[i]=r.nextInt(max-min)+min;
        }
    }
    //----------------------------------------------------------------
    public static void caricaVetDoubleCas(double [] vet, int min, int max){
        Random r= new Random();
        for(int i=0;i<vet.length;i++){
            vet[i]=min + (max - min)* r.nextDouble();
        }
    }
    //------------------------------------------------------------------
    public static int [] bubbleSort(int [] vet){
        for (int i = 0; i < vet.length; i++) {
            boolean flag=false;
            for (int j = 0; j < vet.length-1 ; j++) {
                if(vet[j]>vet[j+1]){
                    int appo=vet[j+1];
                    vet[j+1]=vet[j];
                    vet[j]=appo;
                    flag=true;
                }
            }
            if(!flag)break;
        }
        return vet;
    }
}//end class
