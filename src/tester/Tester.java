package tester;

public class Tester {
    public static boolean isEqual(int x, int y){
        return x == y;
    }

    public static int getMinimum(int x, int y){
        if (x <= y){
            return x;
        }
        return y;
    }
}
