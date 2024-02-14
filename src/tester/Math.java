package tester;


class Parent{
    public static int getMinimum(int x, int y){
        if (x <= y){
            return x;
        }
        return y;
    }

}

public class Math extends Parent {
    public static boolean isEqual(int x, int y){
        return x == y;
    }

}

