public class Main {
    public static void main(String[] args) {
        
        int a = 2; //Задача 1
        byte b = 127;
        short c = 32767;
        long d = 1234567;
        float e = 8.5F;
        double f = 2.5;
        char g = 9;
        boolean h = false;

        double firstBoxerWeight = 78.2; //Задача 2
        double secondBoxerWeight = 82.7;
        System.out.println("Общий вес двух бойцов " + (firstBoxerWeight + secondBoxerWeight) + " кг.");
        System.out.println("Разница в весе двух бойцов " + (secondBoxerWeight-firstBoxerWeight) + " кг.");

        int bananasNumber = 5; //Задача 3
        int bananasWeight = 80;
        int milkVolume = 200;
        int milkWeight = 105;
        int iseCreamNumber = 2;
        int iseCreamWeight = 100;
        int eggsNumber = 4;
        int eggWeight = 70;
        int coctail = bananasNumber*bananasWeight + (milkVolume/100)*105 + iseCreamNumber*iseCreamWeight + eggsNumber*eggWeight;
        System.out.println("Вес спортзавтрака " + coctail + " г.");
        double coctailKilos = coctail*0.001;
        System.out.println("Вес спортзавтрака " + coctailKilos + " кг.");

        int looseGeneral = 7; //Задача 4
        int looseMin = 250;
        int looseMax = 500;
        int looseGeneralKilos = looseGeneral*1000;
        System.out.println("Если худеть по 250 гр. в день, то понадобится " + looseGeneralKilos/looseMin + " дней.");
        System.out.println("Если худеть по 500 гр. в день, то понадобится " + looseGeneralKilos/looseMax + " дней.");
        System.out.println("В среднем понадобится " + looseGeneralKilos/((looseMax+looseMin)/2) + " дней.");

        int mashaSalary = 67760; //Задача 5
        int denisSalary = 83690;
        int krisSalary = 76320;
        var mSalaryGrow = (mashaSalary*0.1)+mashaSalary;
        var dSalaryGrow = (denisSalary*0.1)+denisSalary;
        var kSalaryGrow = (krisSalary*0.1)+krisSalary;
        System.out.println("Маша получает теперь " + mSalaryGrow + " руб. в месяц, а разница доходов в год равна " + ((mSalaryGrow-mashaSalary)*12) + " руб.");
        System.out.println("Денис получает теперь " + dSalaryGrow + " руб. в месяц, а разница доходов в год равна " + ((dSalaryGrow-denisSalary)*12) + " руб.");
        System.out.println("Кристина получает теперь " + kSalaryGrow + " руб. в месяц, а разница доходов в год равна " + ((kSalaryGrow-krisSalary)*12) + " руб.");

        int a1 = 12; //Задача 6
        int b1 = 27;
        int c1 = 44;
        int d1 = 15;
        int e1 = 9;
        int result = a1*(b1+(c1-d1*e1));
        System.out.println(result*(-1));

        int a2 = 5; //Задача 7 (не уверен, что правильно понял условие)
        int b2 = 7;
        ++a2;
        ++a2;
        --b2;
        --b2;
        System.out.println(a2+", "+b2);

        int a3 = 158; //Задача 8
        int b3 = a3%100/10;
        System.out.println(b3);
    }
}
