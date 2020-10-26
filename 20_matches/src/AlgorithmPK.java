import java.util.Scanner;

class AlgorithmPK{
    public static int count;

    public AlgorithmPK(int count) {
        this.count = count;
    }

    public int getCount(int count) {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int algorithmComp(int count){
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

}

