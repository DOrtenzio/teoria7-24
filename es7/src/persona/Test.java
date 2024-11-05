package persona;

import java.util.Scanner;

public class Test {
    public static void main (String [] args){
        Scanner in=new Scanner(System.in);
        Persona x1=new Persona("Gigi","Kr, via B. Zaccagnini 77");
        Studente x2=new Studente("Marcolino", "VCO, via Camozzi 909");
        Professore x3=new Professore("Giovanni","MI, via pasquale 34","AB01","Lettere e filosofia");

        System.out.println("PERSONA\n");
        x1.visualizza();

        System.out.println("\nSTUDENTE\n");
        x2.visualizza();

        System.out.println("\nPROFESSORE\n");
        x3.visualizza();

        System.out.println("--------------------------");
        System.out.println("Inserire nuovo indirizzo studente:");
        x2.setIndirizzo(in.next());

        System.out.println("STUDENTE\n");
        x2.visualizza();
    }
}
