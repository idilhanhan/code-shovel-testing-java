public class Main {
    /**
     * javadoc comment
     * @param x
     * @param y
     * @return
     */
    public static int getMaximum(int x, int y){
        /*
         * This is a regular multi-line comment
         */
        return y;
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
        System.out.println(maxValue);
        System.out.println(minValue);
    }
}