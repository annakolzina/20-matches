import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Компьютер взял 3 спички");
        Scanner scanner = new Scanner(System.in);
        int count = 17;
        while (count!=1) {
            System.out.println("Введите количество спичек");
            count = count - (scanner.nextInt());
            System.out.println("Компьютер взял ");
            AlgorithmPK obj = new AlgorithmPK(count);
            System.out.println(obj.algorithmComp(count));
            count = count - obj.algorithmComp(count);
            System.out.println("Всего спичек");
            System.out.println(count);
            obj.getCount(count);
        }
        if(count == 1){
            System.out.println("Компьютер выиграл");
        }
    }
}
