public class Main {
    public static void main(String[] args){
        System.out.println("Введите количество спичек");
        count =count-(scanner.nextInt());
        System.out.println("Компьютер взял ");
        System.out.println(obj.algorithmComp(count));
        count= count-obj.algorithmComp(count);
        System.out.println("Всего спичек");
        System.out.println(count);
    }
    void allShow(count){
        System.out.println("Введите количество спичек");
        count =count-(scanner.nextInt());
        System.out.println("Компьютер взял ");
        System.out.println(obj.algorithmComp(count));
        count= count-obj.algorithmComp(count);
        System.out.println("Всего спичек");
        System.out.println(count);
    }
}
