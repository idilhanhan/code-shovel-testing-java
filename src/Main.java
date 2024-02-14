

public class Main {
    public static int getSum(int x, int y){
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Running Main.java");
        int maxValue = getSum(4, 5);
        //int minValue = Math.getMinimum(4, 5);
        //boolean result = Math.isEqual(3,3);
        System.out.println(maxValue);
        //System.out.println(minValue);
        //System.out.println(result);
    }
}