import java.util.Scanner;

class math {  
public static void main(String args[]) {  
int number, digit, sum = 0;  
try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter the number: ");  
    number = scanner.nextInt();
}  
while(number > 0) {  
//finds the last digit of the given number    
digit = number % 10;  
//adds last digit to the variable sum  
sum = sum + digit;  
//removes the last digit from the number  
number = number / 10;  
        }  
System.out.println("The sum of digits: " + sum);  
    }  
};


class temp  {
public static void main(String args[]) {
    int f;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("What is the Fahrenheit tempature right now: ");
        //user input of temp
        f = scanner.nextInt();
    }
    //grab input and convert to C
    int f2C = (f - 32) * 5/9;
    //print conversion
    System.out.println(f + " degress F is equivalent to " + f2C + " degrees C.");




    int c;
    
    try (Scanner scanner2 = new Scanner(System.in)) {
        System.out.print("What is the Celsius tempature right now: ");
        //user input of C temp
        c = scanner2.nextInt();
    }
    //convert c to f
    int c2F = (c * 9/5 ) + 32;
    //print conversion
    System.out.println(c + " degrees C is the equivalent to " + c2F + " degrees F.");

    };







};