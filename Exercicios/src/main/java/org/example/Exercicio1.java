package org.example;

public class Exercicio1 {
    public static void main(String[] args) {
            ticoTeco();
        }

    public static void ticoTeco() {
        for(int i=1; i<=100;i++){
            //multiplos de 3 e 5 TicoTeco
            if(i%3==0 && i%5==0){
                System.out.print("TicoTeco");
            }
            //multiplos de 3 -> Tico
            else if(i%3==0){
                System.out.print("Tico");
            }
            //multiplos de 5 -> Teco
            else if(i%5==0){
                System.out.print("Teco");
            }
            else{
                System.out.print(i);
            }
            System.out.print(", ");
        }
    }
}