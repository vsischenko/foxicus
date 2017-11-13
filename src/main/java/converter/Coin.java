package converter;

import java.util.ArrayList;

public class Coin {

    public double coinQuantity = 0.00;
    public double courseOfCoinToUSDforToday = 225;
    public double procentAmount = 0.9;
    public int numberOfFroze = 295;
    public double rizeOfCoursePerDay = 2;

    static void CoinDep(int usd, double rizeOfCoursePerDay, double numberOfFroze, double courseOfCoinToUSDforToday) {
        System.out.println("Вложили " + usd + " у.е.");
        System.out.println("Купили на них " + (usd / courseOfCoinToUSDforToday) + " BCC");
        System.out.println("Через " + numberOfFroze + " дней заморозки они будут стоить " + ((usd / courseOfCoinToUSDforToday) * (rizeOfCoursePerDay * numberOfFroze + courseOfCoinToUSDforToday)) + " у.е.");
    }

    static void usdDep(double usd, double daylyAmount, boolean reinvest, int numberOfFroze) {
        double reinvestind = 0;
        int daycount = 0;
        double persent = 0;
        double nonreinv = 0;
        ArrayList arr= new ArrayList();
        do {
            persent = usd * daylyAmount;
            reinvestind = reinvestind + persent;
            if (reinvest) {
                if (reinvestind >= 10) {
                    usd = usd + reinvestind;
                    reinvestind = 0;
                }

            } else {
                nonreinv = nonreinv + persent;
             if (nonreinv>=usd) {arr.add(daycount);

             }
            }
            daycount++;
        } while (numberOfFroze > daycount);

        if (nonreinv == 0) {
            System.out.println("При выбранной стратегии сумма равна " + usd);
        } else {
            System.out.println("Вариант без реинвеста = " + (usd + nonreinv) + "у.е.");
            System.out.println("Безопасность наступит на "+ arr.get(0)+" день");
        }
    }

}

