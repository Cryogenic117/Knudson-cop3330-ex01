package oop.example;
import java.util.Arrays;
import java.util.Scanner;
public class App {
    public static void main( String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userInput;
        userInput = input.next();
        if(userInput.length()%2!=0) {
            System.out.printf("Don't talk to me %s, your name is odd.", userInput);
        }
        else {
            System.out.printf("Hello, %s, nice to meet you!", userInput);
        }
    }
}