import java.util.Scanner;
public class operator {
    public static int convertToSeconds(int days, int hours, int minutes) {
        int seconds = days * 24 * 3600 + hours * 3600 + minutes * 60;
        return seconds;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smallestTime = Integer.MAX_VALUE;
        while(true){
            System.out.println("Введите название задачи");
            String name = scanner.nextLine();
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = scanner.nextInt();
            System.out.println("Сколько часов?");
            int hours = scanner.nextInt();
            System.out.println("Сколько минут?");
            int minutes = scanner.nextInt();
            int currentTimeTask = convertToSeconds(days, hours, minutes);
            totalTime += currentTimeTask;
            if (currentTimeTask > biggestTime){
                biggestTime = currentTimeTask;
            }
            if (currentTimeTask < smallestTime){
                smallestTime = currentTimeTask;
            }
            scanner.nextLine();
            System.out.println("Для завершения работы программы введите `end` / для продолжения нажмите enter");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
        }
        System.out.println("Всего потребуется: " + totalTime);
        System.out.println("Самая продолжительная задача займет: " + biggestTime);
        System.out.println("Самая короткая задача займет: " + smallestTime);
    }
}