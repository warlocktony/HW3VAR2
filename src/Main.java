public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1 () {
        System.out.println("task 1");
        int a = 400;
        System.out.println("the value of a variable <a> with the type <int> is " + a);
        byte b = 34;
        System.out.println("the value of a variable <b> with the type <byte> is " + b);
        short c = 567;
        System.out.println("the value of a variable <c> with the type <short> is " + c);
        long d = 1567;
        System.out.println("the value of a variable <d> with the type <long> is " + d);
        float e = 4.56f;
        System.out.println("the value of a variable <e> with the type <float> is " + e);
        double f = 7.123456;
        System.out.println("the value of a variable <f> with the type <double> is " + f);
    }

    public static void task2 () {
        System.out.println("task 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3 () {
        System.out.println("task 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short teachersPaper = 480;
        int allStudent = (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        int numberOfPaper = teachersPaper / allStudent;
        System.out.println("on one student calculated " + numberOfPaper + " list of paper");
    }

    public static void task4 () {
        System.out.println("task 4");
        byte generalMinutes = 2;
        byte generalBottels = 16;
        int bottleForOneMinute = generalBottels / generalMinutes;
        int ifMinuteTwenty = 20;
        int bottleForTwentyMinets = ifMinuteTwenty * bottleForOneMinute;
        System.out.println("For " + ifMinuteTwenty + " minute " + " the machine produced " + bottleForTwentyMinets + " pieces of bottles");
        byte day = 1;
        int hourInDay = 24;
        int minutesInHour = 60;
        int minutesInDay = hourInDay * minutesInHour;
        int bottelForDay = bottleForOneMinute * minutesInDay;
        System.out.println("For " + day + " day " + " the machine produced " + bottelForDay + " pieces of bottles");
        byte threeDays = 3;
        int minutesInThreeDays = threeDays * minutesInDay;
        int bottelForThreeDays = bottleForOneMinute * minutesInThreeDays;
        System.out.println("For " + threeDays + " days " + " the machine produced " + bottelForThreeDays + " pieces of bottles");
        byte month = 1;
        byte dayInMonth = 30;
        int minutesInMonth = dayInMonth * minutesInDay;
        int bottelsForMonth = bottleForOneMinute * minutesInMonth;
        System.out.println("For " + month + " month " + " the machine produced " + bottelsForMonth + " pieces of bottles");

    }

    public static void task5 () {
        System.out.println("task 5");
        byte forRepairSchoolNeedPotOfPaint = 120;
        byte forOneClassNeedWhitePotOfPaint = 2;
        byte forOneClassNeedBrownPotOfPaint = 4;
        int allPotOfPaintForOneClass = forOneClassNeedWhitePotOfPaint + forOneClassNeedBrownPotOfPaint;
        int howManyClassesInScholl =forRepairSchoolNeedPotOfPaint / allPotOfPaintForOneClass;
        int allPotOfWhitePaint = howManyClassesInScholl * forOneClassNeedWhitePotOfPaint;
        int allPotOfBrownPaint = howManyClassesInScholl * forOneClassNeedBrownPotOfPaint;
        System.out.println("In school,where " + howManyClassesInScholl + " classes,need " + allPotOfWhitePaint + " pot of white paint and " + allPotOfBrownPaint + " pot of brown paint " );

    }

    public static void task6 () {
        System.out.println("task 6");
        byte bananas = 5;
        byte oneBananaGram = 80;
        short milkMl = 200;
        byte oneHundredMlOfMilk = 100;
        byte oneHundredMlEquallyGramm =105;
        byte iceCreamTwoPieces = 2;
        byte onePieceOfIceCreamInGram = 100;
        byte eggs = 4;
        byte oneEggGram = 70;
        int bananasGram = bananas * oneBananaGram;
        int milkGram = (milkMl / oneHundredMlOfMilk) * oneHundredMlEquallyGramm;
        int iceCreamGram = iceCreamTwoPieces * onePieceOfIceCreamInGram;
        int eggsGram = eggs * oneEggGram;
        long sportBreakfastGramm = bananasGram + milkGram + iceCreamGram + eggsGram;
        System.out.println("in sport breakfast " + sportBreakfastGramm + " gram");
        int oneKgEquallyGram = 1000;
        float sportBreakfastKg = (float) sportBreakfastGramm / oneKgEquallyGram;
        System.out.println("in sport breakfast " + sportBreakfastKg + " kg");

    }

    public static void task7 () {
        System.out.println("task 7");
        byte needToResetKg = 7;
        short ifOneDayResetGram = 250;
        int oneKgEquallyGram = 1000;
        int howManyDaysInOneKg = oneKgEquallyGram / ifOneDayResetGram;
        long howManyDaysToResetSevenKg = howManyDaysInOneKg * needToResetKg;
        System.out.println("if sportsmen reset in one day " + ifOneDayResetGram + " gram,than 7 kg he reset in " + howManyDaysToResetSevenKg + " days");
        short ifOneDayResetGramNew = 500;
        int howManyDaysInOneKgNew = oneKgEquallyGram / ifOneDayResetGramNew;
        long howManyDaysToResetSevenKgNew = howManyDaysInOneKgNew * needToResetKg;
        System.out.println("if sportsmen reset in one day " + ifOneDayResetGramNew + " gram,than 7 kg he reset in " + howManyDaysToResetSevenKgNew + " days");
    }

    public static void task8 () {
        System.out.println("task 8");
        int cashOfMashaInMonthRub = 67760;
        int cashOfDenisInMonthRub = 83690;
        int cashOfKristinaInMonthRub = 76230;
        int tenPercentCash = 10;
        int hundredPercentCashOfStaff = 100;
        byte dayInMonth = 12;
        int tenPercentCashMasha = (cashOfMashaInMonthRub * tenPercentCash) / hundredPercentCashOfStaff;
        int tenPercentCashDenis = (cashOfDenisInMonthRub * tenPercentCash) / hundredPercentCashOfStaff;
        int tenPercentCashKristina = (cashOfKristinaInMonthRub * tenPercentCash) / hundredPercentCashOfStaff;
        int cashOfMashaInMonthRubNew = cashOfMashaInMonthRub + tenPercentCashMasha;
        int cashOfDenisInMonthRubNew = cashOfDenisInMonthRub + tenPercentCashDenis;
        int cashOfKristinaInMonthRubNew = cashOfKristinaInMonthRub + tenPercentCashKristina;
        long cashForYearMashaOld = cashOfMashaInMonthRub * dayInMonth;
        long cashForYearDenisOld = cashOfDenisInMonthRub * dayInMonth;
        long cashForYearKristinaOld = cashOfKristinaInMonthRub * dayInMonth;
        long cashForYearMashaNew = cashOfMashaInMonthRubNew * dayInMonth;
        long cashForYearDenisNew = cashOfDenisInMonthRubNew * dayInMonth;
        long cashForYearKristinaNew = cashOfKristinaInMonthRubNew * dayInMonth;
        long  yearCashMashaUp = cashForYearMashaNew - cashForYearMashaOld;
        long  yearCashDenisUp = cashForYearDenisNew - cashForYearDenisOld;
        long  yearCashKristinaUp = cashForYearKristinaNew - cashForYearKristinaOld;
        System.out.println("Masha now gets " + cashOfMashaInMonthRubNew + " rub.Annual revenue increased by " + yearCashMashaUp + " Rub");
        System.out.println("Denis now gets " + cashOfDenisInMonthRubNew + " rub.Annual revenue increased by " + yearCashDenisUp + " Rub");
        System.out.println("Kristina now gets " + cashOfKristinaInMonthRubNew + " rub.Annual revenue increased by " + yearCashKristinaUp + " Rub");





































    }
}