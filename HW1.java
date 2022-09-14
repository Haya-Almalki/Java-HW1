
public class HW1 {
  
    public static void main(String[] args) {

        //Q1: Write a code that takes one number and print the factorial of this number
        int num=5;
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        System.out.println(f);

        //Q2:

        for (int i=1;i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

        //Q3:
        int grade=89;
        if(grade%5==3){
            grade=grade+2;
        } else if(grade%5==4){
            grade=grade+1;
        }
        System.out.println(grade);
    }
}
    
