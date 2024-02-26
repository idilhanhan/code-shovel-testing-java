public class SimpleMath {
    int x, y;

    public SimpleMath(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getSum(){
        return x + y;
    }

    public int getDifference(){
        return x - y;
    }

    public int getMinimum(){
        return x;
    }
}
