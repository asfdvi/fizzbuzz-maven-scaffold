
public class FizzBuzz {

    public static String getFizzBuzz(int num) {
        if(num % 3 == 0) {
            return "Fizz";
        }
        if(num % 5 == 0) {
            return "Buzz";
        }
        if(num % 15 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(num);
    }
}
