import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите рост в метрах, : ");
        float height = in.nextFloat();

        System.out.print("Введите вес в килограммах: ");
        float weight = in.nextFloat();
        in.close();

        if (weight > 350 || weight < 5) {
            System.out.print("Вес указан неправильно, перезапустите программу");
            System.exit(0);
        }

        if (height > 3) {
            System.out.print("Рост указан неправильно, перезапустите программу");
            System.exit(0);
        }

        BmiService bmiService = new BmiService();
        float imt = bmiService.calculate(height, weight);

        if (imt <= 16) {
            System.out.printf("Индекс массы тела - %s \n Дистрофия, выраженный дефицит массы \n", imt);
        }
        if (imt > 16 & imt <= 17.9) {
            System.out.printf("Индекс массы тела - %s \n Недостаточная масса тела \n", imt);
        }
        if (imt > 17.9 & imt <= 25) {
            System.out.printf("Индекс массы тела - %s \n Вес в норме \n", imt);
        }
        if (imt > 25 & imt <= 30) {
            System.out.printf("Индекс массы тела - %s \n Избыточная масса тела, предожирение \n", imt);
        }
        if (imt > 30 & imt <= 35) {
            System.out.printf("Индекс массы тела - %s \n Ожирение 1 степени \n", imt);
        }
        if (imt > 35 & imt <=40) {
            System.out.printf("Индекс массы тела - %s \n Ожирение 2 степени \n", imt);
        }
        if (imt > 40) {
            System.out.printf("Индекс массы тела - %s \n Ожирение 3 степени \n", imt);
        }
    }
}


