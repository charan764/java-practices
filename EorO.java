class Day2 {
    public static void main(String[] args) {
        Methods m = new Methods();
        m.check(7);
    }
}

class Methods {
    public void check(int num) {
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}