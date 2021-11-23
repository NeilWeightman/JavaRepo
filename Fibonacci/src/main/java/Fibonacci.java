public class Fibonacci {
    public String fibonacci(int i) {
        if(i <= 0) return null;
        String result = "0, 1, ";
        int i1 = 0;
        int i2 = 1;
        for (int index = 2; index < i; index++){
            int nextValue = i1 + i2;
            result = result + nextValue + ", ";
            i1 = i2;
            i2 = nextValue;
        }
        return result;
    }
}
