package Katas;

public class FizzBuzz {
    public static String getResult(int number) {
        if (isDivisibleBy3(number) && isDivisibleBy3(number)) {
            return "fizzbuzz";
        }
        else if (isDivisibleBy3(number)){
            return "fizz";
        }
        else if (isDivisibleBy5(number)) {
            return "buzz";
        }
        return Integer.toString(number);
    }
    public static boolean isDivisibleBy3(int number){
        if (number%3==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isDivisibleBy5(int number){
        if (number%5==0){
            return true;
        }
        else{
            return false;
        }
    }
}
