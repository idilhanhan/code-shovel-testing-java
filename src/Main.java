

public class Main {
    public static int getSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static int getMinimum(int x, int y, int z){
        int min = 0;
        if (x <= y){
            min = x;
        }
        else{
            min = y;
        }
        if (z <= min){
            min = z;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Running Main.java");
        int maxValue = getSum(4, 5);
        int minValue = getMinimum(4, 5, 3);
        //boolean result = Math.isEqual(3,3);
        System.out.println(maxValue);
        System.out.println(minValue);
        //System.out.println(result);
    }
}