

import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.util.Scanner;

    public class Lab01 {
        Scanner sc = new Scanner(System.in);

        public void start(String[] args) {
            homework();
        }

        public void homework() {
            System.out.print("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");

            switch (sc.nextInt()){
                case (1) :
                    System.out.print("Zadej scitanec: ");
                    double scitanec1 = sc.nextDouble();
                    System.out.print("Zadej scitanec: ");
                    double scitanec2 = sc.nextDouble();
                    double summa = scitanec1+scitanec2;
                    System.out.print("Zadej pocet desetinnych mist: ");
                    int scale1 = sc.nextInt();
                    BigDecimal scitanec11 = new BigDecimal(scitanec1).setScale(scale1, RoundingMode.HALF_EVEN);
                    BigDecimal scitanec22 = new BigDecimal(scitanec2).setScale(scale1, RoundingMode.HALF_EVEN);
                    BigDecimal summa1 = new BigDecimal(summa).setScale(scale1, RoundingMode.HALF_EVEN);
                    System.out.print(scitanec11 + " + " + scitanec22 + " = " + summa1);
                    break;
                case (2):
                    System.out.print("Zadej mensenec: ");
                    double mensenec = sc.nextDouble();
                    System.out.print("Zadej mensitel: ");
                    double mensitel = sc.nextDouble();
                    double raznost = mensenec - mensitel;
                    System.out.print("Zadej pocet desetinnych mist: ");
                    int scale2 = sc.nextInt();
                    BigDecimal mensenec1 = new BigDecimal(mensenec).setScale(scale2, RoundingMode.HALF_EVEN);
                    BigDecimal mensitel1 = new BigDecimal(mensitel).setScale(scale2, RoundingMode.HALF_EVEN);
                    BigDecimal raznost1 = new BigDecimal(raznost).setScale(scale2, RoundingMode.HALF_EVEN);
                    System.out.print(mensenec1 + " - " + mensitel1 + " = " + raznost1);
                    break;
                case (3):
                    System.out.print("Zadej cinitel: ");
                    double cinitel1 = sc.nextDouble();
                    System.out.print("Zadej cinitel: ");
                    double cinitel2 = sc.nextDouble();
                    double proizvedenije = cinitel1*cinitel2;
                    System.out.print("Zadej pocet desetinnych mist: ");
                    int scale3 = sc.nextInt();
                    BigDecimal cinitel11 = new BigDecimal(cinitel1).setScale(scale3, RoundingMode.HALF_EVEN);
                    BigDecimal cinitel22 = new BigDecimal(cinitel2).setScale(scale3, RoundingMode.HALF_EVEN);
                    BigDecimal proizvedenije1 = new BigDecimal(proizvedenije).setScale(scale3, RoundingMode.HALF_EVEN);
                    System.out.print(cinitel11 + " * " + cinitel22 + " = " + proizvedenije1);
                    break;
                case (4):
                    System.out.print("Zadej delenec: ");
                    double delenec = sc.nextDouble();
                    System.out.print("Zadej delitel: ");
                    double delitel = sc.nextDouble();
                    if (delitel == 0){
                        System.out.println("Pokus o deleni nulou!");
                        break;
                    }
                    double chastnoje = delenec/delitel;
                    System.out.print("Zadej pocet desetinnych mist: ");
                    int scale4 = sc.nextInt();
                    BigDecimal delenec1 = new BigDecimal(delenec).setScale(scale4, RoundingMode.HALF_EVEN);
                    BigDecimal delitel1 = new BigDecimal(delitel).setScale(scale4, RoundingMode.HALF_EVEN);
                    BigDecimal chastnoje1 = new BigDecimal(chastnoje).setScale(scale4, RoundingMode.HALF_EVEN);
                    System.out.print(delenec1 + " / " + delitel1 + " = " + chastnoje1);
                    break;
                default:
                    System.out.println("Chybna volba!");


            }
        }
}
