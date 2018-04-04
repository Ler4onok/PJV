/*
 * File name: Lab02.java
 * Date:      2018/03/18 21:39
 * Author:    @chyzhval
 */

package cz.cvut.fel.pjv;

import java.util.Scanner;

public class Lab02 {

    Scanner sc = new TextIO().stdin;
    private double[] numbers = new double[10];
    public int number_counter = 0;
    private double prumer = 0;
    private double odchylka = 0;

    public void start(String[] args) {

        if (args.length == 0 || args[0] == "1" || args[0] == "2" || args[0] == "3" || args[0] == "4") {
            homework();
        }
    }

    public void homework() {

        int line_counter = 0;
        boolean end = false;

        while (!end) {

            number_counter = 0;

            for(int i = 0; i < 10; i++) {

                if(sc.hasNextLine()) {

                    line_counter++;
                    String line = sc.nextLine();




                    if(!(TextIO.isDouble(line)) && !(TextIO.isFloat(line)) && !(TextIO.isInteger(line))) {

                        System.err.println("A number has not been parsed from line " + line_counter);
                        i--;
                    }

                    else {
                        double cislo = Double.parseDouble(line);
                        numbers[i] = cislo;
                        number_counter++;

                    }

                } else {
                    System.err.println("End of input detected!");
                    if (number_counter >= 2) {
                        calculate();
                    }
                    end = true;
                    break;
                }
            }

            if (!end){
                calculate();
            }


        }

    }

    public void calculate() {

        // Prumer

        prumer = 0;

        for (int i = 0; i < number_counter; i++) {
            prumer = prumer + numbers[i];
        }

        prumer = prumer / number_counter;

        // Odchylka

        odchylka = 0;
        double rozdil, suma = 0;

        for (int i = 0; i < number_counter; i++) {
            rozdil = Math.pow((numbers[i] - prumer), 2);
            suma += rozdil;
        }

        odchylka = Math.sqrt(suma / number_counter);

        System.out.printf("%2d %.3f %.3f\n", number_counter, prumer, odchylka);

    }
}

/* end of Lab02.java */
