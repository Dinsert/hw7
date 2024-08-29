public class Main {
    public static void main(String[] args) {


        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2459000) {
            total = total + deposit;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }


        int number = 0;
        while (number < 10) {
            number += 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        int totalNumber = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            int birthRate = 17 * totalNumber / 1000;
            int deathRate = 8 * totalNumber / 1000;
            totalNumber = totalNumber + birthRate - deathRate;
            System.out.println("Год " + i + " численность населения составляет " + totalNumber);
        }


        int contribution = 15000;
        int month1 = 0;
        while (contribution < 12_000_000) {
            contribution = contribution + contribution / 12 * 7 / 100;
            month1++;
            System.out.println("Месяц " + month1 + " сумма накоплений равна " + contribution + " рублей");
        }


        int contribution1 = 15000;
        int month2 = 0;
        while (contribution1 < 12_000_000) {
            contribution1 = contribution1 + contribution1 / 12 * 7 / 100;
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + contribution1 + " рублей");
            }
        }


        int contribution2 = 15000;
        int month3 = 0;
        while (month3 <= 108) {
            contribution2 = contribution2 + contribution2 / 12 * 7 / 100;
            month3++;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + contribution2 + " рублей");
            }
        }


        int day = 2;
        while (day <= 31) {
            System.out.println("Сегодня пятница, " + day + " -е число. Необходимо подготовить отчёт");
            day = day + 7;
        }


        int currentYear = 2024;
        int yearAgo = currentYear - 200;
        int yearAfter = currentYear + 100;
        while (yearAgo < yearAfter) {
            yearAgo++;
            if (yearAgo%79==0){
                System.out.println(yearAgo);
            }
        }

    }
}