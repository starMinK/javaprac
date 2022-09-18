class Calculation {
    int add(int x, int y){
        return x + y;
    }
    int subtract(int x, int y){
        return x - y;
    }
}

public class Main {
    public static void main(String[] args) {

    Calculation calculation = new Calculation();
    int addResult = calculation.add(x: 1, y: 2);
    int subtractResult = calculation.subtract(x: 5, y: 3);
    System.out.println(addResult);
    System.out.println(subtractResult);
    }
}