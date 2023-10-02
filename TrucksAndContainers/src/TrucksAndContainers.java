import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество коробок:");
        int container = 0;
        int truck = 0;
        int boxesInContainer = 27;
        int containersInTrack = 12;
        int boxes = scanner.nextInt(); //получение количество коробок от пользователя
        if (boxes < 0) {
            System.out.println("Грузовик: " + truck + "\n\tКонтейнер: " + container + "\n\t\tЯщик: " + boxes);
        }
        if (boxes > 0) {
            for (int i = 1; i <= boxes; i++) {
                if (i % (containersInTrack * boxesInContainer) == 1) {
                    truck++;
                    System.out.println("Грузовик: " + truck);
                }
                if (i % boxesInContainer == 1) {
                    container++;
                    System.out.println("\tКонтейнер: " + container);
                }
                System.out.println("\t\tЯщик: " + i);
            }
            System.out.println("Необходимо:" + "\nгрузовиков - " + truck + " шт." + "\nконтейнеров - " + container + " шт.");
        }
    }
}
