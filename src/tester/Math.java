package tester;


class Parent{
    public static int getMinimum(int first, int second, int third){
        int min = 0;
        if (first <= second){
            min = first;
        }
        else{
            min = second;
        }
        if (third <= min){
            min = third;
        }
        return min;
    }

}

