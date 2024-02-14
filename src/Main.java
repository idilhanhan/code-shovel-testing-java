public class Main {
    public static int getMaximum(int x, int y){
        return x + y;
    }

    public static int getMinimum(int x, int y){
        if (x <= y){
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Running Main.java");
        int maxValue = getMaximum(4, 5);
        int minValue = getMinimum(4, 5);
        boolean result = Tester.isEqual(3,3);
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(result);
    }
}