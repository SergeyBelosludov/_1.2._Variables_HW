public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        //Задание 1
        System.out.println("Zadanie 1");
        System.out.println(" ");

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        double i = 5.12345678987654321;
        float f = 6.123456789f;
        char plus = 43;
        boolean D = true;
        boolean C = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(i);
        System.out.println(f);
        System.out.println("plus = " + plus);
        System.out.println(D);
        System.out.println(C);

        System.out.println(" ");
        // Задание 2
        System.out.println("Zadanie 2");
        System.out.println(" ");

        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double obshchyayMassaBoycov = boxer1Weight + boxer2Weight;
        double raznicaVVese = boxer2Weight - boxer1Weight;
        System.out.println("massa pervogo boyca = " + boxer1Weight);
        System.out.println("massa vtorogo boyca = " + boxer2Weight);
        System.out.println("obshchyay massa boycov = " + obshchyayMassaBoycov);
        System.out.println("raznica v vese = " + raznicaVVese);

        System.out.println(" ");
        // Задание 3
        System.out.println("Zadanie 3");
        System.out.println(" ");

        short banana1Weight = 80;
        short milk100MlWeight = 105;
        short iceCream1BrWeight = 100;
        short egg1Weight = 70;

        short totalBananas = 5;
        short totalMilkMl = 200;
        short totalIceCream = 2;
        short totalEgg = 4;

        int milk100MlInTotal = totalMilkMl / 100;

        int totalBananasWeight = banana1Weight * totalBananas;
        int totalMilkWeight = milk100MlInTotal * milk100MlWeight;
        int totalIceCreamWeight = iceCream1BrWeight * totalIceCream;
        int totalEggWeight = totalEgg * egg1Weight;

        int breakfastInGram = totalBananasWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        System.out.println("vsego zavtrak vesit " + breakfastInGram + " gr");

        float breakfastInKg = breakfastInGram / 1000f;
        System.out.println("vsego zavtrak vesit " + breakfastInKg + " kg");

        System.out.println(" ");
        // Задание 4
        System.out.println("Zadanie 4");
        System.out.println(" ");

        short totalWeightKg = 7;
        short lost1 = 250;
        short lost2 = 500;

        int totalWeightGr = totalWeightKg * 1000;
        int quantity1 = totalWeightGr / lost1;
        int quantity2 = totalWeightGr / lost2;
        int quantity3 = (quantity1 + quantity2) / 2;
        System.out.println("Nuzno " + quantity1 + " dney, chtoby skidyvat po " + lost1 + " gr");
        System.out.println("Nuzno " + quantity2 + " dney, chtoby skidyvat po " + lost2 + " gr");
        System.out.println("Nuzno " + quantity3 + " dney v srednem, chtoby skinut " + totalWeightKg + " kr");

        System.out.println(" ");
        // Задание 5
        System.out.println("Zadanie 5");
        System.out.println(" ");

        int zpMashaOld = 67_760;
        int zpDenisOld = 83_690;
        int zpKristinaOld = 76_230;

        double zpMashaNew = zpMashaOld * 1.1;
        float zpDenisNew = zpDenisOld * 1.1f;
        double zpKristinaNew = zpKristinaOld * 1.1;

        double yearUpWageMasha = 12 * zpMashaOld * 0.1;
        double yearUpWageDenis = 12 * zpDenisOld * 0.1;
        double yearUpWageKristina = 12 * zpKristinaOld * 0.1;

        System.out.println("Masha teper poluchaet " + (int) zpMashaNew + " rub. Godovoy dohod vyros na " + (int) yearUpWageMasha + " rub.");
        System.out.println("Denis teper poluchaet " + (int) zpDenisNew + " rub. Godovoy dohod vyros na " + (int) yearUpWageDenis + " rub.");
        System.out.println("Kristina teper poluchaet " + (int) zpKristinaNew + " rub. Godovoy dohod vyros na " + (int) yearUpWageKristina + " rub.");


    }
}
