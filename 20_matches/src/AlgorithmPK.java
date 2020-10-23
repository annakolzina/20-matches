import java.util.Scanner;

class AlgorithmPK{
    int count;
    int algorithmComp(int count){
        if (count < 17 && count > 13)
            return count-13;
        if (count < 13 && count > 9)
            return count-9;
        if (count < 9 && count > 5)
            return count-5;
        if (count < 5 && count > 1){
            int k = 1;
            while(count - k !=1){
                k++;
            }
            return k;}
        else
            return 0;
    }

    void allShow(count){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество спичек");
        count =count-(scanner.nextInt());
        System.out.println("Компьютер взял ");
        System.out.println(this.algorithmComp(count));
        count= count-obj.algorithmComp(count);
        System.out.println("Всего спичек");
        System.out.println(count);
    }
}

