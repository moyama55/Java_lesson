public class Fizzbuzz{
    public static void main(String[] args){
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzBuzz = "FizzBuzz";
            for(int num = 1; num <= 30; num++){
                System.out.println(num);
                if(num % 3 == 0){
                    System.out.println(Fizz);
                    if(num % 3 == 0 && num % 5 == 0){
                        System.out.println(FizzBuzz);
                    }else if(num % 5 == 0){
                        System.out.println(Buzz);
                        if(num % 3 == 0 && num % 5 == 0){
                            System.out.println(FizzBuzz);
                    }
                }
            }
        }
    }
}