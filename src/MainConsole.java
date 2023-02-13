/*
* File: ButtonPanel.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I-1 N
* Date: 2023-02-06
* Github: https://github.com/andoattila/
* Licenc: GNU GPL
*/
import java.util.Scanner;


public class MainConsole {

    public MainConsole() {
        task();
        about();
        doit();
    }
    private void task(){
        System.out.println("Feladat 251 megoldása");
        System.out.println("Paraleogramma területe");
    }
    private void about(){
        System.out.println("Repülő Géza");
        System.out.println("Szoft I-1 N");
        System.out.println("2023-02-06");
    }
    private String input(String msg){
        System.out.println(msg);
       Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }
    private void doit(){
        String asideStr = input("A oldal");
        String bsideStr = input("B oldal");
        String gammaStr = input("Gamma:");

        double aside = Double.parseDouble(asideStr);
        double bside = Double.parseDouble(bsideStr);
        double gamma = Double.parseDouble(gammaStr);

        Paraleogramma para = new Paraleogramma();
        double area = para.calcArea(aside, bside, gamma);
        System.out.printf("%.2f\n",area);
    }
}