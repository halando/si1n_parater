/*
* File: ButtonPanel.java
* Author: Andó Attila
* Copyright: 2023, Andó Attila
* Group: Szoft I-1 N
* Date: 2023-02-06
* Github: https://github.com/andoattila/
* Licenc: GNU GPL
*/
public class Paraleogramma {

    public Paraleogramma() {
    }
    
    public double calcArea(double aside, double bside, double gamma) {
        double rad = gamma * Math.PI /180;
        double area = aside*bside*Math.sin(rad);
        return area;
    }
    
}
